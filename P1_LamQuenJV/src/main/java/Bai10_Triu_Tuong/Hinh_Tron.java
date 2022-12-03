/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10_Triu_Tuong;

/**
 *
 * @author chung
 */
public class Hinh_Tron extends Hinh{
    private int r;

    public Hinh_Tron() {
    }

    public Hinh_Tron(int r) {
        this.r = r;
    }

    public Hinh_Tron(int r, String name) {
        super(name);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Hinh_Tron{" + "r=" + r + '}';
    }

    @Override
    public double tinhChuVi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tinhDienTich() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
