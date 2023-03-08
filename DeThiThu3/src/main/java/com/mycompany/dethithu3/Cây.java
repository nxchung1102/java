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
public class Cây {
    private int ID;
    private String loaiCay;
    private String mauLa;

    public Cây() {
    }

    public Cây(int ID, String loaiCay, String mauLa) {
        this.ID = ID;
        this.loaiCay = loaiCay;
        this.mauLa = mauLa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLoaiCay() {
        return loaiCay;
    }

    public void setLoaiCay(String loaiCay) {
        this.loaiCay = loaiCay;
    }

    public String getMauLa() {
        return mauLa;
    }

    public void setMauLa(String mauLa) {
        this.mauLa = mauLa;
    }
    public void inThongTin(){
        System.out.println("id: "+ID);
        System.out.println("loai cay: "+loaiCay);
        System.out.println("mau la: "+mauLa);
    }
    public void nhap(){
        Check c = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("========nhap thong tin=========");
        this.ID = c.checkInputNumber();
        System.out.print("nhap loai cay: ");
        this.loaiCay = sc.nextLine();
        System.out.print("nhap mau la: ");
        this.mauLa=sc.nextLine();     
    }
}
