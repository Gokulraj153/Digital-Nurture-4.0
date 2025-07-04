package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..)) || execution(* com.library.repository.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object returnValue = joinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("Execution time of " + joinPoint.getSignature() + ": " + (end - start) + "ms");

        return returnValue;
    }
}
