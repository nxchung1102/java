/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.San_Pham;
import Sevice.QuanLyCuaHang;
import Sevice.QuanLyQuanAo_impl;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class From_Giao_Dien extends javax.swing.JFrame {

    private QuanLyCuaHang _chucNang = new QuanLyQuanAo_impl();
    private DefaultTableModel _model = new DefaultTableModel();
    private int _index, click = 0, htClean = 0;

    public From_Giao_Dien() {
        initComponents();
        setLocationRelativeTo(this);
        fillToTable(_chucNang.getListSP());
    }

    public void fillToTable(ArrayList<San_Pham> sp) {
        _model = (DefaultTableModel) tblBang.getModel();
        _model.setRowCount(0);

        for (San_Pham s : sp) {
            _model.addRow(new Object[]{
                s.getTenSP(), s.getMaSP(), s.getLoaiQA(), s.getSoLuong(), s.getGia()
            });
        }
    }

    public void showIndex(ArrayList<San_Pham> list) {
        if (_chucNang.getListSP().size() == 0) {
            return;
        }
        San_Pham sp = list.get(_index);
        txtMa.setText(sp.getMaSP());
        txtGiaTien.setText(sp.getGia() + "");
        txtSoluong.setText(sp.getSoLuong() + "");
        txtTen.setText(sp.getTenSP());
        cboLoai.setSelectedItem(sp.getLoaiQA());
        tblBang.setRowSelectionInterval(_index, _index);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblQuanLychqa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        lblTenTrangPhuc = new javax.swing.JLabel();
        lblMaQA = new javax.swing.JLabel();
        lblLoai = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblGiaTien = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        cboLoai = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        Backgroup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FPT_Polytechnic.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 240, -1));

        lblQuanLychqa.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblQuanLychqa.setForeground(new java.awt.Color(12, 52, 131));
        lblQuanLychqa.setText("QUẢN LÝ CỬA HÀNG QUẦN ÁO");
        getContentPane().add(lblQuanLychqa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TÊN TRANG PHỤC", "MÃ QUẦN ÁO", "LOẠI", "SỐ LƯỢNG", "GIÁ TIỀN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 820, 340));

        lblTenTrangPhuc.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTenTrangPhuc.setForeground(new java.awt.Color(12, 52, 131));
        lblTenTrangPhuc.setText("Loại");
        getContentPane().add(lblTenTrangPhuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        lblMaQA.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblMaQA.setForeground(new java.awt.Color(12, 52, 131));
        lblMaQA.setText("Mã Quần Áo");
        getContentPane().add(lblMaQA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, -1, -1));

        lblLoai.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblLoai.setForeground(new java.awt.Color(12, 52, 131));
        lblLoai.setText("Số Lượng");
        getContentPane().add(lblLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, -1, -1));

        lblSoLuong.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(12, 52, 131));
        lblSoLuong.setText("Giá Tiền");
        getContentPane().add(lblSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, -1, -1));

        lblGiaTien.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblGiaTien.setForeground(new java.awt.Color(12, 52, 131));
        lblGiaTien.setText("Tên Trang Phục");
        getContentPane().add(lblGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, -1, -1));

        txtTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 2, 2)));
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 150, 30));

        txtMa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 2, 2)));
        getContentPane().add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 150, 30));

        txtGiaTien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 2, 2)));
        getContentPane().add(txtGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, 150, 30));

        txtSoluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 2, 2)));
        getContentPane().add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 150, 30));

        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dài", "Ngắn" }));
        cboLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        getContentPane().add(cboLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 100, 30));

        btnThem.setBackground(new java.awt.Color(12, 52, 131));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnThem.setForeground(new java.awt.Color(242, 113, 37));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(140, 50));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, -1));

        btnSua.setBackground(new java.awt.Color(242, 113, 37));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setPreferredSize(new java.awt.Dimension(140, 50));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, -1, -1));

        btnXoa.setBackground(new java.awt.Color(0, 0, 0));
        btnXoa.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(12, 52, 131));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Remove.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(140, 50));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, -1, -1));

        btnTim.setBackground(new java.awt.Color(41, 81, 90));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnTim.setForeground(new java.awt.Color(212, 204, 0));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tim.png"))); // NOI18N
        btnTim.setText("Tìm Mẫu");
        btnTim.setPreferredSize(new java.awt.Dimension(140, 50));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        getContentPane().add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, 150, -1));

        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit (1).png"))); // NOI18N
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 80, 40));

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/shutdown (1).png"))); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 750, 50, 50));

        btnSapXep.setBackground(new java.awt.Color(255, 204, 204));
        btnSapXep.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSapXep.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/arrange.png"))); // NOI18N
        btnSapXep.setText("SẮP XẾP");
        btnSapXep.setPreferredSize(new java.awt.Dimension(140, 50));
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });
        getContentPane().add(btnSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, 150, -1));

        btnClean.setBackground(new java.awt.Color(204, 255, 204));
        btnClean.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnClean.setForeground(new java.awt.Color(0, 0, 0));
        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/broom.png"))); // NOI18N
        btnClean.setText("Clean");
        btnClean.setPreferredSize(new java.awt.Dimension(140, 50));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        getContentPane().add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 670, 160, -1));

        Backgroup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Backgroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nen.jpg"))); // NOI18N
        getContentPane().add(Backgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (htClean == 1) {
            if (checkNull()) {
                San_Pham sp = new San_Pham();
                sp.setTenSP(txtTen.getText().trim());
                sp.setMaSP(txtMa.getText().trim());
                sp.setLoai(cboLoai.getSelectedItem().equals("Dài") ? 0 : 1);
                sp.setSoLuong(Integer.parseInt(txtSoluong.getText().trim()));
                sp.setGia(Double.parseDouble(txtGiaTien.getText().trim()));
                JOptionPane.showMessageDialog(this, _chucNang.themSP(sp));
                fillToTable(_chucNang.getListSP());
                htClean = 0;
                txtMa.setEnabled(false);
            }
        }else {
            JOptionPane.showMessageDialog(this,"Bạn hãy chọn clean để xóa trắng thông tin trước đi thêm sản phẩm !");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        txtMa.setEnabled(false);
        _index = tblBang.getSelectedRow();
        if (sx == 1) {
            fillToTable(_chucNang.sapXep());
            showIndex(_chucNang.sapXep());
        } else {
            fillToTable(_chucNang.getListSP());
            showIndex(_chucNang.getListSP());
        }
        click = 1;
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (_chucNang.getListSP().size() == 0) {
            JOptionPane.showMessageDialog(this, "Danh sách đã trống không thể sửa");
            return;
        }
        if (click == 1) {
            int chooce = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa sản phẩm đã chọn không ?", "Xóa", JOptionPane.YES_OPTION);
            if (chooce == JOptionPane.YES_OPTION) {
                if (checkNull()) {
                    San_Pham sp = new San_Pham();
                    sp.setTenSP(txtTen.getText().trim());
                    sp.setMaSP(txtMa.getText().trim());
                    sp.setLoai(cboLoai.getSelectedItem().equals("Dài") ? 0 : 1);
                    sp.setSoLuong(Integer.parseInt(txtSoluong.getText().trim()));
                    sp.setGia(Double.parseDouble(txtGiaTien.getText().trim()));
                    JOptionPane.showMessageDialog(this, _chucNang.suaSP(sp));
                    if (sx == 1) {
                        fillToTable(_chucNang.sapXep());
                        showIndex(_chucNang.sapXep());
                    } else {
                        fillToTable(_chucNang.getListSP());
                        showIndex(_chucNang.getListSP());
                    }
                    click = 0;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Dữ liệu vẫn dữ nguyên !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Click vào vị trí trên bảng để sửa thông tin !");

        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        int chooce = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không ?", "Xóa", JOptionPane.YES_OPTION);
        if (chooce == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã quay lại");
        }

    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (_chucNang.getListSP().size() == 0) {
            JOptionPane.showMessageDialog(this, "Danh sách đã trống không thể xóa");
            return;
        }
        if (click == 1) {
            int chooce = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa sản phẩm đã chọn không ?", "Xóa", JOptionPane.YES_OPTION);
            if (chooce == JOptionPane.YES_OPTION) {
                String maSP = _chucNang.getListSP().get(_index).getMaSP();
                JOptionPane.showMessageDialog(this, _chucNang.xoaSP(maSP)
                );
                click = 0;
                fillToTable(_chucNang.getListSP());
                clean();
            } else {
                JOptionPane.showMessageDialog(this, "Dữ liệu vẫn dữ nguyên !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Click vào vị trí trên bảng đẻ xóa");
        }
        if (_chucNang.getListSP().size() == 0) {
            JOptionPane.showMessageDialog(this, "Danh sách đã trống");
            clean();
        }
        return;
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        if (_chucNang.getListSP().size() == 0) {
            JOptionPane.showMessageDialog(this, "Danh sách đã trống không thể tìm");
            return;
        }
        try {
            String maSP = JOptionPane.showInputDialog("Ghi mã sản phẩm mà bạn muốn tìm");
            San_Pham sp = _chucNang.timsp(maSP);
            if (sp == null) {
                JOptionPane.showMessageDialog(null, "Thao tác tìm kiếm không thành công");
                return;
            }
            From_Hien_Thong_Tin ht = new From_Hien_Thong_Tin();
            ht.setlbl(sp);
        } catch (Exception e) {
            return;
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        int chooce = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không ?", "Xóa", JOptionPane.YES_OPTION);
        if (chooce == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new From_Dang_Nhap().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã quay lại");
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtMa.setEnabled(true);
        clean();
        htClean = 1;
    }//GEN-LAST:event_btnCleanActionPerformed
    int sx = 0;
    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        if (sx == 0) {
            fillToTable(_chucNang.sapXep());
            showIndex(_chucNang.sapXep());
            sx = 1;
        } else {
            sx = 0;
            fillToTable(_chucNang.getListSP());
            showIndex(_chucNang.getListSP());
        }
    }//GEN-LAST:event_btnSapXepActionPerformed

    public boolean checkNull() {
        if (txtTen.getText().equals("") || txtSoluong.getText().equals("") || txtGiaTien.getText().equals("") || txtMa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin");
            return false;
        }
        try {
            Integer.parseInt(txtSoluong.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số");
            return false;
        }

        try {
            Double.parseDouble(txtGiaTien.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá tiền phải là số");
            return false;
        }
        Long soLuong = Long.parseLong(txtSoluong.getText());
        Double gia = Double.parseDouble(txtGiaTien.getText());
        if (soLuong > 1000000000 || gia > 1000000000) {
            JOptionPane.showMessageDialog(this, "Bạn hãy ghi số lượng và giá hợp lý");
            return false;
        }

        return true;
    }

    public void clean() {
        txtGiaTien.setText("");
        txtMa.setText("");
        txtSoluong.setText("");
        txtTen.setText("");
        cboLoai.setSelectedIndex(0);
    }

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
            java.util.logging.Logger.getLogger(From_Giao_Dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_Giao_Dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_Giao_Dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_Giao_Dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From_Giao_Dien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgroup;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGiaTien;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblMaQA;
    private javax.swing.JLabel lblQuanLychqa;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenTrangPhuc;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
