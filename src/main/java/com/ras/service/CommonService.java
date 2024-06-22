package com.ras.service;

import com.ras.dao.CodeDao;
import com.ras.dao.StatDao;
import com.ras.mapper.CommonMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CommonService {
    private final CommonMapper commonMapper;

    public List<CodeDao> searchCommonCodeList(CodeDao inputParam) {
        List<CodeDao> returnDao = commonMapper.selectCommonCodeList(inputParam);
        return returnDao;
    }
}
