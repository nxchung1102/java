/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.NhanVien;
import java.sql.*;
import java.util.*;

/**
 *
 * @author chung
 */
public class Repository {

    ConnectSQL dbconnect;

    public ArrayList<NhanVien> getAll() {
        try {
            ArrayList<NhanVien> lstNV = new ArrayList<>();
            String sql = "select Ma,Ho,TenDem,Ten,GioiTinh from NhanVien";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMa(rs.getString("Ma"));
                nv.setHo(rs.getString("Ho"));
                nv.setTendem(rs.getString("TenDem"));
                nv.setTen(rs.getString("Ten"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                lstNV.add(nv);
            }
            return lstNV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean del(String ma) {
        try {
            String sql = "delete from NhanVien where Ma = ?";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean Update(String ma, NhanVien nv) {
        try {
            String sql = "update NhanVien set Ho = ?,TenDem = ?, Ten=?,GioiTinh=? where Ma = ?";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getHo());
            ps.setObject(2, nv.getTendem());
            ps.setObject(3, nv.getTen());
            ps.setObject(4, nv.getGioiTinh());
            ps.setObject(5, ma);
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
