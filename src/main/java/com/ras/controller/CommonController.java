package com.ras.controller;

import com.ras.dao.CodeDao;
import com.ras.dao.SkillDao;
import com.ras.service.CommonService;
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

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Common", description = "공통 컨트롤러")
@RequestMapping("/api/common")
public class CommonController {
    private final CommonService commonService;

    @Operation(summary = "공통 코드 리스트", description = "공통 코드 리스트", tags = {"Common"})
    @RequestMapping(value = "/code", method = RequestMethod.GET)
    public List<CodeDao> searchCommonCodeList(
            @Parameter(name="type" ,description = "코드 분류(1:회원 권한 코드/2:레이드 상태 코드/3:스킬 종류 코드/4:스탯 종류 코드)")
            @RequestParam(required = true) Integer type) throws Exception {
        CodeDao inputParam = new CodeDao();
        inputParam.setType(type);

        List<CodeDao> returnDao = commonService.searchCommonCodeList(inputParam);
        return returnDao;
    }
}
