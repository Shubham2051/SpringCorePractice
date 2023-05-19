package com.springcore.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaconfig {

    @Bean
    public Book getBook(){
       return new Book("H C Verma");
    }

    @Bean
    public Student getStudent(){
        Student student =new Student(getBook());
        return student;
    }

}
