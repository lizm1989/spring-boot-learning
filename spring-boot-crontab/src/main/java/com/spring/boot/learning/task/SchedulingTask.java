package com.spring.boot.learning.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhimingli on 2017/6/23.
 */
@Component
public class SchedulingTask {

    private int count = 0;

    //每隔6秒打印一次
    @Scheduled(cron = "*/6 * * * * ?")
    private void process() {
        System.out.println("SchedulingTask这是第几次了：" + count++);
    }
}
