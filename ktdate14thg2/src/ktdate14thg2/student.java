/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ktdate14thg2;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class student implements Serializable{

  private String id , name ,gender;
          private  double markAVG;
          public String getStatus(double mark){
          if(mark >=5) return "dat";
          else return  "truot";
          }

    public student() {
    }

    public student(String id, String name, String gender, double markAVG) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.markAVG = markAVG;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMarkAVG() {
        return markAVG;
    }

    public void setMarkAVG(double markAVG) {
        this.markAVG = markAVG;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", markAVG=" + markAVG + '}';
    }
                  
    
}
