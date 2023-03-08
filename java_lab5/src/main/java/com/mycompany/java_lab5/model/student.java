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
public class student implements Serializable {
   private String name,major;
  private double mark;

    public student() {
    }

    public student(String name, String major, double mark) {
        this.name = name;
        this.major = major;
        this.mark = mark;
    }
  
  public String getGrade(){
  if(this.mark<3){
  return "kem";
  }
    if(this.mark<5){
  return "yeu";
  }
      if(this.mark<6.5){
  return "tb";
  }
        if(this.mark<7.5){
  return "kha";
  }
          if(this.mark<9){
  return "gioi";
  }else{
          return "xuat sac";
          }
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", major=" + major + ", mark=" + mark + '}';
    }

}
