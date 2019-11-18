package com.explorer.common.util.data.page;

import com.github.pagehelper.Page;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class PageBean<T> implements Serializable {
    private static final long serialVersionUID = 8656597559014685635L;
    private Meta meta;
    /**
     * 结果集
     */
    private List<T> datas;

    /**
     * 包装Page对象，因为直接返回Page对象，在JSON处理以及其他情况下会被当成List来处理， 而出现一些问题。
     *
     * @param list page结果
     * @param
     */
    public PageBean(List<T> list) {
        meta = new Meta();
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            meta.setPageNum(page.getPageNum());
            meta.setPageSize(page.getPageSize());
            meta.setTotal(page.getTotal());
            meta.setPages(page.getPages());
            this.datas = page;
            meta.setSize(page.size());
        }
    }

    public PageBean(Meta meta, List<T> datas) {
        this.meta = meta;
        this.datas = datas;
    }
}
