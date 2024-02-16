package com.ras.controller;

import com.ras.service.StatService;
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
@Tag(name = "Stat", description = "스탯 컨트롤러")
@RequestMapping("/api/stat")
public class StatController {
    private final StatService statService;
}
