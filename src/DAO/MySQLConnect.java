package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MySQLConnect {

    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/quanlybanve?characterEncoding=UTF-8";
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    //
   MySQLConnect() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Lỗi Kết nối Database");
            }
        }
    }
}
