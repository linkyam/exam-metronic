package com.fb.exam.code.service;

import com.fb.exam.code.vo.SpecialityDetail;
import com.fb.exam.code.vo.SpecialitySearch;
import com.fb.exam.common.vo.Speyears;

import java.util.List;

/**
 * Created by Administrator on 16-2-24.
 */
public interface SpecialityService {
    /**
     * 查询 专业信息 列表
     * @param specialitySearch 查询条件
     * @return 列表
     * @throws Exception
     */
    List<SpecialityDetail> getSpecialityDetailBySearch(SpecialitySearch specialitySearch) throws Exception;

    /**
     * 查询所有学制信息列表
     * @return 列表
     * @throws Exception
     */
    List<Speyears> getAllSpeYears() throws Exception;

    /**
     * 根据ID删除专业信息
     * @param specialityId 专业主键ID
     * @return 操作结果
     * @throws Exception
     */
    boolean delSpecialityById(int specialityId) throws Exception;
}
