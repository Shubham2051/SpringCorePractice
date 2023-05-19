package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_main {
    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("config_stereo.xml");
        Student std = context.getBean("std",Student.class );
        System.out.println(std);


    }
}
