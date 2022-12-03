/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Check {

    Scanner _sc = new Scanner(System.in);
    String _input;

    public String getInputValue(String str) {
        System.out.print(str);
        return _sc.nextLine();
    }

    public String checkMaNV() {
        do {
            _input = getInputValue("nhap ma nhan vien: ");

        } while (!_input.matches("\\w+"));
        return _input;
    }

    public String checkHoTen() {
        do {

            _input = getInputValue("nhap ho ten nhan vien: ");
        } while (!_input.matches("[a-zA-Z\\s]+"));
        return _input;
    }

    public double checkLuong() {
        do {

            _input = getInputValue("nhap so tien luong: ");
        } while (!_input.matches("\\d+"));
        return Double.parseDouble(_input);
    }

    public double checkDoanhso() {
        do {

            _input = getInputValue("nhap doanh so: ");
        } while (!_input.matches("\\d+"));
        return Double.parseDouble(_input);
    }

    public double checkHoaHong() {
        do {

            _input = getInputValue("nhap so tien hoa hong: ");
        } while (!_input.matches("\\d+"));
        return Double.parseDouble(_input);
    }

    public double checkTrachNhiem() {
        do {

            _input = getInputValue("nhap so tien trach nhiem: ");
        } while (!_input.matches("\\d+"));
        return Double.parseDouble(_input);
    }
}
