package com.explore.user.admin.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2019/11/15 11:37
 * @version: v0.0.1
 * @history:
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "11111";
    }
}
