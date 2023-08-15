package com.xiazeyu.agent.config.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AopAspectConfig {

    @Around("@annotation(com.xiazeyu.agent.config.aop.Monitor)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            log.info("aop begin");
            return proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw e;
        } finally {
            log.info("aop end");
        }
    }

}
