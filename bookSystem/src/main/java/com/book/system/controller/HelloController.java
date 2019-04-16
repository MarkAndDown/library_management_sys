package com.book.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:HelloController
 * package:com.book.system.controller
 *
 * @Date :2019/4/16 17:25
 * @author:xr
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public  String hello(){

        System.out.println("你们好");
        return "大家好！！！";
    }
}
