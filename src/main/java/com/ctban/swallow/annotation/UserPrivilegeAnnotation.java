package com.ctban.swallow.annotation;

import java.lang.annotation.*;

/**
 * @author GuoJie 2018/7/3 10:34
 */

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserPrivilegeAnnotation {
}
