/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class tinhTienDien {
    public static void main(String[] args) {
        double totalMoney=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of electricity: ");
      double  totalElectricity= Double.parseDouble(sc.nextLine());
      if(totalElectricity>=0&&totalElectricity<50)
      {
      totalMoney = totalElectricity*1000;
          System.out.println("the total amount to be paid is: "+totalMoney);
      }
      else
      {
      totalMoney = 50*1000+(totalElectricity-50)*1200;
      System.out.println("the total amount to be paid is: "+totalMoney);
      }
    }
    
}
