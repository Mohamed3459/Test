/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fun;

/**
 *
 * @author mt879
 */
public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected int Id;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Person(String name, int age, String gender, int Id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Id = Id;
    }
    public Person(){
        
    }
    
}
