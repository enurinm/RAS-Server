package com.ras.controller;

import com.ras.service.RaidService;
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
@Tag(name = "Raid", description = "레이드 컨트롤러")
@RequestMapping("/api/raid")
public class RaidController {
    private final RaidService raidService;
}
