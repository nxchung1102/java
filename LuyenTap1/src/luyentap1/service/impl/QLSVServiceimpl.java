/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap1.service.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import luyentap1.Service1.QLSVService;
import luyentap1.model.SinhVien;

/**
 *
 * @author chung
 */
public class QLSVServiceimpl implements QLSVService{
 private List<SinhVien> lstSV = new ArrayList<>();

    public QLSVServiceimpl() {
        lstSV.add(new SinhVien("chung", "nam",2002, "hà nội"));
        lstSV.add(new SinhVien("hoàng", "nam",1999, "hà nội"));
    }

    @Override
    public ArrayList<SinhVien> loadData() {
        return (ArrayList<SinhVien>) lstSV;
    }

    @Override
    public String them(SinhVien sv) {
lstSV.add(sv);
return "them thanh cong";
    }

    @Override
    public String xoa(int index) {
        lstSV.remove(index);
        return "xoa thanh cong";
    }

    @Override
    public String sua(int index, SinhVien sv) {
        lstSV.set(index, sv);
        return "sua thanh cong";
    }

    @Override
    public int tim(String name) {
        boolean check=false;
        int i;
        for ( i = 0; i < loadData().size(); i++) {
            if(loadData().get(i).getHoTen().equalsIgnoreCase(name)){
                check = true;
            break;
            }
        }
        if(check){
        return i-1;
        }else{
        return i = -1;
        }
    }

    @Override
    public Object read(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object obj = ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            throw  new RuntimeException();
        }
    }

    @Override
    public void wri(String path, Object obj) {
        try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                    oos.writeObject(obj);
                    oos.close();
        } catch (Exception e) {
              throw  new RuntimeException();
        }
        
        
    }
    
 

}
