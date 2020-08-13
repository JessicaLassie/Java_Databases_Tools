/*
 * Copyright (C) Jessica LASSIE from 2020 to present
 * All rights reserved
 */
package fr.jl.generator.views;

import fr.jl.generator.controller.GeneratorController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jessica LASSIE
 */
public class JfGenerator extends javax.swing.JFrame {

    Connection cnx = null;
    
    /**
     * Creates new form JfGenerator
     */
    public JfGenerator() {
        initComponents();
        setLocationRelativeTo(null);  
        jTextFieldServer.setText("mysql-kica.alwaysdata.net");
        jTextFieldPort.setText("3306");
        jPanelDatabase.setVisible(false);      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatabase = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTables = new javax.swing.JList<>();
        jLabelDatabaseName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListColumns = new javax.swing.JList<>();
        jPanelConnection = new javax.swing.JPanel();
        jTextFieldServer = new javax.swing.JTextField();
        jLabelServer = new javax.swing.JLabel();
        jTextFieldPort = new javax.swing.JTextField();
        jLabelPort = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jButtonConnect = new javax.swing.JButton();
        jLabelDatabase = new javax.swing.JLabel();
        jTextFieldDatabase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator");
        setResizable(false);

        jListTables.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListTables.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTablesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListTables);

        jLabelDatabaseName.setText("database name");

        jListColumns.setToolTipText("");
        jScrollPane2.setViewportView(jListColumns);

        javax.swing.GroupLayout jPanelDatabaseLayout = new javax.swing.GroupLayout(jPanelDatabase);
        jPanelDatabase.setLayout(jPanelDatabaseLayout);
        jPanelDatabaseLayout.setHorizontalGroup(
            jPanelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatabaseLayout.createSequentialGroup()
                .addComponent(jLabelDatabaseName)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelDatabaseLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelDatabaseLayout.setVerticalGroup(
            jPanelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatabaseLayout.createSequentialGroup()
                .addComponent(jLabelDatabaseName)
                .addGap(48, 48, 48)
                .addGroup(jPanelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 76, Short.MAX_VALUE))
        );

        jLabelServer.setText("Serveur");

        jLabelPort.setText("Port");

        jLabelLogin.setText("Login");

        jLabelPassword.setText("Password");

        jButtonConnect.setText("Connect");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jLabelDatabase.setText("Database");

        javax.swing.GroupLayout jPanelConnectionLayout = new javax.swing.GroupLayout(jPanelConnection);
        jPanelConnection.setLayout(jPanelConnectionLayout);
        jPanelConnectionLayout.setHorizontalGroup(
            jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonConnect)
                        .addGroup(jPanelConnectionLayout.createSequentialGroup()
                            .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelConnectionLayout.createSequentialGroup()
                                    .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDatabase)
                                        .addComponent(jLabelServer))
                                    .addGap(44, 44, 44))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelConnectionLayout.createSequentialGroup()
                                    .addComponent(jLabelPort)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPort, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(jTextFieldServer))))
                    .addGroup(jPanelConnectionLayout.createSequentialGroup()
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogin)
                            .addComponent(jLabelPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldDatabase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanelConnectionLayout.setVerticalGroup(
            jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelServer))
                .addGap(18, 18, 18)
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPort))
                .addGap(18, 18, 18)
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatabase)
                    .addComponent(jTextFieldDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(28, 28, 28)
                .addComponent(jButtonConnect)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        String server = jTextFieldServer.getText();
        String port = jTextFieldPort.getText();
        String database = jTextFieldDatabase.getText();
        String login = jTextFieldLogin.getText();
        char[] password = jPasswordField.getPassword();

        try {
            cnx = GeneratorController.getConnection(server, port, database, login, password);
            String[] types = {"TABLE"};
            ResultSet res = cnx.getMetaData().getTables(null, null, "%", types);
            ArrayList<String> listeTable = new ArrayList();
            while(res.next()) {
                String nomTable = res.getString(3);
                listeTable.add(nomTable);
            }
            jPanelConnection.setVisible(false);
            jPanelDatabase.setVisible(true);
            jLabelDatabaseName.setText(database);
            DefaultListModel<String> l1 = new DefaultListModel<>();  
            for(String el : listeTable) {
                l1.addElement(el);
                jListTables.setModel(l1);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(JfGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jListTablesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTablesValueChanged
        try {
            Statement stmt=cnx.createStatement();
            ArrayList<String> listCol=new ArrayList();
            ResultSet res = stmt.executeQuery("Select * from " + jListTables.getSelectedValue());
            ResultSetMetaData rsMetaData=res.getMetaData();
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                String nom=rsMetaData.getColumnName(i);
                listCol.add(nom);
            }
            DefaultListModel<String> l1 = new DefaultListModel<>();  
            for(String el : listCol) {
                l1.addElement(el);
                jListColumns.setModel(l1);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
      
        
    }//GEN-LAST:event_jListTablesValueChanged

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
            java.util.logging.Logger.getLogger(JfGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JLabel jLabelDatabase;
    private javax.swing.JLabel jLabelDatabaseName;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelServer;
    private javax.swing.JList<String> jListColumns;
    private javax.swing.JList<String> jListTables;
    private javax.swing.JPanel jPanelConnection;
    private javax.swing.JPanel jPanelDatabase;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDatabase;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldServer;
    // End of variables declaration//GEN-END:variables
}
