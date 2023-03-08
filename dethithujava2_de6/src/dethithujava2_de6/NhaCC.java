/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethithujava2_de6;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class NhaCC implements Serializable{
   private String name,chuHo,loai;
   private double gia;

    public NhaCC() {
    }

    public NhaCC(String name, String chuHo, double gia, String loai) {
        this.name = name;
        this.chuHo = chuHo;
        this.loai = loai;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChuHo() {
        return chuHo;
    }

    public void setChuHo(String chuHo) {
        this.chuHo = chuHo;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "NhaCC{" + "name=" + name + ", chuHo=" + chuHo + ", loai=" + loai + ", gia=" + gia + '}';
    }

 
   
}
