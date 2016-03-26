package com.fb.exam.code.service.impl;

import com.fb.exam.code.dao.UserLoginMapper;
import com.fb.exam.code.service.UserLoginService;
import com.fb.exam.common.dao.SysUserMapper;
import com.fb.exam.common.util.PropertyUtil;
import com.fb.exam.common.vo.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户登录操作方法
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    private static final Logger logger = LoggerFactory.getLogger("UserLoginService");

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private UserLoginMapper userLoginMapper;


    private static List<String> loginTypeList;

    /**
     * 初始化读取配置文件中配置的允许登录系统的帐号类型
     */
    @PostConstruct
    private void initLoginType() {
        String loginTypes = PropertyUtil.getContextProperty("user.loginid");
        logger.debug("初始化用户登录帐号类型 loginTypes ={}", loginTypes);
        if (StringUtils.isNotEmpty(loginTypes)) {
            loginTypeList = Arrays.asList(loginTypes.split(","));
        }
        if (loginTypeList.isEmpty()) {
            logger.debug("初始化失败");
        }
    }

    @Override
    public String countByLoginId(String loginId) throws Exception {

        Map<String, String> map = new HashMap<String, String>();
        map.put("loginId", loginId);
        if (!loginTypeList.isEmpty()) {
            for (String countType : loginTypeList) {
                map.put("countType", countType);
                if (userLoginMapper.countByLoginType(map) > 0) {
                    return countType;
                }
            }
        }
        return null;
    }

    @Override
    public SysUser getUserByLogin(String type, String loginId, String pwd) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("countType", type);
        map.put("loginId", loginId);
        map.put("pwd", pwd);
        SysUser user = userLoginMapper.getUserByLogin(map);
        return user;
    }
}
