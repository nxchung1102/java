/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author chung
 */
public class SinhVienBiz extends SinhVienPoly {

    private double marketting;
    private double sale;

    @Override
    double getDiem() {
        return (2 * marketting + sale) / 3;

    }

    public SinhVienBiz(double marketting, double sale) {
        this.marketting = marketting;
        this.sale = sale;
    }

    public SinhVienBiz(double marketting, double sale, String name, String job) {
        super(name, job);
        this.marketting = marketting;
        this.sale = sale;
    }

    public double getMarketting() {
        return marketting;
    }

    public void setMarketting(double marketting) {
        this.marketting = marketting;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    @Override
    public void xuat() {
        super.xuat();
    }
}
