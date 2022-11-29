/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class b2_mang2chieu {
    public static void main(String[] args) {
        /*
        mảng 2 chiều
        
        */
        Scanner sc = new Scanner(System.in);
        int col,row;
        System.out.println("nhap so hang row= ");
        row= Integer.parseInt(sc.nextLine());
        System.out.println("nhap so cot col= ");
        col= Integer.parseInt(sc.nextLine());
        int arrNumber [][]=new int [row][col];
        //gán giá trị
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrNumber [%d] [%d]= " ,i,j);
                arrNumber[i][j]=sc.nextByte();
            }
        }
        
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrNumber [%d] [%d]= [%d] \n" ,i,j,arrNumber[i][j]);
                
            }
        }
    }
}
