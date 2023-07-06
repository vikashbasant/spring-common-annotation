package com.kash.college;

import org.springframework.stereotype.Component;


@Component
public class College {

    private Principal principal;


    // setter method:
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void test() {
        this.principal.principalInfo();
        System.out.println("Testing this methods");
    }
}
