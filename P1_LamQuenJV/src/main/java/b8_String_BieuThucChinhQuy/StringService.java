/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8_String_BieuThucChinhQuy;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class StringService {

    Scanner _sc = new Scanner(System.in);
    String _input;

    public int checkInputNumber() {
        do {
            System.out.println("nhap so nguyen:");
            _input = _sc.nextLine();
        } while (!_input.matches("\\d+"));
        return Integer.parseInt(_input);
    }

    public String checkInputString() {
        do {
            System.out.println("nhap ho ten");
            _input = _sc.nextLine();
        } while (!_input.matches("[a-zA-Z\\s]+"));
        return _input;
    }

    public String checkInputDate() {
        do {
            System.out.println("nhap ngay sinh");
            _input = _sc.nextLine();
        } while (!_input.matches("[\\d]{2}[-|/][\\d]{2}[-|/][\\d]{4}"));
        return _input;
    }
    public String checkEmail(){
        do {
            System.out.println("nhap email");
        _input = _sc.nextLine();
        } while (!_input.matches("[^@]{2,64}@[^.]{2,253}\\.[0-9a-z-.]{2,63}"));
        return _input;
        
    }
}
