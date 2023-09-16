/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package luyentap1.Service1;

import java.util.ArrayList;
import luyentap1.model.SinhVien;

/**
 *
 * @author chung
 */
public interface QLSVService {
    public ArrayList<SinhVien> loadData();

     public String them(SinhVien sv);

    public String xoa(int index);
    
    public String sua(int index,SinhVien sv);
    
    public int tim(String name);
    
    public Object read(String path);
    
    public void wri(String path,Object obj);
    
}
