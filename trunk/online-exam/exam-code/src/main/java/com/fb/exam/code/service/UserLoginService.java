package com.fb.exam.code.service;

import com.fb.exam.common.vo.SysUser;

/**
 * Created by T420 on 16-1-28.
 */
public interface UserLoginService {

    String countByLoginId(String loginId) throws Exception;

    SysUser getUserByLogin(String type, String loginId, String pwd) throws Exception;
}
