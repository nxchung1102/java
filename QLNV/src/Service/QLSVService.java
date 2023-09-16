/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface QLSVService {
        public ArrayList<NhanVien> getAll();
        public String del(String ma);
        public String update(String ma, NhanVien nv);
}
