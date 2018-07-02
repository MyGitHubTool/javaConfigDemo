package com.ctban.swallow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author GuoJie 2018/7/2 14:20
 */
@Configuration
@PropertySource(value = {"classpath:datasource-pro.properties"})
@Profile(value = "sit")
public class ProPropertiesConfig {
}
