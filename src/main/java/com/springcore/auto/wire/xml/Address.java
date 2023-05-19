package com.springcore.auto.wire.xml;

public class Address {
    private String Street;
    private String city;

    public Address(String street, String city) {
        Street = street;
        this.city = city;
    }

    public Address() {
        super();
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
