/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMNhanVien;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_NV {
      public ArrayList<VMNhanVien> getAllNV();

    public String addNewNV(VMNhanVien V_nv);

    public String UpdateNV(String id, VMNhanVien V_nv);

    public String DeleteNV(String id);  
}
