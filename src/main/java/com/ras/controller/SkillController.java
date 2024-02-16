package com.ras.controller;

import com.ras.service.SkillService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Skill", description = "스킬 컨트롤러")
@RequestMapping("/api/skill")
public class SkillController {
    private final SkillService skillService;
}
