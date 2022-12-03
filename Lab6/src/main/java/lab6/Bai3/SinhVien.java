/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Bai3;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class SinhVien {

    private String hoten;
    private String email;
    private String sdt;
    private String cmnd;

    public SinhVien() {
    }
    Scanner sc = new Scanner(System.in);

    public SinhVien(String hoten, String email, String sdt, String cmnd) {
        this.hoten = hoten;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void nhap() {
        do {
            hoten = title("nhap ho ten: ");
            if (hoten == null || hoten.equalsIgnoreCase(" ")) {
                System.out.println("ho ten khong duoc de trong!");
            } else {
                break;
            }
        } while (true);
        CheckSV check = new CheckSV();
        do {
            email = title("nhap email: ");
            if (check.checkEmail(email)) {
                break;
            }
            System.out.println("email khong hop le!");
        } while (true);
        do {
            sdt = title("nhap sdt: ");
            if (check.checkSDT(sdt)) {
                break;
            }
            System.out.println("sdt khong hop le!");
        } while (true);
        do {
            cmnd = title("nhap cmnd: ");
            if (check.checkCMND(cmnd)) {
                break;
            }
            System.out.println("cmnd khong hop le!");
        } while (true);
    }

    public void xuat() {
        System.out.printf("%-20s | %-30s | %-12s | %-12s \n", hoten, email, sdt, cmnd);
    }

    String title(String str) {
        System.out.print(str);
        return sc.nextLine();
    }

}
