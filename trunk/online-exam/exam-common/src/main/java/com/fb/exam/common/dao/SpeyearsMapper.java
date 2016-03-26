package com.fb.exam.common.dao;

import com.fb.exam.common.vo.Speyears;
import com.fb.exam.common.vo.SpeyearsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpeyearsMapper {
    int countByExample(SpeyearsExample example);

    int deleteByExample(SpeyearsExample example);

    int deleteByPrimaryKey(Integer speyearsId);

    int insert(Speyears record);

    int insertSelective(Speyears record);

    List<Speyears> selectByExample(SpeyearsExample example);

    Speyears selectByPrimaryKey(Integer speyearsId);

    int updateByExampleSelective(@Param("record") Speyears record, @Param("example") SpeyearsExample example);

    int updateByExample(@Param("record") Speyears record, @Param("example") SpeyearsExample example);

    int updateByPrimaryKeySelective(Speyears record);

    int updateByPrimaryKey(Speyears record);
}