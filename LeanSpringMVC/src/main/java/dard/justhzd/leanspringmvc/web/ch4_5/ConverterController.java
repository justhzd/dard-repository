package dard.justhzd.leanspringmvc.web.ch4_5;

import dard.justhzd.leanspringmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 洪志达 on 2018/4/16.
 */
@Controller
public class ConverterController {
    @RequestMapping(value="/convert",produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
