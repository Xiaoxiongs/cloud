package com.server.controller;

import com.server.service.TestService;
import com.vo.bean.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/test")
    public String learn(@RequestParam("str") String str)
    {
        return testService.Learn(str);
    }

    @RequestMapping("/testPost")
    public String testPost(@RequestBody TestVo testVo){
        return testService.testPost(testVo);
    }

}
