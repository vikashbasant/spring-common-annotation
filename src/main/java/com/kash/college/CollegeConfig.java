package com.kash.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.kash.college")
@PropertySource("college-info.properties")
public class CollegeConfig {

}
