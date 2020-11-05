/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on 11 23, 18, 7:53:25 AM
 */
package payrollsystem;


import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.AWTEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax. swing.JOptionPane;




public class Main extends javax.swing.JFrame {
Double wage;
Double Student_Loan;
Double Basic_pay;
Double Hours_Worked;
Double Over_Time;
Double Gross_Pay;
Double Net_Pay;
Double Tax_Paid;
Double iTax = 17.5;

Connection myconObj = null; 
    Statement mystatObj = null;
    ResultSet myresObj = null;
    PreparedStatement mystateObj = null;
    int mousepX;
    int mousepY;
    
    public Main() {
        initComponents();
        Dates();
        setIcon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        lblc1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblc = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CashSEA");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 80));
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, 40));
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 50, 40));
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 40));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 40));

        jLabel45.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText(" Sea Find Ways....");
        jLabel45.setToolTipText("");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 530, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1200, 120));

        jPanel2.setBackground(new java.awt.Color(0, 37, 37));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 40, 40));

        jButton2.setBackground(new java.awt.Color(0, 37, 37));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Wages");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(1);
        jButton2.setInheritsPopupMenu(true);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bills.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 100));

        jButton3.setBackground(new java.awt.Color(0, 37, 37));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, 100));

        jButton4.setBackground(new java.awt.Color(0, 37, 37));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rubbish.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 100));

        jButton5.setBackground(new java.awt.Color(0, 37, 37));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(39, 29));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, 100));

        jButton6.setBackground(new java.awt.Color(0, 37, 37));
        jButton6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Logout");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 100));

        jButton7.setBackground(new java.awt.Color(0, 37, 37));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Clear");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove.png"))); // NOI18N
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 90, 100));

        jButton8.setBackground(new java.awt.Color(0, 37, 37));
        jButton8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Search");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/research.png"))); // NOI18N
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 100));

        jButton9.setBackground(new java.awt.Color(0, 37, 37));
        jButton9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Back");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 100));

        lblc1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        lblc1.setForeground(new java.awt.Color(0, 255, 51));
        lblc1.setText("Clock");
        jPanel2.add(lblc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel27.setBackground(new java.awt.Color(0, 255, 204));
        jLabel27.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 255, 204));
        jLabel27.setText("Time :");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 255, 204));
        jLabel23.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 255, 204));
        jLabel23.setText("Date :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        lblc.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        lblc.setForeground(new java.awt.Color(0, 255, 51));
        lblc.setText("Date");
        jPanel2.add(lblc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 600));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 40, 40));

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 30));

        jPanel13.setBackground(new java.awt.Color(0, 102, 102));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("ID :");
        jPanel13.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 30, 40, -1));

        jTextField19.setBackground(new java.awt.Color(0, 51, 51));
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField19.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField19KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 150, 40));

        jTextField2.setBackground(new java.awt.Color(0, 51, 51));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel13.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, 40));

        jTextField11.setBackground(new java.awt.Color(0, 51, 51));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 150, 40));

        jLabel30.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Insentives :");
        jPanel13.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 280, 100, -1));

        jTextField6.setBackground(new java.awt.Color(0, 51, 51));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 150, 40));

        jLabel31.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Contact :");
        jPanel13.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 80, -1));

        jLabel32.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Job Reference :");
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel33.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Firstname :");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jTextField3.setBackground(new java.awt.Color(0, 51, 51));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel13.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 150, 40));

        jTextField4.setBackground(new java.awt.Color(0, 51, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel13.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, 40));

        jLabel34.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Surname :");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 180, 90, -1));

        jLabel35.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Address :");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 90, -1));

        jTextField5.setBackground(new java.awt.Color(0, 51, 51));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel13.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 40));

        jLabel36.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Gender :");
        jPanel13.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 90, -1));

        jLabel37.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Over Time :");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 230, 110, -1));

        jTextField10.setBackground(new java.awt.Color(0, 51, 51));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 150, 40));

        jLabel38.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Net Pay :");
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 180, 80, -1));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(0, 51, 51));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 150, 40));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(0, 51, 51));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 150, 40));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(0, 51, 51));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 150, 40));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(0, 51, 51));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 150, 40));

        jLabel39.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Student Loan :");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 30, 120, -1));

        jLabel40.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Tax :");
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 80, 50, -1));

        jLabel41.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Gross Pay :");
        jPanel13.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jTextField9.setBackground(new java.awt.Color(0, 51, 51));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 150, 40));

        jTextField8.setBackground(new java.awt.Color(0, 51, 51));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 150, 40));

        jTextField7.setBackground(new java.awt.Color(0, 51, 51));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel13.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, 40));

        jLabel42.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Hour Worked :");
        jPanel13.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 80, 120, -1));

        jLabel43.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Basic Pay :");
        jPanel13.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 90, -1));

        jLabel44.setFont(new java.awt.Font("Footlight MT Light", 1, 17)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Payroll no :");
        jPanel13.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 100, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel13.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, 40));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 970, 330));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Ref", "FirstName", "Surname", "Address", "Phone NO", "Hour Work", "Basic Pay", "Payroll NO", "Overtime Rate", "National IN", "Student loan", "Tax", "Gross pay", "Net pay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 970, 270));

        jPanel5.setBackground(new java.awt.Color(0, 26, 26));
        jPanel5.setForeground(new java.awt.Color(0, 37, 37));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 749));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     int YesOrNo = JOptionPane.showConfirmDialog(null,"Are sure you want to  Quit","Quit", JOptionPane.YES_NO_OPTION);
             if(YesOrNo == 0)
        {
          System.exit(0);
        }
}//GEN-LAST:event_jLabel1MouseClicked

