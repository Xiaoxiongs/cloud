package com.api.controller;

import com.service.client.TestClient;
import com.vo.bean.TestVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class TestController {

    @Resource
    TestClient client;

    @RequestMapping("/test")
    public String learn(@RequestParam("str") String str)
    {
        return client.learn(str);
    }

    @RequestMapping("/postTest")
    public String testPost(@RequestBody TestVo testVo)
    {
        return client.testPost(testVo);
    }

}
