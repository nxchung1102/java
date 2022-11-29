/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class bai3 {

    public static void sapXep(int arr[]) {
        Arrays.sort(arr);
        System.out.println("arr sau khi sap xep: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static void timMin(int arr[],int min) {
        min=arr[0];
        for (int i = 1; i < arr.length; i++) {
           
            min = Math.min(min, arr[i]);
         
        }
        System.out.println("min: " + min);
    }

    public static void tinhTB(int arr[], int a, int count, int avg) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                a += arr[i];
                count++;
            }

        }
        avg = a / count;
        System.out.println("trung binh cong cac so chia het cho 3 la: " + avg);
    }
    
    public  void calculate() {
        System.out.println("nhap do dai cho mang:");
                Scanner sc = new Scanner(System.in);
        int n,min=0,total=0,count=0,avg=0;
        n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap gia tri arr[%d]= ",i);
            arr[i]=sc.nextInt();
        }
        bai3.sapXep(arr);
        bai3.timMin(arr,min);
        bai3.tinhTB(arr, total, count, avg);
    }
}
