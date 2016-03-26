package com.fb.exam.common.result;


import com.fb.exam.common.code.ResCode;

import java.util.List;

/**
 * Created by T420 on 15-9-16.
 */
public class PageResult<T> extends Result{
    private Integer total;

   private Integer pageCount;

    private List<T> data;





    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageResult(){
        super();
    }

    public PageResult(ResCode code, String message) {
        super(code, message);
    }
}
