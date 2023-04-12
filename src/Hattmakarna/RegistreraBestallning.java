package Hattmakarna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraBestallning extends javax.swing.JFrame {

    private InfDB idb; 
    private String valdHatt;
    private String ID;
    private double Lojalitet;
    DefaultListModel<String> model = new DefaultListModel<String>();
    
    private String orderNr;
    private String vikt;
    private String datum;
    private String mottagare;
    private String kund;
    
    public RegistreraBestallning(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID = ID;
        this.setLocationRelativeTo(null);
        RegistreraBestallning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        hämtaKund();
        hämtaHattar();
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbKundID = new javax.swing.JComboBox<>();
        cbHattID = new javax.swing.JComboBox<>();
        jbLaggTillHatt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Adress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jDateChooserReg = new com.toedter.calendar.JDateChooser();
        jbRegBestallning = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        summan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Registrera beställning");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel2.setText("Datum (åååå-mm-dd)");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel4.setText("Leveransadress");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel6.setText("Hatt");

        cbKundID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Kund" }));
        cbKundID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKundIDActionPerformed(evt);
            }
        });

        cbHattID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Hatt" }));
        cbHattID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHattIDActionPerformed(evt);
            }
        });

        jbLaggTillHatt.setText("Lägg till hatt");
        jbLaggTillHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLaggTillHattActionPerformed(evt);
            }
        });

        Adress.setColumns(20);
        Adress.setRows(5);
        jScrollPane1.setViewportView(Adress);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel3.setText("Kund");

        jDateChooserReg.setDateFormatString("yyyy-MM-dd");

        jbRegBestallning.setText("Registrera beställning");
        jbRegBestallning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegBestallningActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel5.setText("Totalsumma:");

        summan.setText("\n");

        jScrollPane3.setViewportView(jList1);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel7.setText("Översikt");

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(summan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbHattID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbKundID, 0, 212, Short.MAX_VALUE)))
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbLaggTillHatt))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jbRegBestallning)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLaggTillHatt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(summan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBort))
                .addGap(18, 18, 18)
                .addComponent(jbRegBestallning, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    public void populateList(String[] data){
          
    for (String s : data) {
        model.addElement(s);
        }
        jList1.setModel(model);   
    }
    
    
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
    
    private void hämtaHattar(){
        
        String fraga= "select Kategori from Hatt";
        ArrayList<String> allaHattIDn;
        HashSet<String> unikaHattIDn = new HashSet<>();
        try {
        
            allaHattIDn= idb.fetchColumn(fraga);
            for (String hattID: allaHattIDn){
            unikaHattIDn.add(hattID);
            
            
        }
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        for (String hattID : unikaHattIDn) {
            cbHattID.addItem(hattID);
        }
    }
    
    private void jbRegBestallningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegBestallningActionPerformed

        if (ValideringsKlass.rutanÄrTom2(Adress, jLabel4)){
        if (ValideringsKlass.datumInteVald(jDateChooserReg)){
        if (ValideringsKlass.listaTom(jList1)){
        
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
        
            String bästID=idb.getAutoIncrement("Bestallning", "BestallningsID");
            String adress = Adress.getText();
            String fraktsedel = "Adress:"+" "+adress;
            String regDatum = DateFormat.format(jDateChooserReg.getDate());
            String kundID = idb.fetchSingle("select KundID from Kund where Namn = '"+cbKundID.getSelectedItem().toString()+"'"); 
                 
            
            if (Lojalitet > 0){
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                    
                        orderNr = bästID;
                        vikt= "100gr";
                        datum = regDatum;
                        mottagare =adress;
                        kund = kundID;
                        
                        double totalSumma = Double.parseDouble(summan.getText())  * Lojalitet;
                        idb.insert("INSERT INTO hattmakare.Bestallning (BestallningsID, Leveransadress, Totalsumma, Fraktsedel, Datum, Kund, Personal) VALUES ("+bästID+", '"+adress+"', "+totalSumma+", '"+fraktsedel+"', '"+regDatum+"', "+kundID+", "+ID+");");
                        new BestallningGenomford(idb,orderNr,vikt,datum,mottagare,kund).setVisible(true);
                        dispose();
                        
                     
                }
                
            }else{
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                        double summa = Double.parseDouble(summan.getText());
                        idb.insert("INSERT INTO hattmakare.Bestallning (BestallningsID, Leveransadress, Totalsumma, Fraktsedel, Datum, Kund, Personal) VALUES ("+bästID+", '"+adress+"', "+summa+", '"+fraktsedel+"', '"+regDatum+"', "+kundID+", "+ID+");");
                        new BestallningGenomford(idb,orderNr,vikt,datum,mottagare,kund).setVisible(true);
                        dispose();
                     
                }

                
            }
            
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        
    }
    }
    }  
    }//GEN-LAST:event_jbRegBestallningActionPerformed

    private void jbLaggTillHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLaggTillHattActionPerformed

        valdHatt = cbHattID.getSelectedItem().toString();
        
        new Hattar(idb, valdHatt).setVisible(true); 
        
    }//GEN-LAST:event_jbLaggTillHattActionPerformed

    private void cbHattIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHattIDActionPerformed
        
    }//GEN-LAST:event_cbHattIDActionPerformed

    private void cbKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKundIDActionPerformed
        
        if (cbKundID.getSelectedItem().toString().equals("+ Lägg till ny kund")){
                
                new RegistreraKundFonster(idb).setVisible(true);
                dispose();
                
            }else{
        
        try {
            
            String hittaLojalitet = idb.fetchSingle("select Lojalitet from Kund where Namn ='"+cbKundID.getSelectedItem().toString()+"'");
            int procent = Integer.parseInt(hittaLojalitet);
            
            if(procent > 1){
                
                Lojalitet = 1 - (procent * 0.01);
                
            }
            
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        }
        
    }//GEN-LAST:event_cbKundIDActionPerformed

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        int index = jList1.getSelectedIndex();
            if (index != -1) {
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        model.remove(index);
    }
        
        
    }//GEN-LAST:event_taBortActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Adress;
    private javax.swing.JComboBox<String> cbHattID;
    private javax.swing.JComboBox<String> cbKundID;
    private com.toedter.calendar.JDateChooser jDateChooserReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbLaggTillHatt;
    private javax.swing.JButton jbRegBestallning;
    private javax.swing.JTextField summan;
    private javax.swing.JButton taBort;
    // End of variables declaration//GEN-END:variables
}
