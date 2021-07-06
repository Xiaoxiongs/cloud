package com.server.service;


import com.vo.bean.TestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {
    public String Learn(String str){
        log.info("boot-service" + str);
        return str;
    }

    public String testPost(TestVo testVo)
    {
        return testVo.toString();
    }
}
