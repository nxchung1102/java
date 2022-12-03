/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author chung
 */
public class ChuNhat {
    private double dai;
    private double rong;

    public ChuNhat() {
    }

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
public double getChuvi(){
return (dai+rong)*2;
}
public double getDienTich(){
return dai*rong;
}
public void xuat(){
    System.out.println("---------------------------");
    System.out.println("chieu dai: "+dai);
    System.out.println("Chieu rong: "+rong);
    System.out.println("chu vi chu nhat la: "+ getChuvi());
    System.out.println("dien tich chu nhat la: "+getDienTich());
}

    
    
}
