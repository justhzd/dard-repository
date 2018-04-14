package dard.justhzd.leanspring.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Service
//声明为每次调用都是一个新的实例
@Scope("prototype")
public class DemoPrototypeService {
}
