package com.medical.service.impl;

import com.medical.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * 示例服务实现
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "Hello, 医疗系统！";
    }
}
