package Hattmakarna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraBestallningFonster extends javax.swing.JFrame {

    private InfDB idb;

    public HanteraBestallningFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        HanteraBestallningFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        fyllCbPersonal();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBestallningsID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtKundID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaLeveransadress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jtHattID = new javax.swing.JTextField();
        jtSumma = new javax.swing.JTextField();
        skrolla = new javax.swing.JScrollPane();
        txtareaInfo = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jbkund = new javax.swing.JButton();
        jbhatt = new javax.swing.JButton();
        jbBortHatt = new javax.swing.JButton();
        jbLev = new javax.swing.JButton();
        jbSumma = new javax.swing.JButton();
        jbVisaInfo = new javax.swing.JButton();
        jbRadera = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbPersonal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jdateDatum = new com.toedter.calendar.JDateChooser();
        jbReg = new javax.swing.JButton();
        cbPersonal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Hantera beställning");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Ange beställningsID");

        jtBestallningsID.setColumns(4);

        jLabel3.setText("KundID");

        jLabel5.setText("Leveransadress");

        jLabel6.setText("Totalsumma");

        jtKundID.setColumns(5);

        txtaLeveransadress.setColumns(20);
        txtaLeveransadress.setRows(5);
        jScrollPane1.setViewportView(txtaLeveransadress);

        jLabel7.setText("Hatt");

        jtHattID.setColumns(5);

        jtSumma.setColumns(5);

        txtareaInfo.setColumns(20);
        txtareaInfo.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        txtareaInfo.setRows(5);
        txtareaInfo.setText("Ange beställningsID för att se \nbeställningsinformation här.");
        skrolla.setViewportView(txtareaInfo);

        jbkund.setText("Ändra kundID");
        jbkund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbkundActionPerformed(evt);
            }
        });

        jbhatt.setText("Lägg till hatt");
        jbhatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhattActionPerformed(evt);
            }
        });

        jbBortHatt.setText("Ta bort hatt");
        jbBortHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBortHattActionPerformed(evt);
            }
        });

        jbLev.setText("Ändra leveransadress");
        jbLev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLevActionPerformed(evt);
            }
        });

        jbSumma.setText("Ändra totalsumma");
        jbSumma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSummaActionPerformed(evt);
            }
        });

        jbVisaInfo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jbVisaInfo.setText("Visa info");
        jbVisaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisaInfoActionPerformed(evt);
            }
        });

        jbRadera.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jbRadera.setText("(Avbryt beställning)");
        jbRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRaderaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(82, 82, 82)
                        .addComponent(jtSumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jbSumma))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbLev))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jbRadera))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(90, 90, 90)
                                        .addComponent(jtKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbkund)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbhatt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbBortHatt))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtBestallningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jbVisaInfo)))
                        .addGap(75, 75, 75)
                        .addComponent(skrolla, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtBestallningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbVisaInfo))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbkund))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jbhatt)
                            .addComponent(jbBortHatt))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(skrolla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbRadera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jbLev)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtSumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSumma)))
        );

        jLabel4.setText("Beställningsansvarig");

        jbPersonal.setText("Ändra beställningsansvarig");
        jbPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPersonalActionPerformed(evt);
            }
        });

        jLabel8.setText("Registreringsdatum");

        jdateDatum.setDateFormatString("yyyy-MM-dd");

        jbReg.setText("Ändra registreringsdatum");
        jbReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegActionPerformed(evt);
            }
        });

        cbPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj personal" }));
        cbPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdateDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jbReg))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPersonal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jbPersonal)
                    .addComponent(cbPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdateDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbReg))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPersonalActionPerformed
        String bestallningsID = jtBestallningsID.getText();
        String bestallningsAnsvarig = cbPersonal.getSelectedItem().toString();
        String hittaPersonal = "Select PersonalID from Personal where namn = '" + bestallningsAnsvarig + "'";

        if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

        } else {
            try {

                if ((bestallningsAnsvarig.isEmpty() == false)) {
                    String ID = idb.fetchSingle(hittaPersonal);
                    idb.update("Update bestallning set Personal= '" + ID + "' where BestallningsID= " + bestallningsID);
                    JOptionPane.showMessageDialog(null, "Ansvarig personal har uppdaterats!");
                    visaInfo();
                } else {
                    JOptionPane.showMessageDialog(null, "Skriv personalID som du vill uppdatera till i rutan!");
                }

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel, var god prova igen.");
                System.out.println("Databasfel: " + e);
            }
        }


    }//GEN-LAST:event_jbPersonalActionPerformed

    private void jbkundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbkundActionPerformed
        String bestallningsID = jtBestallningsID.getText();
        String kundID = jtKundID.getText();

        if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

        } else {
            try {

                if (kundID.isEmpty() == false) {
                    idb.update("Update Bestallning set Kund = " + kundID + " where BestallningsID= " + bestallningsID);
                    JOptionPane.showMessageDialog(null, "KundID har uppdaterats på ordern!");
                    visaInfo();
                } else {
                    JOptionPane.showMessageDialog(null, "Skriv KundID som du vill uppdatera till i rutan!");
                }

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                System.out.println("Databasfel: " + e);
            }
        }
    }//GEN-LAST:event_jbkundActionPerformed

    private void jbhattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhattActionPerformed
        String bestallningsID = jtBestallningsID.getText();

        String hattID = jtHattID.getText();

        if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

        } else {
            try {

                if (hattID.isEmpty() == false) {
                    idb.update("Update Hatt set Bestallning = " + bestallningsID + " where HattID= " + hattID);
                    JOptionPane.showMessageDialog(null, "Hatt har lagts till i ordern!");
                    visaInfo();
                } else {
                    JOptionPane.showMessageDialog(null, "Skriv HattID på den hatt som du vill lägga till i rutan!");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                System.out.println("Databasfel: " + e);
            }
        }
    }//GEN-LAST:event_jbhattActionPerformed

    private void jbBortHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBortHattActionPerformed

        String bestallningsID = jtBestallningsID.getText();

        String hattID = jtHattID.getText();

        if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

        } else {
            try {

                if (hattID.isEmpty() == false) {
                    idb.update("Update Hatt set Bestallning = " + null + " where HattID= " + hattID);
                    JOptionPane.showMessageDialog(null, "Hatt har tagits bort från beställningen!");
                    visaInfo();
                } else {
                    JOptionPane.showMessageDialog(null, "Skriv hattID i rutan.");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                System.out.println("fel: " + e);
            }
        }
    }//GEN-LAST:event_jbBortHattActionPerformed

    private void jbLevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLevActionPerformed

        String bestallningsID = jtBestallningsID.getText();

        String leveransAdress = txtaLeveransadress.getText();

        if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

        } else {
            try {

                if (leveransAdress.isEmpty() == false) {
                    idb.update("Update Bestallning set Leveransadress = " + leveransAdress + " where BestallningsID= " + bestallningsID);
                    idb.update("Update Bestallning set Fraktsedel = ' Adress: " + leveransAdress + "' where BestallningsID= " + bestallningsID);
                    JOptionPane.showMessageDialog(null, "Leveransadress har uppdaterats!");
                    visaInfo();

                } else {
                    JOptionPane.showMessageDialog(null, "Skriv leveransadress som du vill uppdatera till i rutan!");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                System.out.println("Databasfel: " + e);
            }
        }


    }//GEN-LAST:event_jbLevActionPerformed

    private void jbSummaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSummaActionPerformed
        String bestallningsID = jtBestallningsID.getText();
        String totalsumma = jtSumma.getText();

        if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

        } else {
            try {

                if (totalsumma.isEmpty() == false) {
                    idb.update("Update bestallning set Totalsumma= " + totalsumma + " where BestallningsID= " + bestallningsID);
                    JOptionPane.showMessageDialog(null, "Totalsumman har uppdaterats!");
                    visaInfo();

                } else {
                    JOptionPane.showMessageDialog(null, "Skriv totalsumman som du vill uppdatera till i rutan!");
                }

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                System.out.println("Databasfel: " + e);
            }
        }
    }//GEN-LAST:event_jbSummaActionPerformed

    private void jbRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegActionPerformed
        //Hur gör man för att validera att datum är skrivet som yyyy-mm-dd i rutan, och att det inte står ex "hej" där?

        if (ValideringsKlass.datumInteVald(jdateDatum)) {
            String bestallningsID = jtBestallningsID.getText();

            if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

            } else {
                try {
                    SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String regDatum = DateFormat.format(jdateDatum.getDate());
                    if (regDatum.isEmpty() == false) {
                        idb.update("Update bestallning set Datum= '" + regDatum + "' where BestallningsID= " + bestallningsID);
                        JOptionPane.showMessageDialog(null, "Registreringsdatum har uppdaterats!");
                        visaInfo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Säkerställ att du valt datum!");
                    }

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Databasfel");
                    System.out.println("Databasfel: " + e);
                }
            }
        }

    }//GEN-LAST:event_jbRegActionPerformed

    private void jbRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRaderaActionPerformed

        String bestallningsID = jtBestallningsID.getText();

        if (bestallningsID.isEmpty() || (bestallningsID.matches(".*[a-zA-Z].*"))) {
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

        } else {
            try {
                idb.delete("Delete from bestallning where BestallningsID= '" + bestallningsID + "'");
                JOptionPane.showMessageDialog(null, "Beställningen är raderad!");
                txtareaInfo.setText("Beställning med ID: " + bestallningsID + " kan ej hittas.");
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                System.out.println("Databasfel: " + e);
            }
        }
    }//GEN-LAST:event_jbRaderaActionPerformed

    private void jbVisaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisaInfoActionPerformed
        visaInfo();

    }//GEN-LAST:event_jbVisaInfoActionPerformed

    private void cbPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPersonalActionPerformed

    private void fyllCbPersonal() {

        ArrayList<String> allPersonal;
        String fraga = "Select Namn from personal";

        try {
            allPersonal = idb.fetchColumn(fraga);

            for (String Namn : allPersonal) {
                cbPersonal.addItem(Namn);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Databasfel: " + e);
        }
    }

    private void visaInfo() {
        if (ValideringsKlass.endastNummerTillåten(jtBestallningsID) || (ValideringsKlass.rutanÄrTom(jtBestallningsID, jLabel2))) {

            txtareaInfo.setVisible(true);
            skrolla.setVisible(true);
            String bestallningsID = jtBestallningsID.getText();
            String fragaKund = ("Select kund from bestallning where bestallningsID= " + bestallningsID);
            String fragaHatt = ("Select HattId from Hatt where bestallning = '" + bestallningsID + "'");
            String fragaAdress = ("Select Leveransadress from bestallning where bestallningsID= " + bestallningsID);
            String fragaSumma = ("Select Totalsumma from bestallning where bestallningsID= " + bestallningsID);
            String fragaAnsvarig = ("Select Personal from bestallning where bestallningsID= " + bestallningsID);
            String fragaDatum = ("Select Datum from bestallning where bestallningsID= " + bestallningsID);

            if (bestallningsID.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");

            } else {
                try {

                    ArrayList<String> allaBestallningsID;
                    String fraga = "Select BestallningsID from Bestallning";
                    allaBestallningsID = idb.fetchColumn(fraga);

                    boolean finns = false;
                    for (String ID : allaBestallningsID) {
                        if (bestallningsID.equals(ID)) {
                            finns = true;
                            txtareaInfo.setText("BeställningsID: " + bestallningsID + "\n");
                            txtareaInfo.append("KundID: " + idb.fetchSingle(fragaKund) + " \n");
//                            txtareaInfo.append("HattID:");
//                            hamtaaHatt();
                            txtareaInfo.append("Leveransadress: " + idb.fetchSingle(fragaAdress) + " \n");
                            txtareaInfo.append("Totalsumma: " + idb.fetchSingle(fragaSumma) + " kronor \n");
                            txtareaInfo.append("Ansvarig personals ID: " + idb.fetchSingle(fragaAnsvarig) + " \n");
                            txtareaInfo.append("Datum för beställning: " + idb.fetchSingle(fragaDatum) + " \n");
                            hamtaaHatt();
                        }
                    }
                    if (!finns) {
                        txtareaInfo.setText("ID kan ej hittas. Var god prova igen.");

                    }

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Databasfel");
                    System.out.println("Databasfel: " + e);
                }

            }
        }

    }

//    public HashMap getHattarNej() {
//
//        HashMap<String, String> info = new HashMap<>();
//        try {
//
//            info = idb.fetchRow("SELECT HattID, Kategori FROM Hatt WHERE Bestallning = '" + jtBestallningsID.getText() + "'");
//
//           
//                   
//            
//        } catch (InfException ex) {
//            JOptionPane.showMessageDialog(null, "Något gick fel, var god prova igen!");
//
//        }
//        return info;
//
//    }
//    public ArrayList getHattarna() {
//        ArrayList<HashMap<Integer, String>> info = new ArrayList();
//        try {
//            idb.fetchRows("Select * from Hatt");
//
//        } catch (InfException e) {
//            JOptionPane.showMessageDialog(null, "Nått är fel!");
//        }
//        return info;
//    }
//    public void setHattar() {
//
//        ArrayList<HashMap<String, String>> info;
//        info = getHattarna();
//
////        txtareaInfo.append("Hej");
//        for (HashMap<String, String> Hatt : info) {
//
//            if ((Hatt.get("Bestallning")).equals("2")) {
//
//                txtareaInfo.append(("HattID: ") + Hatt.get("HattID") + "\n");
//                txtareaInfo.append("Hej");
//            }
//        }
//    }
    public ArrayList hamtaaHatt() {
        ArrayList<String> hattar = new ArrayList<>();
        String fragaHatt = "Select Bestallning from hatt";

        try {
            hattar = idb.fetchColumn(fragaHatt);

            for (String bestallningsID : hattar) {

                if (bestallningsID.equals(jtBestallningsID.getText())) {

                    String fragaHattID = "Select HattID from hatt where Bestallning= '" + jtBestallningsID.getText() + "'";
                    String hattIDt = idb.fetchSingle(fragaHattID);
                    txtareaInfo.append("HattID: "+ (hattIDt)+ "\n");
 
                    

                }
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "databasfel");
        }
        return hattar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jbBortHatt;
    private javax.swing.JButton jbLev;
    private javax.swing.JButton jbPersonal;
    private javax.swing.JButton jbRadera;
    private javax.swing.JButton jbReg;
    private javax.swing.JButton jbSumma;
    private javax.swing.JButton jbVisaInfo;
    private javax.swing.JButton jbhatt;
    private javax.swing.JButton jbkund;
    private com.toedter.calendar.JDateChooser jdateDatum;
    private javax.swing.JTextField jtBestallningsID;
    private javax.swing.JTextField jtHattID;
    private javax.swing.JTextField jtKundID;
    private javax.swing.JTextField jtSumma;
    private javax.swing.JScrollPane skrolla;
    private javax.swing.JTextArea txtaLeveransadress;
    private javax.swing.JTextArea txtareaInfo;
    // End of variables declaration//GEN-END:variables
}
