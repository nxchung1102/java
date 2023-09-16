/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.ChiTietSP;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_CTSP {
            private DBConnection dbconnect;

    public ArrayList<ChiTietSP> getListChiTietSP() {
        ArrayList<ChiTietSP> lstctsp = new ArrayList<>();
        String sql = "select * from ChiTietSP";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSP ctsp = new ChiTietSP();
                ctsp.setId(rs.getString("Id"));
                ctsp.setIdSP(rs.getString("IdSP"));
                ctsp.setIdNSX(rs.getString("IdNsx"));
                ctsp.setIdMauSac(rs.getString("IdMauSac"));
                ctsp.setIdDongSP(rs.getString("IdDongSP"));
                ctsp.setNamBH(rs.getInt("NamBH"));
                ctsp.setMoTa(rs.getString("MoTa"));
                ctsp.setSoLuongTon(rs.getInt("SoLuongTon"));
                ctsp.setGiaBan(rs.getDouble("GiaNhap"));
                ctsp.setGiaNhap(rs.getDouble("GiaBan"));
                lstctsp.add(ctsp);
            }
            return lstctsp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertCTSP(ChiTietSP ctsp) {
        String sql = "insert into ChiTietSP(IdSP,IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan) values(?,?,?,?,?,?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ctsp.getIdSP());
            ps.setObject(2, ctsp.getIdNSX());
            ps.setObject(3, ctsp.getIdMauSac());
            ps.setObject(4, ctsp.getIdDongSP());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuongTon());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateCTSP(String id, ChiTietSP ctsp) {
        String sql = "update ChiTietSP set IdSP=?,IdNsx=?,IdMauSac=?,IdDongSP=?,NamBH = ?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=? where Id=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ctsp.getIdSP());
            ps.setObject(2, ctsp.getIdNSX());
            ps.setObject(3, ctsp.getIdMauSac());
            ps.setObject(4, ctsp.getIdDongSP());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuongTon());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());
            ps.setObject(10, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCTSP(String id) {
        String sql = "DELETE FROM ChiTietSP WHERE Id = ?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
