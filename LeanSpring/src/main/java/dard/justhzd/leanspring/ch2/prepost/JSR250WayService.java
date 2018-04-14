package dard.justhzd.leanspring.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 洪志达 on 2018/4/14.
 */
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService(){
        super();
        System.out.println("构造函数");
    }
    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
