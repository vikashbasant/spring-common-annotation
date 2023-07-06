package com.kash.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class College {

    @Value("${college.Name}")
    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;


    public void test() {
        System.out.println("This is: " + this.collegeName);
        this.principal.principalInfo();
        this.teacher.teach();
    }
}
