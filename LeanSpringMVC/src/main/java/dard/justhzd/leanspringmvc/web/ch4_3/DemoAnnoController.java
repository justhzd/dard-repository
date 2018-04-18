package dard.justhzd.leanspringmvc.web.ch4_3;

import dard.justhzd.leanspringmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 洪志达 on 2018/4/16.
 */
//声明此类是一个控制器
@Controller
//访问路径是anno
@RequestMapping("/anno")
public class DemoAnnoController {

    //此方法未标记路径，因此使用类级别的路径/anno；produces可定制返回的response的媒体类型和字符集，或需返回值是json对象，则设置produces="application/json;charset=UTF-8"
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }

    //接收路径参数，并在方法参数前结合@PathVariabe使用，访问路径为/anno/pathvar/xx.
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody  String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str: " + str;
    }

    //request参数获取，/anno/requestParam?id=1.
    @RequestMapping(value="/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody  String demoPathVar(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + "can access, id:" + id;
    }

    //参数到对象，访问路径为/anno/obj?id=1&name=xx。
    @RequestMapping(value = "/obj", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, obj id:" + obj.getId() + " obj name:" + obj.getName();
    }

    //映射不同路径到相同的方法，访问路径为/anno/name1获取/anno/name2。
    @RequestMapping(value = {"/name1", "/name2"}, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }
}
