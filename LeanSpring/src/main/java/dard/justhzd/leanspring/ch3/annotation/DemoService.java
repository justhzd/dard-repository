package dard.justhzd.leanspring.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by 洪志达 on 2018/4/15.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置");
    }
}
