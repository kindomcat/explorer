package com.explorer.common.util.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2019/5/9 10:05
 * @version: v0.0.1
 * @history:
 */
@Data
public class BaseEntity implements Serializable {

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date crtTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updTime;

    public static final String CRT_TIME = "crtTime";

    public static final String DB_CRT_TIME = "crt_time";

    public static final String UPD_TIME = "updTime";

    public static final String DB_UPD_TIME = "upd_time";

}
