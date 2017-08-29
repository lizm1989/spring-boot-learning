package com.spring.boot.learning.springbootredis;

import com.spring.boot.learning.springbootredis.repository.StringRedisTemp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisApplicationTests {

	@Autowired
	private StringRedisTemp stringRedisTemp;

	@Test
	public void contextLoads() {
		stringRedisTemp.testKeys("*");
	}

}
