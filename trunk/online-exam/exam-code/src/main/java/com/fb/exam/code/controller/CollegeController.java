package com.fb.exam.code.controller;

import com.fb.exam.code.service.CollegeService;
import com.fb.exam.common.code.ResCode;
import com.fb.exam.common.result.Page;
import com.fb.exam.common.result.PageResult;
import com.fb.exam.common.result.Result;
import com.fb.exam.common.result.TableResult;
import com.fb.exam.common.vo.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 16-2-20.
 * 学院信息处理类
 */
@Controller
public class CollegeController {

    @Autowired
    private CollegeService collegeService;


    @RequestMapping(value = "/college/getCollegesBySearch", method = {RequestMethod.GET})
    @ResponseBody
    public Result getColleges(@RequestParam(required = false) Integer iDisplayStart,
                              @RequestParam(required = false) Integer iDisplayLength,
                              @RequestParam(required = false) String collegeName) throws Exception {
        TableResult<Colleges> result = new TableResult<>(ResCode.SUCCESS, null);
        Page page = new Page();
        page.setBegin(iDisplayStart);
        page.setLength(iDisplayLength);
        List<Colleges> list = collegeService.getCollegesBySearch(collegeName, page);
        result.setData(list);
        result.setRecordsFiltered(page.getTotalRecords());
        result.setRecordsTotal(page.getTotalRecords());
        return result;
    }

    @RequestMapping(value = "/college/getAllColleges", method = {RequestMethod.GET})
    @ResponseBody
    public Result getColleges() throws Exception {
        PageResult<Colleges> result = new PageResult<>(ResCode.SUCCESS, null);
        List<Colleges> list = collegeService.getAllColleges();
        result.setData(list);
        return result;
    }


    @RequestMapping(value = "/college/addColleges", method = {RequestMethod.POST})
    @ResponseBody
    public Result addColleges(@RequestBody Colleges college) throws Exception {
        Result result = new Result(ResCode.SUCCESS, null);
        boolean isExist = collegeService.getCollegeByName(college.getCollegeName());
        if (!isExist) {
            boolean success = collegeService.saveColleges(college);
        } else {
            result.setCode(ResCode.FAILE);
            result.setMessage("学院名重复");
        }
        return result;
    }

    @RequestMapping(value = "/college/delById", method = {RequestMethod.GET})
    @ResponseBody
    public Result delCollegeById(int collegeId) throws Exception {
        Result result = new Result(ResCode.SUCCESS, null);
        boolean success = collegeService.delCollegeById(collegeId);
        return result;
    }
}