private void jTextField19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField19KeyTyped

private void jTextField11jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11jTextField7KeyTyped
       char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField11jTextField7KeyTyped

private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
         char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField6KeyTyped

private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased

}//GEN-LAST:event_jTextField3KeyReleased

private void jTextField10jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10jTextField7KeyTyped
         char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField10jTextField7KeyTyped

private void jTextField15jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15jTextField7KeyTyped
       char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField15jTextField7KeyTyped

private void jTextField14jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14jTextField7KeyTyped
      char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField14jTextField7KeyTyped

private void jTextField13jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13jTextField7KeyTyped
       char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField13jTextField7KeyTyped

private void jTextField12jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12jTextField7KeyTyped
      char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField12jTextField7KeyTyped

private void jTextField9jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9jTextField7KeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();

          }
}//GEN-LAST:event_jTextField9jTextField7KeyTyped

private void jTextField8jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8jTextField7KeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField8jTextField7KeyTyped

private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)&&!evt.isAltDown()){
            getToolkit().beep();
            JOptionPane.showConfirmDialog(null,"Numbers Only!!!","Numbers Only Error", JOptionPane.DEFAULT_OPTION);
            evt.consume();
          }
}//GEN-LAST:event_jTextField7KeyTyped

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 try{ 
               int row =jTable1.getSelectedRow();
               String tc=(jTable1.getModel().getValueAt(row, 0).toString());
               String sql = "select * from APP.CASHC where ID="+tc+"";
               mystateObj=myconObj.prepareStatement(sql);
               myresObj=mystateObj.executeQuery();
               
              if(myresObj.next()){
       String tid = myresObj.getString("ID");
      jTextField19.setText(tid);           
       String Jr = myresObj.getString("JOB_REFERENCE");
      jTextField2.setText(Jr);
       String fn = myresObj.getString("FIRSTNAME");
      jTextField3.setText(fn);      
       String sn = myresObj.getString("SURNAME");
      jTextField4.setText(sn);     
       String ad = myresObj.getString("ADDRESS");
      jTextField5.setText(ad);            
       String hw = myresObj.getString("HOUR_WORK");
      jTextField7.setText(hw);      
       String bp = myresObj.getString("BASIC_PAY");
      jTextField8.setText(bp);     
       String prn = myresObj.getString("PAYROLL_NUM");
      jTextField9.setText(prn);     
      String ot = myresObj.getString("OVERTIME_RATE");
      jTextField10.setText(ot);     
       String ni = myresObj.getString("NATIONAL_IN");
      jTextField11.setText(ni);     
       String sl = myresObj.getString("STUDENT_LOAN");
      jTextField12.setText(sl);    
       String tax = myresObj.getString("TAX");
      jTextField13.setText(tax);    
       String gp = myresObj.getString("GROSS_PAY");
      jTextField14.setText(gp);   
       String np = myresObj.getString("NET_PAY");
      jTextField15.setText(np);    
       jComboBox1.setSelectedItem(myresObj.getString("GENDER")) ;
       String pn = myresObj.getString("CONTACT_NUM");
      jTextField6.setText(pn);
     }
           }
           catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }      
}//GEN-LAST:event_jTable1MouseClicked

