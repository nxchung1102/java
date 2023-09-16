/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMChiTietSP;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_CTSP {
    
    public ArrayList<VMChiTietSP> getAllCTSP();

    public String addNewCTSP(VMChiTietSP V_ctsp);

    public String UpdateCTSP(String id, VMChiTietSP V_ctsp);

    public String DeleteCTSP(String id);
}
