/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import Repository.QL_SQL;
import model.Account;
import view.From_Quan_Ly_San_Pham;
import view.From_Xuat_Nhap;
import view.From_Account;

/**
 *
 * @author toi84
 */
public class Sevice_Kem_Danh_Rang_inml implements Sevice_Kem_Danh_Rang {

    private QL_SQL _qLSQL = new QL_SQL();
    private Account acc = new Account();

    @Override
    public String check_Account(String acc, String pass) {
        if (_qLSQL.join_Account(acc, pass) != null) {
            this.acc = _qLSQL.join_Account(acc, pass);
            return "Dang nhap thanh cong";
        }

        return "Dang nhap khong thanh cong";
    }

    @Override
    public boolean show_From(String use,String pass) {
        if (_qLSQL.join_Account(use, pass) == null) {
            return false;
        }
        if (this.acc.getRole().equalsIgnoreCase("Quan Ly")) {
            new From_Quan_Ly_San_Pham().setVisible(true);
            return true;
        } else if (this.acc.getRole().equalsIgnoreCase("Thu kho")) {
            new From_Xuat_Nhap().setVisible(true);
            return true;
        }
        return false;
    }

}
