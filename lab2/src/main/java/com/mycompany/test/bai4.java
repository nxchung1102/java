/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class bai4 {

    public static void xepLoai(String a[], double b[]) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 0 && b[i] < 5) {
                System.out.println("Ten: " + a[i] + " Diem: " + b[i] + " Hoc luc yeu");
            } else if (b[i] >= 5 && b[i] < 6.5) {
                System.out.println("Ten: " + a[i] + " Diem: " + b[i] + " Hoc luc trung binh");
            } else if (b[i] >= 6.5 && b[i] < 7.5) {
                System.out.println("Ten: " + a[i] + " Diem: " + b[i] + " Hoc luc kha");
            } else if (b[i] >= 7.5 && b[i] < 9) {
                System.out.println("Ten: " + a[i] + " Diem: " + b[i] + " Hoc luc gioi");
            } else if (b[i] >= 9 && b[i] <= 10) {
                System.out.println("Ten: " + a[i] + " Diem: " + b[i] + " Hoc luc xuat sac");
            } else {
                System.out.println("khong ton tai");
            }
        }
    }

    public static void sapXep(double b[]) {
        double temp;
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
    }

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        String hoten[] = new String[n];
        double diemSv[] = new double[n];
        for (int i = 1; i <= n; i++) {
            System.out.print("nhap sinh ho ten svien thu " + i + ": ");
            hoten[i] = sc.nextLine();
            System.out.print("nhap diem cho sinh vien thu " + i + ": ");
            diemSv[i] = Double.parseDouble(sc.nextLine());

        }

//        double diem[] = new double[n];
//        for (int i = 1; i <= diem.length; i++) {
//            System.out.println("nhap diem sinh vien thu " + i);
//            System.out.println("ho ten sinh vien:");
//            diem[i] = Double.parseDouble(sc.nextLine());
//        }
//        bai4.xepLoai(hoten, diem);
//        bai4.sapXep(diem);
    }
}
