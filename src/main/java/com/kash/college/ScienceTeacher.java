package com.kash.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Hi, I'm Vivek");
        System.out.println("I'm your science teacher");
    }
}
