package com.fb.exam.code.service;


import com.fb.exam.code.vo.Menu;
import com.fb.exam.common.vo.SysNavigation;

import java.util.List;

/**
 * Created by Administrator on 16-2-3.
 */
public interface MenuService {

    public List<Menu> getAllNavigation() throws Exception;
}
