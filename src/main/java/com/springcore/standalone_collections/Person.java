package com.springcore.standalone_collections;

import java.util.List;
import java.util.Map;

public class Person {

    private List<String> friends;
    private Map<String,Integer> feestruture;

    public Map<String, Integer> getFeestruture() {
        return feestruture;
    }

    public void setFeestruture(Map<String, Integer> feestruture) {
        this.feestruture = feestruture;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Person(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feestruture=" + feestruture +
                '}';
    }
}
