package com.ras.test.mapper;

import com.ras.test.dao.TestDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    TestDAO selectById(Long id);
}
