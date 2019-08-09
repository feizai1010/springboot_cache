package com.cache.demo.controller;

import com.cache.demo.event.UserEventRegister;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:注册事件的controller
 * @Author: lifen
 * @Date:  2019/8/9 9:59
 */
@Controller
@Api(description = "事件接口")
@RequestMapping("/event")
public class PublishEventController {
    @Autowired
    private UserEventRegister register;
    @GetMapping("/registerUser")
    @ResponseBody
    public void register()  {
        try {
            register.register();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
