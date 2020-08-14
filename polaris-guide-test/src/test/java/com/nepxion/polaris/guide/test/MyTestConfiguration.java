package com.nepxion.polaris.guide.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyTestConfiguration {
    @Bean
    public MyTestCases myTestCases() {
        return new MyTestCases();
    }
}