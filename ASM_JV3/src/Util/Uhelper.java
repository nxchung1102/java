/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author chung
 */
public class Uhelper {

    public static boolean checkNum(JTextField tf, String ms) {
        try {
            Integer.parseInt(tf.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ms);
            return true;
        }
        return false;
    }

    public static boolean CheckNull(JTextField tf, String ms) {
        if (tf.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, ms);
            tf.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkDomain(JTextField jf, String mss) {
        try {
            Integer.parseInt(jf.getText());
            if (Integer.parseInt(jf.getText()) <= 0) {
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
