package com.kash.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public Principal principalBean() {
        return new Principal();
    }

    @Bean
    public College collegeBean() {
        return new College(principalBean());
    }
}
