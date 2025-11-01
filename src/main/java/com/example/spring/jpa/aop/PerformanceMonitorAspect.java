package com.example.spring.jpa.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private static final Logger logger = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around(("execution(* com.example.spring.jpa.service.JobService.*(..))"))
    public Object moniterTime(ProceedingJoinPoint jp) throws Throwable {

        long start = System.currentTimeMillis() ;
        Object obj = jp.proceed() ;
        long end = System.currentTimeMillis() ;
        logger.info("method time taken : {} : {} ms" , jp.getSignature().getName() , end-start );

        return obj;
    }
}
