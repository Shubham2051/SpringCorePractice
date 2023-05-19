package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Pepsi implements InitializingBean, DisposableBean {
    private int price;

    public Pepsi(int price) {
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking pepsi init");
    }

    public void destroy() throws Exception {
        System.out.println("pepsi ended destroy");
    }
}
