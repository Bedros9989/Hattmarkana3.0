package Hattmakarna;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class InloggningsFonster extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;

    public InloggningsFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        InloggningsFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        personalID = new javax.swing.JTextField();
        textAnvändarnamn = new javax.swing.JLabel();
        textLösenord = new javax.swing.JLabel();
        lösenord = new javax.swing.JPasswordField();
        loggaIn = new javax.swing.JButton();
        titel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        personalID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        personalID.setForeground(new java.awt.Color(153, 153, 153));
        personalID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personalID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalIDActionPerformed(evt);
            }
        });

        textAnvändarnamn.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        textAnvändarnamn.setForeground(new java.awt.Color(51, 51, 51));
        textAnvändarnamn.setText("PersonalID");

        textLösenord.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        textLösenord.setForeground(new java.awt.Color(51, 51, 51));
        textLösenord.setText("Lösenord");

        lösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lösenord.setForeground(new java.awt.Color(153, 153, 153));
        lösenord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lösenord.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lösenordActionPerformed(evt);
            }
        });

        loggaIn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        loggaIn.setForeground(new java.awt.Color(51, 51, 51));
        loggaIn.setText("Logga in");
        loggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInActionPerformed(evt);
            }
        });

        titel.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        titel.setForeground(new java.awt.Color(51, 51, 51));
        titel.setText("Logga in!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(loggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titel)
                    .addComponent(textAnvändarnamn)
                    .addComponent(personalID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLösenord))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(titel)
                .addGap(18, 18, 18)
                .addComponent(textAnvändarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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

    private void personalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalIDActionPerformed

    }//GEN-LAST:event_personalIDActionPerformed

    private void lösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lösenordActionPerformed

    }//GEN-LAST:event_lösenordActionPerformed

    private void loggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInActionPerformed

        if (ValideringsKlass.rutanÄrTom(personalID, textAnvändarnamn)){
            if (ValideringsKlass.rutanÄrTom(lösenord, textLösenord)){

                try
                {
                    String id = personalID.getText();
                    String losenord = lösenord.getText();

                    ArrayList<String> existerandePersonal = idb.fetchColumn("select PersonalID from personal");

                    if (!existerandePersonal.contains(id)){

                        JOptionPane.showMessageDialog(null, "Personal med denna ID existerar inte!");

                    }else{
                        String inloggMatcharDB = "Select Losenord from personal where PersonalID ='"+id+"'";
                        String svarLösen = idb.fetchSingle(inloggMatcharDB);
                         
                        if(losenord.equals(svarLösen)){
                            
                            ID = id;
                            new HuvudFonster(idb,ID).setVisible(true);
                            dispose();
                            
                        }
                         
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Fel Lösenord!");
                        }
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
        }
    }//GEN-LAST:event_loggaInActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loggaIn;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField personalID;
    private javax.swing.JLabel textAnvändarnamn;
    private javax.swing.JLabel textLösenord;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
