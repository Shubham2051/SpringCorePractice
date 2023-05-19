package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("config_spel.xml");
        Demo_spel d1 = context.getBean("ob",Demo_spel.class);

        System.out.println(d1);
    }
}
