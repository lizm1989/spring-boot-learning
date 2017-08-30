package com.spring.boot.learning;

import com.spring.boot.learning.config.ConfigProp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigurationApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootConfigurationApplicationTests.class);

    @Autowired
    private ConfigProp configProp;

    @Test
    public void contextLoads() {
        logger.info("SpringBootConfigurationApplicationTests==> user.name={}", configProp.getUserName());
        logger.info("SpringBootConfigurationApplicationTests==> user.phone={}", configProp.getUserPhone());
        logger.info("SpringBootConfigurationApplicationTests==> user.desc={}", configProp.getUserDesc());
    }

}
