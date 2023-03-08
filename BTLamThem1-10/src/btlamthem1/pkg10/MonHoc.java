/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlamthem1.pkg10;

/**
 *
 * @author chung
 */
public class MonHoc {
    private String MaMH;
    private String TenMH;
    private int SoTiet;

    public MonHoc() {
    }

    public MonHoc(String MaMH, String TenMH, int SoTiet) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.SoTiet = SoTiet;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "MaMH=" + MaMH + ", TenMH=" + TenMH + ", SoTiet=" + SoTiet + '}';
    }
    
           
}
