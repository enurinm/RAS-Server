package com.ras.service;

import com.ras.dao.MemberDao;
import com.ras.dao.RaidDao;
import com.ras.dao.StatDao;
import com.ras.mapper.RaidMapper;
import com.ras.mapper.StatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StatService {
    private final StatMapper statMapper;

    public List<StatDao> searchStatList(StatDao inputParam) {
        List<StatDao> returnDao = statMapper.selectStatList(inputParam);
        return returnDao;
    }

    public StatDao searchStat(StatDao inputParam) {
        StatDao returnDao = statMapper.selectStat(inputParam);
        return returnDao;
    }

    @Transactional
    public void registStat(StatDao inputParam) {
        try {
            statMapper.registStat(inputParam);
        } catch (Exception e) {
            throw new RuntimeException("에러입니다.");
        }

        return;
    }
}
