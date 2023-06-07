/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.DANG_NHAP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Run {
    static public Connection conn;
    static public Statement stmt;
    static public DANG_NHAP login;
    static public void ConnecSQL() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/qlsach","root","");
        stmt = conn.createStatement();
    }
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        ConnecSQL();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               login =  new DANG_NHAP();
               login.setVisible(true);
            }
        });
    }
}
