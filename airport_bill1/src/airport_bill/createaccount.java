/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airport_bill;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class createaccount extends javax.swing.JFrame {
    Connection c=Airport_bill.getcon();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    public  createaccount(int id ,String name,String surname)
    {
    initComponents();
    }

public void logopicture ()
    {
               setLayout(null);
logopicc = new JLabel();
logopicc.setSize(180,110);
logopicc.setLocation(350,100);
add(logopicc);
URL imgURL = getClass().getResource("/image/logo.png");
ImageIcon ico = new ImageIcon(imgURL);
Image img1=ico.getImage();
Image img2=img1.getScaledInstance(logopicc.getWidth(), logopicc.getHeight(), Image.SCALE_SMOOTH);
ImageIcon icon2=new ImageIcon(img2);
logopicc.setIcon(icon2);
System.out.print(img1);
    }
    public createaccount() {
        
        logopicture();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtsurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logopicc = new javax.swing.JLabel();
        cancelbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        JDateChooser = new com.toedter.calendar.JDateChooser();
        passwordtf = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, 24));

        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusernameKeyPressed(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 270, 30));

        txtsurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsurnameKeyPressed(evt);
            }
        });
        jPanel1.add(txtsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 270, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, 24));

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 150, 59));
        jPanel1.add(logopicc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 120, 90));

        cancelbt.setText("Cancel");
        cancelbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtMouseClicked(evt);
            }
        });
        cancelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("please fill your user name and your password to create your new account");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Create an account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 360, -1));

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 270, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Birthdate");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 70, 24));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 24));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Surname");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 24));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Username");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, 24));
        jPanel1.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 30));
        jPanel1.add(JDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 190, 30));

        passwordtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtfKeyPressed(evt);
            }
        });
        jPanel1.add(passwordtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 270, 30));

        jCheckBox1.setText("show pass word");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mr", "miss" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 270, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Telephone");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 70, 24));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtMouseClicked
        dispose();
    }//GEN-LAST:event_cancelbtMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
      String sql="insert into accout values(?,?,?,?,?,?,?,?,?)";
      PreparedStatement pst=c.prepareStatement(sql);
      pst.clearParameters();
      pst.setString(1, null);
      pst.setString(2, jComboBox1.getSelectedItem().toString());
      pst.setString(3, txtname.getText());
      pst.setString(4, txtsurname.getText());
      String date=sdf.format(JDateChooser.getDate());
      pst.setString(5, date);
      pst.setString(6, txtphone.getText());
      pst.setString(7, "0");
      pst.setString(8, txtusername.getText());
      pst.setString(9, passwordtf.getText());
      
      if(pst.executeUpdate()==1){
          JOptionPane.showMessageDialog(null, "create account done");
         login l=new login();
         l.show();
          dispose(); 
      }
      }
      catch(Exception e){
      e.printStackTrace();
      }
      finally {
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtActionPerformed
    login l=new login();
    l.show();
        dispose();
    }//GEN-LAST:event_cancelbtActionPerformed

    private void txtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
      passwordtf.requestFocus();
      
      }
    }//GEN-LAST:event_txtusernameKeyPressed

    private void passwordtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtfKeyPressed
   if(evt.getKeyCode()==KeyEvent.VK_ENTER){
      txtname.requestFocus();
      }
    }//GEN-LAST:event_passwordtfKeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            passwordtf.setEchoChar((char)0);
        }
        else{
            passwordtf.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     txtsurname.requestFocus();
      
      }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtsurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsurnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     txtphone.requestFocus();
      
      }
    }//GEN-LAST:event_txtsurnameKeyPressed

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
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createaccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateChooser;
    private javax.swing.JButton cancelbt;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logopicc;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsurname;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}