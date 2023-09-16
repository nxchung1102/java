/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.service_impl;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lab.model.SinhVien;
import lab.service.SinhVienService;

/**
 *
 * @author chung
 */
public class SinhVienServiceIMPL implements SinhVienService{
private ArrayList<SinhVien>lstSV = new ArrayList<>();
    public SinhVienServiceIMPL() {
        lstSV.add(new SinhVien("chung", 1, 2002, "hà nội"));
        lstSV.add(new SinhVien("hoàng", 1, 2005, "HCM"));
        lstSV.add(new SinhVien("lan", 0, 2007, "hà nội"));
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return lstSV;
    }

    @Override
    public String addnew(SinhVien sv) {
        lstSV.add(sv);
        return "them thanh cong";
    }

    @Override
    public String xoa(int index) {
        lstSV.remove(index);
        return "xoa Thanh Cong";
    }

    @Override
    public Object ghi(String a) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(a));
            oos.writeObject(lstSV);
            oos.flush();
            oos.close();
            JOptionPane.showMessageDialog(null, "success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstSV;
    }

    
}
