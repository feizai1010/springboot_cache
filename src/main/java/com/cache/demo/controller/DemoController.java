package com.cache.demo.controller;

import com.cache.demo.dto.UserDto;
import com.cache.demo.service.DemoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(description = "用户接口")
@RequestMapping("/m")
public class DemoController {
    @Autowired
    private DemoService demoService;
      @GetMapping("/getUser")
      @ResponseBody
      public UserDto getUser(){
          return  demoService.getUser();
      }

}
