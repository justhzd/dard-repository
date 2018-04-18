package dard.justhzd.leanspringmvc.web.ch4_6;

import dard.justhzd.leanspringmvc.MyMvcConfig;
import dard.justhzd.leanspringmvc.service.DemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by 洪志达 on 2018/4/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
//声明加载的ApplicationContext是一个WebApplicationContext。属性指定的是web资源的位置，默认为src/main/webapp
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTests {
    //模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化
    private MockMvc mockMvc;

    //可以注入spring的bean
    @Autowired
    private DemoService demoService;

    //可以注入WebApplicationContext
    @Autowired
    WebApplicationContext wac;

    //可以注入模拟的http session
    @Autowired
    MockHttpSession  session;

    //可以注入模拟的http request
    @Autowired
    MockHttpServletRequest request;

    //测试开始前进行初始化工作
    @Before
    public  void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testNormalController() throws Exception {
        //模拟向/normal进行get请求
        mockMvc.perform(get("/normal"))
                //预期返回状态是200
                .andExpect(status().isOk())
                //预期view的名称为page
                .andExpect(view().name("page"))
                //预期转向的真正的路径为/WEB-INF/classes/views/page.jsp
                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))
                //预期model里的值是demoService.saySomething()的返回值hello
                .andExpect(model().attribute("msg", demoService.saySomething()))
        ;
    }

    @Test
    public void testRestController() throws Exception{
        //模拟转向testRest
        mockMvc.perform(get("/testRest"))
                .andExpect(status().isOk())
                //预期返回的媒体类型为text/plain;charset=UTF-8
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                //预期返回的内容是demoService.saySomething()的返回值hello
                .andExpect(content().string(demoService.saySomething()));
    }
}
