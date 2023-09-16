/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.PhongHoc;
import java.sql.*;
import java.util.*;

/**
 *
 * @author chung
 */
public class Repository {

    private ConnectSQL dbconnect;

    public ArrayList<PhongHoc> getAll() {
        try {
            ArrayList<PhongHoc> lstPH = new ArrayList<>();
            String sql = "select maPhong,TenPhong,tang,soSV,TrangThai from PhongHoc";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhongHoc ph = new PhongHoc();
                ph.setId(rs.getString("maPhong"));
                ph.setTen(rs.getString("TenPhong"));
                ph.setTang(rs.getInt("tang"));
                ph.setSoSV(rs.getInt("soSV"));
                ph.setTrangThai(rs.getInt("TrangThai"));
                lstPH.add(ph);
            }
            return lstPH;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addNew(PhongHoc ph) {
        try {
            String sql = "insert into PhongHoc(TenPhong, tang, soSV, TrangThai) values(?,?,?,?)";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ph.getTen());
            ps.setObject(2, ph.getTang());
            ps.setObject(3, ph.getSoSV());
            ps.setObject(4, ph.getTrangThai());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public PhongHoc checkPhong(String tp) {
        try {
            String sql = "select maPhong,TenPhong,tang,soSV,TrangThai from PhongHoc where TenPhong like ?";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, tp);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhongHoc ph = new PhongHoc();
                ph.setId(rs.getString("maPhong"));
                ph.setTen(rs.getString("TenPhong"));
                ph.setTang(rs.getInt("tang"));
                ph.setSoSV(rs.getInt("soSV"));
                ph.setTrangThai(rs.getInt("TrangThai"));
                return ph;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean xoa(String ma) {
        try {
            String sql = "delete from PhongHoc where maPhong like ?";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(String ma, PhongHoc ph) {
        try {
            String sql = "UPDATE  PhongHoc SET TenPhong=?,tang=?,soSV=?,TrangThai=?  where maPhong like ?";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ph.getTen());
            ps.setObject(2, ph.getTang());
            ps.setObject(3, ph.getSoSV());
            ps.setObject(4, ph.getTrangThai());
            ps.setObject(5, ma);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
