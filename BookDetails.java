
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BookDetails extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    PreparedStatement pst;
    ResultSet rs;
    String query;
   
    String bookid,booktitle,author,publisher,available;
    
    
  
    public BookDetails() {
        initComponents();
        
        
    }

    private void Reset()
{
    
    jButton1.setVisible(true);
    jButton2.setVisible(true);
    //Get_Data();
}
  /*private void Get_Data(){
     
     try{
        // con= Connect.ConnectDB();
         String sql="select RoomNo as 'Room No.',RoomType as 'Room Type', RoomCharges as 'Room Charges',RoomStatus as 'Room Status' from room";
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         
     DefaultTableModel model = (DefaultTableModel) jtable1.getModel();
        model.setRowCount(0); // Clear existing rows

        while (rs.next()) {
            model.addRow(new Object[]{rs.getInt(1), rs.getString("Room Type"), rs.getInt(3), rs.getString("Room Status")});
        }

        rs.close();
        pst.close();
        con.close();
    } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}}*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Name", "Author", "Publisher", "Availability Status"
            }
        ));
        table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(40);
            table1.getColumnModel().getColumn(1).setPreferredWidth(210);
            table1.getColumnModel().getColumn(2).setPreferredWidth(150);
            table1.getColumnModel().getColumn(3).setPreferredWidth(40);
            table1.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(57, 278, 830, 296);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 610, 94, 29);

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Search by Book Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(74, 202, 256, 32);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(375, 205, 329, 32);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(820, 200, 110, 32);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(279, 77, 425, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        HomePage mn=new HomePage();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
      /*  try
        {
          
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","iisc");
            Statement stm=con.createStatement();
       
                // ConnectionClass con=new ConnectionClass();
               
               String sql="select * from bookdata";
              
                ResultSet rs=stm.executeQuery(sql);
                 
                while(rs.next())
                {
                    String bookid = String.valueOf(rs.getInt("bookid"));
                    String booktitle=rs.getString("booktitle");
                    String author=rs.getString("author");
                    String publisher=rs.getString("publisher");
                    String available=rs.getString("available");
                    
                    //String array for store data
                    String tbData[]= {bookid,booktitle,author,publisher,available};
                    DefaultTableModel tb1Model= (DefaultTableModel)jtable1.getModel();
                    
                    //add String array data into jTable
                    tb1Model.addRow(tbData);
                    JOptionPane.showMessageDialog(this, "Table inserted Successfully");
                   
                }
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(this,"Cannot insert the table");
             
        } */           
       try
        {
            //connect();
            ConnectionClass con=new ConnectionClass();
            query="SELECT * FROM bookdata WHERE booktitle='"+jTextField1.getText()+"';";
            rs=con.stm.executeQuery(query); 
            if(rs.next())
            {
                bookid=rs.getString("bookid");
               booktitle=rs.getString("booktitle");
                author=rs.getString("author");
                publisher=rs.getString("publisher");
                available=rs.getString("available");
                //t2.setText(booktitle);
                
                    //String array for store data
                    String tbData[]= {bookid,booktitle,author,publisher,available};
                    DefaultTableModel tb1Model= (DefaultTableModel)table1.getModel();
                    
                    //add String array data into jTable
                    tb1Model.addRow(tbData);
            }
            else
                jTextField1.setText("");
            //disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Sorry Record not Found");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        /* try
        {
            connect();
            ConnectionClass con=new ConnectionClass();
            query="SELECT * FROM bookdata WHERE booktitle='"+jTextField1.getText()+"';";
            rs=con.stm.executeQuery(query); 
            if(rs.next())
            {
                bookid=rs.getString("bookid");
               booktitle=rs.getString("booktitle");
                author=rs.getString("author");
                publisher=rs.getString("publisher");
                available=rs.getString("available");
                //t2.setText(booktitle);
                
                    //String array for store data
                    String tbData[]= {bookid,booktitle,author,publisher,available};
                    DefaultTableModel tb1Model= (DefaultTableModel)jtable1.getModel();
                    
                    //add String array data into jTable
                    tb1Model.addRow(tbData);
            }
            else
                jTextField1.setText("");
            disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Sorry Record not Found");
        }*/
    }//GEN-LAST:event_jTextField1KeyReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_table1MouseClicked

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
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookDetails().setVisible(true);
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
    private javax.swing.ButtonGroup b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
