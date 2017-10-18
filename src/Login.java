import static Database.Db.*;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setTitle("Login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ui = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pa = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 153, 0));
        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PHARMACY STORE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER TYPE :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 26));

        cb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEMBER", "ADMIN" }));
        getContentPane().add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 111, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 81, 25));

        ui.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 111, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PASSWORD :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 23));

        pa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paActionPerformed(evt);
            }
        });
        pa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paKeyPressed(evt);
            }
        });
        getContentPane().add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 111, 23));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pharmacy-d-farmacy-81341.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 600, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Log(); 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ui.setText("");
        pa.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void paActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paActionPerformed
        Log();
    }//GEN-LAST:event_paActionPerformed

    private void paKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paKeyPressed
        
    }//GEN-LAST:event_paKeyPressed

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        Log();
    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
       ui.setText("");
        pa.setText("");
    }//GEN-LAST:event_jButton2KeyReleased
void Log(){
   
  ResultSet rs;
  String type = (String)cb.getSelectedItem();
  String id= ui.getText();
  String p =new String(pa.getPassword());
   try{
  if(type.equals("MEMBER"))
  {
 checkid1.setString(1, id);
 checkid1.setString(2, p);
 rs=checkid1.executeQuery();
/**
 * this is java doc type comment
 */
  if(rs.next())
       {
            new MemberHome(rs.getString(3),type,id).setVisible(true);
           dispose();
  
        }else
          JOptionPane.showMessageDialog(this,"Wrong Entries!!!!");
      
    }
  
  else{
 checkid2.setString(1,id);
 checkid2.setString(2,p);
 rs=checkid2.executeQuery();
                    if(rs.next())
           
                        {
      
                      new AdminHome(rs.getString(3),type).setVisible(true);
                            dispose();
  
                            }else{
                            JOptionPane.showMessageDialog(null, "wrong entries");
                               }
  }
    
    } 
    catch(Exception ex){
    JOptionPane.showMessageDialog(null,ex);
    }
    
    
    
    
    
}
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pa;
    private javax.swing.JTextField ui;
    // End of variables declaration//GEN-END:variables
}
