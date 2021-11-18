/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.system.Model;
import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author alahm
 */
public class ConnectionManager {
        private static String dbName="rs";
        private static String url = "jdbc:mysql://localhost:3306/"+dbName+"?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        private static String driverName = "com.mysql.jdbc.Driver";
        private static String username = "root";
        private static String password = "";
        private static java.sql.Connection con;
        public static java.sql.Connection getConnection() {
            try {
                con = DriverManager.getConnection(url, username, password);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex,"ERROR CONNECTION TO DATABASE",0);
            }
            return con;
        }
}
