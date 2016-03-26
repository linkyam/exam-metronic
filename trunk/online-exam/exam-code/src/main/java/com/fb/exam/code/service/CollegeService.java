package com.fb.exam.code.service;

import com.fb.exam.common.result.Page;
import com.fb.exam.common.vo.Colleges;

import java.util.List;

/**
 * Created by Administrator on 16-2-20.
 */
public interface CollegeService {
    /**
     * 查询学院信息列表
     *
     * @param collegeName
     * @param page
     * @return
     * @throws Exception
     */
    List<Colleges> getCollegesBySearch(String collegeName,Page page) throws Exception;

    /**
     * 根据学院名称查询
     *
     * @param collegeName
     * @return
     * @throws Exception
     */
    boolean getCollegeByName(String collegeName) throws Exception;

    /**
     * 保存学院信息
     *
     * @param college
     * @return  操作结果
     * @throws Exception
     */
    boolean saveColleges(Colleges college) throws Exception;

    /**
     * 删除学院信息
     * @param collegeId
     * @return 操作结果
     * @throws Exception
     */
    boolean delCollegeById(int collegeId) throws Exception;

    /**
     * 查询所有学院
     * @return 列表
     * @throws Exception
     */
    List<Colleges> getAllColleges() throws Exception;

}
