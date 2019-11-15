package com.explorer.common.util.data;


import lombok.Data;
import java.io.Serializable;

/**
 * Created by ace on 2017/8/23.
 */
@Data
public class BaseResponse implements Serializable {
    /**
     * 状态码
     */
    private int status = 200;
    /**
     * 错误信息
     */
    private String message;

    public BaseResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse() {
    }


}
