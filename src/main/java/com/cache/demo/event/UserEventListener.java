package com.cache.demo.event;

import com.cache.demo.dto.UserDto;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {
    @EventListener(condition = "#user.name!=null")
    public void handleEvent(UserDto user) throws Exception{
        System.out.println(user.getName());
        System.out.println(user.getSex());
    }
}
