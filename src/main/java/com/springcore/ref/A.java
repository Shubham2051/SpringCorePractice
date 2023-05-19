package com.springcore.ref;

public class A  {
    private int x;
    private B ab;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getAb() {
        return ab;
    }

    public void setAb(B ab) {
        this.ab = ab;
    }

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ab=" + ab +
                '}';
    }
}
