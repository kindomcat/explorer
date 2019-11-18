package com.explorer.common.util.data.page;

import lombok.Data;

import java.io.Serializable;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2019/5/13 17:52
 * @version: v0.0.1
 * @history:
 */
@Data
public class PageRequest implements Serializable {

    private Integer pageSize = 10;
    private Integer pageNum = 1;


    public Integer getPageSize() {
        if (pageSize < 1) {
            pageSize = 10;
        }
        return pageSize;
    }

    public Integer getPageNum() {
        if (pageNum < 1) {
            pageNum = 1;
        }
        return pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
