/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1_lamquenjv.cauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class tryCatch {
    /*
    try catch kiểm soát lỗi
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhap so tien luong");
            double luong = Double.parseDouble(sc.nextLine());
            System.out.println("luong= "+luong);
        } catch (Exception e) {
        }
    }
}
