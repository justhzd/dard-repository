package dard.justhzd.leanspring.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 洪志达 on 2018/4/14.
 */
//声明当前类是一个配置类
@Configuration
//自动扫描这个包下的所有使用@Service、@Component、@Repository和@Controller类
@ComponentScan("dard.justhzd.leanspring.ch1.di")
public class DiConfig {
}
