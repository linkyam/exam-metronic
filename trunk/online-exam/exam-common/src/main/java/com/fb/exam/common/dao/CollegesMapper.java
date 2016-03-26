package com.fb.exam.common.dao;

import com.fb.exam.common.vo.Colleges;
import com.fb.exam.common.vo.CollegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollegesMapper {
    int countByExample(CollegesExample example);

    int deleteByExample(CollegesExample example);

    int deleteByPrimaryKey(Integer collegeId);

    int insert(Colleges record);

    int insertSelective(Colleges record);

    List<Colleges> selectByExample(CollegesExample example);

    Colleges selectByPrimaryKey(Integer collegeId);

    int updateByExampleSelective(@Param("record") Colleges record, @Param("example") CollegesExample example);

    int updateByExample(@Param("record") Colleges record, @Param("example") CollegesExample example);

    int updateByPrimaryKeySelective(Colleges record);

    int updateByPrimaryKey(Colleges record);
}