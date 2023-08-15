package com.xiazeyu.agent.service;

import com.xiazeyu.agent.config.aop.Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {

    @Monitor
    public void test() {
    }

}