private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
     
}//GEN-LAST:event_jTable1KeyPressed

private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
            if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN ){
           
           try{ 
               int row =jTable1.getSelectedRow();
               String tc=(jTable1.getModel().getValueAt(row, 0).toString());
               String sql = "select * from APP.CASHC where ID="+tc+"";
               mystateObj=myconObj.prepareStatement(sql);
               myresObj=mystateObj.executeQuery();
               
              if(myresObj.next()){
       String tid = myresObj.getString("ID");
      jTextField19.setText(tid);           
       String Jr = myresObj.getString("JOB_REFERENCE");
      jTextField2.setText(Jr);
       String fn = myresObj.getString("FIRSTNAME");
      jTextField3.setText(fn);      
       String sn = myresObj.getString("SURNAME");
      jTextField4.setText(sn);     
       String ad = myresObj.getString("ADDRESS");
      jTextField5.setText(ad);           
       String hw = myresObj.getString("HOUR_WORK");
      jTextField7.setText(hw);      
       String bp = myresObj.getString("BASIC_PAY");
      jTextField8.setText(bp);     
       String prn = myresObj.getString("PAYROLL_NUM");
      jTextField9.setText(prn);     
      String ot = myresObj.getString("OVERTIME_RATE");
      jTextField10.setText(ot);     
       String ni = myresObj.getString("NATIONAL_IN");
      jTextField11.setText(ni);     
       String sl = myresObj.getString("STUDENT_LOAN");
      jTextField12.setText(sl);    
       String tax = myresObj.getString("TAX");
      jTextField13.setText(tax);    
       String gp = myresObj.getString("GROSS_PAY");
      jTextField14.setText(gp);   
       String np = myresObj.getString("NET_PAY");
      jTextField15.setText(np);
     jComboBox1.setSelectedItem(myresObj.getString("GENDER")) ;
       String pn = myresObj.getString("CONTACT_NUM");
      jTextField6.setText(pn);
     }
           }
           catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }      
           
       }
}//GEN-LAST:event_jTable1KeyReleased

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
fecth();
Dates();
}//GEN-LAST:event_formWindowActivated

