/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_asm.model;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class Empolyee implements Serializable {
    private String id,name,email;
    private double salary;
    private int age;

    public Empolyee() {
    }

    public Empolyee(String id, String name, int age, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NV{" + "id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", age=" + age + '}';
    }
    
    
    
}
