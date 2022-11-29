/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1_lamquenjv;

/**
 *
 * @author chung
 */
public class b4_wrapper {
      public static void main(String[] args) {
       /*
        LỚP BAO-WRAPPER 
        tương ứng với kiểu nguyên thủy => có tác lớp bao tương ứng
        -kiểu nguyên thủy => kiểu wrapper 
        -boolean => Boolean
        -byte => Byte
        -char => Character
        -short => Short
        -int => Integer
        -long => Long
        -float => Float
        -double => Double
        
        */
       /*
       boxing => bao lấy gtri nguyên thủy
       */
       Integer a = new Integer(5); //bao tường minh
       Integer b = Integer.valueOf(5);//bao tường minh
       Integer c = 5; //bao ngầm định
        /*
       Unboxing: lấy giá trị từ lớp bao đó
       */
        int value = a.intValue(); // mở bao tường minh
        int result = b; // mở bao ngầm định
        double d =0;
        Double dou = null;
    }
}
