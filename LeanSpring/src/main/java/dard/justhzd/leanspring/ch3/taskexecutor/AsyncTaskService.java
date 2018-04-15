package dard.justhzd.leanspring.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by 洪志达 on 2018/4/15.
 */
@Service
public class AsyncTaskService {
    //注明该方法是异步方法，如果注释在类上面。说明该类所有方法都是异步的。
    @Async
    public void executeAsyncTask(Integer integer) {
        System.out.println("执行任务：" + integer);
    }

    public void executeAsyncTaskPlus(Integer integer) {
        System.out.println("执行任务+l：" + (integer + 1));
    }
}
