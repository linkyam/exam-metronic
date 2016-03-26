package com.fb.exam.common.dao;

import com.fb.exam.common.vo.SysNavigation;
import com.fb.exam.common.vo.SysNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNavigationMapper {
    int countByExample(SysNavigationExample example);

    int deleteByExample(SysNavigationExample example);

    int deleteByPrimaryKey(Integer naId);

    int insert(SysNavigation record);

    int insertSelective(SysNavigation record);

    List<SysNavigation> selectByExample(SysNavigationExample example);

    SysNavigation selectByPrimaryKey(Integer naId);

    int updateByExampleSelective(@Param("record") SysNavigation record, @Param("example") SysNavigationExample example);

    int updateByExample(@Param("record") SysNavigation record, @Param("example") SysNavigationExample example);

    int updateByPrimaryKeySelective(SysNavigation record);

    int updateByPrimaryKey(SysNavigation record);
}