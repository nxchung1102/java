/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMGioHangChiTiet;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_GHCT {
        public ArrayList<VMGioHangChiTiet> getAllGHCT();

    public String addNewGHCT(VMGioHangChiTiet V_ghct);

    public String UpdateGHCT(String id, VMGioHangChiTiet V_ghct);

    public String DeleteGHCT(String id1,String id2);
}
