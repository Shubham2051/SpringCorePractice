package com.springcore.auto.wire.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowire_main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config_autowire.xml");
        Emp emp = (Emp) context.getBean("emp1");

        System.out.println(emp);
    }
}
