package com.fb.exam.code.dao;

import com.fb.exam.code.vo.SpecialityDetail;
import com.fb.exam.code.vo.SpecialitySearch;

import java.util.List;

/**
 * Created by Administrator on 16-2-24.
 */
public interface SpecialityDetailMapper {
    int countSpecialityBySearch(SpecialitySearch specialitySearch);

    List<SpecialityDetail> getSpecialityDetailBySearch(SpecialitySearch specialitySearch);
}
