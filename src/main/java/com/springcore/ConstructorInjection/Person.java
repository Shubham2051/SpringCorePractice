package com.springcore.ConstructorInjection;

public class Person {
    private String name;
    private int personId;
    private certi certificate;

    public Person(String name, int personId,certi certificate) {
        this.name = name;
        this.personId = personId;
        this.certificate=certificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                '}';
    }
}
