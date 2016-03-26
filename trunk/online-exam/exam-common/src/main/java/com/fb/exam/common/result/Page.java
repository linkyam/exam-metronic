package com.fb.exam.common.result;

import java.io.Serializable;

/**
 * Created by T420 on 15-9-16.
 */
public class Page implements Serializable{

    /**
     * 当前页数
     */
    private int pageNo=1;

    /**
     * 每页多少条
     */
    private int pageSize=20;

    /**
     * 从多少条开始 mysql分页传参
     */
    private int begin;

    /**
     * 分页长度 mysql分页传参
     */
    private int length;

    /**
     * 总数据长度
     */
    private int totalRecords;

    /**
     * 总页数
     */
    private int pageCount;

    public Page(){
        super();
    }
    /**
     * 构造函数
     * @param pageNo
     * @param pageSize
     */
    public Page(int pageNo,int pageSize) {
        this.setPageNo(pageNo);
        this.setPageSize(pageSize);
    }


    public void setPageSize(int pageSize) {
        if(pageSize!=this.pageSize&&pageSize>0){
            this.pageSize=pageSize;
        }
    }
    public int getPageNo(){
      return pageNo;
    }
    public void setPageNo(int pageNo) {
        if(pageNo>1){
            this.pageNo=pageNo;
        }
    }

    public int getBegin() {
        this.begin=this.begin==0?pageSize*(pageNo-1):this.begin;
        return begin;
    }

    public int getLength() {
        this.length=length==0?this.pageSize:length;
        return length;
    }


    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
        this.pageCount = (int) Math.floor((this.totalRecords * 1.0d) / this.length);
        if (this.totalRecords % this.length != 0) {
            this.pageCount++;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", begin=" + begin +
                ", length=" + length +
                ", totalRecords=" + totalRecords +
                ", pageCount=" + pageCount +
                '}';
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
