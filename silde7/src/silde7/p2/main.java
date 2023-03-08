/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package silde7.p2;

/**
 *
 * @author chung
 */
public class main {
    public static void main(String[] args) {
        // tương ứng với 8 KDL nguyên thủy có 8 class wrapper bao chọn lấy 8 KDL nguyên thủy <=> chuyển qua chuyển lại 
        //việc chuyển từ nguyên thủy => đối tượng là boxing,autoboxing: đóng hộp, bao đóng
        //chuyển từ obj => nguyên thủy  là unboxing,autounboxing: mở hộp, bao mở
        //boxing: nguyên thủy => obj
        Integer I = Integer.valueOf(5);
        Double D = Double.valueOf(6);
        Integer iobj = new Integer(100);

        //auto boxing 
         Integer I2 = 5;
         Float F = (float) 6.5; // n đang hiểu là double nên phải ép kiểu
          Double D2 = 9.5;
          //unboxing
          int i = I.intValue();
          double d = D.doubleValue();
          //auto unboxing
          int i2 = I;
          double d2 = D; 
    }
}
