package com.ras.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping(value = "/example", method = RequestMethod.GET)
    public String TestRequest() {
        return "테스트 api 입니다.";
    }

}
