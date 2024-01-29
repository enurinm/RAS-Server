package com.ras.test.controller;

import com.ras.test.dao.TestDAO;
import com.ras.test.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Test", description = "테스트용 api 컨트롤러")
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestService testService;

    @Operation(summary = "테스트 컨트롤러", description = "string을 반환하는 테스트 컨트롤러", tags = { "Test" })
    @RequestMapping(value = "/example", method = RequestMethod.GET)
    public TestDAO TestRequest(@RequestParam Long id) {

        TestDAO returnDao = testService.getTestEntity(id);

        return returnDao;
    }

}
