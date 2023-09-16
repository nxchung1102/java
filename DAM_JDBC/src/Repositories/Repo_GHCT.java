/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.GioHangChiTiet;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_GHCT {
            private DBConnection dbconnect;

    public ArrayList<GioHangChiTiet> getListGHCT() {
        String sql = "select * from GioHangChiTiet";
        ArrayList<GioHangChiTiet> lstghct = new ArrayList<>();
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GioHangChiTiet ghct = new GioHangChiTiet();
                ghct.setIdGioHang(rs.getString("IdGioHang"));
                ghct.setIdChiTietSP(rs.getString("IdChiTietSP"));
                ghct.setSoLuong(rs.getInt("SoLuong"));
                ghct.setDonGia(rs.getDouble("DonGia"));
                ghct.setDonGiaKhiGiam(rs.getDouble("DonGiaKhiGiam"));
                lstghct.add(ghct);
            }
            return lstghct;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertGHCT(GioHangChiTiet ghct) {
        String sql = "insert into GioHangChiTiet(IdGioHang,IdChiTietSP,SoLuong,DonGia,DonGiaKhiGiam) values(?,?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ghct.getIdGioHang());
            ps.setObject(2, ghct.getIdChiTietSP());
            ps.setObject(3, ghct.getSoLuong());
            ps.setObject(4, ghct.getDonGia());
            ps.setObject(5, ghct.getDonGiaKhiGiam());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateGHCT(String id, GioHangChiTiet ghct) {
        String sql = "update GioHangChiTiet set SoLuong=?,DonGia=?,DonGiaKhiGiam=? where IdGioHang=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ghct.getSoLuong());
            ps.setObject(2, ghct.getDonGia());
            ps.setObject(3, ghct.getDonGiaKhiGiam());
            ps.setObject(4, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteGHCT(String id1, String id2) {
        String sql = "DELETE FROM GioHangChiTiet WHERE IdGioHang = ? And IdChiTietSP = ?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, id1);
            ps.setObject(2, id2);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
