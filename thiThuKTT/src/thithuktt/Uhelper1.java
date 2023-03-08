/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithuktt;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author chung
 */
public class Uhelper1 {
    static String email = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$" ;

    public static boolean CheckNull(JTextField tf, String ms) {
        if (tf.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, ms);
            tf.requestFocus();          
            return true;
        }
        return false;
    }
    public static boolean checkAge(JTextField tf , String ms){
        try {
            Integer.parseInt(tf.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ms);
            return true;
        }
        return false;
    }
        public static boolean checkSalary(JTextField tf , String ms){
        try {
            Double.parseDouble(tf.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ms);
            return true;
        }
        return false;
    }
            public static boolean checkEmail(JTextField tf , String ms){
                Matcher match = Pattern.compile(email).matcher(tf.getText());
                if(!match.matches()){
                JOptionPane.showMessageDialog(null, ms);
                return true;
                }
        return false;
    }
            
            
            
            
            public static byte[] read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object readObj(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object obj = ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void wriObj(String path, Object obj) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(obj);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean checkDomain(JTextField jf, String mss) {
        try {
             Integer.parseInt(jf.getText());
            if(Integer.parseInt(jf.getText()) < 16 || Integer.parseInt(jf.getText()) > 55)
            {
                JOptionPane.showMessageDialog(null, mss);
                return true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, mss);
            return true;
        }
        return false;
    }
       public static boolean checkDomain2(JTextField jf, String mss) {
        try {
             Double.parseDouble(jf.getText());
            if(Double.parseDouble(jf.getText())<=5000000)
            {
                JOptionPane.showMessageDialog(null, mss);
                return true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, mss);
            return true;
        }
        return false;
    }
}
