/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMHoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_HDCT {
         public ArrayList<VMHoaDonChiTiet> getAllHDCT();

    public String addNewHDCT(VMHoaDonChiTiet V_hdct);

    public String UpdateHDCT(String id, VMHoaDonChiTiet V_hdct);

    public String DeleteHDCT(String id1,String id2);
}
