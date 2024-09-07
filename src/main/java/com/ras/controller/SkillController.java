package com.ras.controller;

import com.ras.dao.SkillDao;
import com.ras.dao.SkillDetailDao;
import com.ras.dao.SkillListDao;
import com.ras.service.SkillService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public List<SkillListDao> searchSkillList(
            @Parameter(name="effectCd" ,description = "스킬 종류")
            @RequestParam(required = false) Integer effectCd) throws Exception{
        SkillListDao inputParam = new SkillListDao();
        inputParam.setEffectCd(effectCd);

        List<SkillListDao> returnDao = skillService.searchSkillList(inputParam);
        return returnDao;
    }

    @Operation(summary = "스킬 상세 조회", description = "스킬 상세 조회", tags = {"Skill"})
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public SkillDetailDao searchSkill(
            @Parameter(name="id" ,description = "스킬 id")
            @RequestParam(required = true) Integer id) throws Exception{
        SkillListDao inputParam = new SkillListDao();
        inputParam.setId(id);

        SkillDetailDao returnDao = skillService.searchSkill(inputParam);
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
