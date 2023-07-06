package com.kash.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Hi, I'm your Math Teacher");
        System.out.println("My name is Basant");
    }
}
