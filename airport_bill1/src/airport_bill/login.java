/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airport_bill;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    Connection c = Airport_bill.getcon();

    public login(int id, String name, String surname) {
        initComponents();
    }

    public void logopicture() {
        setLayout(null);
        logopic = new JLabel();
        logopic.setSize(180, 110);
        logopic.setLocation(340, 170);
        add(logopic);
        URL imgURL = getClass().getResource("/image/logo.png");
        ImageIcon ico = new ImageIcon(imgURL);
        Image img1 = ico.getImage();
        Image img2 = img1.getScaledInstance(logopic.getWidth(), logopic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(img2);
        logopic.setIcon(icon2);

    }

    public login() {

        logopicture();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usertf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginbt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logopic = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createacc = new javax.swing.JLabel();
        cancelbt = new javax.swing.JButton();
        passwordtf = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 0));
        jLabel2.setText("please fill your user name and your password to login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 300, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 100, 60, 24));

        usertf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usertfKeyPressed(evt);
            }
        });
        jPanel1.add(usertf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 60, 24));

        loginbt.setText("Login");
        loginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtActionPerformed(evt);
            }
        });
        jPanel1.add(loginbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 150, 59));

        logopic.setText("jLabel6");
        jPanel1.add(logopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 180, 110));

        jLabel6.setText("don't have account? ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 130, -1));

        createacc.setForeground(new java.awt.Color(255, 0, 51));
        createacc.setText("create account");
        createacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccMouseClicked(evt);
            }
        });
        jPanel1.add(createacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 90, -1));

        cancelbt.setText("Cancel");
        cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        passwordtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtfKeyPressed(evt);
            }
        });
        jPanel1.add(passwordtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 220, 30));

        jCheckBox1.setText("show pass word");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createaccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccMouseClicked
        if (evt.getClickCount() == 2) {
            createaccount caac = new createaccount();
            caac.show();
            dispose();
        }
    }//GEN-LAST:event_createaccMouseClicked

    private void loginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtActionPerformed
        try {
            String sql = "select *from accout where c_username=? and c_password=?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, usertf.getText());
            pst.setString(2, passwordtf.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String id = rs.getString("c_id");
                Home h = new Home(id);
                h.show();
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Can't find your account");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_loginbtActionPerformed

    private void cancelbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelbtActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            passwordtf.setEchoChar((char) 0);
        } else {
            passwordtf.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void usertfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passwordtf.requestFocus();

        }
    }//GEN-LAST:event_usertfKeyPressed

    private void passwordtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String sql = "select *from accout where c_username=? and c_password=?";
                PreparedStatement pst = c.prepareStatement(sql);
                pst.setString(1, usertf.getText());
                pst.setString(2, passwordtf.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String id = rs.getString("c_id");
                    Home h = new Home(id);
                    h.show();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Can't find your account");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_passwordtfKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbt;
    private javax.swing.JLabel createacc;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbt;
    private javax.swing.JLabel logopic;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JTextField usertf;
    // End of variables declaration//GEN-END:variables
}
