package com.ras.mapper;

import com.ras.dao.MemberDao;
import com.ras.dao.RaidDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RaidMapper {
    List<RaidDao> selectRaidList(MemberDao param);
}
