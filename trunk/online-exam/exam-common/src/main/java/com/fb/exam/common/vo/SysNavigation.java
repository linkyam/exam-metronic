package com.fb.exam.common.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class SysNavigation implements Serializable {

    private Integer naId;

    private String naName;

    @JSONField(serialize=false)
    private String naDescribe;

    @JSONField(serialize=false)
    private String naValue;

    @JSONField(serialize=false)
    private Integer naNo;

    private String naUrl;

    @JSONField(serialize=false)
    private Integer naStatus;

    private static final long serialVersionUID = 1L;

    public Integer getNaId() {
        return naId;
    }

    public void setNaId(Integer naId) {
        this.naId = naId;
    }

    public String getNaName() {
        return naName;
    }

    public void setNaName(String naName) {
        this.naName = naName == null ? null : naName.trim();
    }

    public String getNaDescribe() {
        return naDescribe;
    }

    public void setNaDescribe(String naDescribe) {
        this.naDescribe = naDescribe == null ? null : naDescribe.trim();
    }

    public String getNaValue() {
        return naValue;
    }

    public void setNaValue(String naValue) {
        this.naValue = naValue == null ? null : naValue.trim();
    }

    public Integer getNaNo() {
        return naNo;
    }

    public void setNaNo(Integer naNo) {
        this.naNo = naNo;
    }

    public String getNaUrl() {
        return naUrl;
    }

    public void setNaUrl(String naUrl) {
        this.naUrl = naUrl == null ? null : naUrl.trim();
    }

    public Integer getNaStatus() {
        return naStatus;
    }

    public void setNaStatus(Integer naStatus) {
        this.naStatus = naStatus;
    }
}