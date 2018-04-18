package dard.justhzd.leanspringmvc.web.ch4_3;

import dard.justhzd.leanspringmvc.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 洪志达 on 2018/4/16.
 */
//声明是控制器并且返回数据不需要@ResponseBody
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    //返回数据类型为json
    @RequestMapping(value="/getJson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getJson(DemoObj obj) {
        //直接返回对象，会自动转换
        return new DemoObj((obj.getId() + 1), obj.getName() + "yy");
    }

    //返回数据类型为xml
    @RequestMapping(value="/getXml", produces={"application/xml;charset=UTF-8"})
    public DemoObj getXml(DemoObj obj) {
        //直接返回对象，会自动转换
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }
}
