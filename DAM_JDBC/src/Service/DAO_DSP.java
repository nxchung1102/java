/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMDongSP;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_DSP {
      public ArrayList<VMDongSP> getAllDSP();

    public String addNewDSP(VMDongSP V_dsp);

    public String UpdateDSP(String id, VMDongSP V_dsp);

    public String DeleteDSP(String id);

}
