package com.explore.user.admin.biz;

import com.explore.user.admin.entity.SysUser;
import com.explore.user.admin.mapper.SysUserMapper;
import com.explore.user.admin.vo.SysUserPageVO;
import com.explorer.common.util.data.BaseBiz;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 系统用户表
 *
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-11-18 11:52:23
 */
@Service
public class SysUserBiz extends BaseBiz<SysUserMapper, SysUser> {


    public List<SysUser> pageQuery(SysUserPageVO requestVO) {
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();
        String username = requestVO.getUsername();
        if(StringUtils.isNotBlank(username)){
            criteria.andLike(SysUser.USERNAME, username);
        }
        return mapper.selectByExample(example);
    }
}
