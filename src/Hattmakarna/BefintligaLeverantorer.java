package Hattmakarna;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class BefintligaLeverantorer extends javax.swing.JFrame {

    private InfDB idb;

    public BefintligaLeverantorer(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        BefintligaLeverantorer.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fyllLista();
        namn.setEnabled(false);
        telefonnummer.setEnabled(false);
        adress.setEnabled(false);
    }

    public void fyllLista(){
        
        String hämtaLeverantörer = "Select Namn from Leverantor";
        
        ArrayList<String> allaLeverantörer;
        
        try {
            
            allaLeverantörer = idb.fetchColumn(hämtaLeverantörer);

            for (String namn : allaLeverantörer) {
                valdLeverantör.addItem(namn);
            }            
            
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valdLeverantör = new javax.swing.JComboBox<>();
        namn = new javax.swing.JTextField();
        adress = new javax.swing.JTextField();
        telefonnummer = new javax.swing.JTextField();
        jLVald = new javax.swing.JLabel();
        jLNamn = new javax.swing.JLabel();
        jLAdress = new javax.swing.JLabel();
        jLTelefon = new javax.swing.JLabel();
        statistik = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        valdLeverantör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valdLeverantörActionPerformed(evt);
            }
        });

        jLVald.setText("Vald Leverantör");

        jLNamn.setText("Namn");

        jLAdress.setText("Telefonnummer");

        jLTelefon.setText("Adress");

        statistik.setText("Statistik");
        statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNamn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLAdress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLTelefon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(namn, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(adress)
                    .addComponent(telefonnummer))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLVald)
                        .addGap(18, 18, 18)
                        .addComponent(valdLeverantör, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valdLeverantör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLVald))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAdress))
                .addGap(18, 18, 18)
                .addComponent(statistik, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(30, 30, 30))
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

    private void valdLeverantörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valdLeverantörActionPerformed
        
        try {
            
            String valdLeverantor = valdLeverantör.getSelectedItem().toString();
            String hämtaTelefon = idb.fetchSingle("Select Telefon from Leverantor where Namn='"+valdLeverantor+"'");
            String hämtaAdress = idb.fetchSingle("Select Adress from Leverantor where Namn='"+valdLeverantor+"'");
            
            namn.setText(valdLeverantor);
            telefonnummer.setText(hämtaTelefon);
            adress.setText(hämtaAdress);
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        
    }//GEN-LAST:event_valdLeverantörActionPerformed

    private void statistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikActionPerformed
        // TODO add your handling code here:
         new LeverantorsStatistik(idb).setVisible(true);
    }//GEN-LAST:event_statistikActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JLabel jLAdress;
    private javax.swing.JLabel jLNamn;
    private javax.swing.JLabel jLTelefon;
    private javax.swing.JLabel jLVald;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namn;
    private javax.swing.JButton statistik;
    private javax.swing.JTextField telefonnummer;
    private javax.swing.JComboBox<String> valdLeverantör;
    // End of variables declaration//GEN-END:variables
}
