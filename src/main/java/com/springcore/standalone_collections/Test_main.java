package com.springcore.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_main {
    public static void main(String[] args) {

        ApplicationContext Context =new ClassPathXmlApplicationContext("config_alone.xml");

        Person per= (Person) Context.getBean("person");
        System.out.println(per);
        System.out.println(per.getFriends().getClass().getName());


    }

}
