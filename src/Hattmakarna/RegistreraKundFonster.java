package Hattmakarna;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraKundFonster extends javax.swing.JFrame {

    private InfDB idb;
    
    public RegistreraKundFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraKundFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTitel = new javax.swing.JLabel();
        jKundNamn = new javax.swing.JLabel();
        jKundTelefon = new javax.swing.JLabel();
        jKundAdress = new javax.swing.JLabel();
        jKundMejl = new javax.swing.JLabel();
        jAngivetKundNamn = new javax.swing.JTextField();
        jAngiventKundTel = new javax.swing.JTextField();
        jAngivenKundAdress = new javax.swing.JTextField();
        jAngivenKundMejl = new javax.swing.JTextField();
        btnRegistreraKund = new javax.swing.JButton();
        felMeddelande = new javax.swing.JLabel();
        confirmMeddelande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTitel.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jTitel.setText("Registrera ny kund");

        jKundNamn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jKundNamn.setText("Namn");

        jKundTelefon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jKundTelefon.setText("Telefonnummer");

        jKundAdress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jKundAdress.setText("Gatuadress");

        jKundMejl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jKundMejl.setText("E-postadress");

        jAngivetKundNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivetKundNamnActionPerformed(evt);
            }
        });

        jAngiventKundTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngiventKundTelActionPerformed(evt);
            }
        });

        jAngivenKundAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivenKundAdressActionPerformed(evt);
            }
        });

        jAngivenKundMejl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivenKundMejlActionPerformed(evt);
            }
        });

        btnRegistreraKund.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistreraKund.setText("Registrera kund");
        btnRegistreraKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraKundActionPerformed(evt);
            }
        });

        felMeddelande.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTitel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(felMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jKundNamn)
                                    .addComponent(jKundTelefon)
                                    .addComponent(jKundAdress)
                                    .addComponent(confirmMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jKundMejl))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jAngivenKundMejl, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jAngivenKundAdress)
                            .addComponent(jAngiventKundTel)
                            .addComponent(jAngivetKundNamn)
                            .addComponent(btnRegistreraKund, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAngivetKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKundTelefon)
                    .addComponent(jAngiventKundTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKundAdress)
                    .addComponent(jAngivenKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKundMejl)
                    .addComponent(jAngivenKundMejl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(felMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btnRegistreraKund, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(confirmMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAngivetKundNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivetKundNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivetKundNamnActionPerformed

    private void jAngivenKundAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivenKundAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivenKundAdressActionPerformed

    private void btnRegistreraKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraKundActionPerformed
    felMeddelande.setText("");
    confirmMeddelande.setText("");
        
        if (ValideringsKlass.rutaEmpty(jAngivetKundNamn) || ValideringsKlass.rutaEmpty(jAngiventKundTel) || ValideringsKlass.rutaEmpty(jAngivenKundAdress) || ValideringsKlass.rutaEmpty(jAngivenKundMejl)) {
           felMeddelande.setText("Fel: Vänligen fyll i alla fält");
        } else {
            try {
                String kID = idb.getAutoIncrement("Kund", "KundID");
                idb.insert("INSERT INTO Kund VALUES (" + kID + ", '" + jAngivetKundNamn.getText() + "', '" + jAngivenKundAdress.getText() + "', '" + jAngiventKundTel.getText() + "', 0 , '" + jAngivenKundMejl.getText() + "');");
                confirmMeddelande.setText("En ny kund har registrerats!");
            } catch (InfException exc) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            } 
        }
    }//GEN-LAST:event_btnRegistreraKundActionPerformed

    private void jAngiventKundTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngiventKundTelActionPerformed
   
    }//GEN-LAST:event_jAngiventKundTelActionPerformed

    private void jAngivenKundMejlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivenKundMejlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivenKundMejlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraKund;
    private javax.swing.JLabel confirmMeddelande;
    private javax.swing.JLabel felMeddelande;
    private javax.swing.JTextField jAngivenKundAdress;
    private javax.swing.JTextField jAngivenKundMejl;
    private javax.swing.JTextField jAngiventKundTel;
    private javax.swing.JTextField jAngivetKundNamn;
    private javax.swing.JLabel jKundAdress;
    private javax.swing.JLabel jKundMejl;
    private javax.swing.JLabel jKundNamn;
    private javax.swing.JLabel jKundTelefon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTitel;
    // End of variables declaration//GEN-END:variables
}
