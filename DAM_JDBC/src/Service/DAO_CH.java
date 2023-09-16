/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMCuaHang;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_CH {
        public ArrayList<VMCuaHang> getAllCH();

    public String addNewCH(VMCuaHang V_ch);

    public String UpdateCH(String id, VMCuaHang V_ch);

    public String DeleteCH(String id);

}
