package com.explore.user.admin.controller;

import com.explorer.common.util.data.ObjectRestResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @PostMapping("/page/query")
    public ObjectRestResponse pageQuery(){
        return ObjectRestResponse.success(true);
    }

    @DeleteMapping("/del")
    public ObjectRestResponse<Boolean> delete(int[] ids) {
        return ObjectRestResponse.success(true);
    }

    @PostMapping(value = "")
    public ObjectRestResponse<Boolean> add() {
        return ObjectRestResponse.success(true);
    }

    @PutMapping(value = "/{id}")
    public ObjectRestResponse<Boolean> update() {
        return ObjectRestResponse.success(true);
    }
}
