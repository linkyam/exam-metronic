package com.fb.exam.code.vo;

import com.fb.exam.common.vo.SysMenu;
import com.fb.exam.common.vo.SysNavigation;

import java.util.List;

/**
 * Created by Administrator on 16-2-3.
 */
public class Menu extends SysNavigation {
    private static final long serialVersionUID = 1L;

    List<SysMenu> menus;

    public List<SysMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<SysMenu> menus) {
        this.menus = menus;
    }
}
