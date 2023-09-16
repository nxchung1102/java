/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.DongSP;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_DSP {
            private DBConnection dbconnect;

    public ArrayList<DongSP> getListDSP() {
        ArrayList<DongSP> lstDSP = new ArrayList<>();
        String sql = "select * from DongSP";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongSP dsp = new DongSP();
                dsp.setId(rs.getString("Id"));
                dsp.setMa(rs.getString("Ma"));
                dsp.setTen(rs.getString("Ten"));
                lstDSP.add(dsp);
            }
            return lstDSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertDSP(DongSP dsp) {
        String sql = "INSERT INTO DongSP(Ma,Ten)\n"
                + "VALUES (?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, dsp.getMa());
            ps.setObject(2, dsp.getTen());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateDSP(String id, DongSP dsp) {
        String sql = "UPDATE DongSP\n"
                + "SET Ma = ?, Ten = ?\n"
                + "WHERE Id=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, dsp.getMa());
            ps.setObject(2, dsp.getTen());
            ps.setObject(3, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean DeleteDSP(String id) {
        String sql = "DELETE FROM DongSP WHERE Id = ?";
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
