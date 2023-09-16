/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import View_Model.VMKhachHang;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface DAO_KH {
        public ArrayList<VMKhachHang> getAllCustomer();

    public String addNewCustomer(VMKhachHang V_c);

    public String UpdateCustomer(String id, VMKhachHang V_c);

    public String DeleteCustomer(String id);
}
