/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class LibrarianLogin extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public LibrarianLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Librarian Login Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 250, 28);

        jToggleButton1.setBackground(new java.awt.Color(204, 102, 0));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/eye2.png"))); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToggleButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jToggleButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(480, 150, 50, 40);

        jButton2.setBackground(new java.awt.Color(204, 102, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("→");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 0, 50, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 80, 160, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/name.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 80, 40, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 160, 160, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/password.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 160, 40, 40);

        jTextField2.setBackground(new java.awt.Color(204, 102, 0));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 80, 250, 40);

        jButton4.setBackground(new java.awt.Color(204, 102, 0));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("forgot password");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 230, 180, 40);

        jPasswordField1.setBackground(new java.awt.Color(204, 102, 0));
        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(210, 150, 250, 40);

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/login.jpg"))); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 230, 180, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/admin login.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 550, 320);

        setSize(new java.awt.Dimension(564, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField2.getText().trim();
        char pass[] = jPasswordField1.getPassword();
        String parse = String.valueOf(pass);
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
            String sql = "select name, password from librarian where name = ? and password = ?";
            PreparedStatement s = c.prepareStatement(sql);
            s.setString(1, name);
            s.setString(2, parse);
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                this.setVisible(false);
                new LibrarianSection().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "invalid username or password","Invalid",0,  new ImageIcon("R.png"));
            }
            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"invalid",0,new ImageIcon("R.png"));
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new librarianResetPassword().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyPressed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected()){
            jToggleButton1.setIcon(new ImageIcon("eye1.png"));
            jPasswordField1.setEchoChar((char)0);
        }else{
            jToggleButton1.setIcon(new ImageIcon("eye2.png"));
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextField2.getText().trim();
        char pass[] = jPasswordField1.getPassword();
        String parse = String.valueOf(pass);
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
            String sql = "select name, password from librarian where name = ? and password = ?";
            PreparedStatement s = c.prepareStatement(sql);
            s.setString(1, name);
            s.setString(2, parse);
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                this.setVisible(false);
                new LibrarianSection().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "invalid username or password","Invalid",0,  new ImageIcon("R.png"));
            }
            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"invalid",0,new ImageIcon("R.png"));
        } 
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextField2.getText().trim();
        char pass[] = jPasswordField1.getPassword();
        String parse = String.valueOf(pass);
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
            String sql = "select name, password from librarian where name = ? and password = ?";
            PreparedStatement s = c.prepareStatement(sql);
            s.setString(1, name);
            s.setString(2, parse);
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                this.setVisible(false);
                new LibrarianSection().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "invalid username or password","Invalid",0,  new ImageIcon("R.png"));
            }
            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"invalid",0,new ImageIcon("R.png"));
        } 
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jToggleButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jToggleButton1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextField2.getText().trim();
        char pass[] = jPasswordField1.getPassword();
        String parse = String.valueOf(pass);
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
            String sql = "select name, password from librarian where name = ? and password = ?";
            PreparedStatement s = c.prepareStatement(sql);
            s.setString(1, name);
            s.setString(2, parse);
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                this.setVisible(false);
                new LibrarianSection().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "invalid username or password","Invalid",0,  new ImageIcon("R.png"));
            }
            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"invalid",0,new ImageIcon("R.png"));
        } 
        }
    }//GEN-LAST:event_jToggleButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextField2.getText().trim();
        char pass[] = jPasswordField1.getPassword();
        String parse = String.valueOf(pass);
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
            String sql = "select name, password from librarian where name = ? and password = ?";
            PreparedStatement s = c.prepareStatement(sql);
            s.setString(1, name);
            s.setString(2, parse);
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                this.setVisible(false);
                new LibrarianSection().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "invalid username or password","Invalid",0,  new ImageIcon("R.png"));
            }
            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"invalid",0,new ImageIcon("R.png"));
        } 
        }
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(LibrarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
