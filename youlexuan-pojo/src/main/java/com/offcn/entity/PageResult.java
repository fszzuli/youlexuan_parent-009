package com.offcn.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassNamePageResult
 * @Description TODO
 * Auther FSZZULI
 * @Date2020/4/7 17:07
 * @Version 1.0
 **/


/*
* 分页对象
* 总条数 total
* 当前页的行列表 rows
* */
public class PageResult implements Serializable {

    private long total;//总条数
    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
