package com.fb.exam.code.vo;

import com.fb.exam.common.result.Page;

/**
 * Created by Administrator on 16-2-24.
 */
public class SpecialitySearch extends Page {
    //专业名称
    private String specialityName;
    //学院ID
    private Integer collegeId;
    //学制ID
    private Integer speyearsId;

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getSpeyearsId() {
        return speyearsId;
    }

    public void setSpeyearsId(Integer speyearsId) {
        this.speyearsId = speyearsId;
    }
}
