package com.cache.demo.service.impl;

import com.cache.demo.dto.UserDto;
import com.cache.demo.service.DemoService;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
//    @Cacheable(value = "userCache",key = "#root.methodName")
    //value标示缓冲的命名空间，key表示该缓冲的key值，
    // #root.methodName表示以方法名称作为key值，方法的返回值表示缓冲的value值
    public UserDto getUser(){
        System.out.println("查后台数据");
        UserDto dto=new UserDto();
        dto.setName("cache");
        dto.setSex("woman");
        return dto;
    }
}
