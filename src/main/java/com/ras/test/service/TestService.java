package com.ras.test.service;

import com.ras.test.dao.TestDAO;
import com.ras.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public TestDAO getTestEntity(long id) {
        TestDAO testDAO = new TestDAO();

        testDAO = testMapper.selectById(id);

        return testDAO;
    }
}
