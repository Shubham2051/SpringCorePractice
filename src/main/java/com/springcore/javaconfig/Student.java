package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {
    private Book book;

    public Student(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void study(){
        this.book.reading();
        System.out.println("I am reading this book --> "+ this.book.getName());

    }

    @Override
    public String toString() {
        return "Student{" +
                "book=" + book +
                '}';
    }
}
