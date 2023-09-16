/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMHoaDon;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_HD {
   public ArrayList<VMHoaDon> getAllHD();

    public String addNewHD(VMHoaDon V_hd);

    public String UpdateHD(String id, VMHoaDon V_hd);

    public String DeleteHD(String id); 
}
