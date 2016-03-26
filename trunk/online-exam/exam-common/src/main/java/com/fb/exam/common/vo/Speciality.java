package com.fb.exam.common.vo;

import java.io.Serializable;
import java.util.Date;

public class Speciality implements Serializable {
    private Integer specialityId;

    private Integer collegeId;

    private Integer speyearsId;

    private String specialityName;

    private String comment;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Integer getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(Integer specialityId) {
        this.specialityId = specialityId;
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

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName == null ? null : specialityName.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}