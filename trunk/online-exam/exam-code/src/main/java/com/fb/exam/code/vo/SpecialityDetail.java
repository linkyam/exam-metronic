package com.fb.exam.code.vo;

import com.fb.exam.common.vo.Speciality;

/**
 * Created by Administrator on 16-2-24.
 */
public class SpecialityDetail extends Speciality {
    private String speyearsName;
    private String collegeName;

    public String getSpeyearsName() {
        return speyearsName;
    }

    public void setSpeyearsName(String speyearsName) {
        this.speyearsName = speyearsName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
