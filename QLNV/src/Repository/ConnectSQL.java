/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repository;
import java.sql.*;

/**
 *
 * @author chung
 */
public class ConnectSQL {

    public static Connection getConnection(){
        try {
            var URL = "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLY_NET_JAVA_SM22_BL2";

            var user = "sa";
            var pass = "123123";
            return DriverManager.getConnection(URL, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

      
    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        getConnection();
    }
    
}
