package com.cache.demo.event;

import com.cache.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserEventRegister {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void register() throws Exception {
        UserDto user=new UserDto();
        user.setName("电脑");
        user.setSex("未知");
        publisher.publishEvent(user);
    }
}
