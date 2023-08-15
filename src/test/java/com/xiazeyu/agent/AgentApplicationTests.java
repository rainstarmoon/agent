package com.xiazeyu.agent;

import com.xiazeyu.agent.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AgentApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {
        for (int i = 0; i < 20; i++) {
            testService.test();
        }
    }

}
