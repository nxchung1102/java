/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6_bt_oop_arrlist;

/**
 *
 * @author chung
 */
public class NguoiYeuCu {

    //private tất cả các thuộc tính
    private String maNY;
    private String mame;
    private String age;
    private double vong1;
    private double vong2;
    private double vong3;

    public NguoiYeuCu() {
    }

    public NguoiYeuCu(String maNY, String mame, String age, double vong1, double vong2, double vong3) {
        this.mame = mame;
        this.age = age;
        this.vong1 = vong1;
        this.vong2 = vong2;
        this.vong3 = vong3;
    }

    public String getMaNY() {
        return maNY;
    }

    public void setMaNY(String maNY) {
        this.maNY = maNY;
    }


    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getVong1() {
        return vong1;
    }

    public void setVong1(double vong1) {
        this.vong1 = vong1;
    }

    public double getVong2() {
        return vong2;
    }

    public void setVong2(double vong2) {
        this.vong2 = vong2;
    }

    public double getVong3() {
        return vong3;
    }

    public void setVong3(double vong3) {
        this.vong3 = vong3;
    }

    public void gioiThieu() {
    }

    @Override
    public String toString() {
        return "NguoiYeuCu{" + "maNY=" + maNY + ", mame=" + mame + ", age=" + age + ", vong1=" + vong1 + ", vong2=" + vong2 + ", vong3=" + vong3 + '}';
    }

}
