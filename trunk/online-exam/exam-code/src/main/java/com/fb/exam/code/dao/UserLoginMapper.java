package com.fb.exam.code.dao;

import com.fb.exam.common.vo.SysUser;

import java.util.Map;

/**
 * Created by Administrator on 16-1-29.
 */
public interface UserLoginMapper {

    int countByLoginType(Map<String, String> map);

    SysUser getUserByLogin(Map<String, String> map);
}
