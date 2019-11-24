package com.example.demo.common.result;

/**
 * @Author zyw
 * @Description 用于分页
 * @Date 17:22 2019/11/24
 * @Param: null
 * @Return
 */
public class MyPagedList<T> {

    private Integer skip; //
    private Integer total; //总数
    private Integer pageSize; //本页条数
    private Integer firstRow; //首条所在行
    private T data;

    public Integer getSkip() {
        return skip;
    }

    public MyPagedList setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public MyPagedList setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public MyPagedList setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public T getData() {
        return data;
    }

    public MyPagedList setData(T data) {
        this.data = data;
        return this;
    }

    public Integer getFirstRow() {
        return firstRow;
    }

    public MyPagedList setFirstRow(Integer firstRow) {
        this.firstRow = firstRow;
        return this;
    }
}
