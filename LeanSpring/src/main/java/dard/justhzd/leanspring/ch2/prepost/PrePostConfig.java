package dard.justhzd.leanspring.ch2.prepost;

import org.springframework.context.annotation.Bean;

/**
 * Created by 洪志达 on 2018/4/14.
 */
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
