package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_lifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("config_lifeCycle.xml");
        Samosa temp = (Samosa) context.getBean("samosa1");
        System.out.println(temp);
        //this available in AbstractApplicationContext
        context.registerShutdownHook();
        System.out.println("===============================================================");
        Pepsi pep=(Pepsi) context.getBean("pepsi");
        System.out.println(pep);

        sweets sw =(sweets) context.getBean("sweets");
        System.out.println(sw);


    }
}
