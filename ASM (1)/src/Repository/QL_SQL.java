/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.*;
import java.sql.*;
import model.Account;

public class QL_SQL {

    private SQL _qL = new SQL();
    private Connection _con = _qL.getConnection();
    private PreparedStatement _pR;
    private String _sQL;

    public Account join_Account(String use, String pass) {
        _sQL = "SELECT * FROM ACCOUNT WHERE USENAME =? and PASSWORD =?";
        model.Account acc = new Account();

        try {
            _pR = _con.prepareStatement(_sQL);
            _pR.setObject(1, use);
            _pR.setObject(2, pass);
            ResultSet re = _pR.executeQuery();

            while (re.next()) {
                acc = new Account();
                acc.setUserName(re.getString("usename"));
                acc.setPassWord(re.getString("password"));
                acc.setRole(re.getString("role"));
                return acc;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