private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

}//GEN-LAST:event_jComboBox1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Basic_pay=Double.parseDouble(jTextField8.getText());
          Hours_Worked=Double.parseDouble(jTextField7.getText());    
          Over_Time=Double.parseDouble(jTextField10.getText());
          
          Gross_Pay=(Basic_pay+(Hours_Worked * Over_Time));
          Student_Loan=((Gross_Pay)*00.9)/100;
          Tax_Paid = (((Gross_Pay)* iTax)/100);
          wage = Gross_Pay - (Student_Loan+Tax_Paid);
            
        
        String SL = String.format("%.2f",Student_Loan);
        jTextField12.setText(SL);
        String TAX = String.format("%.2f",Tax_Paid);
        jTextField13.setText(TAX);
          String GP = String.format("%.2f",Gross_Pay);
        jTextField14.setText(GP);
          String Salary = String.format("%.2f",wage);
        jTextField15.setText(Salary);   
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
            int id = Integer.parseInt(jTextField19.getText());
           String jr = jTextField2.getText();
           String fn = jTextField3.getText();
           String sn = jTextField4.getText();
           String ad = jTextField5.getText();
           String value = (String) jComboBox1.getSelectedItem();
          String pn =  jTextField6.getText();
           Double hw =  Double.parseDouble(jTextField7.getText());
           Double bp =  Double.parseDouble(jTextField8.getText());
           Double prn =  Double.parseDouble(jTextField9.getText());
           Double ot =  Double.parseDouble(jTextField10.getText());
           Double ni =  Double.parseDouble(jTextField11.getText());
           Double sl =  Double.parseDouble(jTextField12.getText());
           Double tax = Double.parseDouble( jTextField13.getText());
           Double gp =  Double.parseDouble(jTextField14.getText());
           Double np =  Double.parseDouble(jTextField15.getText());  
               myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/Payrol","tian","tian");
        String sql = "insert into APP.CASHC(ID,JOB_REFERENCE,FIRSTNAME,SURNAME,ADDRESS,GENDER,CONTACT_NUM,HOUR_WORK,BASIC_PAY,PAYROLL_NUM,OVERTIME_RATE,NATIONAL_IN,STUDENT_LOAN,TAX,GROSS_PAY,NET_PAY)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement add = myconObj.prepareStatement(sql);
            add.setInt(1,id);
            add.setString(2,jr);
            add.setString(3,fn);
            add.setString(4,sn);
            add.setString(5,ad);   
             add.setString(6,value);
            add.setString(7,pn);
            add.setDouble(8,hw);
            add.setDouble(9,bp);
            add.setDouble(10,prn);
            add.setDouble(11,ot);
            add.setDouble(12,ni);
            add.setDouble(13,sl);
            add.setDouble(14,tax);
            add.setDouble(15,gp); 
            add.setDouble(16,np);
           
            int row = add.executeUpdate();
            if(row >0){
                JOptionPane.showMessageDialog(null,"Data Have been Add","Data File",JOptionPane.INFORMATION_MESSAGE);
                fecth();
            }
        }
        catch(SQLException E){
            E.printStackTrace();
        }
         jTextField19.setText(null);
       jTextField15.setText(null);
       jTextField14.setText(null);
       jTextField13.setText(null);
       jTextField12.setText(null);
       jTextField11.setText(null);
       jTextField10.setText(null);
       jTextField9.setText(null);
       jTextField8.setText(null);
       jTextField7.setText(null);
       jTextField6.setText(null);
       jTextField5.setText(null);
       jTextField4.setText(null);
       jTextField3.setText(null);
       jTextField2.setText(null);
       jComboBox1.setSelectedItem(null);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int YesOrNo = JOptionPane.showConfirmDialog(null,"Are you Sure you want to Delete Data","Delete Data", JOptionPane.YES_NO_OPTION);
             if(YesOrNo == 0) {
 
 try{
      myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/Payrol","tian","tian");
       int id = Integer.parseInt(jTextField19.getText());
       String sql = "delete from APP.CASHC where ID =?" ;
PreparedStatement preparedStatement = myconObj.prepareStatement(sql);
preparedStatement.setInt(1,id);
preparedStatement.execute();
       JOptionPane.showMessageDialog(null,"Data Have been delete","Data File",JOptionPane.INFORMATION_MESSAGE);   
        fecth();
         jTextField19.setText(null);
       jTextField15.setText(null);
       jTextField14.setText(null);
       jTextField13.setText(null);
       jTextField12.setText(null);
       jTextField11.setText(null);
       jTextField10.setText(null);
       jTextField9.setText(null);
       jTextField8.setText(null);
       jTextField7.setText(null);
       jTextField6.setText(null);
       jTextField5.setText(null);
       jTextField4.setText(null);
       jTextField3.setText(null);
       jTextField2.setText(null);
       jComboBox1.setSelectedItem(null);
 }
 catch(Exception e)
 {
JOptionPane.showMessageDialog(null, e);     
 }

 
             }    
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try{
        int id = Integer.parseInt(jTextField19.getText());
           String jr = jTextField2.getText();
           String fn = jTextField3.getText();
           String sn = jTextField4.getText();
           String ad = jTextField5.getText();
            String value = (String) jComboBox1.getSelectedItem();
           String pn =  jTextField6.getText();
          Double hw =  Double.parseDouble(jTextField7.getText());
           Double bp =  Double.parseDouble(jTextField8.getText());
           Double prn =  Double.parseDouble(jTextField9.getText());
           Double ot =  Double.parseDouble(jTextField10.getText());
           Double ni =  Double.parseDouble(jTextField11.getText());
           Double sl =  Double.parseDouble(jTextField12.getText());
           Double tax = Double.parseDouble( jTextField13.getText());
           Double gp =  Double.parseDouble(jTextField14.getText());
           Double np =  Double.parseDouble(jTextField15.getText());  
          
        String sql = "update APP.CASHC set JOB_REFERENCE=?,FIRSTNAME=?,SURNAME=?,ADDRESS=?,GENDER=?,CONTACT_NUM=?,HOUR_WORK=?,BASIC_PAY=?,PAYROLL_NUM=?,OVERTIME_RATE=?,NATIONAL_IN=?,STUDENT_LOAN=?,TAX=?,GROSS_PAY=?,NET_PAY=? where ID=?";
         myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/Payrol","tian","tian");
         PreparedStatement add = myconObj.prepareStatement(sql);
            add.setInt(16,id);
            add.setString(1,jr);
            add.setString(2,fn);
            add.setString(3,sn);
            add.setString(4,ad);
            add.setString(5,value);
             add.setString(6,pn);
            add.setDouble(7,hw);
            add.setDouble(8,bp);
            add.setDouble(9,prn);
            add.setDouble(10,ot);
            add.setDouble(11,ni);
            add.setDouble(12,sl);
            add.setDouble(13,tax);
            add.setDouble(14,gp); 
            add.setDouble(15,np);
            
            add.executeUpdate();
         
   
          int row = add.executeUpdate();
            if(row >0){
                JOptionPane.showMessageDialog(null,"Data Have been Update","Data File",JOptionPane.INFORMATION_MESSAGE);
                 fecth();
            }
     }
      catch(SQLException E){
            E.printStackTrace();
        }    
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 Login l = new Login();
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Return to Login","Return", JOptionPane.YES_NO_OPTION);
             if(YesOrNo == 0)
        {
             l.show();
        this.hide();
        }  
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
jTextField19.setText(null);
       jTextField15.setText(null);
       jTextField14.setText(null);
       jTextField13.setText(null);
       jTextField12.setText(null);
       jTextField11.setText(null);
       jTextField10.setText(null);
       jTextField9.setText(null);
       jTextField8.setText(null);
       jTextField7.setText(null);
       jTextField6.setText(null);
       jTextField5.setText(null);
       jTextField4.setText(null);
       jTextField3.setText(null);
       jTextField2.setText(null);
       jComboBox1.setSelectedItem(null);
}//GEN-LAST:event_jButton7ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 Search l = new Search();
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Time To Update","Update Time", JOptionPane.YES_NO_OPTION);
             if(YesOrNo == 0)
        {
             l.show();
        this.hide();
        }
}//GEN-LAST:event_jButton8ActionPerformed

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 basebody l = new basebody();
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Return to Main Form","Return", JOptionPane.YES_NO_OPTION);
             if(YesOrNo == 0)
        {
             l.show();
        this.hide();
        }
}//GEN-LAST:event_jButton9ActionPerformed

