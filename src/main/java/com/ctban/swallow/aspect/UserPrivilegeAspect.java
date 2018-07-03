package com.ctban.swallow.aspect;

import com.ctban.swallow.annotation.UserPrivilegeAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author GuoJie 2018/7/3 10:36
 */
@Component
@Aspect
public class UserPrivilegeAspect {

    @Before("@annotation(userPrivilegeAnnotation)")
    public void beforeTest(JoinPoint joinPoint, UserPrivilegeAnnotation userPrivilegeAnnotation) {
        System.out.println("前置通知执行");

    }
}
