package com.baixs.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author baifujun
 * @date 2022-01-21
 * @time 14:27
 */
@Configuration
@ConditionalOnClass({DemoService.class})
@EnableConfigurationProperties(DemoServiceProperties.class)
@ConditionalOnProperty(prefix = "service", name = "enabled", havingValue = "true")
public class DemoServiceAutoConfig {
    @Autowired
    private DemoServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean({DemoService.class})
    public DemoService demoService() {
        return new DemoService(properties.getName());
    }
}
