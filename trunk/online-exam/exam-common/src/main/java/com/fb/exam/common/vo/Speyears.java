package com.fb.exam.common.vo;

import java.io.Serializable;

public class Speyears implements Serializable {
    private Integer speyearsId;

    private String speyearsName;

    private Integer speyearsYears;

    private static final long serialVersionUID = 1L;

    public Integer getSpeyearsId() {
        return speyearsId;
    }

    public void setSpeyearsId(Integer speyearsId) {
        this.speyearsId = speyearsId;
    }

    public String getSpeyearsName() {
        return speyearsName;
    }

    public void setSpeyearsName(String speyearsName) {
        this.speyearsName = speyearsName == null ? null : speyearsName.trim();
    }

    public Integer getSpeyearsYears() {
        return speyearsYears;
    }

    public void setSpeyearsYears(Integer speyearsYears) {
        this.speyearsYears = speyearsYears;
    }
}