/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airport_bill;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public final class bill_owner extends javax.swing.JFrame {

    public String id;

    public String idowner;
    public int price;
    public String lpb;
    String sql;
    flightprice fp;
    DefaultTableModel Model = new DefaultTableModel();
    Connection c = Airport_bill.getcon();

    /**
     * Creates new form bill_owner
     *
     * @param _fp
     */
    public bill_owner(flightprice _fp) {
        this.fp = _fp;

        initComponents();

    }

    public bill_owner(String id, String lpb, int price) {
        initComponents();
        this.id = id;
        this.lpb = lpb;
        this.price = price;

        Model = (DefaultTableModel) tbshow.getModel();
        showtb(id);
    }

    public bill_owner() {
        initComponents();
        Model = (DefaultTableModel) tbshow.getModel();
        showtb(id);

    }

    public void showtb(String id) {
        try {
            int idx = tbshow.getRowCount() - 1;
            while (idx >= 0) {
                Model.removeRow(idx--);
            }
            sql = "select*from owner where c_id=?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] itm = {
                    rs.getString("o_id"),
                    rs.getString("o_name"),
                    rs.getString("o_surname"),
                    rs.getString("o_nationality"),
                    rs.getString("o_telephone"),
                    rs.getString("o_p"),
                    rs.getString("o_d"),
                    rs.getString("o_v"),};
                Model.addRow(itm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnationality = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbshow = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btsave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txttelephone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsurname = new javax.swing.JTextField();
        txtp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnationality.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtnationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, -1));

        txtd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdMouseClicked(evt);
            }
        });
        jPanel1.add(txtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 180, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("District");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 80, 22));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("nationality");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 22));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("      Bill owner");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 260, 30));

        tbshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Nationality", "Telephone", "Provine", "District", "Village"
            }
        ));
        tbshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbshowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbshow);
        if (tbshow.getColumnModel().getColumnCount() > 0) {
            tbshow.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbshow.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbshow.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbshow.getColumnModel().getColumn(3).setPreferredWidth(30);
            tbshow.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbshow.getColumnModel().getColumn(5).setPreferredWidth(30);
            tbshow.getColumnModel().getColumn(6).setPreferredWidth(30);
            tbshow.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 590, 180));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btsave.setText("save");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Telephone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 22));

        txttelephone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txttelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Surname");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 22));

        txtsurname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsurname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsurnameMouseClicked(evt);
            }
        });
        jPanel1.add(txtsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 180, -1));

        txtp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpMouseClicked(evt);
            }
        });
        jPanel1.add(txtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 180, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 80, 22));

        txtv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtvMouseClicked(evt);
            }
        });
        jPanel1.add(txtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Village");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 80, 22));

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 22));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Province");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 80, 22));

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdMouseClicked

    }//GEN-LAST:event_txtdMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        flightprice fh = new flightprice();
        fh.id = id;
        fh.lpb = lpb;
        fh.price = price;
        fh.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsurnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsurnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsurnameMouseClicked

    private void txtpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpMouseClicked

    private void txtvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvMouseClicked

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameMouseClicked

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:
        try {
            sql = "insert into owner values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, txtname.getText());
            pst.setString(3, txtsurname.getText());
            pst.setString(4, txtnationality.getText());
            pst.setString(5, txttelephone.getText());
            pst.setString(6, txtp.getText());
            pst.setString(7, txtd.getText());
            pst.setString(8, txtv.getText());
            pst.setString(9, id);
            if (pst.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(this, "save done");
                txtd.setText("");
                txtv.setText("");
                txtname.setText("");
                txtnationality.setText("");
                txtsurname.setText("");
                txttelephone.setText("");
                txtp.setText("");
                showtb(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btsaveActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int jop = JOptionPane.showConfirmDialog(this, "confrim the selection", "confrim", JOptionPane.YES_NO_CANCEL_OPTION);
        if (jop == 0) {
            flightprice fp = new flightprice(id, lpb, price, txtname.getText(), txtsurname.getText(), idowner, txtnationality.getText());
            fp.show();
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    int idx;
    private void tbshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbshowMouseClicked
        idx = tbshow.getSelectedRow();
        idowner = tbshow.getValueAt(idx, 0).toString();
        txtname.setText(tbshow.getValueAt(idx, 1).toString());
        txtsurname.setText(tbshow.getValueAt(idx, 2).toString());
        txtnationality.setText(tbshow.getValueAt(idx, 3).toString());
        txttelephone.setText(tbshow.getValueAt(idx, 4).toString());
        txtp.setText(tbshow.getValueAt(idx, 5).toString());
        txtd.setText(tbshow.getValueAt(idx, 6).toString());
        txtv.setText(tbshow.getValueAt(idx, 7).toString());
        btsave.setVisible(false);

    }//GEN-LAST:event_tbshowMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int jop = JOptionPane.showConfirmDialog(this, "Are you sure to Edit", "confrim", JOptionPane.YES_NO_CANCEL_OPTION);
        if (jop == 0) {
            try {
                sql = "UPDATE owner SET o_name = ?, o_surname= ?, o_nationality = ?, o_telephone= ?, o_p = ?, o_d = ?, o_v = ? WHERE owner.o_id =?;";
                PreparedStatement pst = c.prepareStatement(sql);
                pst.clearParameters();
                pst.setString(1, txtname.getText());
                pst.setString(2, txtsurname.getText());
                pst.setString(3, txtnationality.getText());
                pst.setString(4, txttelephone.getText());
                pst.setString(5, txtp.getText());
                pst.setString(6, txtd.getText());
                pst.setString(7, txtv.getText());
                pst.setString(8, String.valueOf(idowner));

                if (pst.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "save done");
                    showtb(id);
                    txtd.setText("");
                    txtv.setText("");
                    txtname.setText("");
                    txtnationality.setText("");
                    txtsurname.setText("");
                    txttelephone.setText("");
                    txtp.setText("");
                    btsave.setVisible(true);

                }

            } catch (HeadlessException | SQLException e) {
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(bill_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill_owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbshow;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JTextField txtp;
    private javax.swing.JTextField txtsurname;
    private javax.swing.JTextField txttelephone;
    private javax.swing.JTextField txtv;
    // End of variables declaration//GEN-END:variables
}
