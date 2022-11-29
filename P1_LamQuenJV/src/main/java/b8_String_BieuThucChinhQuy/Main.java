/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8_String_BieuThucChinhQuy;

/**
 *
 * @author chung
 */
public class Main {

    public static void swap (int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    }
    public static void main(String[] args) {
//        StringService cs = new StringService();
//        int n = cs.checkInputNumber();
//        System.out.println("n= " + n);
//        String hoTen = cs.checkInputString();
//        System.out.println("ho ten:" + hoTen);
//        String date = cs.checkInputDate();
//        System.out.println("date:" + date);
//        String email = cs.checkEmail();
//        System.out.println("email:" + email);
        int a=7,b=6;
        swap(a,b);
        System.out.println(a+" "+b);
    }
}
