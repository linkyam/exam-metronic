package com.fb.exam.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysMenu implements Serializable {
    private Integer menuId;

    private Integer naId;

    private String menuName;

    private String menuType;

    private String menuDescribe;

    private String menuUrl;

    private Integer menuNo;

    private Integer menuStatus;

    private Integer parentid;

    private Integer menuLevel;

    private List<SysMenu> childMenu;

    private static final long serialVersionUID = 1L;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getNaId() {
        return naId;
    }

    public void setNaId(Integer naId) {
        this.naId = naId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getMenuDescribe() {
        return menuDescribe;
    }

    public void setMenuDescribe(String menuDescribe) {
        this.menuDescribe = menuDescribe == null ? null : menuDescribe.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(Integer menuNo) {
        this.menuNo = menuNo;
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public List<SysMenu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<SysMenu> childMenu) {
        this.childMenu = childMenu;
    }

    public void setChildMenu(SysMenu menu) {
        if(this.childMenu == null){
            this.childMenu=new ArrayList<>();
        }
        childMenu.add(menu);
    }
}