package dard.justhzd.leanspring.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Service
public class DemoService {
    //注入普通字符
    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
