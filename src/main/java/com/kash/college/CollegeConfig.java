package com.kash.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public Teacher scienceTeacherBean() {
        return new ScienceTeacher();
    }

    @Bean
    public Teacher mathTeacherBean() {
        return new MathTeacher();
    }

    @Bean
    public Principal principalBean() {
        return new Principal();
    }

    @Bean
    public College collegeBean() {
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(scienceTeacherBean());
        return college;
    }
}
