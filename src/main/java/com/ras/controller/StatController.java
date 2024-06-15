package com.ras.controller;

import com.ras.dao.StatDao;
import com.ras.service.StatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Stat", description = "스탯 컨트롤러")
@RequestMapping("/api/stat")
public class StatController {
    private final StatService statService;

    @Operation(summary = "스탯 목록 리스트", description = "스탯 목록 리스트", tags = {"Stat"})
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<StatDao> searchStatList(
            @Parameter(name="statType" ,description = "스탯 종류 (0: 유동 스탯(기본 스탯)/1: 고정 스탯(기본 스탯)/2: 연계 스탯)")
            @RequestParam(required = false) Integer statType) {
        StatDao inputParam = new StatDao();
        inputParam.setStatType(statType);

        List<StatDao> returnDao = statService.searchStatList(inputParam);
        return returnDao;
    }

    @Operation(summary = "스탯 상세 조회", description = "스탯 상세 조회", tags = {"Stat"})
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public StatDao searchStat(
            @Parameter(name="id" ,description = "스탯 id")
            @RequestParam(required = true) Integer id) {
        StatDao inputParam = new StatDao();
        inputParam.setId(id);

        StatDao returnDao = statService.searchStat(inputParam);
        return returnDao;
    }

    @Operation(summary = "스탯 등록", description = "스탯 등록", tags = {"Stat"})
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public StatDao registStat(
            @Parameter(name="stat" ,description = "스탯 정보")
            @RequestParam(required = false) StatDao stat) {

        StatDao returnDao = statService.searchStat(stat);
        return returnDao;
    }
}
