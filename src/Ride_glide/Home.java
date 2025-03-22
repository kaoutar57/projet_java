


package Ride_glide;


import java.sql.*;  // Cela inclut ResultSet, Statement, Connection, etc.
import javax.swing.*;  // Pour le JPanel, JTable, etc.

import java.sql.Statement;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;






public class Home extends javax.swing.JFrame {

        public Home() {
        initComponents();
        affichervoitures();
        
         
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fermeture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num_immatriculationTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        marqueTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modèleTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        carburantTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kilométrageTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        prix_locationTb = new javax.swing.JTextField();
        statutCb = new javax.swing.JComboBox<>();
        ajouterBtn = new javax.swing.JButton();
        modifierBtn = new javax.swing.JButton();
        supprimerBtn = new javax.swing.JButton();
        réinitialiserBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Réservations");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Se déconnecter");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admin");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Restitution des voitures");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\projet_java\\src\\Ride_glide\\Icon\\emp.png")); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\projet_java\\src\\Ride_glide\\Icon\\cus.png")); // NOI18N
        jLabel16.setText("jLabel16");

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\projet_java\\src\\Ride_glide\\Icon\\car-key.png")); // NOI18N
        jLabel17.setText("jLabel17");

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\projet_java\\src\\Ride_glide\\Icon\\rencar.png")); // NOI18N
        jLabel18.setText("jLabel18");

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\projet_java\\src\\Ride_glide\\Icon\\logout (1).png")); // NOI18N
        jButton1.setText("jButton1");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Clients");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jButton1))
                .addGap(162, 162, 162))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        fermeture.setBackground(new java.awt.Color(255, 255, 255));
        fermeture.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fermeture.setForeground(new java.awt.Color(204, 0, 0));
        fermeture.setText("X");
        fermeture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermetureMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1051, Short.MAX_VALUE)
                .addComponent(fermeture, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(fermeture))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Gestion des voitures");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("num_immatriculation");

        num_immatriculationTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_immatriculationTbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("marque");

        marqueTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marqueTbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("modèle");

        modèleTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modèleTbActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("carburant");

        carburantTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carburantTbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("kilométrage");

        kilométrageTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilométrageTbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("statut");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("prix de location");

        prix_locationTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prix_locationTbActionPerformed(evt);
            }
        });

        statutCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statutCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponible", "réservée" }));
        statutCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statutCbActionPerformed(evt);
            }
        });

        ajouterBtn.setBackground(new java.awt.Color(0, 204, 0));
        ajouterBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajouterBtn.setForeground(new java.awt.Color(255, 255, 255));
        ajouterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ride_glide/Icon/addcar1.png"))); // NOI18N
        ajouterBtn.setText("Ajouter");
        ajouterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBtnActionPerformed(evt);
            }
        });

        modifierBtn.setBackground(new java.awt.Color(51, 51, 255));
        modifierBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modifierBtn.setForeground(new java.awt.Color(255, 255, 255));
        modifierBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ride_glide/Icon/editcar.png"))); // NOI18N
        modifierBtn.setText("Modifier");
        modifierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierBtnActionPerformed(evt);
            }
        });

        supprimerBtn.setBackground(new java.awt.Color(255, 0, 0));
        supprimerBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supprimerBtn.setForeground(new java.awt.Color(255, 255, 255));
        supprimerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ride_glide/Icon/remcar.png"))); // NOI18N
        supprimerBtn.setText("Supprimer");
        supprimerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerBtnActionPerformed(evt);
            }
        });

        réinitialiserBtn.setBackground(new java.awt.Color(255, 255, 0));
        réinitialiserBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        réinitialiserBtn.setForeground(new java.awt.Color(255, 255, 255));
        réinitialiserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ride_glide/Icon/back.png"))); // NOI18N
        réinitialiserBtn.setText("Réinitialiser");
        réinitialiserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                réinitialiserBtnActionPerformed(evt);
            }
        });

        CarsTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "num-immatriculation", "marque", "modèle", "carburant", "kilométrage", "prix de location", "statut"
            }
        ));
        CarsTable.setRowHeight(25);
        CarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CarsTable);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Liste des voitures");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(129, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num_immatriculationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marqueTb, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modèleTb, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carburantTb, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kilométrageTb, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(208, 208, 208)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel5)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel6)
                                        .addGap(12, 12, 12))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ajouterBtn)
                                .addGap(18, 18, 18)
                                .addComponent(modifierBtn)
                                .addGap(18, 18, 18)
                                .addComponent(supprimerBtn)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(réinitialiserBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(prix_locationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(statutCb, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(marqueTb)
                        .addComponent(num_immatriculationTb)
                        .addComponent(modèleTb)
                        .addComponent(statutCb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carburantTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prix_locationTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kilométrageTb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(réinitialiserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num_immatriculationTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_immatriculationTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_immatriculationTbActionPerformed

    private void marqueTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marqueTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marqueTbActionPerformed

    private void modèleTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modèleTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modèleTbActionPerformed

    private void carburantTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carburantTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carburantTbActionPerformed

    private void kilométrageTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilométrageTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilométrageTbActionPerformed

    private void prix_locationTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prix_locationTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prix_locationTbActionPerformed
   
    private void affichervoitures() {
        // Déclaration des variables nécessaires pour la gestion de la base de données
        Connection Con = null;
        Statement St = null;
        ResultSet Rs = null;

        try {
            // Connexion à la base de données
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_database", "root", "");
            St = Con.createStatement();

            // Exécution de la requête pour récupérer toutes les voitures
           
            Rs = St.executeQuery("SELECT num_immatriculation, marque, modele, carburant, kilometrage, statut, prix_location FROM voiture");


            // Créez un DefaultTableModel pour le JTable
            ResultSetMetaData metaData = Rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Créez un tableau pour les noms de colonnes
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
            }

            // Créez un tableau pour les données
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);

            // Ajoutez les lignes au tableau
            while (Rs.next()) {
                String[] row = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = Rs.getString(i);
                }
                model.addRow(row);
            }

            // Affecte le modèle de table au JTable
            CarsTable.setModel(model);

        } catch (SQLException e) {
            // Si une erreur survient, afficher les détails
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur lors de l'affichage des voitures : " + e.getMessage());
        } finally {
            // Fermeture des ressources dans le bloc finally pour garantir qu'elles sont fermées
            try {
                if (Rs != null) Rs.close();  // Ferme le ResultSet
                if (St != null) St.close();  // Ferme le Statement
                if (Con != null) Con.close();  // Ferme la connexion
            } catch (SQLException e) {
                e.printStackTrace();  // Affiche une erreur si la fermeture échoue
            }
        }
    }

    

    private void ajouterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBtnActionPerformed
        // TODO add your handling code here:
        Connection Con = null;
        PreparedStatement St = null;
        ResultSet Rs = null;
        
        
        if (num_immatriculationTb.getText().isEmpty() || marqueTb.getText().isEmpty() || modèleTb.getText().isEmpty() || carburantTb.getText().isEmpty() || kilométrageTb.getText().isEmpty() || prix_locationTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs doivent être remplis !");
             
        }else{
        try {
            // Connexion à la base de données
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_database", "root", ""); 
            
            // Préparation de la requête SQL
            String query = "INSERT INTO voiture (num_immatriculation, marque, modele, carburant, kilometrage, statut, prix_location) VALUES (?, ?, ?, ?, ?, ?, ?)";
            St = Con.prepareStatement(query);
            
            // Remplissage des valeurs
            St.setString(1, num_immatriculationTb.getText());
            St.setString(2, marqueTb.getText());
            St.setString(3, modèleTb.getText());
            St.setString(4, carburantTb.getText());
            St.setString(5, kilométrageTb.getText());
            St.setString(6, statutCb.getSelectedItem().toString());
            
            St.setDouble(7, Double.parseDouble(prix_locationTb.getText()));


            // Exécution de la requête
            int row = St.executeUpdate();

            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Voiture ajoutée avec succès!");
                affichervoitures();
            } else {
                JOptionPane.showMessageDialog(this, "Échec de l'ajout de la voiture!");
            }

            // Fermeture de la connexion
            St.close();
            Con.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
        }
        }
    
    }//GEN-LAST:event_ajouterBtnActionPerformed

    private void modifierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierBtnActionPerformed
        // TODO add your handling code here:
           
    Connection Con = null;
    PreparedStatement St = null;
    
    
     if (num_immatriculationTb.getText().isEmpty() || marqueTb.getText().isEmpty() || modèleTb.getText().isEmpty() || carburantTb.getText().isEmpty() || kilométrageTb.getText().isEmpty() || prix_locationTb.getText().isEmpty()) {
            
        
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner la voiture à modifier");
    } else {
        try {
            
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_database", "root", "");
            
            String query = "UPDATE voiture SET marque=?, modele=?, carburant=?, kilometrage=?, statut=?, prix_location=? WHERE num_immatriculation=?";
            
            St = Con.prepareStatement(query);
            
            St.setString(1, marqueTb.getText());
            St.setString(2, modèleTb.getText());
            St.setString(3, carburantTb.getText());
            St.setString(4, kilométrageTb.getText());
            St.setString(5, statutCb.getSelectedItem().toString());
            St.setString(6, prix_locationTb.getText());
            St.setString(7, num_immatriculationTb.getText());

            
           
            int row = St.executeUpdate();

          
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Les informations de la voiture sont modifiées avec succès!");
                affichervoitures();  // Rafraîchir la liste des voitures
            } else {
                JOptionPane.showMessageDialog(this, "Échec de la modification de la voiture!");
            }
            affichervoitures();
            Reset();

            // Fermer les ressources
            St.close();
            Con.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
        }
    }

        
    }//GEN-LAST:event_modifierBtnActionPerformed

    private void supprimerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerBtnActionPerformed
        // TODO add your handling code here:
       
    Connection Con = null;
    PreparedStatement St = null;
    
    // Vérifier si le champ d'immatriculation est vide
    if (num_immatriculationTb.getText().isEmpty()) { 
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner la voiture à supprimer");
    } else {
        try {
            // Connexion à la base de données
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_database", "root", "");
            
            
            // Préparer la requête SQL pour supprimer la voiture
            String query = "DELETE FROM voiture WHERE num_immatriculation = ?";
            St = Con.prepareStatement(query);
            
            // Remplir la requête avec l'immatriculation de la voiture à supprimer
            St.setString(1, num_immatriculationTb.getText());
            
            // Exécuter la requête
            int row = St.executeUpdate();

            // Vérifier si la suppression a réussi
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Voiture supprimée avec succès!");
                affichervoitures();  // Rafraîchir la liste des voitures
            } else {
                JOptionPane.showMessageDialog(this, "Échec de la suppression de la voiture!");
            }
            affichervoitures();
            Reset();
            // Fermer les ressources
            St.close();
            Con.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
        }
    }


        
        
    }//GEN-LAST:event_supprimerBtnActionPerformed

    private void statutCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statutCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statutCbActionPerformed
    private void Reset(){
        num_immatriculationTb.setText("");
        marqueTb.setText("");
        modèleTb.setText("");
        carburantTb.setText("");
        kilométrageTb.setText("");
        statutCb.setSelectedIndex(0);
        prix_locationTb.setText("");
        
    }
    private void réinitialiserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_réinitialiserBtnActionPerformed
        // TODO add your handling code here:
        Reset();
      
        
    }//GEN-LAST:event_réinitialiserBtnActionPerformed

    private void CarsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)CarsTable.getModel();
        int MyIndex=CarsTable.getSelectedRow();
        num_immatriculationTb.setText(model.getValueAt(MyIndex, 0).toString());
        marqueTb.setText(model.getValueAt(MyIndex, 1).toString());
        modèleTb.setText(model.getValueAt(MyIndex, 2).toString());
        carburantTb.setText(model.getValueAt(MyIndex, 3).toString());
        kilométrageTb.setText(model.getValueAt(MyIndex, 4).toString());
        statutCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        prix_locationTb.setText(model.getValueAt(MyIndex, 6).toString());
    }//GEN-LAST:event_CarsTableMouseClicked

    private void fermetureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermetureMouseClicked
        // TODO add your handling code here:
          this.dispose();
    }//GEN-LAST:event_fermetureMouseClicked

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
    private javax.swing.JTable CarsTable;
    private javax.swing.JButton ajouterBtn;
    private javax.swing.JTextField carburantTb;
    private javax.swing.JLabel fermeture;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kilométrageTb;
    private javax.swing.JTextField marqueTb;
    private javax.swing.JButton modifierBtn;
    private javax.swing.JTextField modèleTb;
    private javax.swing.JTextField num_immatriculationTb;
    private javax.swing.JTextField prix_locationTb;
    private javax.swing.JButton réinitialiserBtn;
    private javax.swing.JComboBox<String> statutCb;
    private javax.swing.JButton supprimerBtn;
    // End of variables declaration//GEN-END:variables
}
