package com.explorer.common.util.data.page;

import lombok.Data;

import java.io.Serializable;
@Data
public class Meta implements Serializable {
    private static final long serialVersionUID = 6530472046648134775L;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 第几页
     */
    private int pageNum;
    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int pages;
    /**
     * 当前页的数量 <= pageSize，该属性来自ArrayList的size属性
     */
    private int size;
}
