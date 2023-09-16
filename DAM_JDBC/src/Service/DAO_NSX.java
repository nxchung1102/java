/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMNSX;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_NSX {
   
    public ArrayList<VMNSX> getAllNSX();

    public String addNewNSX(VMNSX V_nsx);

    public String UpdateNSX(String id, VMNSX V_nsx);

    public String DeleteNSX(String id);
 
}
