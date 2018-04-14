package dard.justhzd.leanspring.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by 洪志达 on 2018/4/14.
 */
//@Service注解声明当前类是Spring管理的一个Bean。其中我们用@Component、@Service、@repository和@Controller是等效的，根据需要选用
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello" + word + " !";
    }
}
