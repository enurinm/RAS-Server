package com.ras.controller;

import com.ras.service.CharacterService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Character", description = "캐릭터 컨트롤러")
@RequestMapping("/api/character")
public class CharacterController {
    @Autowired
    CharacterService characterService;
}
