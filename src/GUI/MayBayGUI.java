/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.MayBayBUS;
import BUS.MayBayBUS;
import DTO.MayBayDTO;
import DTO.MayBayDTO;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class MayBayGUI extends javax.swing.JDialog {

    private DefaultTableModel model;

    /**
     * Creates new form MayBayGUI
     */
    public MayBayGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public String getContent() {
        return txtMaMB.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSMB = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaMB = new javax.swing.JTextField();
        txtTenMB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKCGhe = new javax.swing.JTextField();
        txtSDG1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSLGheThuong = new javax.swing.JTextField();
        txtSLGheVIP = new javax.swing.JTextField();
        btAddMB = new javax.swing.JButton();
        btSuaMB = new javax.swing.JButton();
        btXoaMB = new javax.swing.JButton();
        btResetMB = new javax.swing.JButton();
        btChooseMB = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÁY BAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        tblDSMB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Máy Bay", "Tên Máy Bay", "Khoảng Cách Ghế", "Sơ Đồ Ghế", "Số lượng Ghế Thường", "Số lượng Ghế VIP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSMB.setRowHeight(30);
        tblDSMB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSMBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSMB);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mã Máy Bay:");

        jLabel3.setText("Tên Máy Bay:");

        jLabel4.setText("Khoảng cách Ghế:");

        jLabel5.setText("Sơ Đồ Ghế:");

        jLabel7.setText("Số lượng Ghế Thường:");

        jLabel8.setText("Số lượng Ghế VIP:");

        btAddMB.setText("Thêm");
        btAddMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMBActionPerformed(evt);
            }
        });

        btSuaMB.setText("Sửa");
        btSuaMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaMBActionPerformed(evt);
            }
        });

        btXoaMB.setText("Xóa");
        btXoaMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaMBActionPerformed(evt);
            }
        });

        btResetMB.setText("Reset");
        btResetMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetMBActionPerformed(evt);
            }
        });

        btChooseMB.setText("CHỌN");

        btExit.setText("THOÁT");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tim Kiem"));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        jLabel9.setText("Theo Mã:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTenMB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMaMB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSDG1)
                                    .addComponent(txtKCGhe, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtSLGheThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSLGheVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btChooseMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAddMB, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSuaMB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btResetMB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btXoaMB, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtKCGhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSLGheVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSDG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSLGheThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btXoaMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSuaMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAddMB, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btResetMB, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(btChooseMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        MayBayBUS bus = new MayBayBUS();
        if (MayBayBUS.dsmb == null) {
            bus.docDSMB();
        }
        Vector header = new Vector();
        header.add("Mã Máy Bay");
        header.add("Tên Máy Bay");
        header.add("Khoảng Cách Ghế");
        header.add("Sơ Đồ Ghế");
        header.add("Số lượng Ghế Thường");
        header.add("Số lượng Ghế VIP");
        model = new DefaultTableModel(header, 0);
        MayBayBUS.dsmb.stream().map((mb) -> {
            Vector row = new Vector();
            row.add(mb.MaMB);
            row.add(mb.TenMayBay);
            row.add(mb.SoDoGhe);
            row.add(mb.KCGhe);
            row.add(mb.SLGheThuong);
            row.add(mb.SLGheVIP);
            return row;
        }).forEachOrdered((row) -> {
            model.addRow(row);
        });
        tblDSMB.setModel(model);
    }//GEN-LAST:event_formWindowActivated

    private void tblDSMBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSMBMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modellt = (DefaultTableModel) tblDSMB.getModel();
        int i = tblDSMB.getSelectedRow();
        if (i >= 0) {
            MayBayDTO maybay = new MayBayDTO();
            maybay = MayBayBUS.dsmb.get(i);
            txtMaMB.setText(maybay.getMaMB());
            txtTenMB.setText(maybay.getTenMayBay());
            txtKCGhe.setText(String.valueOf(maybay.getKCGhe()));
            txtSDG1.setText(maybay.getSoDoGhe());
            txtSLGheThuong.setText(String.valueOf(maybay.getSLGheThuong()));
            txtSLGheVIP.setText(String.valueOf(maybay.getSLGheVIP()));
        }
    }//GEN-LAST:event_tblDSMBMouseClicked

    private void btAddMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMBActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtMaMB.getText()) || "".equals(txtTenMB.getText())
                || "".equals(txtKCGhe.getText()) || "".equals(txtSDG1.getText())
                || "".equals(txtSLGheThuong.getText())|| "".equals(txtSLGheVIP.getText())) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập đầy đủ thông tin !!!");
        } else {
            MayBayBUS bus = new MayBayBUS();
            MayBayDTO dto = new MayBayDTO();
            dto.MaMB = txtMaMB.getText();
            dto.TenMayBay = txtTenMB.getText();
            dto.KCGhe = Integer.parseInt(txtKCGhe.getText());
            dto.SoDoGhe = txtSDG1.getText();
            dto.SLGheThuong = Integer.parseInt(txtSLGheThuong.getText());
            dto.SLGheVIP = Integer.parseInt(txtSLGheVIP.getText());
            bus.them(dto);
            Vector row = new Vector();
            row.add(dto.MaMB);
            row.add(dto.TenMayBay);
            row.add(dto.KCGhe);
            row.add(dto.SoDoGhe);
            row.add(dto.SLGheThuong);
            row.add(dto.SLGheVIP);
            model.addRow(row);
            tblDSMB.setModel(model);
        }
    }//GEN-LAST:event_btAddMBActionPerformed

    private void btSuaMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaMBActionPerformed
        // TODO add your handling code here:
        int i = tblDSMB.getSelectedRow();
        String MaMB = txtMaMB.getText();
        int check = 0;
        for (MayBayDTO x : MayBayBUS.dsmb) {
            if (x.getMaMB().equals(txtMaMB.getText())) {
                check = 1;
            }
        }
        MayBayBUS.dsmb.stream().filter((x) -> (x.getMaMB().equals(MaMB)));
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Bạn cần chọn dòng để sửa");
        } else if (check == 0) {
            JOptionPane.showMessageDialog(null, "Mã Máy bay không được sửa");
            txtMaMB.requestFocus();

        } else {
            int chon = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không", "Sửa", JOptionPane.YES_NO_OPTION);
            if (chon == JOptionPane.YES_OPTION && check == 1) {
                MayBayDTO maybay = new MayBayDTO();
                maybay = MayBayBUS.dsmb.set(i, maybay);
                maybay.TenMayBay = txtTenMB.getText();
                maybay.KCGhe = Integer.parseInt(txtKCGhe.getText());
                maybay.SoDoGhe = txtSDG1.getText();
                maybay.SLGheVIP = Integer.parseInt(txtSLGheVIP.getText());
                maybay.SLGheThuong = Integer.parseInt(txtSLGheThuong.getText());
                MayBayBUS bus = new MayBayBUS();
                bus.sua(maybay);
                model.setValueAt(maybay.MaMB, i, 0);
                model.setValueAt(maybay.TenMayBay, i, 1);
                model.setValueAt(maybay.KCGhe, i, 2);
                model.setValueAt(maybay.SoDoGhe, i, 3);
                model.setValueAt(maybay.SLGheVIP, i, 4);
                model.setValueAt(maybay.SLGheThuong, i, 5);
                bus.docDSMB();
            }

        }
    }//GEN-LAST:event_btSuaMBActionPerformed

    private void btXoaMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaMBActionPerformed
        // TODO add your handling code here:
        int i = tblDSMB.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Bạn cần chọn dòng để xóa");
        } else {
            int chon = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không", "Xóa máy bay", JOptionPane.YES_NO_OPTION);
            if (chon == JOptionPane.YES_OPTION) {
                MayBayDTO mb = new MayBayDTO();
                mb = MayBayBUS.dsmb.remove(i);
                MayBayBUS bus = new MayBayBUS();
                bus.xoa(txtMaMB.getText());
                model.removeRow(i);
                tblDSMB.setModel(model);
                txtMaMB.setText(null);
                txtTenMB.setText(null);
                txtKCGhe.setText(null);
                txtSDG1.setText(null);
               
                txtSLGheVIP.setText(null);
                txtSLGheThuong.setText(null);
            }
        }
    }//GEN-LAST:event_btXoaMBActionPerformed

    private void btResetMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetMBActionPerformed
        // TODO add your handling code here:
        txtMaMB.setText(null);
        txtTenMB.setText(null);
        txtKCGhe.setText(null);
        txtSLGheVIP.setText(null);
        txtSLGheThuong.setText(null);
    }//GEN-LAST:event_btResetMBActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

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
            java.util.logging.Logger.getLogger(MayBayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayBayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayBayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayBayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            MayBayGUI dialog = new MayBayGUI(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddMB;
    private javax.swing.JButton btChooseMB;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btResetMB;
    private javax.swing.JButton btSuaMB;
    private javax.swing.JButton btXoaMB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDSMB;
    private javax.swing.JTextField txtKCGhe;
    private javax.swing.JTextField txtMaMB;
    private javax.swing.JTextField txtSDG1;
    private javax.swing.JTextField txtSLGheThuong;
    private javax.swing.JTextField txtSLGheVIP;
    private javax.swing.JTextField txtTenMB;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
