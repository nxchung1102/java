/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab5;

/**
 *
 * @author chung
 */
public class XFileDemo {
    public static void main(String[] args) {
        byte[] data = XFile.read("a.txt");
        XFile.write("a.txt", data);
    }
}
