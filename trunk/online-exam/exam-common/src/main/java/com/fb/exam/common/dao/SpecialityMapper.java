package com.fb.exam.common.dao;

import com.fb.exam.common.vo.Speciality;
import com.fb.exam.common.vo.SpecialityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialityMapper {
    int countByExample(SpecialityExample example);

    int deleteByExample(SpecialityExample example);

    int deleteByPrimaryKey(Integer specialityId);

    int insert(Speciality record);

    int insertSelective(Speciality record);

    List<Speciality> selectByExample(SpecialityExample example);

    Speciality selectByPrimaryKey(Integer specialityId);

    int updateByExampleSelective(@Param("record") Speciality record, @Param("example") SpecialityExample example);

    int updateByExample(@Param("record") Speciality record, @Param("example") SpecialityExample example);

    int updateByPrimaryKeySelective(Speciality record);

    int updateByPrimaryKey(Speciality record);
}