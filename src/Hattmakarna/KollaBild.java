
package Hattmakarna;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import java.sql.ResultSet;


public class KollaBild extends javax.swing.JFrame {

    private ImageIcon format=null;
    private String fname=null;
    int s=0;
    public byte[] pimage=null;
    Connection conn=null;
    private String hatten;
    
    public KollaBild(String hatten) {
        initComponents();
        this.hatten=hatten;
        this.setLocationRelativeTo(null);
        KollaBild.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        conn=KollaBild.DBConnect.connect();
        kollaPåBild();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class DBConnect {   
     public static Connection connect()
    {
     Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");                                
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hattmakare","hattuser","hattkey");   
        } 
            catch (Exception e) 
    {
        System.out.println("inter.DBConnect.connect()");
    }
   return con;
        } 
    }
    
    
    private void kollaPåBild(){
        
        try {
           String sql="SELECT `BildData` FROM `Hatt` WHERE HattID="+hatten;          
           PreparedStatement pst=conn.prepareStatement(sql);
           ResultSet rs=pst.executeQuery();
           if(rs.next())
           {          
               byte[] imagedata=rs.getBytes("BildData");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(jLabel1.getWidth(),        jLabel1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon image=new ImageIcon(img2);
               jLabel1.setIcon(image);
            } 
           else
           {
          
           }
        } catch (Exception e) {
           
        }   
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
