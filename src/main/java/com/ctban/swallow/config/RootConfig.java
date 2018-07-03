package com.ctban.swallow.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author GuoJie 2018/7/2 12:32
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.ctban.swallow"}, excludeFilters = {@ComponentScan.Filter(value = EnableWebMvc.class)})
public class RootConfig {
}
