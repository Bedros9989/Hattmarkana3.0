package Hattmakarna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraHattFonster extends javax.swing.JFrame {

    private InfDB idb;
    public byte[] pimage = null;
    Connection conn = null;
    private ArrayList<Double> MaterialLista;

    public RegistreraHattFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        RegistreraHattFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lblHattIDPresentation.setText(hamtaHattID());
        fyllCbValjPersonal();
        fyllCbHattMaterial();
        fyllCbHattKategori();
        this.setLocationRelativeTo(null);
        conn = RegistreraHattFonster.DBConnect.connect();
        MaterialLista = new ArrayList<>(); //ettMaterialIDDouble, valdMangdDouble, materialPrisAvrundat
    }

    private String hamtaHattID() {
        String nastaID = null;
        try {
            nastaID = idb.getAutoIncrement("hatt", "HattID");
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        return nastaID;
    }

    private void fyllCbValjPersonal() {
        try {
            ArrayList<String> allaPersonalNamn = idb.fetchColumn("Select namn from personal");
            Collections.sort(allaPersonalNamn);

            for (String Namn : allaPersonalNamn) {
                cbValjPersonal.addItem(Namn);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void fyllCbHattMaterial() {
        try {
            ArrayList<String> allaHattMaterial = idb.fetchColumn("Select materialnamn from material");
            Collections.sort(allaHattMaterial);

            for (String Namn : allaHattMaterial) {
                cbHattMaterial.addItem(Namn);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void fyllCbHattKategori() {
            cbHattKategori.addItem("Doktorshatt");
            cbHattKategori.addItem("Specialhatt");
            cbHattKategori.addItem("Studenthatt");
    }

    public class DBConnect {

        public static Connection connect() {
            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hattmakare", "hattuser", "hattkey");
            } catch (Exception e) {
                System.out.println("inter.DBConnect.connect()");
            }
            return con;
        }
    }

    public void hämtabild(byte[] pimage2) {

        pimage = pimage2;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkomstText = new javax.swing.JLabel();
        lblHattStorlek = new javax.swing.JLabel();
        txtHattStorlek = new javax.swing.JTextField();
        lblHattSkapare = new javax.swing.JLabel();
        cbValjPersonal = new javax.swing.JComboBox<>();
        btnRegistreraHatt = new javax.swing.JButton();
        lblValjMaterial = new javax.swing.JLabel();
        cbHattMaterial = new javax.swing.JComboBox<>();
        lblMängdMaterial = new javax.swing.JLabel();
        txtHattMangd = new javax.swing.JTextField();
        lblHattID = new javax.swing.JLabel();
        lblHattIDPresentation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMaterial = new javax.swing.JTextArea();
        lblValtMaterial = new javax.swing.JLabel();
        btnValjMaterial = new javax.swing.JButton();
        hattBild = new javax.swing.JButton();
        cbHattKategori = new javax.swing.JComboBox<>();
        lblHattKategorier = new javax.swing.JLabel();
        lblTillverkningstimmar = new javax.swing.JLabel();
        txtTillverkningstimmar = new javax.swing.JTextField();
        txtBestallning = new javax.swing.JTextField();
        lblBestallningsID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblValkomstText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValkomstText.setText("Registrera ny hatt");

        lblHattStorlek.setText("Storlek");

        lblHattSkapare.setText("Skapare");

        cbValjPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj personal" }));
        cbValjPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjPersonalActionPerformed(evt);
            }
        });

        btnRegistreraHatt.setText("Registrera hatt");
        btnRegistreraHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraHattActionPerformed(evt);
            }
        });

        lblValjMaterial.setText("Välj material");

        cbHattMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj materialnamn" }));
        cbHattMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHattMaterialActionPerformed(evt);
            }
        });

        lblMängdMaterial.setText("Mängd material");

        txtHattMangd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHattMangdActionPerformed(evt);
            }
        });

        lblHattID.setText("HattID");

        lblHattIDPresentation.setText("hattID");

        txtAreaMaterial.setColumns(20);
        txtAreaMaterial.setRows(5);
        jScrollPane1.setViewportView(txtAreaMaterial);

        lblValtMaterial.setText("Valt material");

        btnValjMaterial.setText("Välj");
        btnValjMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjMaterialActionPerformed(evt);
            }
        });

        hattBild.setText("Lägg till bild");
        hattBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hattBildActionPerformed(evt);
            }
        });

        lblHattKategorier.setText("Hattkategori");

        lblTillverkningstimmar.setText("Tillverkningstimmar");

        lblBestallningsID.setText("BeställningsID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHattStorlek)
                                    .addComponent(lblValjMaterial)
                                    .addComponent(lblMängdMaterial)
                                    .addComponent(lblHattSkapare)
                                    .addComponent(lblHattID)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTillverkningstimmar)
                                            .addComponent(lblHattKategorier))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbValjPersonal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtHattStorlek)
                                            .addComponent(cbHattMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblHattIDPresentation)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtHattMangd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbHattKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnValjMaterial)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(hattBild, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValtMaterial)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnRegistreraHatt)
                                    .addGap(18, 18, 18)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblBestallningsID)
                                .addGap(18, 18, 18)
                                .addComponent(txtBestallning, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValkomstText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblValkomstText)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHattID)
                    .addComponent(lblHattIDPresentation)
                    .addComponent(lblValtMaterial))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHattSkapare)
                                    .addComponent(cbValjPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHattStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHattStorlek))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbHattMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValjMaterial))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMängdMaterial)
                                    .addComponent(txtHattMangd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnValjMaterial)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHattKategorier)
                            .addComponent(cbHattKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTillverkningstimmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRegistreraHatt)
                                    .addComponent(hattBild))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBestallning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBestallningsID))
                        .addGap(133, 133, 133))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbValjPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbValjPersonalActionPerformed

    private void btnRegistreraHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraHattActionPerformed

        /* För att lägga-bild funktionen ska funka så behövde vi 
           använda den officiella mysql.java.jar filen som fanns
           istället för InfDB.jar. Den är dock jättenkel att använda
           som ni kanske märker nedanför */
        String bestallningsID = "";

        try {
            if (txtBestallning.getText().isEmpty()) {
                bestallningsID = null;
            }

            String q = "INSERT INTO `hatt`(`hattID`, `Storlek`,`Skapare`,`Kategori`,`Bestallning`,`Tillverkningstimmar`,`BildData`) VALUES (?,?,?,?,?,?,?)";

            String personalNamn = cbValjPersonal.getSelectedItem().toString();
            String personalID = idb.fetchSingle("SELECT personalID FROM Personal WHERE namn = '" + personalNamn + "'");

            PreparedStatement pst = conn.prepareStatement(q);
            pst.setString(1, lblHattIDPresentation.getText());
            pst.setString(2, txtHattStorlek.getText());
            pst.setString(3, personalID);
            pst.setString(4, cbHattKategori.getSelectedItem().toString());
            pst.setString(5, txtBestallning.getText());
            pst.setString(6, txtTillverkningstimmar.getText());
            pst.setBytes(7, pimage);
            pst.execute();

//                        
//            //Hatt 1
//            double material1 = MaterialLista.get(0);
//            Integer materialID1 = (int) material1;
//            String materialID1String = materialID1.toString();
//            double materialMangd1 = MaterialLista.get(1);
//            double materialPris1 = MaterialLista.get(2);
//            //Hatt 2
//            double material2 = MaterialLista.get(3);
//            Integer materialID2 = (int) material2;
//            String materialID2String = materialID2.toString();
//            double materialMangd2 = MaterialLista.get(4);
//            double materialPris2 = MaterialLista.get(5);
//            //Hatt 3
//            double material3 = MaterialLista.get(6);
//            Integer materialID3 = (int) material3;
//            String materialID3String = materialID3.toString();
//            double materialMangd3 = MaterialLista.get(7);
//            double materialPris3 = MaterialLista.get(8);
//            //Hatt 4
//            double material4 = MaterialLista.get(9);
//            Integer materialID4 = (int) material4;
//            String materialID4String = materialID4.toString();
//            double materialMangd4 = MaterialLista.get(10);
//            double materialPris4 = MaterialLista.get(11);
//            //Hatt 5
//            double material5 = MaterialLista.get(12);
//            Integer materialID5 = (int) material5;
//            String materialID5String = materialID5.toString();
//            double materialMangd5 = MaterialLista.get(13);
//            double materialPris5 = MaterialLista.get(14);
//            //Hatt 6
//            double material6 = MaterialLista.get(15);
//            Integer materialID6 = (int) material6;
//            String materialID6String = materialID6.toString();
//            double materialMangd6 = MaterialLista.get(16);
//            double materialPris6 = MaterialLista.get(17);
//            //Hatt 7
//            double material7 = MaterialLista.get(18);
//            Integer materialID7 = (int) material7;
//            String materialID7String = materialID7.toString();
//            double materialMangd7 = MaterialLista.get(19);
//            double materialPris7 = MaterialLista.get(20);
//            //Hatt 8
//            double material8 = MaterialLista.get(21);
//            Integer materialID8 = (int) material8;
//            String materialID8String = materialID8.toString();
//            double materialMangd8 = MaterialLista.get(22);
//            double materialPris8 = MaterialLista.get(23);
//            //Hatt 9
//            double material9 = MaterialLista.get(24);
//            Integer materialID9 = (int) material9;
//            String materialID9String = materialID9.toString();
//            double materialMangd9 = MaterialLista.get(25);
//            double materialPris9 = MaterialLista.get(26);
//            //Hatt 10
//            double material10 = MaterialLista.get(27);
//            Integer materialID10 = (int) material10;
//            String materialID10String = materialID10.toString();
//            double materialMangd10 = MaterialLista.get(28);
//            double materialPris10 = MaterialLista.get(29);
//
//            
//            
//            //Uppdatera Material genom Arralisten MaterialLista
//            //0, 3, 6= MaterialID
//            //1, 4, 7= mangdMangd
//            //2, 5, 8= materialPrisAvrundat
//            
//            
//            ArrayList<String> allaAntal = new ArrayList<String>();
//            ArrayList<String> allaMetervara = new ArrayList<String>();
//            ArrayList<String> allaKvadrametervara= new ArrayList<String>();
//            String fragaAntal = "SELECT materialID FROM antalvara";
//            String fragaMetervara = "SELECT materialID FROM metervara";
//            String fragaKvadratmetervara = "SELECT materialID FROM kvadratmetervara";
//            allaAntal = idb.fetchColumn(fragaAntal);
//            allaMetervara = idb.fetchColumn(fragaMetervara);
//            allaKvadrametervara = idb.fetchColumn(fragaKvadratmetervara);
//
//            for (String idAntal : allaAntal) {
//                if (materialID1.equals(idAntal)) {
//                    String nuvarandeAntal = idb.fetchSingle("SELECT Antal FROM Antalvara WHERE MaterialID =" + materialID1);
//                    double nuvarandeAntalDouble = Double.parseDouble(nuvarandeAntal);
//                    double nyttAntal = nuvarandeAntalDouble - materialMangd1;
//                }
//            }
//
//            
//         
            // "Update Antalvara SET Antal ="++ " WHERE MaterialID= " +variableMaterialID
            //         + ("SELECT Antal FROM Antalvara WHERE MaterialID =" + variableMaterialID +
            // ") - +variabelmangdMaterial+
            //Uppdatera HattMaterial genom Arralisten MaterialLista
            
            JOptionPane.showMessageDialog(null, "Hatten har registrerats");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }


    }//GEN-LAST:event_btnRegistreraHattActionPerformed

    private void cbHattMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHattMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHattMaterialActionPerformed

    private void txtHattMangdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHattMangdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHattMangdActionPerformed

    private void btnValjMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjMaterialActionPerformed
        try {
            String ettMaterialNamn = cbHattMaterial.getSelectedItem().toString();
            String valdMangd = txtHattMangd.getText();
            double valdMangdDouble = Double.parseDouble(valdMangd);
            String ettMaterialIDString = idb.fetchSingle("select MaterialID from Material where Namn ='" + ettMaterialNamn + "'");
            int ettMaterialIDInt = Integer.parseInt(ettMaterialIDString);
            double ettMaterialIDDouble = Double.parseDouble(ettMaterialIDString);
            int ettInkopsPris = Integer.parseInt(idb.fetchSingle("select Inkopspris from bestallningsinnehall where Material =" + ettMaterialIDInt));
            double ettInkopsPrisDouble = ettInkopsPris;
            double enhetsPrisDouble = ettInkopsPrisDouble / Double.parseDouble(idb.fetchSingle("select Mangd from bestallningsinnehall where Material=" + ettMaterialIDInt));
            double materialPris = enhetsPrisDouble * Double.parseDouble(valdMangd);
            double materialPrisAvrundad = Math.round(materialPris);

            txtAreaMaterial.append(ettMaterialNamn + "   " + "Mängd: " + valdMangd + "   " + "Pris: " + materialPrisAvrundad + "\n");
            txtHattMangd.setText("");

            MaterialLista.add(ettMaterialIDDouble);
            MaterialLista.add(valdMangdDouble);
            MaterialLista.add(materialPrisAvrundad);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnValjMaterialActionPerformed

    private void hattBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hattBildActionPerformed

        new ValjBild().setVisible(true);

    }//GEN-LAST:event_hattBildActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraHatt;
    private javax.swing.JButton btnValjMaterial;
    private javax.swing.JComboBox<String> cbHattKategori;
    private javax.swing.JComboBox<String> cbHattMaterial;
    private javax.swing.JComboBox<String> cbValjPersonal;
    private javax.swing.JButton hattBild;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBestallningsID;
    private javax.swing.JLabel lblHattID;
    private javax.swing.JLabel lblHattIDPresentation;
    private javax.swing.JLabel lblHattKategorier;
    private javax.swing.JLabel lblHattSkapare;
    private javax.swing.JLabel lblHattStorlek;
    private javax.swing.JLabel lblMängdMaterial;
    private javax.swing.JLabel lblTillverkningstimmar;
    private javax.swing.JLabel lblValjMaterial;
    private javax.swing.JLabel lblValkomstText;
    private javax.swing.JLabel lblValtMaterial;
    private javax.swing.JTextArea txtAreaMaterial;
    private javax.swing.JTextField txtBestallning;
    private javax.swing.JTextField txtHattMangd;
    private javax.swing.JTextField txtHattStorlek;
    private javax.swing.JTextField txtTillverkningstimmar;
    // End of variables declaration//GEN-END:variables
}
