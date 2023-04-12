
package Hattmakarna;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import oru.inf.InfDB;
import oru.inf.InfException;

public class BestallningGenomford extends javax.swing.JFrame {

    private InfDB idb;
    private String orderNr;
    private String vikt;
    private String datum;
    private String mottagare;
    private String kund;
    
    public BestallningGenomford(InfDB idb, String orderNr,String vikt,String datum, String mottagare,String kund) {
        initComponents();
        this.idb = idb;
        this.orderNr=orderNr;
        this.vikt=vikt;
        this.datum=datum;
        this.mottagare=mottagare;
        this.kund=kund;
        this.setLocationRelativeTo(null);
        BestallningGenomford.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBVisaFraktsedel = new javax.swing.JButton();
        jLBeställning = new javax.swing.JLabel();
        skickaBekräftelse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jBVisaFraktsedel.setText("Visa fraktsedel");
        jBVisaFraktsedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisaFraktsedelActionPerformed(evt);
            }
        });

        jLBeställning.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLBeställning.setText("Beställning genomförd!");

        skickaBekräftelse.setText("Skicka Bekräftelse");
        skickaBekräftelse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skickaBekräftelseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLBeställning))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skickaBekräftelse, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBVisaFraktsedel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLBeställning)
                .addGap(31, 31, 31)
                .addComponent(jBVisaFraktsedel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skickaBekräftelse, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

    public static PDDocument createSamplePDF(String msg, String msg2, String msg3, String msg4, String msg5, String msg6, String msg7)throws IOException{
        
        PDDocument pDDocument = new PDDocument();
        PDPage pDPage = new PDPage();
        pDDocument.addPage(pDPage);
        PDPageContentStream cs = new PDPageContentStream(pDDocument,pDPage);
        cs.beginText();
        cs.setFont(PDType1Font.TIMES_BOLD, 20);
        cs.setNonStrokingColor(Color.black);
        cs.moveTextPositionByAmount(250, 750);
        cs.showText(msg);
        cs.newLineAtOffset(-70, -30);
        cs.newLine();
        cs.showText(msg2);
        cs.newLineAtOffset(-150, -80);
        cs.newLine();
        cs.showText(msg3);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg4);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg5);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg6);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg7);
        cs.endText();
        cs.close();
        return pDDocument;
    }
    
    public static void savenclose (PDDocument pdd,String destpath)throws IOException{
        
        pdd.save(new File(destpath));
        pdd.close();
        
    }
    
    public static void insertImage (String pdfPath, String imagePath)throws IOException{
        
       PDDocument pdd = PDDocument.load(new File(pdfPath));
       PDPage page = pdd.getPage(0);
       
       PDImageXObject pdImage = PDImageXObject.createFromFile("./Databasfiler/1.png", pdd);
       PDPageContentStream cs = new PDPageContentStream(pdd,page,PDPageContentStream.AppendMode.APPEND,false);
       cs.drawImage(pdImage,55,50,500,300);
       cs.close();
       savenclose(pdd,pdfPath);
        
    }
    
    private void jBVisaFraktsedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisaFraktsedelActionPerformed
        
        String text = "Fraktsedel";
        String text2= "Otto och Judiths hattar AB";
        String text3= "Ordernummer:"+orderNr;
        String text4= "Vikt:"+vikt;
        String text5= "Datum:"+datum;
        String text6= "Avsändare: Hattvägen 1, 70281, Örebro";
        String text7= "Mottagare:"+ mottagare;
       
        try {
       PDDocument pdd = createSamplePDF(text, text2, text3, text4, text5,text6,text7);
        savenclose (pdd,"./Databasfiler/hej.pdf");
        insertImage("./Databasfiler/hej.pdf","./Databasfiler/1.png");
        
        File file = new File("./Databasfiler/hej.pdf");
        if (file.exists()) {
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("File not found.");
        }

        
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_jBVisaFraktsedelActionPerformed

    private void skickaBekräftelseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skickaBekräftelseActionPerformed
        
        try {
            
            String email= idb.fetchSingle("select Email from Kund where KundID = "+kund);
            try {
            String subject = "Email subject";
            String body = "This is the email body text";
            URI emailUri = new URI("mailto", email, null, "subject=" + subject + "&body=" + body, null);
            Desktop.getDesktop().mail(emailUri);
            
            }catch (URISyntaxException | IOException ex) {
                 ex.printStackTrace();
            }
 
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        
        }
        
        
        
        
        


        
    }//GEN-LAST:event_skickaBekräftelseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVisaFraktsedel;
    private javax.swing.JLabel jLBeställning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton skickaBekräftelse;
    // End of variables declaration//GEN-END:variables
}
