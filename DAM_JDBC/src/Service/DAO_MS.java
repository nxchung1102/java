/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMMauSac;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_MS {
    
    public ArrayList<VMMauSac> getAllMauSac();

    public String addNewMauSac(VMMauSac V_ms);

    public String UpdateMauSac(String id, VMMauSac V_ms);

    public String DeleteMauSac(String id);

}
