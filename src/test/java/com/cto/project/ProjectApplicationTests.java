package com.cto.project;

import com.cto.project.service.redis.RedisCacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectApplicationTests {
    @Autowired
    private RedisCacheService redisCacheService;

    @Test
    public void contextLoads() {
    }

}
