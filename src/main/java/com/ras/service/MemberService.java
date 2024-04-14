package com.ras.service;

import com.ras.dao.MemberDao;
import com.ras.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public MemberDao login(String id, String pw){
        MemberDao memberDao = new MemberDao();
        memberDao.setId(id);
        memberDao.setPw(pw);

        return memberMapper.login(memberDao);
    }
}
