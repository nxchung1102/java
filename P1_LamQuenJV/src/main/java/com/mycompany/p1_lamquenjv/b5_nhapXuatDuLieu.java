/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1_lamquenjv;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class b5_nhapXuatDuLieu {
     public static void main(String[] args) {
        System.out.println("hello");
        System.out.print(":3");
        System.out.printf("hôm nay là %d", 2004);
        
        //2. nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("\n nhập họ và tên:" );
        String name = sc.nextLine();
        System.out.println("nhạp tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = sc.nextLine();
        
         System.out.println(name);
         System.out.println(age);
         System.out.println(address);
               
        
        
        
        
    }
}
