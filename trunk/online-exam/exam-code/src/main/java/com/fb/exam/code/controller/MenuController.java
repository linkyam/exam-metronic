package com.fb.exam.code.controller;

import com.fb.exam.code.service.MenuService;
import com.fb.exam.code.vo.Menu;
import com.fb.exam.common.code.ResCode;
import com.fb.exam.common.result.PageResult;
import com.fb.exam.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 16-2-3.
 */
@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/user/getAllMenu", method = {RequestMethod.GET})
    @ResponseBody
    public Result getAllMenu() throws Exception{
        PageResult<Menu> result=new PageResult<>(ResCode.SUCCESS,null);
        List<Menu> list=menuService.getAllNavigation();
        result.setData(list);
        return result;
    }

}
