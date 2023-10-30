/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airport_bill;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.print.DocFlavor;
import javax.swing.JTable;

public class Home extends javax.swing.JFrame {

    Connection c = Airport_bill.getcon();
    public String id;
    public String gender;

    public Home(String id) {
        this.id = id;
        initComponents();
        logo();

    }

    public void logo() {
        ImageIcon ico = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        Image img1 = ico.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ico2 = new ImageIcon(img2);
        jLabel1.setIcon(ico2);

    }

    public void iconuser(String gender) {
        String m;
        if (gender.equals("mr")) {
            m = "man.png";
        } else {
            m = "profile.png";
        }
        ImageIcon ico = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(m)));
        Image img1 = ico.getImage();
        Image img2 = img1.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ico2 = new ImageIcon(img2);
        jLabel2.setIcon(ico2);
    }

    public Home() {
        initComponents();
        ImageIcon ico = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        Image img1 = ico.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ico2 = new ImageIcon(img2);
        jLabel1.setIcon(ico2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progresspoint = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        historylb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pointlb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progresspoint.setBackground(new java.awt.Color(255, 255, 255));
        progresspoint.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        progresspoint.setForeground(new java.awt.Color(0, 255, 51));
        progresspoint.setString("0.00%");
        progresspoint.setStringPainted(true);
        jPanel1.add(progresspoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 140, 24));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Point       :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, -1));

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("**********full for a free ticket**********");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Flight");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 70, -1));

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jLabel7.setText("Username:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 220, 32));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, 32));

        historylb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        historylb.setText("click to check your histoy");
        historylb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historylbMouseClicked(evt);
            }
        });
        jPanel1.add(historylb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 20));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 580, 370));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 100));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home page");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 280, 100));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("account setting");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 100));

        pointlb.setBackground(new java.awt.Color(255, 255, 255));
        pointlb.setForeground(new java.awt.Color(153, 255, 153));
        pointlb.setText("19");
        pointlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pointlbMouseClicked(evt);
            }
        });
        getContentPane().add(pointlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 20, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {
            String sql = "SELECT * FROM accout WHERE c_id = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.clearParameters();
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                jLabel7.setText("Username : " + rs.getString("c_username"));
                pointlb.setText(rs.getString("c_point"));
                float point = Float.parseFloat(rs.getString("c_point"));
                int pointn = Integer.parseInt(rs.getString("c_point"));
                gender = rs.getString("gender");
                String points = String.valueOf(point);
                progresspoint.setString(points);
                progresspoint.setValue(pointn);
            }
            iconuser(gender);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_formWindowOpened

    private void pointlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointlbMouseClicked

    }//GEN-LAST:event_pointlbMouseClicked

    private void historylbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historylbMouseClicked
        if (evt.getClickCount() == 2) {
            History h = new History();
            h.id = id;
            h.setVisible(true);

        }

    }//GEN-LAST:event_historylbMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login lg = new login();
        lg.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fligth f = new fligth(id);
        f.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        accountsetting acst = new accountsetting(id);
        acst.show();
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel historylb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pointlb;
    private javax.swing.JProgressBar progresspoint;
    // End of variables declaration//GEN-END:variables
}
