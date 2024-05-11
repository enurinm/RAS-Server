package com.ras.service;

import com.ras.dao.MemberDao;
import com.ras.dao.RaidDao;
import com.ras.mapper.RaidMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RaidService {
    private final RaidMapper raidMapper;

    public List<RaidDao> searchRaidList(MemberDao param) {
        List<RaidDao> returnDao = raidMapper.selectRaidList(param);
        return returnDao;
    }
}
