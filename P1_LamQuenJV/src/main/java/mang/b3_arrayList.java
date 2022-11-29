/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chung
 */
public class b3_arrayList {

    public static void main(String[] args) {
        // khai báo 1 arraylist không định kiểu
        ArrayList lstKDK = new ArrayList();
        lstKDK.add(1);
        lstKDK.add("chung:3");
        lstKDK.add(true);
        //duyệt mảng arraylist không định kiểu
        for (int i = 0; i < lstKDK.size(); i++) {
            System.out.println(lstKDK.get(i));
        }
        //p2 arrlist có định kiểu
        //làm việc với lớp kiểu dữ liệu - wrapper
        ArrayList<Integer> lstInteger = new ArrayList<>();
        lstInteger.add(1);
        lstInteger.add(4);

        ArrayList<Double> lstDouble = new ArrayList<>();
        for (Integer i : lstInteger) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //ArrayList.sort(lstInteger)
        System.out.println("sắp xếp tăng dần");
        Collections.sort(lstInteger);
        for (Integer i : lstInteger) {
            System.out.print(i + " ");
        }
        
        System.out.println("sắp xếp gi dần");
        Collections.reverse(lstInteger);
        for (Integer i : lstInteger) {
            System.out.print(i + " ");
        }
    }

}
