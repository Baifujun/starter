package com.baixs.starter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author baifujun
 * @date 2022-01-21
 * @time 14:26
 */
@Data
@AllArgsConstructor
public class DemoService {
    private String name;

    public String hello() {
        return "hello " + name;
    }
}
