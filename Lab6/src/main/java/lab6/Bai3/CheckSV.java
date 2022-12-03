/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Bai3;

/**
 *
 * @author chung
 */
public class CheckSV {

    public boolean checkEmail(String str) {
        String dinhDangEM = "\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(dinhDangEM);
    }

    public boolean checkSDT(String str) {
        return str.matches("0\\d{9}");
    }

    public boolean checkCMND(String str) {
        return str.matches("\\d{6}");
    }
}
