/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab5.model;

import com.mycompany.java_lab5.XFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chung
 */
public class main {
    public static void main(String[] args) {
        List<student> lstST = new ArrayList<>();
        lstST.add(new student("a", "cntt", 10));
        lstST.add(new student("b", "tt", 8));
        lstST.add(new student("c", "cnt", 6));
        XFile.wriObj("b.txt", lstST);
        List<student> lstST2 = (List<student>) XFile.readObj("b.txt");
        for (student object : lstST) {
            object.toString();
        }
    }
}
