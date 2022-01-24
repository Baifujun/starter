package com.baixs.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author baifujun
 * @date 2022-01-21
 * @time 14:37
 */
@Data
@ConfigurationProperties(prefix = "service")
public class DemoServiceProperties {
    /**
     * 姓名
     **/
    private String name;

    /**
     * true启用，false停用
     **/
    private boolean enabled;
}
