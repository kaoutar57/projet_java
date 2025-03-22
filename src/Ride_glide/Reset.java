
package Ride_glide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Reset extends javax.swing.JFrame {

   Connection con = null;
   ResultSet rs = null;
   PreparedStatement pst = null;
   public String user;
   
   public Reset(String émail_admin) {
        this.user=émail_admin;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EnregistrerBtn = new javax.swing.JButton();
        txtVerResetPass = new javax.swing.JPasswordField();
        txtResetPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Right.setBackground(new java.awt.Color(204, 0, 0));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Ride_glide\\src\\Ride_glide\\Icon\\logokk.png")); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nouveau mot de passe");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Confirmer le mot de passe");

        EnregistrerBtn.setBackground(new java.awt.Color(204, 0, 0));
        EnregistrerBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EnregistrerBtn.setForeground(new java.awt.Color(255, 255, 255));
        EnregistrerBtn.setText("Enregistrer");
        EnregistrerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerBtnActionPerformed(evt);
            }
        });

        txtResetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetPassActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Réinitialiser le mot de passe");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel2))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(txtVerResetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(txtResetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(EnregistrerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(txtResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addComponent(txtVerResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(EnregistrerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnregistrerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerBtnActionPerformed
        
         
    if(txtResetPass.getText().equals(txtVerResetPass.getText())){
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_database", "root", "");

        // Vérification de la valeur de 'user'
        System.out.println("Valeur de user: " + user);

        // Vérifier si l'admin existe via email_admin
        String checkQuery = "SELECT email_admin FROM admin WHERE LOWER(TRIM(email_admin)) = LOWER(TRIM(?))";
        pst = con.prepareStatement(checkQuery);
        pst.setString(1, user);
        rs = pst.executeQuery();

        if(rs.next()) {
            // L'admin existe, procéder à la mise à jour
            pst.close();
            String updateQuery = "UPDATE admin SET mot_de_passe_adm=? WHERE email_admin=?";
            pst = con.prepareStatement(updateQuery);
            pst.setString(1, new String(txtVerResetPass.getPassword()));
            pst.setString(2, user);
            
            int rowsAffected = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mot de passe modifié avec succès");
        } else {
            // Afficher une liste des admins existants pour debug
            JOptionPane.showMessageDialog(null, "Erreur: Admin '" + user + "' introuvable dans la base de données");

            pst.close();
            String listQuery = "SELECT email_admin FROM admin";
            pst = con.prepareStatement(listQuery);
            rs = pst.executeQuery();

            System.out.println("Admins existants dans la base:");
            while(rs.next()) {
                System.out.println("- " + rs.getString("email_admin"));
            }
        }
    } catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    } finally {
        try {
            if(rs != null) rs.close();
            if(pst != null) pst.close();
            if(con != null) con.close();
        } catch(Exception ex) {
           
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Les mots de passe ne correspondent pas");
}

         
                                                      
        

        
    }//GEN-LAST:event_EnregistrerBtnActionPerformed

    private void txtResetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResetPassActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnregistrerBtn;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtResetPass;
    private javax.swing.JPasswordField txtVerResetPass;
    // End of variables declaration//GEN-END:variables
}
