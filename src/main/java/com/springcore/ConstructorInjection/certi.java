package com.springcore.ConstructorInjection;

public class certi {
    private String name;

    public certi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "certi{" +
                "name='" + name + '\'' +
                '}';
    }
}
