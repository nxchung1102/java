/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethithujava2_de7;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class Laixe implements Serializable{
    private String ten,loaiBang;
     private int namKN;
     public String getTrangThai(int namKN){
     if(namKN > 3)return "tot";
     else return "binh thuong";
     }

    public Laixe() {
    }

    public Laixe(String ten, String loaiBang, int namKN) {
        this.ten = ten;
        this.loaiBang = loaiBang;
        this.namKN = namKN;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaiBang() {
        return loaiBang;
    }

    public void setLoaiBang(String loaiBang) {
        this.loaiBang = loaiBang;
    }

    public int getNamKN() {
        return namKN;
    }

    public void setNamKN(int namKN) {
        this.namKN = namKN;
    }

    @Override
    public String toString() {
        return "Laixe{" + "ten=" + ten + ", loaiBang=" + loaiBang + ", namKN=" + namKN + '}';
    }
     
}
