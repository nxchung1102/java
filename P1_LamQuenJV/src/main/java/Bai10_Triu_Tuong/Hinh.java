/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10_Triu_Tuong;

/**
 *
 * @author chung
 */
//abstract class : lớp trìu tượng
public abstract class Hinh {
    private String name;
   abstract public double tinhChuVi();
   abstract public double tinhDienTich();
    

    public Hinh() {
    }

    public Hinh(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hinh{" + "name=" + name + '}';
    }
    
}
