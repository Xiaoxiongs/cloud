package com.service.client;

import com.vo.bean.TestVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 包含所有需要发布到注册中心的服务名称
 *
 */
@Repository
@FeignClient(name="boot-service")
public interface TestClient {

    @RequestMapping("/test")
    String learn(@RequestParam("str") String str);

    @RequestMapping("/testPost")
    String testPost(@RequestBody TestVo testVo);
}
