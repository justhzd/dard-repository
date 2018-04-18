package dard.justhzd.leanspringmvc.web.ch4_4;

import dard.justhzd.leanspringmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 洪志达 on 2018/4/16.
 */
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomthing(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉，参数有误/" + "来自@ModelAttribute:" + msg);
    }
}
