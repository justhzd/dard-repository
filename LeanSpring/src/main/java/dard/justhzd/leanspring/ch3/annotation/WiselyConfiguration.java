package dard.justhzd.leanspring.ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 洪志达 on 2018/4/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//组合下面两个注解
@Configuration
@ComponentScan
public @interface WiselyConfiguration {
    //覆盖value参数
    String[] value() default {};
}
