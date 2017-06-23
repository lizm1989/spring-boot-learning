package com.spring.boot.learning.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhimingli on 2017/6/23.
 */
@Component
public class SchedulingFixedRateTask {

    private int count;

    /**
     * 第一次延迟1秒后执行
     *
     * @Scheduled(initialDelay=1000,fixedRate = 6000)
     */


    //每隔6秒打印一次
    @Scheduled(fixedRate = 6000)
    private void printCount() {
        System.out.println("SchedulingFixedRateTask这是第几次了：" + count++);
    }
}
