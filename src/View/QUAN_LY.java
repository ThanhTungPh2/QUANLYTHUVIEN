
package View;
import static Main.Run.*;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QUAN_LY extends javax.swing.JFrame {
    String clicked,clicked2;
     List<Object> dataList2 = new ArrayList<>(); // Danh sách để lưu trữ dữ liệu từ jTable
    public QUAN_LY() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField13 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jTextField17 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load_Window(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Tên sách");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Tác giả");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Năm xuất bản");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("NXB");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Giá tiền");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Số lượng");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SÁCH", "TÊN SÁCH", "SỐ LƯỢNG", "GIÁ TIỀN", "NĂM XB", "NXB", "TÁC GIẢ"
            }
        ));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClick(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setText("Thêm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton5.setText("Sửa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton6.setText("Xóa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addGap(35, 35, 35)
                        .addComponent(jButton5)
                        .addGap(34, 34, 34)
                        .addComponent(jButton6)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jComboBox2, jTextField2, jTextField4, jTextField6, jTextField7});

        jTabbedPane1.addTab("Quản lý sách", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HIỂN THỊ CHI TIẾT PHIẾU MƯỢN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16), new java.awt.Color(0, 0, 255))); // NOI18N

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SÁCH", "TÊN SÁCH", "GIÁ TIỀN"
            }
        ));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(2).setMinWidth(200);
            jTable4.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Thành Tiền: ");

        jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH PHIẾU MƯỢN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16), new java.awt.Color(0, 0, 204))); // NOI18N

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ PHIẾU", "NGƯỜI MƯỢN", "NGÀY MƯỢN", "NGÀY HẸN TRẢ", "TRẠNG THÁI"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Click_Phieu_Muon(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton11.setText("Tìm Kiếm");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton12.setText("Trả sách");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButton12)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NHẬP PHIẾU MƯỢN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16), new java.awt.Color(0, 0, 204))); // NOI18N

        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Mã sinh viên");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Ngày hẹn trả");

        jTable6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SÁCH", "TÊN SÁCH"
            }
        ));
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton15.setText("Thêm sách");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton16.setText("Reset");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton18.setText("Xóa");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton13.setText("Thêm phiếu");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton14.setText("Sửa");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton13)
                        .addGap(42, 42, 42)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Quản lý phiếu mượn", jPanel2);

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Mã độc giả");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Họ và tên");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Địa chỉ");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Khoa");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Lớp");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setText("Thêm");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton10.setText("Sửa");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ ĐỌC GIẢ", "TÊN ĐỌC GIẢ", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI", "KHOA", "LỚP"
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

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Số điện thoại");

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(jTextField9)
                            .addComponent(jTextField12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField11, jTextField5});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(35, 35, 35)
                        .addComponent(jButton10)
                        .addGap(131, 131, 131))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField11, jTextField12, jTextField5});

        jTabbedPane1.addTab("Quản lý độc giả", jPanel3);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setText("Quay lại");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(74, 74, 74))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Hien_Thi_Sach() throws SQLException {
        String sql = "SELECT MA_SACH, s.NAME, SO_LUONG, GIA_TIEN, NAM_XB, nxb.NAME, tg.NAME FROM SACH s JOIN NHA_XUAT_BAN nxb ON s.MA_NXB = nxb.MA_NXB JOIN TAC_GIA tg ON s.MA_TAC_GIA = tg.MA_TAC_GIA";
        ResultSet rs = stmt.executeQuery(sql);

        // Tạo một DefaultTableModel với các cột tương ứng với tên các trường trong ResultSet
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
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
        jTable1.setModel(model);
    }
    private void Hien_Doc_Gia() throws SQLException {
        String sql = "SELECT MA_DOC_GIA, NAME, ADDRESS, SDT, KHOA, LOP FROM DOC_GIA";
        ResultSet rs = stmt.executeQuery(sql);

        // Tạo một DefaultTableModel với các cột tương ứng với tên các trường trong ResultSet
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        // Reset Dữ liệu trong model
        model.setRowCount(0);
        // Thêm dữ liệu từ ResultSet vào model
        while (rs.next()) {
            Object[] rowData = new Object[6];
            for (int i = 0; i < 6; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
        }

        // Gán model cho JTable
        jTable2.setModel(model);
    }
    private void Hien_Thi_Phieu_Muon () throws SQLException {
        String sql = "SELECT MA_PHIEU, dg.NAME, DATE_START, DATE_END,TRANG_THAI FROM DOC_GIA dg JOIN PHIEU_MUON mp ON dg.MA_DOC_GIA = mp.MA_DOC_GIA ORDER BY CASE WHEN TRANG_THAI = 'ĐANG MƯỢN' THEN 1 ELSE 2 END ";
        ResultSet rs = stmt.executeQuery(sql);

        // Tạo một DefaultTableModel với các cột tương ứng với tên các trường trong ResultSet
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        // Reset Dữ liệu trong model
        model.setRowCount(0);
        // Thêm dữ liệu từ ResultSet vào model
        while (rs.next()) {
            Object[] rowData = new Object[5];
            for (int i = 0; i < 5; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
        }

        // Gán model cho JTable
        jTable3.setModel(model);
    }
    private void Hien_Thi_Sach_Duoc_Muon() throws SQLException {
        String sql = "SELECT s.MA_SACH, NAME, GIA_TIEN FROM SACH s JOIN PHIEU_MUON_SACH pms ON s.MA_SACH = pms.MA_SACH WHERE MA_PHIEU = '"+clicked2+"'";
        ResultSet rs = stmt.executeQuery(sql);

        // Tạo một DefaultTableModel với các cột tương ứng với tên các trường trong ResultSet
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        // Reset Dữ liệu trong model
        model.setRowCount(0);
        // Thêm dữ liệu từ ResultSet vào model
        DefaultTableModel model2 = (DefaultTableModel) jTable6.getModel();
        // Reset Dữ liệu trong model
        model2.setRowCount(0);
        dataList2.clear();
        while (rs.next()) {
            Object[] rowData = new Object[3];
            for (int i = 0; i < 3; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
            Object[] rowData2 = new Object[2];
            for (int i = 0; i < 2; i++) {
                rowData2[i] = rs.getObject(i + 1);
            }
            dataList2.add(rowData2[0]);
            model2.addRow(rowData);
        }
        rs.close();
        // Gán model cho JTable
        ResultSet rs2 = stmt.executeQuery("SELECT TONG_TIEN('"+clicked2+"')");
        rs2.next();
        if (rs2.getObject(1) != null)
            jTextField14.setText(rs2.getObject(1).toString());
        else
              jTextField14.setText("0");
        rs2.close();
        jTable6.setModel(model2);
        jTable4.setModel(model);
    }
    private void setValue(Object[] source){
        jTextField2.setText(source[1].toString());
        jTextField7.setText(source[2].toString());
        jTextField6.setText(source[3].toString());
        jTextField4.setText(source[4].toString());
        jComboBox1.setSelectedItem(source[5].toString());
        jComboBox2.setSelectedItem(source[6].toString());
    }
    private void setValue2(Object[] source) {
        jTextField5.setText((String) source[0]);
        jTextField11.setText((String) source[1]);
        jTextField8.setText((String) source[2]);
        jTextField12.setText((String) source[4]);
        jTextField9.setText((String) source[5]);
        jTextField10.setText((String) source[3]);
    }
    private String[] getValue() {
        String name = jTextField2.getText();
        String sl = jTextField7.getText();
        String gt = jTextField6.getText();
        String n = jTextField4.getText();
        String nxb = (String) jComboBox1.getSelectedItem();
        String tg = (String) jComboBox2.getSelectedItem();
        String[] k = {name,sl,gt,n,nxb,tg};
        return k;
    }
    private String[] getValue2() {
        String mdg = jTextField5.getText();
        String hvt = jTextField11.getText();
        String dc = jTextField8.getText();
        String khoa = jTextField12.getText();
        String lop = jTextField9.getText();
        String sdt = jTextField10.getText();
        String[] k = {mdg,hvt,dc,sdt,khoa,lop};
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
    private void LoadNXB() throws SQLException{
        String q = "SELECT NAME FROM NHA_XUAT_BAN";
        ResultSet rs = stmt.executeQuery(q);
        while (rs.next()) {
            jComboBox1.addItem(rs.getObject(1).toString());
        }
    }
    private void LoadTG() throws SQLException {
        String q = "SELECT NAME FROM TAC_GIA";
        ResultSet rs = stmt.executeQuery(q);
        while (rs.next()) {
            jComboBox2.addItem(rs.getObject(1).toString());
        }
    }
    private void Load_Window(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load_Window
        try {
            // Quản lý sách
            Hien_Thi_Sach();
            //Quan ly doc gia
            Hien_Doc_Gia();
            // Danh sach Phieu muon
            Hien_Thi_Phieu_Muon();
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox1.setEditable(true);
        jComboBox2.setEditable(true);
        try {
            LoadNXB();
            LoadTG();
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Load_Window

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DANG_NHAP.menu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClick
        int selectedRow = jTable1.getSelectedRow();
        Object[] rowData = new Object[7];

        for (int column = 0; column < 7; column++) {
            rowData[column] = jTable1.getValueAt(selectedRow, column);
        }
        clicked = (String) rowData[0];
        setValue(rowData);
    }//GEN-LAST:event_MouseClick

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String[] data = getValue();// Lay du lieu tu form
        if(Validate(data))// Kiem tra co truong nao rong khong
            return;
        String check_sach_q = "SELECT MA_SACH FROM SACH WHERE NAME = '"+data[0]+"'";
        String check_nxb_q = "SELECT MA_NXB FROM NHA_XUAT_BAN WHERE NAME = '"+data[4]+"'";
        String check_tg_q = "SELECT MA_TAC_GIA FROM TAC_GIA WHERE NAME = '"+data[5]+"'"; 
        String lated_ms_q = "SELECT MA_SACH FROM SACH ORDER BY MA_SACH DESC LIMIT 1 ";
        String lated_nxb_q = "SELECT MA_NXB FROM NHA_XUAT_BAN ORDER BY MA_NXB DESC LIMIT 1 ";
        String lated_tg_q = "SELECT MA_TAC_GIA FROM TAC_GIA ORDER BY MA_TAC_GIA DESC LIMIT 1 ";
        String nxb;
        String tg;
        try {
            ResultSet rs = stmt.executeQuery(check_sach_q);
            if (rs.next()){ // Kiem tra sach da ton tai hay chua và dua ra thong bao
                JOptionPane.showMessageDialog(this, "Sách"+data[0]+"đã tồn tại");
                rs.close();
            }
            else {
                rs.close();
                ResultSet rs1 = stmt.executeQuery(check_nxb_q);// check nha xuat ban da ton tai chua
                // NXB
                if(rs1.next()){
                    nxb = rs1.getObject(1).toString(); // Lay ma nxb da ton tai
                }
                else {
                    // NXB chua ton tai thì thêm moi vao bang NXB
                    rs1 = stmt.executeQuery(lated_nxb_q);
                    rs1.next();
                    nxb = generateCode(rs1.getObject(1).toString());
                    String insert_nxb = "INSERT INTO `nha_xuat_ban`(`MA_NXB`, `NAME`) VALUES ('"+nxb+"','"+data[4]+"')";
                    stmt.execute(insert_nxb);
                }
                rs1.close();
                // TAC_GIA
                ResultSet rs2 = stmt.executeQuery(check_tg_q);// check tac gia da ton tai chua
                if(rs2.next()){
                    tg = rs2.getObject(1).toString();
                }
                else {
                    // Thêm tác giả mới vào
                    rs2 = stmt.executeQuery(lated_tg_q);
                    rs2.next();
                    tg = generateCode(rs2.getObject(1).toString());
                    String insert_tg = "INSERT INTO `tac_gia`(`MA_TAC_GIA`, `NAME`) VALUES ('"+tg+"','"+data[5]+"')";
                    stmt.execute(insert_tg);
                }
                rs2.close();
                ResultSet rs3 = stmt.executeQuery(lated_ms_q);// Lấy ra mã sách mới nhất
                String lated_ms;
                if(rs3.next()){
                    lated_ms = generateCode(rs3.getObject(1).toString()); // Tạo ra mã sách mới
                }
                else
                    lated_ms = generateCode("S00");
                String inner = "INSERT INTO `sach`(`MA_SACH`, `NAME`, `SO_LUONG`, "
                    + "`GIA_TIEN`, `NAM_XB`, `MA_NXB`, `MA_TAC_GIA`) "
                    + "VALUES ('"+lated_ms+"','"+data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"','"+nxb+"','"+tg+"')";
                stmt.execute(inner); // Thêm sách
                rs3.close();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                Hien_Thi_Sach();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String[] data = getValue();
        if(Validate(data))
            return;
        String check_sach_q = "SELECT MA_SACH FROM SACH WHERE MA_SACH = '"+clicked+"'";
        String check_nxb_q = "SELECT MA_NXB FROM NHA_XUAT_BAN WHERE NAME = '"+data[4]+"'";
        String check_tg_q = "SELECT MA_TAC_GIA FROM TAC_GIA WHERE NAME = '"+data[5]+"'";
        String lated_nxb_q = "SELECT MA_NXB FROM NHA_XUAT_BAN ORDER BY MA_NXB DESC LIMIT 1 ";
        String lated_tg_q = "SELECT MA_TAC_GIA FROM TAC_GIA ORDER BY MA_TAC_GIA DESC LIMIT 1 ";
        String nxb;
        String tg;
        String ms;
        try {
            ResultSet rs = stmt.executeQuery(check_sach_q);
            rs.next();
            ms = rs.getObject(1).toString();
            rs.close();
            ResultSet rs1 = stmt.executeQuery(check_nxb_q);// check nha xuat ban da ton tai chua
                // NXB
                if(rs1.next()){
                    nxb = rs1.getObject(1).toString(); // Lay ma nxb da ton tai
                }
                else {
                    // NXB chua ton tai thì thêm moi vao bang NXB
                    rs1 = stmt.executeQuery(lated_nxb_q);
                    rs1.next();
                    nxb = generateCode(rs1.getObject(1).toString());
                    String insert_nxb = "INSERT INTO `nha_xuat_ban`(`MA_NXB`, `NAME`) VALUES ('"+nxb+"','"+data[4]+"')";
                    stmt.execute(insert_nxb);
                }
                rs1.close();
                // TAC_GIA
                ResultSet rs2 = stmt.executeQuery(check_tg_q);// check tac gia da ton tai chua
                if(rs2.next()){
                    tg = rs2.getObject(1).toString();
                }
                else {
                    // Thêm tác giả mới vào
                    rs2 = stmt.executeQuery(lated_tg_q);
                    rs2.next();
                    tg = generateCode(rs2.getObject(1).toString());
                    String insert_tg = "INSERT INTO `tac_gia`(`MA_TAC_GIA`, `NAME`) VALUES ('"+tg+"','"+data[5]+"')";
                    stmt.execute(insert_tg);
                }
                rs2.close();
                String update_sach_q = "UPDATE `sach` SET "
                + "`NAME`='"+data[0]+"',"
                + "`SO_LUONG`='"+data[1]+"',"
                + "`GIA_TIEN`='"+data[2]+"',"
                + "`NAM_XB`='"+data[3]+"',"
                + "`MA_NXB`='"+nxb+"',"
                + "`MA_TAC_GIA`='"+tg+"' "
                + "WHERE MA_SACH = '"+ms+"'";
                stmt.execute(update_sach_q);
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                Hien_Thi_Sach();
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục?", "Xác nhận", JOptionPane.YES_NO_OPTION);
         if (choice == JOptionPane.YES_OPTION) {
             try {
                 stmt.execute("DELETE FROM SACH WHERE MA_SACH = '"+clicked+"'");
                 JOptionPane.showMessageDialog(this, "Xóa thành công");
                  Hien_Thi_Sach();
             } catch (SQLException ex) {
                 Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String[] source = {"","","","","","",""};
        setValue(source);
        jTextField1.setText("");
        try {
            Hien_Thi_Sach();
            LoadNXB();
            LoadTG();
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String text = jTextField1.getText();
        String sql = "SELECT MA_SACH, s.NAME, SO_LUONG, GIA_TIEN, NAM_XB, nxb.NAME, tg.NAME FROM SACH s "
                + "JOIN NHA_XUAT_BAN nxb ON s.MA_NXB = nxb.MA_NXB JOIN TAC_GIA tg ON s.MA_TAC_GIA = tg.MA_TAC_GIA "
                + "WHERE MA_SACH = '"+text+"' OR s.NAME = '"+text+"'";
        
        try {
            ResultSet rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Reset Dữ liệu trong model
            model.setRowCount(0);
        // Thêm dữ liệu từ ResultSet vào model
            rs.next();
            Object[] rowData = new Object[7];
            for (int i = 0; i < 7; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
            jTable1.setModel(model);
  
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String text = jTextField3.getText();
        String sql = "SELECT MA_DOC_GIA, NAME, SDT, ADDRESS, KHOA, LOP FROM DOC_GIA "
                + "WHERE MA_DOC_GIA = '"+text+"' OR NAME = '"+text+"'";
        
        try {
            ResultSet rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        // Reset Dữ liệu trong model
            model.setRowCount(0);
        // Thêm dữ liệu từ ResultSet vào model
            rs.next();
            Object[] rowData = new Object[7];
            for (int i = 0; i <6; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
            jTable2.setModel(model);
  
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String[] source = {"","","","","","",""};
               setValue2(source);
               jTextField3.setText("");
               try {
                   Hien_Doc_Gia();
               } catch (SQLException ex) {
                   Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
               }        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Thêm doc gia
        String[] data = getValue2();// Lay du lieu tu form
        if(Validate(data))// Kiem tra co truong nao rong khong
            return;
        else{
            String check_doc_gia = "SELECT MA_DOC_GIA FROM DOC_GIA WHERE MA_DOC_GIA = '"+data[0]+"'";
            try {
               ResultSet rs = stmt.executeQuery(check_doc_gia);
               if (rs.next()){ // Kiem tra sach da ton tai hay chua và dua ra thong bao
                    JOptionPane.showMessageDialog(this, "Đọc giả đã tồn tại");
                    rs.close();
                }
                else {
                    String inner = "INSERT INTO `doc_gia`(`MA_DOC_GIA`, `NAME`, `SDT`, `ADDRESS`, `KHOA`, `LOP`) "
                            + "VALUES ('"+data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"','"+data[4]+"','"+data[5]+"')";
                    stmt.execute(inner); // Thêm đọc giả
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    Hien_Doc_Gia();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Thêm doc gia
        String[] data = getValue2();// Lay du lieu tu form
        if(Validate(data))// Kiem tra co truong nao rong khong
            return;
        else{
            try {
                String update = "UPDATE `doc_gia` SET "
                        + "`NAME`='"+data[1]+"',"
                        + "`SDT`='"+data[3]+"',"
                        + "`ADDRESS`='"+data[2]+"',"
                        + "`KHOA`='"+data[4]+"',"
                        + "`LOP`='"+data[5]+"' WHERE MA_DOC_GIA = '"+data[0]+"'";
                stmt.execute(update); // Thêm đọc giả
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                Hien_Doc_Gia();
            } catch (SQLException ex) {
                Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable2MouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClick
        int selectedRow = jTable2.getSelectedRow();
        Object[] rowData = new Object[6];

        for (int column = 0; column < 6; column++) {
            rowData[column] = jTable2.getValueAt(selectedRow, column);
        }
        setValue2(rowData);
    }//GEN-LAST:event_jTable2MouseClick

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String text = jTextField17.getText();
        String sql = "SELECT MA_SACH,NAME,SO_LUONG FROM SACH "
                + "WHERE MA_SACH = '"+text+"' OR NAME = '"+text+"' AND SO_LUONG > 0";
        
        try {
            ResultSet rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        // Thêm dữ liệu từ ResultSet vào model
            if(rs.next()){
                    Object[] rowData = new Object[2];
                    for (int i = 0; i < 2; i++) {
                        rowData[i] = rs.getObject(i + 1);
                    }
                    model.addRow(rowData);

                // Gán model cho JTable
                jTable6.setModel(model);
            }
            else{
                 JOptionPane.showMessageDialog(this, "Không tìm thấy sách hoặc sách đẽ hết");
            }
  
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int selectedRow = jTable6.getSelectedRow(); // Lấy chỉ mục dòng được chọn

        if (selectedRow != -1) { // Kiểm tra xem có dòng được chọn không
            DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
            model.removeRow(selectedRow); // Xóa dòng được chọn từ model của jTable
        } else {
            // Hiển thị thông báo lỗi nếu không có dòng được chọn
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTextField15.setText("");
        jTextField15.setEditable(true);
        jButton13.setEnabled(true);
        jTextField17.setText("");
        jDateChooser2.setDate(null);
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        model.setRowCount(0);
        jTable6.setModel(model);
        try {
            Hien_Thi_Phieu_Muon();
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
    String msv = jTextField15.getText();
    if (jTextField15.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Yêu cầu nhập mã sinh viên");
    }
    
    // Kiểm tra nếu jTable không có dòng nào
    else if (jTable6.getRowCount() == 0) {
         JOptionPane.showMessageDialog(this, "Không có sách nào được mượn");
    }
    else {
        int rowCount = model.getRowCount(); // Số lượng dòng trong jTable
        List<Object[]> dataList = new ArrayList<>(); // Danh sách để lưu trữ dữ liệu từ jTable

        for (int i = 0; i < rowCount; i++) {
            Object[] rowData = new Object[model.getColumnCount()]; // Mảng để lưu trữ giá trị từ mỗi dòng

            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData[j] = model.getValueAt(i, j); // Lấy giá trị từ mỗi ô trong dòng i
            }

            dataList.add(rowData); // Thêm mảng giá trị của dòng vào danh sách
        }
        try {
            ResultSet rs3 = stmt.executeQuery("SELECT MA_PHIEU FROM PHIEU_MUON ORDER BY MA_PHIEU DESC LIMIT 1 "); // Lấy ra mã sách mới nhất
            String lated_ms;
            if(rs3.next()){
                lated_ms = generateCode(rs3.getObject(1).toString()); // Tạo ra mã sách mới
            }
            else
                lated_ms = generateCode("PM00");
        
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        Date selectedDate = jDateChooser2.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate2 = dateFormat.format(selectedDate);
        String inner = "INSERT INTO `phieu_muon`(`MA_PHIEU`, `MA_NV`, `MA_DOC_GIA`, `DATE_START`, `DATE_END`) "
                + "VALUES ('"+lated_ms+"','"+DANG_NHAP.mnv+"','"+msv+"','"+formattedDate+"','"+formattedDate2+"')";
        stmt.execute(inner); // Thêm sách
        rs3.close();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        
        Hien_Thi_Phieu_Muon();
        for (Object[] rowData: dataList){
            String column1Value = rowData[0].toString();
            stmt.execute("CALL THEM_SACH('"+lated_ms+"', '"+column1Value+"')");
        }
        Hien_Thi_Sach();
        } 
            
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Yêu cầu nhập đúng mã sinh viên"); 
        }
    }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Date selectedDate = jDateChooser2.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate2 = dateFormat.format(selectedDate);
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        if (jTable6.getRowCount() == 0) {
         JOptionPane.showMessageDialog(this, "Không có sách nào được mượn");
        } 
        else {
        try {
            for (Object x: dataList2){
                String column1Value = x.toString();
                stmt.execute("CALL XOA_SACH('"+clicked2+"', '"+column1Value+"')");
            }
            int rowCount = model.getRowCount(); // Số lượng dòng trong jTable
            List<Object[]> dataList = new ArrayList<>(); // Danh sách để lưu trữ dữ liệu từ jTable

            for (int i = 0; i < rowCount; i++) {
                Object[] rowData = new Object[model.getColumnCount()]; // Mảng để lưu trữ giá trị từ mỗi dòng

                for (int j = 0; j < model.getColumnCount(); j++) {
                    rowData[j] = model.getValueAt(i, j); // Lấy giá trị từ mỗi ô trong dòng i
                }

                dataList.add(rowData); // Thêm mảng giá trị của dòng vào danh sách
            }
            for (Object[] rowData: dataList){
                String column1Value = rowData[0].toString();
                stmt.execute("CALL THEM_SACH('"+clicked2+"', '"+column1Value+"')");
            }
            Hien_Thi_Sach();
            Hien_Thi_Sach_Duoc_Muon();
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void Click_Phieu_Muon(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Click_Phieu_Muon
        int selectedRow = jTable3.getSelectedRow();
        Object[] rowData = new Object[5];
        for (int i = 0; i<5; i++)
            rowData[i] = jTable3.getValueAt(selectedRow, i);
        clicked2 = (String) rowData[0];
        try {
            jDateChooser2.setDate((Date) rowData[3]);
            ResultSet rs2 = stmt.executeQuery("SELECT MA_DOC_GIA FROM PHIEU_MUON WHERE MA_PHIEU = '"+clicked2+"'");
            rs2.next();
            jTextField15.setText(rs2.getObject(1).toString());
            rs2.close();
            jTextField15.setEditable(false);
            jButton13.setEnabled(false);
            Hien_Thi_Sach_Duoc_Muon();
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Click_Phieu_Muon

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       
            try {
               for (Object x: dataList2){
                String column1Value = x.toString();
                stmt.execute("CALL XOA_SACH('"+clicked2+"', '"+column1Value+"')");
                Hien_Thi_Phieu_Muon();
               }
               stmt.execute("UPDATE `phieu_muon` SET `TRANG_THAI`='ĐÃ TRẢ' WHERE MA_PHIEU = '"+clicked2+"'");
               Hien_Thi_Sach();
               Hien_Thi_Phieu_Muon();
               Hien_Thi_Sach_Duoc_Muon();
            } catch (SQLException ex) {
                Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
            }    
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String text = jTextField13.getText();
        String sql = "SELECT MA_PHIEU, dg.NAME, DATE_START, DATE_END,TRANG_THAI FROM DOC_GIA dg JOIN PHIEU_MUON mp ON dg.MA_DOC_GIA = mp.MA_DOC_GIA "
                + "WHERE MA_PHIEU = '"+text+"' OR dg.NAME = '"+text+"'";
        
        try {
            ResultSet rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        // Reset Dữ liệu trong model
            model.setRowCount(0);
        // Thêm dữ liệu từ ResultSet vào model
            while(rs.next()){
            Object[] rowData = new Object[7];
            for (int i = 0; i <5; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
            jTable3.setModel(model);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QUAN_LY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
