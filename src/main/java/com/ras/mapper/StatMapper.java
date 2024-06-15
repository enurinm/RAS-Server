package com.ras.mapper;

import com.ras.dao.MemberDao;
import com.ras.dao.RaidDao;
import com.ras.dao.StatDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatMapper {
    List<StatDao> selectStatList(StatDao param);

    StatDao selectStat(StatDao param);

    void insertStat(StatDao param);

    void updateStat(StatDao param);
}
