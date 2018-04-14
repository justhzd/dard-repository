package dard.justhzd.leanspring.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Configuration
public class ProfileConfig {
    @Bean
    //profile为dev时实例化这个
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    //profile为prod时实例化这个
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
