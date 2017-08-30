package com.spring.boot.learning.springbootredis;

import com.spring.boot.learning.springbootredis.repository.StringRedisTemp;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisApplicationTests {

    @Autowired
    private StringRedisTemp stringRedisTemp;

    @Test
    public void contextLoads() {
        stringRedisTemp.testKeys("*");
    }


    @Test
    public void zaddNumber() {
        SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("zaddNumber====start==============================" + smf.format(new Date()));
        stringRedisTemp.zaddNumber();
        System.out.println("zaddNumber====end=============================" + smf.format(new Date()));
    }
}
