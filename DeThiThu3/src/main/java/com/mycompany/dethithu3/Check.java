/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dethithu3;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Check {

    Scanner _sc = new Scanner(System.in);
    String _input;

    public int checkInputNumber() {
        do {
            System.out.print("nhap id: ");
            _input = _sc.nextLine();
        } while (!_input.matches("\\d+"));
        return Integer.parseInt(_input);
    }

}
