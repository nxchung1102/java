/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMSanPham;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_SP {
    public ArrayList<VMSanPham> getAllSP();

    public String addNewSP(VMSanPham V_sp);

    public String UpdateSP(String id, VMSanPham V_sp);

    public String DeleteSP(String id);
}
