package com.ras.test.controller;

import com.ras.test.dao.TestDAO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequiredArgsConstructor
@RestController
@Tag(name = "Test", description = "테스트용 api 컨트롤러")
@RequestMapping("/api/test")
public class TestController {

//    @Autowired
//    private TestDAO testDAO;

    @RequestMapping(value = "/example", method = RequestMethod.GET)
    public TestDAO TestRequest() {

        TestDAO returnDao = new TestDAO();
        returnDao.setMessage("테스트 api 입니다.");

        return returnDao;
    }

}
