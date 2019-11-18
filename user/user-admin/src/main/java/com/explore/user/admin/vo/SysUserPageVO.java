package com.explore.user.admin.vo;

import com.explorer.common.util.data.page.PageRequest;
import lombok.Data;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2019/11/18 17:07
 * @version: v0.0.1
 * @history:
 */
@Data
public class SysUserPageVO  extends PageRequest {

    private String username;
}
