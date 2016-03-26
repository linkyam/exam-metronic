package com.fb.exam.common.result;


import com.fb.exam.common.code.ResCode;

import java.util.List;

/**
 * Created by Administrator on 15-10-8.
 */
public class TableResult<T> extends Result{
    private int recordsTotal=0;
    private int recordsFiltered=0;
    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    private List<T> data;

    public TableResult(ResCode resCode,String message){
        super(resCode,message);
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public TableResult(){ super();}
}
