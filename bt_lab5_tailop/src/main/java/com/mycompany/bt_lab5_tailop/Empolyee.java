/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bt_lab5_tailop;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class Empolyee implements Serializable{

    private String id, name, languages;
    private int age;

    public Empolyee() {
    }

    public Empolyee(String id, String name, String languages, int age) {
        this.id = id;
        this.name = name;
        this.languages = languages;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Empolyee{" + "id=" + id + ", name=" + name + ", languages=" + languages + ", age=" + age + '}';
    }

    public String getTuoiLaoDong(int age) {
        if (age < 18) {
            return "chua truong thanh";
        }
        if (age < 40) {
            return "tuoi tre";
        }
        if (age < 60) {
            return "sap ve huu";
        } else {
            return "tuoi gia";
        }

    }
}
