/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.chuabai.model.student;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chung
 */
public class chuaBaiTuBuoi1 extends javax.swing.JFrame {

    /**
     * Creates new form chuaBaiTuBuoi1
     */
    List<student> lstST = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    int index;

    public chuaBaiTuBuoi1() {
        initComponents();
        setLocationRelativeTo(null);
        lstST.add(new student("c", "anh", 20));
        lstST.add(new student("a", "my", 20));
        lstST.add(new student("b", "phap", 20));
        model = (DefaultTableModel) tblST.getModel();
        fillToTable();
        if (lstST.size() > 0) {
            index = 0;
            showDetail(); //phuong thuc nay se hien thi studen dang dung tai phan tu do

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        lblContry = new javax.swing.JLabel();
        cboContry = new javax.swing.JComboBox<>();
        btnDel = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblST = new javax.swing.JTable();
        record = new javax.swing.JLabel();
        btnDel1 = new javax.swing.JButton();
        btnwri = new javax.swing.JButton();
        btnread = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("họ tên");

        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblAge.setText("tuổi");

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        lblContry.setText("quốc gia");

        cboContry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "anh ", "my", "phap" }));
        cboContry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContryActionPerformed(evt);
            }
        });

        btnDel.setText("delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnPre.setText("<<");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnnext.setText(">|");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        tblST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "họ tên", "tuổi", "ngoại ngữ", "status"
            }
        ));
        tblST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblST);

        record.setText("1/3");

        btnDel1.setText("update");
        btnDel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDel1ActionPerformed(evt);
            }
        });

        btnwri.setText("writeFile");
        btnwri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwriActionPerformed(evt);
            }
        });

        btnread.setText("readFile");
        btnread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContry, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboContry, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(record)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnwri)
                        .addGap(39, 39, 39)
                        .addComponent(btnread)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnPre, btnnext});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnClear, btnDel, btnDel1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboContry, txtAge, txtName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblContry, lblName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboContry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDel))
                    .addComponent(lblContry, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPre)
                    .addComponent(record)
                    .addComponent(btnLast)
                    .addComponent(btnnext)
                    .addComponent(btnDel1))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnwri)
                    .addComponent(btnread))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, lblName, txtName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDel, btnDel1, btnFirst, btnLast, btnPre, btnnext, cboContry, lblContry});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, lblAge, txtAge});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboContryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContryActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        del();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        try {
            index = lstST.size() - 1;
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi di chuyen");
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            if (index < lstST.size() - 1) {
                index++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi di chuyen");
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSTMouseClicked
        try {
            //lay dong dang chon tren table
            index = tblST.getSelectedRow();
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi click table");
        }
    }//GEN-LAST:event_tblSTMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            index = 0;
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi di chuyen");
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        try {
            if (index > 0) {
                index--;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi di chuyen");
        }
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            //ktra rong
            //ktra tuoi la so
            //ktra mien tuoi 0-100
            //lay du lieu tren form
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String language = cboContry.getSelectedItem().toString();
            student st = new student(name, language, age);
            //them vao list
            lstST.add(st);
            //them vao bang
            model.addRow(new Object[]{name, age, language, st.getStatus(age)});
            //xu ly sau khi them
            index = lstST.size() - 1;
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi nut add");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDel1ActionPerformed
        try {
            //ktra rong
            //ktra tuoi la so
            //ktra mien tuoi 0-100
            //lay du lieu tren form
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String language = cboContry.getSelectedItem().toString();
            student st = new student(name, language, age);
            //them vao list
            lstST.set(index, st);
            model.setValueAt(name, index, 0);
            model.setValueAt(age, index, 1);
            model.setValueAt(language, index, 2);
            model.setValueAt(st.getStatus(age),index,3);
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi nut update");
        }
    }//GEN-LAST:event_btnDel1ActionPerformed

    private void btnwriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwriActionPerformed
        // ghi list hoc sinh vao file
        try {
            //b1 mo luong tao doi tuong 
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
            //b2 thuc hien doc/ghi
            oos.writeObject(lstST);
            //b3 dong
            oos.flush();//xa luong
            oos.close();//dong luong
            JOptionPane.showMessageDialog(this, "ghi file thanh cong");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "loi nut ghi file");
    e.printStackTrace();
        }
    }//GEN-LAST:event_btnwriActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
             //doc du lieu tu file hoc sinh
             //neu co du lieu thi hien thi phan tu dau tien
             //table hien thi danh sach hoc sinh trong lít
        try {
            //b1 mo luong tao doi tuong 
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
            //b2 thuc hien doc/ghi
            lstST =  (List<student>) ois.readObject(); //doc du lieu tu nut file do vao list hoc sinh
            //b3 dong
            ois.close();//dong luong
            //xu ly sau khi doc
            fillToTable();
            if(lstST.size() > 0 ){
            index = 0; 
            showDetail();
            }else {
            clear();
            }
            JOptionPane.showMessageDialog(this, "doc file thanh cong");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "loi nut doc file");
    e.printStackTrace();
        }
    }//GEN-LAST:event_btnreadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chuaBaiTuBuoi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chuaBaiTuBuoi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chuaBaiTuBuoi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chuaBaiTuBuoi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chuaBaiTuBuoi1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDel1;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnread;
    private javax.swing.JButton btnwri;
    private javax.swing.JComboBox<String> cboContry;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContry;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel record;
    private javax.swing.JTable tblST;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        model.setRowCount(0);
        for (student st : lstST) {
            model.addRow(new Object[]{st.getName(), st.getAge(), st.getLanguage(), st.getStatus(st.getAge())});
        }
    }

    private void showDetail() {
        student st = lstST.get(index); //lay phan tu dang dung cua list
        txtName.setText(st.getName());
        txtAge.setText(st.getAge() + "");
        cboContry.setSelectedItem(st.getLanguage());
        tblST.setRowSelectionInterval(index, index); // hien thi vi tri hien tai
        record.setText(index + 1 + "/" + lstST.size());
    }

    private void clear() {
        txtAge.setText("");
        txtName.setText("");
        cboContry.setSelectedIndex(0);
        record.setText("...");
        index = -1;
        tblST.clearSelection();//xoa vi tri dang chon tren table
    }

    private void del() {
        int alterbtn = JOptionPane.showConfirmDialog(null, "co muon xoa?", "canh bao", JOptionPane.YES_OPTION);
        if (alterbtn == JOptionPane.YES_OPTION) {
            lstST.remove(index);
            fillToTable();
            clear();
            JOptionPane.showMessageDialog(this, "xoa thanh cong");
        } else {
            return;
        }
    }

    
}
