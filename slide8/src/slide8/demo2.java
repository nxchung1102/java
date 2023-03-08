/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8;

/**
 *
 * @author chung
 */
public class demo2 {
    public static void main(String[] args) {
        //non-generic 
        generic_2ThamSo_kieu p = new generic_2ThamSo_kieu();
        p.setS(1);
        p.setT("one");
        System.out.println(p);
        p.setS("one");
        p.setT(1);
        //generic
        generic_2ThamSo_kieu<String,Integer> p2 = new generic_2ThamSo_kieu<>("two", Integer.valueOf(2));
        generic_2ThamSo_kieu<String,Integer> p3 = new generic_2ThamSo_kieu<>("three",3);
        generic_2ThamSo_kieu<String,String> p4 = new generic_2ThamSo_kieu<>();
        System.out.println("\n"+p2);
        System.out.println(p3);
        
        p4.setS("one");
        p4.setT("một");
        System.out.println("\n"+p4);
    }
  
}
