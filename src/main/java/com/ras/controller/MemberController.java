package com.ras.controller;

import com.ras.dao.MemberDao;
import com.ras.service.MemberService;
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

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Member", description = "회원 컨트롤러")
@RequestMapping("/api/member")
public class MemberController {
    private final MemberService memberService;

    @Operation(summary = "로그인 컨트롤러", description = "로그인 컨트롤러")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public MemberDao TestRequest(
            @Parameter(name="userId" ,description = "아이디") @RequestParam(required = true) String id
            , @Parameter(name="password" ,description = "비밀번호") @RequestParam(required = true) String pw) {

        MemberDao returnDao = memberService.login(id, pw);

        return returnDao;
    }
}
