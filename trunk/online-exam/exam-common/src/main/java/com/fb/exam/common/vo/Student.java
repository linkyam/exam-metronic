package com.fb.exam.common.vo;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private Integer studentId;

    private Integer classId;

    private String studentNum;

    private Date enterYear;

    private String origin;

    private static final long serialVersionUID = 1L;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    public Date getEnterYear() {
        return enterYear;
    }

    public void setEnterYear(Date enterYear) {
        this.enterYear = enterYear;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }
}