package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    //@Autowired
    //@Qualifier("address1")
    private Address address;

    public Emp() {
        super();
    }

    //@Autowired
    public Emp( Address address) {
        this.address = address;
        System.out.println("inside Construter");
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address1")
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("inside Setter");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
