package com.kash.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        // Create the object CollegeConfig class from base package:
        // Register that object in the application context inside the IOC container:
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);


        // Fetch the object through bean id="collegeBean"
        College college = context.getBean("college", College.class);
        System.out.println("This college object created by spring is: " + college);
        college.test();

    }
}
