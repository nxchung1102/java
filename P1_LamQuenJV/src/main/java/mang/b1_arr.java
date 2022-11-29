/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.Arrays;
/**
 *
 * @author chung
 */
public class b1_arr {

    public static void main(String[] args) {
        /*array 1 tập các gtri có cùng kiểu dữ liệu 
         */
        int arrNumber[] = new int[5]; // khai báo 1 mạng sổ nguyên gồm 5pt
        arrNumber[0] = 3;
        arrNumber[1] = 4;
        System.out.println("arr[0]=" + arrNumber[0]);

        String arrName[] = {"FPT", "Poly", "HN"};

        for (int i = 0; i < arrName.length; i++) {
            System.out.println("arrName" + arrName[i]);
        }

        for (String name : arrName) {
            System.out.println(name);
        }
        //duyệt mảng số nguyên
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + " ");
        }
        System.out.println("");
        /*
        for each không thay đổi được gtri
         */
        for (int i : arrNumber) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("-----------------------");
        Arrays.sort(arrNumber);
        for (int i : arrNumber) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("t k nh phân");
        int index = Arrays.binarySearch(arrNumber,1);
        System.out.println("vị trí cần tìm="+ index);
    }
}
