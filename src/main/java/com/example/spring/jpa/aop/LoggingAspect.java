package com.example.spring.jpa.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class) ;

    @Before("execution(* com.example.spring.jpa.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        logger.info("method called : {}", jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.spring.jpa.service.JobService.*(..))")
    public void logMethodCrash(JoinPoint jp){
        logger.info("Exception in method : {}" , jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.spring.jpa.service.JobService.*(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        logger.info("method successfully executed : {}" , jp.getSignature().getName() );
    }

    @After("execution(* com.example.spring.jpa.service.JobService.*(..))")
    public void logMethodExecuted(JoinPoint jp){
        logger.info("method finished : {}", jp.getSignature().getName());
    }
}
