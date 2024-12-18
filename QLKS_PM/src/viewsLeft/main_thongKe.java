/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewsLeft;

import connectDatabase.ConnectDB;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import viewsLeft.*;
import viewsTop.*;
import model.*;
import staticModify.*;
import baoCaoTK.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author DELL
 */
public class main_thongKe extends javax.swing.JFrame {

    /**
     * Creates new form main_taiKhoan
     */
    ConnectDB con = new ConnectDB();
    Connection conn;
    DefaultTableModel tableModel;

    List<phong> phongList;

    public main_thongKe(String username) {
        initComponents();
        txt_TaiKhoan.setText(username);
        phongList = new ArrayList<>();
//        tableModel = (DefaultTableModel) tblPhong.getModel();
        //show_phong();
    }

    public main_thongKe() {
        initComponents();
        txt_TaiKhoan.setText(staticModify.userName);
    }

    public void doanhThu() {
        java.sql.Date ngayBD = new java.sql.Date(dateStart.getDate().getTime());
        java.sql.Date ngayKT = new java.sql.Date(dateEnd.getDate().getTime());
        conn = con.getConnection();
        try {
            String sql = "{call doanhThu (?, ?)}";
            CallableStatement statement = conn.prepareCall(sql);

            statement.setString(1, ngayBD.toString());
            statement.setString(2, ngayKT.toString());

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String dt = rs.getString("doanhThu");
                dt = String.valueOf(Float.valueOf(dt) * 1000.0f);
                txtDoanhThu.setText(dt);
            }
        } catch (Exception e) {
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Đóng kết nối thành công");
                } catch (SQLException ex) {
                    Logger.getLogger(main_thongKe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void showTK() {
        if (cbThongKe.getSelectedIndex() == 0) {
            new bc1().setVisible(true);
        } else if (cbThongKe.getSelectedIndex() == 1) {
            new bc2().setVisible(true);
        } else if (cbThongKe.getSelectedIndex() == 2) {
            new bc3().setVisible(true);
        } else if (cbThongKe.getSelectedIndex() == 3) {
            new bc4().setVisible(true);
        } else if (cbThongKe.getSelectedIndex() == 4) {
            new bc5().setVisible(true);
        } else if (cbThongKe.getSelectedIndex() == 5) {
            new bc6().setVisible(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnTaiKhoan = new javax.swing.JButton();
        btnPhong = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnTrangThaiPhong = new javax.swing.JButton();
        btnDatPhong = new javax.swing.JButton();
        btnDkdv = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txt_TaiKhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbDateStart = new javax.swing.JLabel();
        lbDateEnd = new javax.swing.JLabel();
        btnDoanhThu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dateStart = new com.toedter.calendar.JDateChooser();
        dateEnd = new com.toedter.calendar.JDateChooser();
        lbDoanhThu = new javax.swing.JLabel();
        txtDoanhThu = new javax.swing.JTextField();
        lbTitleDoanhThu = new javax.swing.JLabel();
        lbTitleThongKe = new javax.swing.JLabel();
        lbOption = new javax.swing.JLabel();
        cbThongKe = new javax.swing.JComboBox<>();
        btnShowTK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAUL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BÁO CÁO - THỐNG KÊ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tài khoản:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 76, 80, 20));

        btnTaiKhoan.setText("Tài Khoản");
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 110, -1));

        btnPhong.setText("Phòng");
        btnPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongActionPerformed(evt);
            }
        });
        getContentPane().add(btnPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 110, -1));

        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        getContentPane().add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 110, -1));

        btnKhachHang.setText("Khách Hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 110, -1));

        btnTrangThaiPhong.setText("Trạng thái phòng theo ngày");
        btnTrangThaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangThaiPhongActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrangThaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, -1));

        btnDatPhong.setText("Đặt phòng");
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatPhongActionPerformed(evt);
            }
        });
        getContentPane().add(btnDatPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 220, -1));

        btnDkdv.setText("Đặt đồ ăn / đồ uống");
        btnDkdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDkdvActionPerformed(evt);
            }
        });
        getContentPane().add(btnDkdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 220, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 130, -1));

        btnThongKe.setText("Báo cáo - Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 220, -1));

        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 220, -1));

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 220, -1));

        txt_TaiKhoan.setAlignmentX(1.0F);
        txt_TaiKhoan.setAutoscrolls(false);
        txt_TaiKhoan.setPreferredSize(new java.awt.Dimension(120, 22));
        txt_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TaiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, 30));

        jLabel4.setBackground(new java.awt.Color(20, 56, 20));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/uth.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 220, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbDateStart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDateStart.setText("Từ ngày:");

        lbDateEnd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDateEnd.setText("Đến ngày:");

        btnDoanhThu.setText("Doanh thu");
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });
        btnDoanhThu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDoanhThuKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("BÁO CÁO - THỐNG KÊ:");

        dateStart.setDateFormatString("yyyy-MM-dd");

        dateEnd.setDateFormatString("yyyy-MM-dd");

        lbDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDoanhThu.setText("Doanh thu:");

        txtDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoanhThuActionPerformed(evt);
            }
        });

        lbTitleDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitleDoanhThu.setText("1. Doanh thu:");

        lbTitleThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitleThongKe.setText("2. Báo cáo - Thông kê:");

        lbOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbOption.setText("Lựa chọn:");

        cbThongKe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Top 3 khách hàng đặt/hẹn phòng nhiều nhất", "Top 3 phòng được đặt nhiều nhất", "Top 3 đồ ăn được đặt nhiều nhất", "Top 3 đồ uống được đặt nhiều nhất", "Những khách hàng đang hẹn phòng", "Những khách hàng quá hạn thanh toán" }));

        btnShowTK.setText("Hiển thị");
        btnShowTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTKActionPerformed(evt);
            }
        });
        btnShowTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnShowTKKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VNĐ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitleDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbTitleThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(lbDateEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDoanhThu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lbOption, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(cbThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShowTK, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitleDoanhThu)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDateEnd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDateStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDoanhThu)
                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbTitleThongKe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOption)
                    .addComponent(cbThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowTK))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, 510));

        btnAUL.setText("Đồ ăn / Đồ uống / Loại phòng");
        btnAUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAULActionPerformed(evt);
            }
        });
        getContentPane().add(btnAUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/green.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 640));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TaiKhoanActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        // TODO add your handling code here:
        new main_taiKhoan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongActionPerformed
        // TODO add your handling code here:
        new main_phong().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPhongActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        new main_nhanVien().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        new main_khachHang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnTrangThaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangThaiPhongActionPerformed
        // TODO add your handling code here:
        new main_trangThaiPhong().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangThaiPhongActionPerformed

    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatPhongActionPerformed
        // TODO add your handling code here:
        new main_datPhong().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDatPhongActionPerformed

    private void btnDkdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDkdvActionPerformed
        // TODO add your handling code here:
        new main_DkDichVu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDkdvActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        new main_thongKe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        staticModify.refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAULActionPerformed
        // TODO add your handling code here:
        new main_AUL().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAULActionPerformed

    private void txtDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoanhThuActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        // TODO add your handling code here:
        doanhThu();
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnShowTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTKActionPerformed
        // TODO add your handling code here:
        showTK();
    }//GEN-LAST:event_btnShowTKActionPerformed

    private void btnShowTKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnShowTKKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Nhấn Phím enter hiển thị báo cáo");
            showTK();
        }
    }//GEN-LAST:event_btnShowTKKeyPressed

    private void btnDoanhThuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDoanhThuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Nhấn Phím enter doanh thu");
            doanhThu();
        }
    }//GEN-LAST:event_btnDoanhThuKeyPressed

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
            java.util.logging.Logger.getLogger(main_thongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_thongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_thongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_thongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_thongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAUL;
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JButton btnDkdv;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhong;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnShowTK;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangThaiPhong;
    private javax.swing.JComboBox<String> cbThongKe;
    private com.toedter.calendar.JDateChooser dateEnd;
    private com.toedter.calendar.JDateChooser dateStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbDateEnd;
    private javax.swing.JLabel lbDateStart;
    private javax.swing.JLabel lbDoanhThu;
    private javax.swing.JLabel lbOption;
    private javax.swing.JLabel lbTitleDoanhThu;
    private javax.swing.JLabel lbTitleThongKe;
    private javax.swing.JTextField txtDoanhThu;
    private javax.swing.JTextField txt_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
