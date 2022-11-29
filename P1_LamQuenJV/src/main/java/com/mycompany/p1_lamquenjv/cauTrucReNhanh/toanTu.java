/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1_lamquenjv.cauTrucReNhanh;

/**
 *
 * @author chung
 */
public class toanTu {
    // <biểu thức điều kiện>?<gtri đúng>:<gtri sai>
    public static void main(String[] args) {
        boolean test = !(5>6);
        System.out.println(test);
        double luong = 8000;
        boolean check = (luong>5000) ? true : false ;
        System.out.println(check);
        
        int a =6,b=7;
        /*
        
         Math.celi(a) làm tròn lên
         Math.floor(a) làm tròn xuống
         
        */
        int c = (int) Math.pow(a, b);
        System.out.println("pow=" + c);
        
        
    }
}
