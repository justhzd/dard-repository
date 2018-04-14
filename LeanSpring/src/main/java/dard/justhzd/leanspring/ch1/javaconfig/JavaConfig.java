package dard.justhzd.leanspring.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }
    //教程里没有这个，但是因为原教程会报错找不到原因。无奈加进去的。
    @Bean
    public UseFunctionService useFunctionService() {
        return new UseFunctionService();
    }
}
