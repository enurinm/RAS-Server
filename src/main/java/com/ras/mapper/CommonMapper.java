package com.ras.mapper;

import com.ras.dao.CodeDao;
import com.ras.dao.StatDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommonMapper {
    List<CodeDao> selectCommonCodeList(CodeDao param);

}
