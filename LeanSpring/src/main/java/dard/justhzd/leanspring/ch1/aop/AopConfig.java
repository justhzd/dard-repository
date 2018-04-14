package dard.justhzd.leanspring.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Configuration
@ComponentScan("dard.justhzd.leanspring.ch1.aop")
//开启对AspectJ代理的支持
@EnableAspectJAutoProxy
public class AopConfig {
}
