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
public class Check {

    public boolean checkNull(JTextField j, String ms) {
        if (j.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, ms);
            return true;
        }
        return false;
    }

    public boolean checkNum(JTextField j, String ms) {
        try {
            Integer.parseInt(j.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ms);
            return true;
        }
        return false;
    }

    public boolean checkNumPlus(JTextField j, String ms) {
        try {
            Integer.parseInt(j.getText());
            if (Integer.parseInt(j.getText()) < 0) {
                JOptionPane.showMessageDialog(null, ms);
                return true;
            }
        } catch (Exception e) {

            return true;
        }
        return false;
    }

    public boolean doMain(JTextField j, String ms) {
        try {
            Integer.parseInt(j.getText());
            if (Integer.parseInt(j.getText()) < 1 || Integer.parseInt(j.getText()) > 10) {
                JOptionPane.showMessageDialog(null, ms);
                return true;
            }
        } catch (Exception e) {
            return true;
        }
        return false;
    }
}
