package com.kash.college;

import org.springframework.stereotype.Component;

@Component // =>> By-default bean for the same class but camleCase notation:
public class College {
    public void test() {
        System.out.println("Testing this methods");
    }
}
