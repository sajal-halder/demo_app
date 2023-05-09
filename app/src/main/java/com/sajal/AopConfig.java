package com.sajal;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Aspect
@Configuration
public class AopConfig {

    Logger logger = LoggerFactory.getLogger(AopConfig.class);

    @Before("execution(public int com.sajal.A.getSum(..))")
    public void beforeGetSum(JoinPoint joinPoint) {
        logger.info("**** Staring - " + joinPoint.getSignature().getName());
        logger.info("**** With parameter - " + Arrays.toString(joinPoint.getArgs()));
    }

    @Before("execution( int com.sajal.A.getNum(..))")
    public void beforeGetNum(JoinPoint joinPoint) {
        logger.info("**** Staring - " + joinPoint.getSignature().getName());
    }

    @Before("execution(public void com.sajal.A.printHello(..))")
    public void beforePrintHello(JoinPoint joinPoint) {
        logger.info("**** Staring - " + joinPoint.getSignature().getName());
    }

//    @Before("execution(*com.sajal.A.getNum(..))")
//    public void before2(JoinPoint joinPoint) {
//        logger.info("**** Staring - " + joinPoint.getSignature().getName());
//        logger.info("**** With parameter - " + Arrays.toString(joinPoint.getArgs()));
//    }
//    @Before("execution(*com.sajal.A.getSum(..))")
//    public void before3(JoinPoint joinPoint) {
//        logger.info("**** Staring - " + joinPoint.getSignature().getName());
//        logger.info("**** With parameter - " + Arrays.toString(joinPoint.getArgs()));
//    }

}