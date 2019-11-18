package com.explore.user.admin.controller;

import com.explorer.common.util.data.ObjectRestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2019/11/18 14:40
 * @version: v0.0.1
 * @history:
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public ObjectRestResponse<Boolean> login(){
        return ObjectRestResponse.success(Boolean.TRUE);
    }
}
