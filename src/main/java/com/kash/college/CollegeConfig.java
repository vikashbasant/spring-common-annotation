package com.kash.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean(name = {"colBean", "collegeBean"})
    public College collegeBean() { // =>> collegeBean - Bean id
        return new College();
    }

}
