package com.medical.controller;

import com.medical.common.Result;
import com.medical.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基础 Controller 示例
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    /**
     * 基础接口，本地访问 http://localhost:8080/api/hello
     */
    @GetMapping("/hello")
    public Result<String> hello() {
        return Result.success(helloService.hello());
    }
}
