package com.springcore.auto.wire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowire_main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config_autowire_annotation.xml");
        Emp emp = (Emp) context.getBean("emp1");

        System.out.println(emp);
    }
}
