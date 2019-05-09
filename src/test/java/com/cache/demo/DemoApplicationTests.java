package com.cache.demo;

import com.cache.demo.dto.UserDto;
import com.cache.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private DemoService demoService;

    @Test
    public void contextLoads() {
        UserDto user = demoService.getUser();
        System.out.println(user.getSex());

    }

}
