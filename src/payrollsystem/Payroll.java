/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author user 2
 */
import java.sql.*;
import javax.swing.*;
public class Payroll {
      Connection conn = null;
public static Connection ConnectDb()
 {
try{Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527/Payrol", "tian", "tian");
return conn;
}catch (Exception e) {
JOptionPane.showMessageDialog(null, e);
return null;
}
}
}