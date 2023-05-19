package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {

        ApplicationContext context =new AnnotationConfigApplicationContext(javaconfig.class);
        Student std= context.getBean("getStudent" ,Student.class);
        System.out.println(std);
        std.study();

    }
}
