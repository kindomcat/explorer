package com.explorer.common.util.data;

import lombok.Data;

/**
 * Created by Ace on 2017/6/11.
 */
@Data
public class ObjectRestResponse<T> extends BaseResponse {
    /**
     * 数据封装
     */
    T data;

    boolean rel = true;

    public ObjectRestResponse rel(boolean rel) {
        this.setRel(rel);
        return this;
    }

    public ObjectRestResponse data(T data) {
        this.setData(data);
        return this;
    }

    public ObjectRestResponse() {
    }

    public ObjectRestResponse(int status, String message, T data, boolean rel) {
        super(status, message);
        this.data = data;
        this.rel = rel;
    }


    public static <T> ObjectRestResponse<T> success(T data) {
        return new ObjectRestResponse<>(200, null, data, true);
    }

    public static <T> ObjectRestResponse<T> success(T data,String message) {
        return new ObjectRestResponse<>(200, message, data, true);
    }

    public static <T> ObjectRestResponse<T> error(String message, Integer code) {
        return new ObjectRestResponse<>(code, message, null, false);
    }
}
