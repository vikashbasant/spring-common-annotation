package com.kash.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class College {

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;


    public void test() {
        this.principal.principalInfo();
        this.teacher.teach();
        System.out.println("Testing this methods");
    }
}
