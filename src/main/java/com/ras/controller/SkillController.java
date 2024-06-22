package com.ras.controller;

import com.ras.dao.SkillDao;
import com.ras.service.SkillService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Skill", description = "스킬 컨트롤러")
@RequestMapping("/api/skill")
public class SkillController {
    private final SkillService skillService;

    @Operation(summary = "스킬 목록 리스트", description = "스킬 목록 리스트", tags = {"Skill"})
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<SkillDao> searchSkillList(
            @Parameter(name="statType" ,description = "스킬 종류 (0: 유동 스킬(기본 스킬)/1: 고정 스킬(기본 스킬)/2: 연계 스킬)")
            @RequestParam(required = false) Integer statType) throws Exception{
        List<SkillDao> returnDao = new ArrayList<>();
//        inputParam.setSkillType(statType);
//
//        List<SkillDao> returnDao = statService.searchSkillList(inputParam);
        return returnDao;
    }

    @Operation(summary = "스킬 상세 조회", description = "스킬 상세 조회", tags = {"Skill"})
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public SkillDao searchSkill(
            @Parameter(name="id" ,description = "스킬 id")
            @RequestParam(required = true) Integer id) throws Exception{
        SkillDao returnDao = new SkillDao();
//        inputParam.setId(id);
//
//        SkillDao returnDao = statService.searchSkill(inputParam);
        return returnDao;
    }

    @Operation(summary = "스킬 등록", description = "스킬 등록", tags = {"Skill"})
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public void registSkill(@RequestBody SkillDao stat) throws Exception{
//        statService.registSkill(stat);
        return;
    }

    @Operation(summary = "스킬 수정(id로 참조)", description = "스킬 수정(id로 참조)", tags = {"Skill"})
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveSkill(@RequestBody SkillDao stat) throws Exception{
//        statService.saveSkill(stat);
        return;
    }
}
