/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.BDS;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author chung
 */
public class Repository {

    ConnectSQL dbconnect;

    public ArrayList<BDS> getAll() {
        try {
            ArrayList<BDS> lstb = new ArrayList<>();
            String sql = "Select * from BDS";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BDS b = new BDS();
                b.setMaBDS(rs.getString("MaBDS"));
                b.setTenBDS(rs.getString("TenBDS"));
                b.setDiaChi(rs.getString("DiaChi"));
                b.setDienThoai(rs.getString("dienThoai"));
                b.setTrangThai(rs.getInt("TrangThai"));
                lstb.add(b);
            }
            return lstb;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean addNew(BDS b) {
        try {
            String sql = "insert into BDS ( TenBDS, DiaChi, dienThoai, TrangThai) values(?,?,?,?)";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, b.getTenBDS());
            ps.setObject(2, b.getDiaChi());
            ps.setObject(3, b.getDienThoai());
            ps.setObject(4, b.getTrangThai());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
        public boolean Up(String ma,BDS b) {
        try {
            String sql = "update BDS set TenBDS=?, DiaChi=?, dienThoai=?, TrangThai=? where MaBDS = ? ";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, b.getTenBDS());
            ps.setObject(2, b.getDiaChi());
            ps.setObject(3, b.getDienThoai());
            ps.setObject(4, b.getTrangThai());
            ps.setObject(5, ma);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }
               public boolean del(String ma) {
        try {
            String sql = "delete from BDS where MaBDS = ? ";
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    } 
}
