package com.jspider.springcore;

public class Student {

    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student name is: " + name);
    }
}