/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.HoaDonChiTiet;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_HDCT {
            private DBConnection dbconnect;

    public ArrayList<HoaDonChiTiet> getListHDCT() {
        String sql = "select * from HoaDonChiTiet";
        ArrayList<HoaDonChiTiet> lsthdct = new ArrayList<>();
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setIdHoaDon(rs.getString("IdHoaDon"));
                hdct.setIdChiTietSP(rs.getString("IdChiTietSP"));
                hdct.setSoLuong(rs.getInt("SoLuong"));
                hdct.setDonGia(rs.getDouble("DonGia"));
                lsthdct.add(hdct);
            }
            return lsthdct;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertHDCT(HoaDonChiTiet hdct) {
        String sql = "insert into HoaDonChiTiet(IdHoaDon,IdChiTietSP,SoLuong,DonGia) values(?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, hdct.getIdHoaDon());
            ps.setObject(2, hdct.getIdChiTietSP());
            ps.setObject(3, hdct.getSoLuong());
            ps.setObject(4, hdct.getDonGia());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateHDCT(String id, HoaDonChiTiet hdct) {
        String sql = "update HoaDonChiTiet set SoLuong=?,DonGia=? where IdHoaDon=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, hdct.getSoLuong());
            ps.setObject(2, hdct.getDonGia());
            ps.setObject(3, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteHDCT(String id1,String id2) {
        String sql = "DELETE FROM HoaDonChiTiet WHERE IdHoaDon = ? And IdChiTietSP = ?";
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
