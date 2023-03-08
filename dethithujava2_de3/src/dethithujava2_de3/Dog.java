/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethithujava2_de3;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class Dog implements Serializable{
    private String name ,color,gender;
    public String getStatus(String color){
    if(color.equalsIgnoreCase("white")){
    return "good";
    }else{return "normal";}
    }

    public Dog() {
    }

    public Dog(String name, String color, String gender) {
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", color=" + color + ", gender=" + gender + '}';
    }
    
}
