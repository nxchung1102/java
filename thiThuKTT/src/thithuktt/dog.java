/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thithuktt;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class dog implements Serializable{

private String Name,gender;
private double Weight ;
public String getStatus(double weight){
if(weight<5){
return "Normal";
}else{
return  "fat";
}
}

    public dog(String Name, double Weight, String gender) {
        this.Name = Name;
        this.gender = gender;
        this.Weight = Weight;
    }

    public dog() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    @Override
    public String toString() {
        return "dog{" + "Name=" + Name + ", gender=" + gender + ", Weight=" + Weight + '}';
    }

}
