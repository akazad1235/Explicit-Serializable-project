package com.example.akazad.employee.employee;

import java.io.Serializable;

public class Employee implements Serializable{

    private  String name;
    private int age;
    private Contact contact; //one to one association

    public Employee(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
