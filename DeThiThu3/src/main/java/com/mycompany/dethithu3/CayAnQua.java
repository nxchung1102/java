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
public class CayAnQua extends Cây{
    private String ten;
    private int soQua;

    public CayAnQua() {
    }

    
    public CayAnQua(String ten, int soQua) {
        this.ten = ten;
        this.soQua = soQua;
    }

    public CayAnQua(String ten, int soQua, int ID, String loaiCay, String mauLa) {
        super(ID, loaiCay, mauLa);
        this.ten = ten;
        this.soQua = soQua;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoQua() {
        return soQua;
    }

    public void setSoQua(int soQua) {
        this.soQua = soQua;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("ten cay: "+ten);
        System.out.println("so qua: "+soQua);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap(); 
        System.out.println("nhap ten cay: ");
        this.ten = sc.nextLine();
        System.out.println("nhap so qua: ");
        this.soQua = Integer.parseInt(sc.nextLine());
    }
    
    
    
}
