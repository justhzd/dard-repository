package dard.justhzd.leanspring.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 洪志达 on 2018/4/15.
 */
@Configuration
@ComponentScan("dard.justhzd.leanspring.ch3.taskscheduler")
//开启计划任务支持
@EnableScheduling
public class TaskSchedulerConfig {
}