private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
    int cordX=evt.getXOnScreen();
    int cordY=evt.getYOnScreen();

    this.setLocation(cordX-mousepX, cordY-mousepY);
}//GEN-LAST:event_jPanel5MouseDragged

private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
   mousepX=evt.getX();
   mousepY=evt.getY();
}//GEN-LAST:event_jPanel5MousePressed

private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

}//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblc1;
    // End of variables declaration//GEN-END:variables
 private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pay.png")));
    }
    public void fecth(){
    try{
        
         myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/Payrol","tian","tian");
        String sql = "select * from APP.CASHC order by ID";
        mystateObj  = myconObj.prepareStatement(sql);
        myresObj=mystateObj.executeQuery();
    
         jTable1.setModel(DbUtils.resultSetToTableModel(myresObj));
    
      
        
    }
    catch(Exception e){
 
        JOptionPane.showMessageDialog(null,e);
    }
  
}


public void Dates(){
       
 Thread clock = new Thread(){
            @Override
    public void run(){
     for(;;)   {
      
    try{
           Calendar d = new GregorianCalendar();
    int month = d.get(Calendar.MONTH);
    int year = d.get(Calendar.YEAR);
    int day = d.get(Calendar.DAY_OF_MONTH);
    lblc.setText((month+1)+"/"+day+"/"+year);
    
   int sec = d.get(Calendar.SECOND);
   String ssec;
   if(sec<10)ssec = "0" + sec;
    else ssec = ""+sec;
    int min = d.get(Calendar.MINUTE);
    String fmin;
    if(min<10)fmin = "0" + min;
    else fmin = ""+min;
    int hour = d.get(Calendar.HOUR);
    int ampm = d.get(Calendar.AM_PM);
    String stampm;
    if (ampm ==0 ) stampm="AM";
    else stampm="PM";
    lblc1.setText(hour+":"+(fmin)+":"+ssec+" "+stampm);
      sleep(1000);
    }
    catch(Exception e){
        
    }
    }
    }
};
        clock.start();

}
}