/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Domain_model.KhachHang;
import java.util.ArrayList;
import Domain_model.ChucVu;
import View_Model.*;

/**
 *
 * @author chung
 */
public interface DAO_CV {

    public ArrayList<VMChucVu> getAllPosition();

    public String addNewPosition(VMChucVu V_p);

    public String UpdatePosition(String id, VMChucVu V_p);

    public String DeletePosition(String id);



    

  




    

   

   


}
