package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Demo_spel {
    @Value("#{33+1}")
    private int x;
    @Value("#{T(java.lang.Math).PI}")
    private double y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;

    @Value("#{ new java.lang.String('Shubham')}")
    private String name;

    @Value("#{1>3? false : true }")
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Demo_spel() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Demo_spel{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
