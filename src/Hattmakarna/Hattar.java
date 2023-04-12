
package Hattmakarna;

import java.awt.Window;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import oru.inf.InfDB;
import oru.inf.InfException;


public class Hattar extends javax.swing.JFrame {

    private InfDB idb;
    private String valdHatt;
    DefaultTableModel model = new DefaultTableModel();
    

    
    public Hattar(InfDB idb, String valdHatt) {
        initComponents();
        this.idb = idb;
        this.valdHatt=valdHatt;
        this.setLocationRelativeTo(null);
        Hattar.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tabell.setModel(model);
        model.addColumn("Storlek");
        model.addColumn("Skapare");
        model.addColumn("Bild");
        addValues();
        tabell.setDefaultEditor(Object.class, null);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabell = new javax.swing.JTable();
        läggTillBeställning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        text.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        text.setText("Tillgängliga hattar");

        tabell.setRequestFocusEnabled(false);
        tabell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabell);

        läggTillBeställning.setText("Lägg till hatten i beställningen");
        läggTillBeställning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggTillBeställningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(läggTillBeställning, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(text))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(text)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(läggTillBeställning)
                .addContainerGap(28, Short.MAX_VALUE))
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

    
    private void läggTillBeställningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggTillBeställningActionPerformed
        
        int valdaHatten = tabell.getSelectedRow();
        if (valdaHatten != -1){
            
            String hatten = valdHatt+" "+(String)tabell.getValueAt(valdaHatten, 0);
               
            RegistreraBestallning beställning = getBeställningForm();
            String[] data = {hatten};
            beställning.populateList(data);
            dispose();
        }
        
    }//GEN-LAST:event_läggTillBeställningActionPerformed

    private void tabellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellMouseClicked
       
//        int index = tabell.getSelectedRow();
//        TableModel model = tabell.getModel();
//        try
//        {
//            if (index != -1){
//            
//            String hatt = (String)tabell.getValueAt(index, 0);
//            String hatten = idb.fetchSingle("select HattID from Hatt where Storlek="+hatt);
//            new KollaBild(hatten).setVisible(true);
//            
//        }
//
//            
//        }catch (InfException ettUndantag) {
//            
//            JOptionPane.showMessageDialog(null, "Databasfel!");
//            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
//            
//        }
//        
//        catch (Exception ettUndantag) {
//            
//            JOptionPane.showMessageDialog(null, "Något gick fel!");
//            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
//            
//        }
        
        
    }//GEN-LAST:event_tabellMouseClicked

    private RegistreraBestallning getBeställningForm(){
        
        RegistreraBestallning form = null;
        for (Window window : Window.getWindows()){
            if (window instanceof RegistreraBestallning){
                form = (RegistreraBestallning) window;
                break;
            }
            
        }
        return form;
    }
    
    private void addValues(){
        
        
        try
        {
            String hattar = "Select Namn AS 'Skapare', Storlek from Hatt join Personal P on Hatt.Skapare = P.PersonalID where Kategori='"+valdHatt+"'";
            ArrayList<HashMap<String, String>> allaHattar = idb.fetchRows(hattar); 
            
            for (HashMap<String, String> hatt : allaHattar){
                
                
                Object[] hattData = {
                    
                    hatt.get("Storlek"),
                    hatt.get("Namn"),                    
                };
                model.addRow(hattData);

            }

            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
        
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton läggTillBeställning;
    private javax.swing.JTable tabell;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
