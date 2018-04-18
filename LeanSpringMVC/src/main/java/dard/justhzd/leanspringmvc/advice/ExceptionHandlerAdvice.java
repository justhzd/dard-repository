package dard.justhzd.leanspringmvc.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 洪志达 on 2018/4/16.
 */
//控制器建言
@ControllerAdvice
public class ExceptionHandlerAdvice {

    //定义全局异常处理，value是过滤条件，这里是拦截所有的Exception
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        //error页面
        ModelAndView modeAndView = new ModelAndView("error");
        modeAndView.addObject("errorMessage", exception.getMessage());
        return modeAndView;
    }

    //将键值对添加到全局，所有注解的@RequestMapping的方法都可以获取到此键值对
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息");
    }

    //定制WebDataBinder，忽略request的参数的id
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id");
    }
}
