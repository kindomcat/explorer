package com.explore.user.admin.controller;

import com.explore.user.admin.biz.SysUserBiz;
import com.explore.user.admin.constant.UserAdminConstant;
import com.explore.user.admin.entity.SysUser;
import com.explore.user.admin.vo.SysUserPageVO;
import com.explorer.common.util.constant.ComConstant;
import com.explorer.common.util.data.ObjectRestResponse;
import com.explorer.common.util.data.page.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Autowired
    private SysUserBiz sysUserBiz;

    @GetMapping("/page/query")
    public ObjectRestResponse<PageBean<SysUser>> pageQuery(SysUserPageVO requestVO){
        PageHelper.startPage(requestVO);
        List<SysUser> list = sysUserBiz.pageQuery(requestVO);
        PageBean<SysUser> pageBean = new PageBean<>(list);
        return ObjectRestResponse.success(pageBean);
    }

    @DeleteMapping("/del")
    public ObjectRestResponse<Boolean> delete(int id) {
        sysUserBiz.deleteById(id);
        return ObjectRestResponse.success(Boolean.TRUE);
    }

    @PostMapping(value = "")
    public ObjectRestResponse<Boolean> add(@RequestBody SysUser sysUser) {
        sysUser.setStatus(ComConstant.Status.YES);
        String password = new BCryptPasswordEncoder(UserAdminConstant.PW_ENCORDER_SALT).encode(sysUser.getPassword());
        sysUser.setPassword(password);
        sysUserBiz.insertSelective(sysUser);
        return ObjectRestResponse.success(true);
    }

    @PutMapping(value = "/{id}")
    public ObjectRestResponse<Boolean> update(@RequestBody SysUser sysUser) {
        sysUserBiz.updateSelectiveById(sysUser);
        return ObjectRestResponse.success(true);
    }
}
