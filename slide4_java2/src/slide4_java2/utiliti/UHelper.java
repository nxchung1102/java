/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide4_java2.utiliti;

import javax.swing.*;
import javax.swing.JTextField;

/**
 *
 * @author chung
 */
public class UHelper {
        public static boolean CheckNull (JTextField tf,String ms){
          if (tf.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, ms);
            tf.requestFocus();
            return true;
    }
          return false;
}
}

