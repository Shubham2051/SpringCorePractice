package com.springcore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_conInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config_CI.xml");
        Person temp=(Person) context.getBean("person1");
        System.out.println(temp);

        addition add=(addition) context.getBean("addition");
        add.doSum();
        //System.out.println(add);


    }
}
