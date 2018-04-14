package dard.justhzd.leanspring.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Component
public class DemoPublisher {
    //注入context用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        //发布事件
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
