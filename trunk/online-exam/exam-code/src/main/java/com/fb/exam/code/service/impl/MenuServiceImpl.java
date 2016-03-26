package com.fb.exam.code.service.impl;

import com.fb.exam.code.dao.MenuMapper;
import com.fb.exam.code.service.MenuService;
import com.fb.exam.code.vo.Menu;
import com.fb.exam.common.dao.SysMenuMapper;
import com.fb.exam.common.dao.SysNavigationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 对系统菜单的操作方法
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private SysNavigationMapper sysNavigationMapper;

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> getAllNavigation() throws Exception {
        return menuMapper.getAllMenu();
    }
}
