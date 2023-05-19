package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class sweets {
    private String name;

    public sweets() {
        super();
    }

    public sweets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "sweets{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("this init method:sweets");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("this is destroy method:sweets");
    }
}
