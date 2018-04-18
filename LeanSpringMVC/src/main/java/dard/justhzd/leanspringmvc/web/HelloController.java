package dard.justhzd.leanspringmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 洪志达 on 2018/4/15.
 */
//声明是一个控制器
@Controller
public class HelloController {
    //配置URL和方法之间的映射
    @RequestMapping("/index")
    public String hello() {
        //通过ViewResolver的Bean配置，返回值为index说明对应路径/WEB-INF/classes/views/index.jsp
        return "index";
    }
}
