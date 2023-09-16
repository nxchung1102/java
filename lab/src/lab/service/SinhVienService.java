/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab.service;

import java.util.ArrayList;
import lab.model.SinhVien;

/**
 *
 * @author chung
 */
public interface SinhVienService {
    public ArrayList<SinhVien> getList();
    public String addnew(SinhVien sv);
    public String xoa(int index);
    public Object ghi(String a);
}
