package com.fb.exam.common.result;

import java.io.Serializable;

/**
 * Created by Administrator on 15-10-18.
 */
public class BaseData implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer iDisplayStart;
    private Integer iDisplayLength;
    private int recordsTotal;
    private int recordsFiltered;

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

    public Integer getiDisplayStart() {
        return iDisplayStart;
    }

    public void setiDisplayStart(Integer iDisplayStart) {
        this.iDisplayStart = iDisplayStart;
    }

    public Integer getiDisplayLength() {
        return iDisplayLength;
    }

    public void setiDisplayLength(Integer iDisplayLength) {
        this.iDisplayLength = iDisplayLength;
    }
}
