/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10_Triu_Tuong;

/**
 *
 * @author chung
 */
public class Hinh_vuong extends Hinh{
    private int x;

    public Hinh_vuong() {
    }

    public Hinh_vuong(int x) {
        this.x = x;
    }

    public Hinh_vuong(int x, String name) {
        super(name);
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Hinh_vuong{" + "x=" + x + '}';
    }

    @Override
    public double tinhChuVi() {
    return x *4;
    }

    @Override
    public double tinhDienTich() {
    return x*x;
    }
    
}
