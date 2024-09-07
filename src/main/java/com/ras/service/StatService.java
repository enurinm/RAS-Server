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

    /**
     * 스탯 목록 조회
     * @param inputParam
     * @return
     */
    public List<StatDao> searchStatList(StatDao inputParam) throws Exception{
        List<StatDao> returnDao = statMapper.selectStatList(inputParam);
        return returnDao;
    }

    /**
     * 스탯 상세 조회
     * @param inputParam
     * @return
     */
    public StatDao searchStat(StatDao inputParam) throws Exception{
        StatDao returnDao = statMapper.selectStat(inputParam);
        return returnDao;
    }

    /**
     * 스탯 등록
     * @param inputParam
     */
    @Transactional
    public void registStat(StatDao inputParam) throws Exception{
        try {
            statMapper.insertStat(inputParam);
        } catch (Exception e) {
            throw new RuntimeException("에러입니다.");
        }
        return;
    }

    /**
     * 스탯 수정
     * @param inputParam
     */
    @Transactional
    public void saveStat(StatDao inputParam) throws Exception{ // 여기서부터 개발
        try {
            statMapper.updateStat(inputParam);
        } catch (Exception e) {
            throw new RuntimeException("에러입니다.");
        }
        return;
    }
}
