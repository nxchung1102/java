/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMGioHang;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_GH {
  public ArrayList<VMGioHang> getAllGH();

    public String addNewGH(VMGioHang V_gh);

    public String UpdateGH(String id, VMGioHang V_gh);

    public String DeleteGH(String id);   
}
