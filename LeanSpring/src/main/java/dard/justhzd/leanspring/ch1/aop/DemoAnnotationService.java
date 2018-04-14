package dard.justhzd.leanspring.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {}
}
