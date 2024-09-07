package com.ras.mapper;

import com.ras.dao.StatDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatMapper {
    /**
     * 스탯 목록 조회
     */
    List<StatDao> selectStatList(StatDao param);

    /**
     * 스탯 상세 조회
     */
    StatDao selectStat(StatDao param);

    /**
     * 스탯 등록
     */
    void insertStat(StatDao param);

    /**
     * 스탯 수정
     */
    void updateStat(StatDao param);
}
