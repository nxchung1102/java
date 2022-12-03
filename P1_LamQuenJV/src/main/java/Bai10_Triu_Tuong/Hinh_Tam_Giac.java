/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10_Triu_Tuong;

/**
 *
 * @author chung
 */
public class Hinh_Tam_Giac extends Hinh {

    private int a;
    private int b;
    private int c;

    public Hinh_Tam_Giac() {
    }

    public Hinh_Tam_Giac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Hinh_Tam_Giac(int a, int b, int c, String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Hinh_Tam_Giac{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    @Override
    public double tinhChuVi() {
        return a+b+c;
    }

    @Override
    public double tinhDienTich() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
