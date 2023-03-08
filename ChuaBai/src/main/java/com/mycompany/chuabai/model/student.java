/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chuabai.model;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class student  implements Serializable {

    private String name, language;
    private int age;

    public student() {
    }

    public student(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", language=" + language + ", age=" + age + '}';
    }

    public String getStatus(int age) {
        if (age < 18) {
            return "student";
        } else if (age < 65) {
            return "young";
        } else {
            return "old";
        }
    }
}
