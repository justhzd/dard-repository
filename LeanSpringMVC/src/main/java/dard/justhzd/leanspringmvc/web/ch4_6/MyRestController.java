package dard.justhzd.leanspringmvc.web.ch4_6;

import dard.justhzd.leanspringmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 洪志达 on 2018/4/18.
 */
@RestController
public class MyRestController {
    @Autowired
    DemoService service;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public String testRest() {
        return service.saySomething();
    }
}
