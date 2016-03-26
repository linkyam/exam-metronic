package com.fb.exam.code.controller;

import com.fb.exam.code.service.UserLoginService;
import com.fb.exam.common.code.ResCode;
import com.fb.exam.common.result.Result;
import com.fb.exam.common.util.PropertyUtil;
import com.fb.exam.common.vo.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by T420 on 16-1-28.
 */
@Controller
public class UserLoginController {

    private static final String LOGIN_USER_KEY= PropertyUtil.getContextProperty("session.loginUser");


    @Autowired
    private UserLoginService userLoginService;


    /**
     *用户登录
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/log/userLogin", method = {RequestMethod.POST})
    @ResponseBody
    public Result userLogin(HttpServletRequest request, HttpServletResponse response,
                            @RequestBody SysUser user) throws Exception{
        if(user==null){
            return new Result(ResCode.FAILE,"用户信息为空");
        }
        String loginId=user.getLoginId();
        if(StringUtils.isEmpty(loginId)){
            return new Result(ResCode.FAILE,"登录帐号为空");
        }
        String pwd=user.getPwd();
        if(StringUtils.isEmpty(pwd)){
            return new Result(ResCode.FAILE,"登录密码为空");
        }
        String type = userLoginService.countByLoginId(loginId.trim().toLowerCase());
        if(StringUtils.isNotEmpty(type)){
            SysUser sysUser=userLoginService.getUserByLogin(type, loginId.trim().toLowerCase(), pwd.trim());
            if(sysUser!=null){
                request.getSession().setAttribute(LOGIN_USER_KEY, sysUser);
                return new Result(ResCode.SUCCESS,null);
            }else{
                return new Result(ResCode.FAILE,"密码错误!");
            }
        }else{
            return new Result(ResCode.FAILE,"帐号不存在");
        }
    }
}
