/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java2_lab4;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author chung
 */
public class uhelper {
            public static boolean CheckNull (JTextField tf,String ms){
          if (tf.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, ms);
            tf.requestFocus();
            tf.setBackground(Color.YELLOW);
            return true;
    }
          return false;
}
}
