package com.cto.project;

import com.cto.project.entity.User;
import com.cto.project.service.UserService;
import com.cto.project.service.redis.RedisCacheService;
import com.cto.project.utils.UUIDUtils;
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
    private UserService userService;
    @Autowired
    private RedisCacheService redisCacheService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setNickName("aaaa");
        user.setUserName("bbbb");
        user.setPassword("1234");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        redisCacheService.setCacheObject("user1",user);
//        userService.insert(user);
    }

}
