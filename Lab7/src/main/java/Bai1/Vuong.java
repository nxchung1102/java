/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author chung
 */
public class Vuong extends ChuNhat {

    private double canh;

    public Vuong(double canh) {
        super(canh, canh);
    }

    public Vuong() {
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println("chu vi vuong la: "+getChuvi());
        System.out.println("dien tich vuong la: "+getDienTich());
    }
}
