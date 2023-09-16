/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Service.KH_impl;
import View_Model.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Service.DAO_KH;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author chung
 */
public class QLKH extends javax.swing.JFrame {

    int index = -1;
    DefaultTableModel model = new DefaultTableModel();
    DAO_KH svr = new KH_impl();

    /**
     * Creates new form QLCustomer
     */
    public QLKH() {
        initComponents();
        setLocationRelativeTo(this);
        txtid.setEnabled(false);
        fillToTable(svr.getAllCustomer());
    }

        public boolean checkDate(){
        try {
            String date = txtngsinh.getText();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "kddd");
            return false;
        }
    }
    public void fillToTable(ArrayList<VMKhachHang> lst) {
        model = (DefaultTableModel) tblkh.getModel();
        model.setRowCount(0);
        for (VMKhachHang c : lst) {
            model.addRow(new Object[]{c.getId(),
                c.getMa(),
                c.getTen(),
                c.getTenDem(),
                c.getHo(),
                c.getNgaySinh(),
                c.getSdt(),
                c.getDiaChi(),
                c.getThanhPho(),
                c.getQuocGia(),
                c.getMatKhau()});
        }
    }

    public void showIndex() {
        VMKhachHang c = svr.getAllCustomer().get(index);
        txtid.setText(c.getId());
        txtma.setText(c.getMa());
        txtten.setText(c.getTen());
        txttendem.setText(c.getTenDem());
        txtho.setText(c.getHo());
        txtngsinh.setText(c.getNgaySinh());
        txtsdt.setText(c.getSdt());
        txtdiachi.setText(c.getDiaChi());
        txtthanhpho.setText(c.getThanhPho());
        txtquocgia.setText(c.getQuocGia());
        txtmk.setText(c.getMatKhau());
        tblkh.setRowSelectionInterval(index, index);
    }
public void clear(){
      txtid.setText("");
        txtma.setText("");
        txtten.setText("");
        txttendem.setText("");
        txtho.setText("");
        txtngsinh.setText("");
        txtsdt.setText("");
        txtdiachi.setText("");
        txtthanhpho.setText("");
        txtquocgia.setText("");
        txtmk.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttendem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        txtmk = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtngsinh = new javax.swing.JTextField();
        txtquocgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        txtthanhpho = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        txtxoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkh = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Customer");

        jLabel2.setText("ID");

        jLabel3.setText("Mã");

        jLabel4.setText("Tên Đệm");

        jLabel5.setText("Họ");

        jLabel6.setText("Tên");

        jLabel7.setText("Mật Khẩu");

        jLabel8.setText("Ngày Sinh");

        jLabel9.setText("Quốc Gia");

        jLabel10.setText("Địa chỉ");

        jLabel11.setText("Thành phố");

        jLabel12.setText("SĐT");

        btnthem.setText("Thêm ");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        txtxoa.setText("Xóa");
        txtxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtxoaActionPerformed(evt);
            }
        });

        tblkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã", "Tên", "Tên Đệm", "Họ", "Ngày Sinh", "SĐT", "Địa Chỉ", "Thành Phố", "Quốc Gia", "Mật Khẩu"
            }
        ));
        tblkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkh);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttendem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtho, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtquocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnthem))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsua)
                                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtthanhpho, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtxoa))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttendem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthanhpho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(txtxoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, txtdiachi, txtho, txtid, txtma, txtmk, txtngsinh, txtquocgia, txtsdt, txtten, txttendem, txtthanhpho});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkhMouseClicked
        // TODO add your handling code here:
        index = tblkh.getSelectedRow();
        showIndex();
    }//GEN-LAST:event_tblkhMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
     if(checkDate()){
        String ma = txtma.getText();
        String ten = txtten.getText();
        String tendem = txttendem.getText();
        String ho = txtho.getText();
        String ngsinh = txtngsinh.getText();
        String sdt = txtsdt.getText();
        String dc = txtdiachi.getText();
        String tp = txtthanhpho.getText();
        String qg = txtquocgia.getText();
        String mk = txtmk.getText();
        VMKhachHang V_c = new VMKhachHang(ma, ten, tendem, ho, ngsinh, sdt, dc, tp, qg, mk);
        JOptionPane.showMessageDialog(this, svr.addNewCustomer(V_c));
        clear();
        fillToTable(svr.getAllCustomer());
     }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        try {
            index = tblkh.getSelectedRow();
            String id = svr.getAllCustomer().get(index).getId();
            String ma = txtma.getText();
            String ten = txtten.getText();
            String tendem = txttendem.getText();
            String ho = txtho.getText();
            String ngsinh = txtngsinh.getText();
            String sdt = txtsdt.getText();
            String dc = txtdiachi.getText();
            String tp = txtthanhpho.getText();
            String qg = txtquocgia.getText();
            String mk = txtmk.getText();
            VMKhachHang V_c = new VMKhachHang(ma, ten, tendem, ho, ngsinh, sdt, dc, tp, qg, mk);
            JOptionPane.showMessageDialog(this, svr.UpdateCustomer(id, V_c));
            clear();
            fillToTable(svr.getAllCustomer());
            tblkh.setRowSelectionInterval(index, index);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "chon khach hang moun sua");
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void txtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtxoaActionPerformed
        // TODO add your handling code here:
        try {
            index = tblkh.getSelectedRow();
            String id = svr.getAllCustomer().get(index).getId();
            JOptionPane.showMessageDialog(this, svr.DeleteCustomer(id));
            clear();
            fillToTable(svr.getAllCustomer());
            index = 0;
            tblkh.setRowSelectionInterval(index, index);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "chon khach hang moun xoa");
        }
    }//GEN-LAST:event_txtxoaActionPerformed


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
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblkh;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtho;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtmk;
    private javax.swing.JTextField txtngsinh;
    private javax.swing.JTextField txtquocgia;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttendem;
    private javax.swing.JTextField txtthanhpho;
    private javax.swing.JButton txtxoa;
    // End of variables declaration//GEN-END:variables
}
