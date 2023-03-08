/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_lab3;

import java.util.*;

/**
 *
 * @author chung
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student sv1 = new Student();
        sv1.setName("tuấn");
        sv1.setMajor("CNTT");
        sv1.setMarks(7);
        map.put("sv1", sv1);
        Student sv2 = new Student();
        sv2.setName("hoàng");
        sv2.setMajor("QHCC");
        sv2.setMarks(8);
        map.put("sv2", sv2);
        Student sv3 = new Student();
        sv3.setName("Tuấn");
        sv3.setMajor("TKDH");
        sv3.setMarks(9);
        map.put("sv3", sv3);
        Set<String>keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println("họ và tên: "+ sv.getName());
            System.out.println("học lực: "+sv.getGrade());
        }
    }
}
