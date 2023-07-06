package com.kash.college;

import org.springframework.stereotype.Component;


@Component
public class College {

    private final Principal principal;

    // parameterized constructor:
    public College(Principal principal) {
        this.principal = principal;
    }

    public void test() {
        this.principal.principalInfo();
        System.out.println("Testing this methods");
    }
}
