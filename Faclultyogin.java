
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jegat
 */
public class Faclultyogin extends javax.swing.JFrame {

   private String captchaCode;
// Method to generate a random CAPTCHA code
    private String generateCaptcha() {
    // Generate a random 6-character alphanumeric code
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 6; i++) {
        int index = (int) (chars.length() * Math.random());
        sb.append(chars.charAt(index));
    }
    return sb.toString();
    
}
 private void setUpCaptcha() {
        captchaCode = generateCaptcha();
        cla.setText(captchaCode);
    }
    public Faclultyogin() {
        initComponents();
        captcha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

             setUpCaptcha();
             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        show = new javax.swing.JCheckBox();
        lcap = new javax.swing.JLabel();
        cla = new javax.swing.JLabel();
        captcha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(628, 486, 86, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(352, 181, 112, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(352, 259, 95, 35);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(555, 263, 159, 32);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(555, 184, 159, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(431, 486, 84, 32);

        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show);
        show.setBounds(570, 307, 122, 29);

        lcap.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lcap.setText("Captcha");
        getContentPane().add(lcap);
        lcap.setBounds(360, 326, 192, 38);

        cla.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        cla.setForeground(new java.awt.Color(0, 102, 102));
        cla.setText("CAPTCHA");
        cla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cla);
        cla.setBounds(352, 397, 103, 41);
        getContentPane().add(captcha);
        captcha.setBounds(555, 378, 159, 41);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(852, 196, 249, 195);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACULTY LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(310, 40, 540, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HomePage h1=new HomePage();
        h1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            
            if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Fill out Username");
        }
        else if(jPasswordField1.getText().equals( ""))
        {
            JOptionPane.showMessageDialog(this,"Please Fill out your Password");
        }
        else if(captcha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the CAPTCHA code");
        } else if(!captcha.getText().equals(captchaCode)) {
            JOptionPane.showMessageDialog(this, "Invalid CAPTCHA code");
            captcha.setText("");
        }
        else{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryDB","root","iisc");
            Statement stm=con.createStatement();
            
        
        
                String username = jTextField1.getText();
                String password= jPasswordField1.getText();
                String query="SELECT * FROM faculty WHERE faculid = '"+jTextField1.getText()+"' and passwd = '"+jPasswordField1.getText()+"'";
                ResultSet rs=stm.executeQuery(query);
                 
                while(rs.next())
                {
                   FacultyView mn=new FacultyView();
                    mn.setVisible(true);
                    dispose();
                }
        }
        }
        catch(Exception e)
        {
            
             JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
             jTextField1.setText("");
             jPasswordField1.setText("");
                 
                this.setVisible(false);
        }          
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        if (show.isSelected())
         {
            jPasswordField1.setEchoChar((char) 0); // Show password characters
        } 
        else 
        {
         jPasswordField1.setEchoChar('*'); // Hide password characters
        }
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(Faclultyogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faclultyogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faclultyogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faclultyogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faclultyogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField captcha;
    private javax.swing.JLabel cla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lcap;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
