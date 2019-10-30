package com.explore.user.service.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/10/30 21:54
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello explore ...";
    }
}
