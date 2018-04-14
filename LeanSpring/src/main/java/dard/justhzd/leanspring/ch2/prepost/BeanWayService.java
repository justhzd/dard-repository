package dard.justhzd.leanspring.ch2.prepost;

/**
 * Created by 洪志达 on 2018/4/14.
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService() {
        super();
        System.out.println("构造函数");
    }
    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
