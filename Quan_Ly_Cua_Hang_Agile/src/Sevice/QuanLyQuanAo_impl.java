/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevice;

import Model.Account;
import Model.San_Pham;
import Repository.Chuc_Nang_SQL;
import View.From_Dang_Ky;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author toi84
 */
public class QuanLyQuanAo_impl implements QuanLyCuaHang {

    private Chuc_Nang_SQL _chucNang = new Chuc_Nang_SQL();

    @Override
    public ArrayList<San_Pham> getListSP() {
        ArrayList<San_Pham> list = new ArrayList<>();
        return list = _chucNang.getSP();
    }

    @Override
    public String themSP(San_Pham s) {
        if (_chucNang.checkTonTaiTen(s.getMaSP()) == null) {
            if (_chucNang.themSP(s)) {
                return "Thêm thành công";
            }
            return "Thêm không thành công";
        }
        return "Mã sản phẩm đã tồn tại";
    }

    @Override
    public String suaSP(San_Pham sp) {
        if (_chucNang.checkTonTaiTen(sp.getMaSP()) != null) {
            if (_chucNang.suaSP(sp)) {
                return "Thay đổi thành công";
            }
            return "Tên sản phẩm này không tồn tại";
        }
        return "Tên sản phẩm này không tồn tại";
    }

    @Override
    public String xoaSP(String tenSP) {
        if (_chucNang.xoaSp(tenSP)) {
            return "Loại bỏ thành công";
        }
        return "Loại bỏ không thành công";
    }

    @Override
    public San_Pham timsp(String maSP) {
        San_Pham sp = new San_Pham();
        if (_chucNang.timMaSP(maSP) != null) {
            JOptionPane.showMessageDialog(null, "Đã tìm thấy sản phẩm này");
            return sp = _chucNang.timMaSP(maSP);
        }
        return null;
    }

    @Override
    public String themAccount(Account acc) {
        if (_chucNang.themACC(acc)) {
            return "Tạo tài khoản thành công";
        }
        return "Tạo tài khoản không thành công";
    }

    @Override
    public boolean dangNhap(String tk, String mk) {
        if (_chucNang.checkAcc(tk, mk) != null) {
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Đăng nhập không thành công"
        );
        return false;
    }

    @Override
    public boolean suaEmail(String passWord, String Oldemail) {
        if (_chucNang.suaEmail(passWord, Oldemail)) {
            JOptionPane.showMessageDialog(null, "Thay đổi thành công");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Thay đổi không thành công");
        return false;
    }

    @Override
    public boolean accTonTai(String tk) {
        if (_chucNang.accTonTai(tk) != null) {
            JOptionPane.showMessageDialog(null, "Tài khoản này đã tồn tại");
            return false;
        }
        return true;
    }

    @Override
    public boolean gmailTonTai(String gmail) {
        if (_chucNang.emailTonTai(gmail) != null) {
            JOptionPane.showMessageDialog(null, "Gmail này đã có người sử dụng rồi");
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<San_Pham> sapXep() {
        ArrayList<San_Pham> list = new ArrayList<>();
        return list = _chucNang.sapXepGia();
    }

}
