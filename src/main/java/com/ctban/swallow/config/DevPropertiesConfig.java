package com.ctban.swallow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author GuoJie 2018/7/2 14:20
 */
@Configuration
@PropertySource(value = {"classpath:datasource-dev.properties"})
@Profile(value = "dev")
public class DevPropertiesConfig {
}
