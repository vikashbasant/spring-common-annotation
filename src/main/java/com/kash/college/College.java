package com.kash.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class College {


    private Principal principal;


    private Teacher teacher;

    @Autowired
    @Qualifier("scienceTeacher")
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Autowired
    // setter method:
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void test() {
        this.principal.principalInfo();
        this.teacher.teach();
        System.out.println("Testing this methods");
    }
}
