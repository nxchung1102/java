/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;
import java.util.ArrayList;
import model.sinhvien;
/**
 *
 * @author chung
 */
public interface QLSVService {
        
    ArrayList<sinhvien> getList();
    
  public  String them(sinhvien sinhVien);
  public  String update(int id,sinhvien sv);
  public  String delete(int id);
 
}
