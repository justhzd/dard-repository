package dard.justhzd.leanspring.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 洪志达 on 2018/4/15.
 */
//在JUnit环境下提供SpringTestContextFramework的功能
@RunWith(SpringJUnit4ClassRunner.class)
//加载ApplicationContext,其中classes属性用来加载配置类
@ContextConfiguration(classes = {TestConfig.class})
//声明活动的profile
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {
    //可以注入Bean
    @Autowired
    private TestBean testBean;

    //测试代码
    @Test
    public void prodBeanShouldInject(){
        String expected = "from prod profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
