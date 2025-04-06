
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.sql.PreparedStatement;

public class IssueBook extends javax.swing.JFrame {

    Connection con;
    Statement stm;
    ResultSet rs;
    String query;
    String No;
    Date date=new Date();
    SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
    String available, stuname,stucourse,studept,stumail,booktitle;
    private static Connection connection;
    String author,publisher;
    String bookid;
    /**
     * Creates new form ReturnBook
     */
    public IssueBook() {
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
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                OnCreate(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Issue Book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 20, 300, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(124, 106, 130, 22);

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(324, 103, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(124, 160, 140, 22);

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setEnabled(false);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(324, 157, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Book Id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(124, 211, 80, 22);

        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }
        });
        getContentPane().add(t3);
        t3.setBounds(324, 208, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Book name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(124, 322, 140, 22);

        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.setEnabled(false);
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4);
        t4.setBounds(324, 312, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Issue Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(124, 378, 140, 22);

        t5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t5.setEnabled(false);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5);
        t5.setBounds(324, 368, 210, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Issue");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 460, 130, 29);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 460, 110, 29);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 560, 90, 36);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 560, 150, 30);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Issued Book Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(450, 560, 220, 29);

        t6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t6.setEnabled(false);
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6);
        t6.setBounds(324, 257, 210, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Available");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(124, 260, 140, 22);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downloadissue.png"))); // NOI18N
        jLabel8.setText(".");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(610, 50, 321, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void OnCreate(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_OnCreate
        // TODO add your handling code here:
    }//GEN-LAST:event_OnCreate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        String id=t3.getText();
        int bookid=Integer.parseInt(id);
        String booktitle=t4.getText();
        String stuid=t1.getText();
        String stuname=t2.getText();
	
        String available="YES";
        String issuedate=t5.getText();
        
       
        if(t1.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Book id"); 
        else if(t2.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Book name"); 
        else if(t3.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter student id"); 
        else if(t4.getText().equals(" "))
            JOptionPane.showMessageDialog(this,"Please enter book name");
        else if(t5.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please enter issue date");
      else{
                try
                    {  
                        connect();
                      ConnectionClass con=new ConnectionClass();
                       
                       
                        
                        query="SELECT * FROM bookdata WHERE bookid='"+t3.getText()+"';";
               
                        rs=con.stm.executeQuery(query); 
                          
                        rs.next();
                        if(t6.getText().equals("YES"))
                        {
                            try{
                           
                           
                           String sql="insert into issuetable values('"+stuid+"','"+stuname+"','"+bookid+"','"+booktitle+"','"+stumail+"','"+issuedate+"','"+stucourse+"','"+studept+"')";
                        
                            con.stm.executeUpdate(sql);
                           JOptionPane.showMessageDialog(this,"Book with id = "+t3.getText()+" has been issued to "+t2.getText());
                          
                           
                            String query="UPDATE bookdata SET available='NO' WHERE bookid=?";
                              con.stm.executeUpdate(query);
                          
                        
                            }
                            catch(SQLException ex){
                                ex.printStackTrace();
                            }
                      
                        }
    
                        if(t6.getText().equals("NO"))
                        {
                            JOptionPane.showMessageDialog(this,"Book with this id is not available currently");
                        }
                        if(t6.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(this,"There is no book in the library with this id");
                        }
                            t5.setText("");
                            t4.setText("");
                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t6.setText("");
                        disconnect();

                    
                    }
                    catch(SQLException e)
                    {
                        if(e.getErrorCode()==1062)
                        JOptionPane.showMessageDialog(this,"A student can only get a single book from library at a time ");
                    }
                }
                
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ViewBooks bd=new ViewBooks();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        try
        {
            //connect();
            ConnectionClass con=new ConnectionClass();
            query="SELECT * FROM student WHERE stuid='"+t1.getText()+"';";
            rs=con.stm.executeQuery(query); 
            if(rs.next())
            {
                stuname=rs.getString("stuname");
                stumail=rs.getString("stumail");
                stucourse=rs.getString("stucourse");
                studept=rs.getString("studept");
                t2.setText(stuname);
            }
            else
                t2.setText("");
  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       t5.setText(format.format(date));
    }//GEN-LAST:event_t1KeyReleased

    private void t3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyReleased
        try
        {
            connect();
            ConnectionClass con=new ConnectionClass();
            query="SELECT * FROM bookdata WHERE bookid='"+t3.getText()+"';";
            rs=con.stm.executeQuery(query);
            if(rs.next())
            {
                available=rs.getString("available");
                booktitle=rs.getString("booktitle");
                t6.setText(available);
                t4.setText(booktitle);
             
            }
            else
            {
                t6.setText("");
                t4.setText("");
            }
            disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_t3KeyReleased

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
                
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    public void connect()
    {
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/librarydb","root","iisc");  
            stm=con.createStatement(); 
        }
        catch(Exception e)
        { 
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"connection error");
        }
    }
    public void disconnect()
    {
        try
        {
           con.close(); 
        }
        catch(Exception e)
        {}

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
