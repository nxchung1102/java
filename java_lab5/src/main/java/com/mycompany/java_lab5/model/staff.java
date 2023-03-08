/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab5.model;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class staff implements Serializable {

    private String name;
    private double salary;

    public staff() {
    }

    public staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("staff{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

}
