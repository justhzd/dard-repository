package dard.justhzd.leanspring.ch1.javaconfig;

/**
 * Created by 洪志达 on 2018/4/14.
 */
//这里没有使用@Service声明Bean
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
