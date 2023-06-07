/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import static Main.Run.stmt;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThanhTung
 */
public class QUANLYNV extends javax.swing.JFrame {

    /**
     * Creates new form QUANLYNV
     */
    String clicked;
    public QUANLYNV() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(this);
        Hien_Thi_NV();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton7.setText("Tìm Kiếm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MNV", "HỌ VÀ TÊN", "SỐ ĐIỆN THOẠI", "ĐỊA CHỈ", "TÀI KHOẢN", "MẬT KHẨU", "CHỨC VỤ"
            }
        ));
        jTable2.setAlignmentX(1.0F);
        jTable2.setAlignmentY(1.0F);
        jTable2.setRowHeight(30);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClick(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setText("Thêm");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton10.setText("Xóa");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Họ và tên");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Số điện thoại");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Địa chỉ");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Tài khoản");

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Mật khẩu");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Vai trò");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản trị" }));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton11.setText("Quay lại");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton12.setText("Sửa");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN THƯ VIỆN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField12)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton9)
                        .addGap(31, 31, 31)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void Hien_Thi_NV() throws SQLException {
        String sql = "SELECT nhan_vien_thu_vien.MA_NV, name, phone, address, ten_dang_nhap, mat_khau, CASE WHEN role = 0 THEN 'Nhân viên' ELSE 'Quản trị' END FROM tai_khoan JOIN nhan_vien_thu_vien ON tai_khoan.MA_NV = nhan_vien_thu_vien.MA_NV;";
        ResultSet rs = stmt.executeQuery(sql);

        // Tạo một DefaultTableModel với các cột tương ứng với tên các trường trong ResultSet
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        // Reset Dữ liệu trong model
        model.setRowCount(0);
        // Thêm dữ liệu từ ResultSet vào model
        while (rs.next()) {
            Object[] rowData = new Object[7];
            for (int i = 0; i < 7; i++) {
                rowData[i] = rs.getObject(i + 1);
                
            }
            model.addRow(rowData);
        }

        // Gán model cho JTable
        jTable2.setModel(model);
    }
     private void setValue2(Object[] source) {
        jTextField5.setText((String) source[1]);
        jTextField11.setText((String) source[2]);
        jTextField8.setText((String) source[3]);
        jTextField12.setText((String) source[4]);
        jTextField9.setText((String) source[5]);
        jComboBox1.setSelectedItem(source[6].toString());
    } 
    private String[] getValue2() {
        String hvt = jTextField5.getText();
        String sdt = jTextField11.getText();
        String dc = jTextField8.getText();
        String tk = jTextField12.getText();
        String mk = jTextField9.getText();
        String role = String.valueOf(jComboBox1.getSelectedIndex());
        String[] k = {hvt,sdt,dc,tk,mk,role};
        return k;
    }
     private boolean Validate(String[] array){
         boolean containsEmptyString = false;
         for (String str : array) {
            if (str.isEmpty()) {
                containsEmptyString = true;
                break;
            }
        }

        // Kiểm tra kết quả
        if (containsEmptyString) {
             JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ dữ liệu");
            return true;
        } else {
            return false;
        }
    }
     private String generateCode (String code) {
        String[] codes = code.split("0",2);
        String output = codes[0]+"0"+(Integer.valueOf(codes[1])+1);
        return output;
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String text = jTextField3.getText();
        String sql = "SELECT nhan_vien_thu_vien.MA_NV, name, phone, address, ten_dang_nhap, mat_khau, CASE WHEN role = 0 THEN 'Nhân viên' ELSE 'Quản trị' END FROM tai_khoan JOIN nhan_vien_thu_vien ON tai_khoan.MA_NV = nhan_vien_thu_vien.MA_NV WHERE nhan_vien_thu_vien.MA_NV = '"+text+"' OR NAME = '"+text+"'";

        try {
           ResultSet rs = stmt.executeQuery(sql);
           DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            // Reset Dữ liệu trong model
            model.setRowCount(0);
            // Thêm dữ liệu từ ResultSet vào model
            rs.next();
            Object[] rowData = new Object[7];
            for (int i = 0; i <7; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
            jTable2.setModel(model);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QUANLYNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String[] source = {"","","","","","","Nhân viên"};
        setValue2(source);
        jTextField3.setText("");
        clicked = "";
        try {
            Hien_Thi_NV();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QUANLYNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClick
        int selectedRow = jTable2.getSelectedRow();
        Object[] rowData = new Object[7];

        for (int column = 0; column < 7; column++) {
            rowData[column] = jTable2.getValueAt(selectedRow, column);
        }
        clicked = (String) rowData[0];
        setValue2(rowData);
    }//GEN-LAST:event_jTable2MouseClick

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Thêm doc gia
        String[] data = getValue2();// Lay du lieu tu form
        if(Validate(data))// Kiem tra co truong nao rong khong
        return;
        else{
            String check_nv = "SELECT MA_NV FROM NHAN_VIEN_THU_VIEN WHERE MA_NV = '"+clicked+"'";
          
            try {
            ResultSet rs = stmt.executeQuery(check_nv);
            if (rs.next()){ // Kiem tra sach da ton tai hay chua và dua ra thong bao
                    JOptionPane.showMessageDialog(this, "Nhân viên đã tồn tại");
                    rs.close();
                }
                else {
                    String lated_ms_q = "SELECT MA_NV FROM NHAN_VIEN_THU_VIEN ORDER BY MA_NV DESC LIMIT 1 ";
                    ResultSet rs3 = stmt.executeQuery(lated_ms_q);// Lấy ra mã sách mới nhất
                    String lated_ms;
                    if(rs3.next()){
                        lated_ms = generateCode(rs3.getObject(1).toString()); // Tạo ra mã sách mới
                    }
                    else
                        lated_ms = generateCode("NV00");
                    String inner = "CALL THEM_NV('"+lated_ms+"', '"+data[0]+"', '"+data[1]+"', '"+data[2]+"', '"+data[3]+"', '"+data[4]+"', "+data[5]+");";
                    stmt.execute(inner); // Thêm đọc giả
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    Hien_Thi_NV();
                }
            
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(QUANLYNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }            
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục?", "Xác nhận", JOptionPane.YES_NO_OPTION);
         if (choice == JOptionPane.YES_OPTION) {
             try {
                 stmt.execute("CALL XOA_NV ('"+clicked+"')");
                 JOptionPane.showMessageDialog(this, "Xóa thành công");
                  Hien_Thi_NV();
             } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(QUAN_LY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.dispose();
        DANG_NHAP.menu.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
// Thêm doc gia
        String[] data = getValue2();// Lay du lieu tu form
        if(Validate(data))// Kiem tra co truong nao rong khong
        return;
        else{
                System.out.print(clicked);
                String update = "CALL SUA_NHAN_VIEN('"+clicked+"', '"+data[0]+"', '"+data[1]+"', '"+data[2]+"', '"+data[3]+"', '"+data[4]+"', "+data[5]+");";
            try {
                stmt.execute(update); // Thêm đọc giả
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                Hien_Thi_NV();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(QUANLYNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }        
    }//GEN-LAST:event_jButton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
