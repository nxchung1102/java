/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author chung
 */
public abstract class SinhVienPoly {

    private String name;
    private String job;

    abstract double getDiem();

    public String getHocLuc() {
        String hocLuc = null;
        if (getDiem() < 5 && getDiem() > 0) {
            hocLuc = "hoc luc yeu";
        } else if (getDiem() >= 5 && getDiem() < 6.5) {
            hocLuc = "hoc luc trung binh";
        } else if (getDiem() >= 6.5 && getDiem() < 7.5) {
            hocLuc = "hoc luc gioi";
        } else {
            hocLuc = "xuat sac";
        }
        return hocLuc;
    }

    public SinhVienPoly() {
    }

    public SinhVienPoly(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void xuat() {
        System.out.println("ho ten: " + name);
        System.out.println("nganh: " + job);
        System.out.println("diem: " + getDiem());
        System.out.println(getHocLuc());
    }
}
