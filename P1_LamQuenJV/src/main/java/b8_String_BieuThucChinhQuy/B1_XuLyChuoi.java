/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8_String_BieuThucChinhQuy;

/**
 *
 * @author chung
 */
public class B1_XuLyChuoi {
    public static void main(String[] args) {
        String name = "FPT Polytechnic";
        System.out.println(name);
        //toLowerCase()
        System.out.println(name.toLowerCase());
        //toUpperCase()
        System.out.println(name.toUpperCase());
        //trim()
        System.out.println(name.trim());
        //substring()
        System.out.println(name.trim().substring(4));
        System.out.println(name.trim().substring(1, 6));
        //charAt()
        System.out.println(name.charAt(0));
        
        String monHoc = "Java         lap trinh huong doi tuong";
        System.out.println(monHoc);
        String result[]= monHoc.split("\\s+");
        for (String str : result) {
            System.out.println(str);
            System.out.println(monHoc.matches("(.*)trinh(.*)"));
        }
    }
}
