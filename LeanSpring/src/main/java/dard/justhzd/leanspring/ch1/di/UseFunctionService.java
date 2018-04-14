package dard.justhzd.leanspring.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 洪志达 on 2018/4/14.
 */
@Service
public class UseFunctionService {
    //将FunctionService注入到UseFunctionService
    @Autowired
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
