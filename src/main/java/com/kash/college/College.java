package com.kash.college;

import org.springframework.stereotype.Component;


@Component
public class College {

    private Principal principal;

    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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
