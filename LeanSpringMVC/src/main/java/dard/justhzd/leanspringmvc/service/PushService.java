package dard.justhzd.leanspringmvc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by 洪志达 on 2018/4/18.
 */
@Service
public class PushService {
    private DeferredResult<String> deferredResult;

    //产生DeferredResult给控制器使用
    public DeferredResult<String> getAsyncUpdate(){
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    //@Scheduled注解的方法定时更新DeferredResult。
    @Scheduled(fixedDelay = 5000)
    public void refresh(){
        if (deferredResult != null) {
            deferredResult.setResult(Long.toString(System.currentTimeMillis()));
        }
    }
}
