package dard.justhzd.leanspring.ch1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 洪志达 on 2018/4/14.
 */
//此处没有使用@Service声明Bean
public class UseFunctionService {
    //此处原本没有使用@Autowired注解注入Bean
    @Autowired
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello("say: " + word);
    }
}
