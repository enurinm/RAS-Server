package com.ras.controller;

import com.ras.dao.MemberDao;
import com.ras.dao.RaidDao;
import com.ras.service.RaidService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Raid", description = "레이드 컨트롤러")
@RequestMapping("/api/raid")
public class RaidController {
    private final RaidService raidService;

    @Operation(summary = "레이드 목록 리스트", description = "로그아웃", tags = {"Login", "Member"})
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<RaidDao> searchRaidList() {
        MemberDao memberDao = new MemberDao();
        List<RaidDao> returnDao = raidService.searchRaidList(memberDao);
        return returnDao;
    }
}
