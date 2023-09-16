/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Account;
import Model.San_Pham;
import java.sql.*;
import Repository.SQL;
import java.util.*;

public class Chuc_Nang_SQL {

    private SQL _chucNang = new SQL();
    private Connection _con = _chucNang.getConnection();
    private PreparedStatement _pre;
    private String _sQL;

    public ArrayList<San_Pham> getSP() {
        ArrayList<San_Pham> list = new ArrayList<>();
        San_Pham sp = new San_Pham();
        _sQL = "SELECT * FROM SANPHAM";
        try {
            _pre = _con.prepareStatement(_sQL);
            ResultSet re = _pre.executeQuery();
            while (re.next()) {
                sp = new San_Pham();
                sp.setMaSP(re.getString("MASP"));
                sp.setTenSP(re.getString("TENSP"));
                sp.setLoai(re.getInt("LOAI"));
                sp.setSoLuong(re.getInt("SOLUONG"));
                sp.setGia(re.getDouble("GIA"));
                list.add(sp);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean themACC(Account acc) {
        _sQL = "INSERT INTO ACCOUNT(USER_NAME,PASSWORD,GMAIL)\n"
                + "VALUES(?,?,?)";
        try {
            _pre = _con.prepareStatement(_sQL);

            _pre.setObject(1, acc.getTaiKhoan());
            _pre.setObject(2, acc.getMatKhau());
            _pre.setObject(3, acc.getEmail());

            int i = _pre.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Account checkAcc(String tk, String mk) {
        _sQL = "SELECT * FROM ACCOUNT WHERE USER_NAME =? AND PASSWORD =?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, tk);
            _pre.setObject(2, mk);
            ResultSet re = _pre.executeQuery();
            Account acc = new Account();
            while (re.next()) {
                acc = new Account();
                acc.setTaiKhoan(re.getString("USER_NAME"));
                acc.setMatKhau(re.getString("PASSWORD"));
                acc.setEmail(re.getString("GMAIL"));
                return acc;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean themSP(San_Pham sp) {
        _sQL = "INSERT INTO SANPHAM(MASP,TENSP,LOAI,SOLUONG,GIA)\n"
                + "VALUES(?,?,?,?,?)";
        try {
            _pre = _con.prepareStatement(_sQL);

            _pre.setObject(1, sp.getMaSP());
            _pre.setObject(2, sp.getTenSP());
            _pre.setObject(3, sp.getLoai());
            _pre.setObject(4, sp.getSoLuong());
            _pre.setObject(5, sp.getGia());

            int i = _pre.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public San_Pham checkTonTaiTen(String masp) {
        _sQL = "SELECT * FROM SANPHAM WHERE MASP = ?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, masp);
            ResultSet re = _pre.executeQuery();
            San_Pham sp = new San_Pham();
            while (re.next()) {
                sp = new San_Pham();
                sp.setMaSP(re.getString("MASP"));
                sp.setTenSP(re.getString("TENSP"));
                sp.setLoai(re.getInt("LOAI"));
                sp.setSoLuong(re.getInt("SOLUONG"));
                sp.setGia(re.getDouble("GIA"));
                return sp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean suaSP(San_Pham sp) {
        _sQL = "UPDATE SANPHAM \n"
                + "SET MASP = ? , TENSP = ? , LOAI = ? , SOLUONG = ? , GIA = ?\n"
                + "WHERE MASP = ?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, sp.getMaSP());
            _pre.setObject(2, sp.getTenSP());
            _pre.setObject(3, sp.getLoai());
            _pre.setObject(4, sp.getSoLuong());
            _pre.setObject(5, sp.getGia());
            _pre.setObject(6, sp.getMaSP());

            int i = _pre.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean xoaSp(String maSP) {
        _sQL = "delete SANPHAM WHERE MASP =?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, maSP);

            int i = _pre.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public San_Pham timMaSP(String maSP) {
        _sQL = "SELECT * FROM SANPHAM WHERE MASP =?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, maSP);
            ResultSet re = _pre.executeQuery();
            San_Pham sp = new San_Pham();
            while (re.next()) {
                sp = new San_Pham();
                sp.setMaSP(re.getString("MASP"));
                sp.setTenSP(re.getString("TENSP"));
                sp.setLoai(re.getInt("LOAI"));
                sp.setSoLuong(re.getInt("SOLUONG"));
                sp.setGia(re.getDouble("GIA"));
                return sp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean suaEmail(String passWord, String oldEmail) {
        _sQL = "UPDATE ACCOUNT SET PASSWORD = ? WHERE GMAIL = ?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, passWord);
            _pre.setObject(2, oldEmail);
            int i = _pre.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Account accTonTai(String tk) {
        Account acc = new Account();
        _sQL = "SELECT * FROM ACCOUNT WHERE USER_NAME = ?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, tk);
            ResultSet re = _pre.executeQuery();
            while (re.next()) {
                acc = new Account();
                acc.setTaiKhoan(re.getString("USER_NAME"));
                acc.setMatKhau(re.getString("PASSWORD"));
                acc.setEmail(re.getString("GMAIL"));
                return acc;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Account emailTonTai(String gmail) {
        Account acc = new Account();
        _sQL = "SELECT * FROM ACCOUNT WHERE GMAIL = ?";
        try {
            _pre = _con.prepareStatement(_sQL);
            _pre.setObject(1, gmail);
            ResultSet re = _pre.executeQuery();
            while (re.next()) {
                acc = new Account();
                acc.setTaiKhoan(re.getString("USER_NAME"));
                acc.setMatKhau(re.getString("PASSWORD"));
                acc.setEmail(re.getString("GMAIL"));
                return acc;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<San_Pham> sapXepGia() {
        San_Pham sp = new San_Pham();
        ArrayList<San_Pham> list = new ArrayList<>();
        _sQL = "SELECT * FROM SANPHAM \n"
                + "ORDER BY GIA ASC";
        try {
            _pre = _con.prepareStatement(_sQL);
            ResultSet re = _pre.executeQuery();
            while (re.next()) {
                sp = new San_Pham();
                sp.setMaSP(re.getString("MASP"));
                sp.setTenSP(re.getString("TENSP"));
                sp.setLoai(re.getInt("LOAI"));
                sp.setSoLuong(re.getInt("SOLUONG"));
                sp.setGia(re.getDouble("GIA"));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
