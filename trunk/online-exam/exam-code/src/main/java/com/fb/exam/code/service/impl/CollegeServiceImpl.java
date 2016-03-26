package com.fb.exam.code.service.impl;

import com.fb.exam.code.service.CollegeService;
import com.fb.exam.common.dao.CollegesMapper;
import com.fb.exam.common.result.Page;
import com.fb.exam.common.vo.Colleges;
import com.fb.exam.common.vo.CollegesExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 16-2-20.
 */
@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegesMapper collegesMapper;

    /**
     * 查询学院信息列表
     *
     * @param collegeName
     * @param page
     * @return
     * @throws Exception
     */
    @Override
    public List<Colleges> getCollegesBySearch(String collegeName, Page page) throws Exception {
        CollegesExample example = new CollegesExample();
        example.setBegin(page.getBegin());
        example.setLength(page.getLength());
        if (StringUtils.isNotEmpty(collegeName)) {
            example.createCriteria().andCollegeNameLike("%" + collegeName + "%");
        }
        int count = collegesMapper.countByExample(example);
        page.setTotalRecords(count);
        return collegesMapper.selectByExample(example);
    }

    /**
     * 根据学院名称查询
     *
     * @param collegeName
     * @return
     * @throws Exception
     */
    @Override
    public boolean getCollegeByName(String collegeName) throws Exception {
        CollegesExample example = new CollegesExample();
        example.createCriteria().andCollegeNameEqualTo(collegeName.trim());
        return collegesMapper.countByExample(example) > 0;
    }

    /**
     * 保存学院信息
     *
     * @param college
     * @return
     * @throws Exception
     */
    @Override
    public boolean saveColleges(Colleges college) throws Exception {
        return collegesMapper.insertSelective(college) > 0;
    }

    /**
     * 删除学院信息
     *
     * @param collegeId
     * @return
     * @throws Exception
     */
    @Override
    public boolean delCollegeById(int collegeId) throws Exception {
        return collegesMapper.deleteByPrimaryKey(collegeId) > 0;
    }

    /**
     * 查询所有学院
     *
     * @return 列表
     * @throws Exception
     */
    @Override
    public List<Colleges> getAllColleges() throws Exception {
        return collegesMapper.selectByExample(new CollegesExample());
    }
}
