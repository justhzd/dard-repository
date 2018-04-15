package dard.justhzd.leanspring.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 洪志达 on 2018/4/15.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //声明该方法是计划任务，fixedRate，每隔固定时间执行
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒钟执行一次：" + dateFormat.format(new Date()));
    }

    //cron属性按照指定时间执行，这里是每天15点07分执行；cron是UNIX和类UNIX（Linux）系统下的定时任务
    @Scheduled(cron = "0 07 15 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间" + dateFormat.format(new Date()) + "执行");
    }
}
