package Hattmakarna;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class SeKundInfoFonster extends javax.swing.JFrame {

    private InfDB idb;

    public SeKundInfoFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        SeKundInfoFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        id.setEnabled(false);
        namn.setEnabled(false);
        mail.setEnabled(false);
        adress.setEnabled(false);
        lojalitet.setEnabled(false);
        nummer.setEnabled(false);
        hämtaKund();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jÄndraKundMejl = new javax.swing.JLabel();
        jLojalitetsKund = new javax.swing.JLabel();
        jÄndraKundTel = new javax.swing.JLabel();
        jÄndraKundNamn = new javax.swing.JLabel();
        jÄndraKundAdress = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        namn = new javax.swing.JTextField();
        nummer = new javax.swing.JTextField();
        adress = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        lojalitet = new javax.swing.JTextField();
        spara = new javax.swing.JButton();
        ändra = new javax.swing.JButton();
        cbKundID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Sök kundinformation");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("KundID");

        jÄndraKundMejl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundMejl.setText("E-postadress");

        jLojalitetsKund.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLojalitetsKund.setText("Lojalitetskund");

        jÄndraKundTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundTel.setText("Telefonnummer");

        jÄndraKundNamn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundNamn.setText("Namn");

        jÄndraKundAdress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundAdress.setText("Gatuadress");

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        cbKundID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Kund" }));
        cbKundID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKundIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jÄndraKundNamn)
                    .addComponent(jÄndraKundAdress)
                    .addComponent(jÄndraKundTel)
                    .addComponent(jLojalitetsKund)
                    .addComponent(jÄndraKundMejl))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbKundID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adress)
                    .addComponent(mail)
                    .addComponent(lojalitet)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namn)
                    .addComponent(nummer))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(jÄndraKundNamn))
                    .addComponent(namn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraKundTel)
                    .addComponent(nummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jÄndraKundMejl)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lojalitet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLojalitetsKund))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hämtaKund(){
        
        String fraga= "select Namn from Kund";
        ArrayList<String> allaKundNamn;
        
        try{
            allaKundNamn= idb.fetchColumn(fraga);
            for (String enKund: allaKundNamn){
              cbKundID.addItem(enKund);
              
            }
            cbKundID.addItem("+ Lägg till ny kund");
            
            
            
        }  catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
    }
    }
    
    private void cbKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKundIDActionPerformed

        if (cbKundID.getSelectedItem().toString().equals("+ Lägg till ny kund")){

            new RegistreraKundFonster(idb).setVisible(true);
            dispose();

            
            
        }else{

            try {
                String kunden = cbKundID.getSelectedItem().toString();
                String hämtaID = idb.fetchSingle("select KundID from Kund where Namn= '"+kunden+"'");
                String hämtaNamn = idb.fetchSingle("select Namn from Kund where Namn= '"+kunden+"'");
                String hämtaTelefon = idb.fetchSingle("select Telefonnummer from Kund where Namn= '"+kunden+"'");
                String hämtaAdress = idb.fetchSingle("select Adress from Kund where Namn= '"+kunden+"'");
                String hämtaMail = idb.fetchSingle("select Email from Kund where Namn= '"+kunden+"'");
                String hämtaLojalitet = idb.fetchSingle("select Lojalitet from Kund where Namn= '"+kunden+"'");
                
                id.setText(hämtaID);
                namn.setText(hämtaNamn);
                nummer.setText(hämtaTelefon);
                adress.setText(hämtaAdress);
                mail.setText(hämtaMail);
                lojalitet.setText(hämtaLojalitet);
                
                


            }
            catch (InfException e) {

                JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
                System.out.println("Databasfel: " + e);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");

            }
        }

    }//GEN-LAST:event_cbKundIDActionPerformed

    private void ändraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraActionPerformed
        
        namn.setEnabled(true);
        mail.setEnabled(true);
        adress.setEnabled(true);
        lojalitet.setEnabled(true);
        nummer.setEnabled(true);
        
    }//GEN-LAST:event_ändraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
        int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
    
    if(resultat == JOptionPane.YES_OPTION){
        
        try {
                String kunden = cbKundID.getSelectedItem().toString();
                String hämtaID = idb.fetchSingle("select KundID from Kund where Namn= '"+kunden+"'");
            
                String nyNamn = namn.getText();
                String nyTelefon = nummer.getText();
                String nyAdress = adress.getText();
                String nyMail = mail.getText();
                String nyLojalitet = lojalitet.getText();
                String ändraInfo = "UPDATE hattmakare.Kund t SET t.Namn = '"+nyNamn+"', t.Adress= '"+nyAdress+"', t.Telefonnummer = '"+nyTelefon+"', t.Lojalitet = "+nyLojalitet+", t.Email = '"+nyMail+"' WHERE t.KundID = "+hämtaID+";";
                idb.update(ändraInfo);
                
                JOptionPane.showMessageDialog(null, "Ändringar sparade!");
                new SeKundInfoFonster(idb).setVisible(true);
                dispose();
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        
    }//GEN-LAST:event_sparaActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JComboBox<String> cbKundID;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLojalitetsKund;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jÄndraKundAdress;
    private javax.swing.JLabel jÄndraKundMejl;
    private javax.swing.JLabel jÄndraKundNamn;
    private javax.swing.JLabel jÄndraKundTel;
    private javax.swing.JTextField lojalitet;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField namn;
    private javax.swing.JTextField nummer;
    private javax.swing.JButton spara;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
