/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Suprotim
 */
import java.sql.*;
import javax.swing.*; 
public class Add_Staffs extends javax.swing.JFrame {

    /**
     * Creates new form Add_Staffs
     */
    public Add_Staffs() {
        initComponents();
        setDefaultCloseOperation(Add_Staffs.DISPOSE_ON_CLOSE); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        addStaffs = new javax.swing.JButton();
        cancelStaffs = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Integral CF Bold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STAFF ID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 80, 113, 36));

        jLabel2.setFont(new java.awt.Font("Integral CF Bold", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NAME :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 161, 113, 36));

        jLabel3.setFont(new java.awt.Font("Integral CF Bold", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTACT :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 238, -1, 36));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 80, 198, 36));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 160, 198, 36));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 237, 198, 36));

        addStaffs.setBackground(new java.awt.Color(248, 173, 157));
        addStaffs.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        addStaffs.setText("ADD");
        addStaffs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addStaffs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStaffs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffsActionPerformed(evt);
            }
        });
        getContentPane().add(addStaffs, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 321, 113, 41));

        cancelStaffs.setBackground(new java.awt.Color(255, 218, 185));
        cancelStaffs.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cancelStaffs.setText("CANCEL");
        cancelStaffs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancelStaffs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelStaffs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelStaffsActionPerformed(evt);
            }
        });
        getContentPane().add(cancelStaffs, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 321, 113, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 660, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void addStaffsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffsActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://localhost/library";
        String user="root"; 
        String pwd="epikishere12345."; 
        String query="insert into staffs values(?,?,?);";  
        String id=t1.getText(); 
        String name=t2.getText();
        String contact=(t3.getText());  
       
        
        try{
            Connection conn = DriverManager.getConnection(url,user,pwd); 
            // Use PreparedStatement for better security and to handle parameters
            PreparedStatement stm = conn.prepareCall(query);
            stm.setString(1, id);
            stm.setString(2, name);
            stm.setString(3, contact);   
            stm.execute(); 
            JOptionPane.showMessageDialog(this,"One Staff added successfully");   
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e);  
        }
        
    }//GEN-LAST:event_addStaffsActionPerformed

    private void cancelStaffsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelStaffsActionPerformed
        // TODO add your handling code here:
        this.dispose(); 
    }//GEN-LAST:event_cancelStaffsActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Staffs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Staffs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Staffs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Staffs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Staffs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStaffs;
    private javax.swing.JButton cancelStaffs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
