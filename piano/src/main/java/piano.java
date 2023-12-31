
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gopi
 */
public class piano extends javax.swing.JFrame {

    /**
     * Creates new form piano
     */
    public piano() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        E = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        A = new javax.swing.JButton();
        G = new javax.swing.JButton();
        F = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        Fsharp = new javax.swing.JButton();
        Gsharp = new javax.swing.JButton();
        Bb = new javax.swing.JButton();
        Csharp1 = new javax.swing.JButton();
        Dsharp1 = new javax.swing.JButton();
        Csharp = new javax.swing.JButton();
        Dsharp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.desktop);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("virtual piano");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        E.setText("E");
        E.setActionCommand("");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        C.setText("C");
        C.setActionCommand("");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setText("D");
        D.setActionCommand("");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        A.setText("A");
        A.setActionCommand("");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        G.setText("G");
        G.setActionCommand("");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        F.setText("F");
        F.setActionCommand("");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        B.setText("B");
        B.setActionCommand("");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C1.setText("C1");
        C1.setActionCommand("");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        E1.setText("E1");
        E1.setActionCommand("");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        D1.setText("D1");
        D1.setActionCommand("");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        F1.setText("F1");
        F1.setActionCommand("");
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        Fsharp.setBackground(new java.awt.Color(0, 0, 0));
        Fsharp.setForeground(new java.awt.Color(255, 255, 255));
        Fsharp.setText("F#");
        Fsharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FsharpActionPerformed(evt);
            }
        });

        Gsharp.setBackground(new java.awt.Color(0, 0, 0));
        Gsharp.setForeground(new java.awt.Color(255, 255, 255));
        Gsharp.setText("G#");
        Gsharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GsharpActionPerformed(evt);
            }
        });

        Bb.setBackground(new java.awt.Color(0, 0, 0));
        Bb.setForeground(new java.awt.Color(255, 255, 255));
        Bb.setText("Bb");
        Bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbActionPerformed(evt);
            }
        });

        Csharp1.setBackground(new java.awt.Color(0, 0, 0));
        Csharp1.setForeground(new java.awt.Color(255, 255, 255));
        Csharp1.setText("C#1");
        Csharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Csharp1ActionPerformed(evt);
            }
        });

        Dsharp1.setBackground(new java.awt.Color(0, 0, 0));
        Dsharp1.setForeground(new java.awt.Color(255, 255, 255));
        Dsharp1.setText("D#1");
        Dsharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dsharp1ActionPerformed(evt);
            }
        });

        Csharp.setBackground(new java.awt.Color(0, 0, 0));
        Csharp.setForeground(new java.awt.Color(255, 255, 255));
        Csharp.setText("C#");
        Csharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsharpActionPerformed(evt);
            }
        });

        Dsharp.setBackground(new java.awt.Color(0, 0, 0));
        Dsharp.setForeground(new java.awt.Color(255, 255, 255));
        Dsharp.setText("D#");
        Dsharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsharpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Csharp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Gsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(Csharp1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dsharp1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Csharp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dsharp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Csharp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dsharp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fsharp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gsharp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\G.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_GActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\E.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }        // TODO add your handling code here:
    }//GEN-LAST:event_EActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\C.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }//GEN-LAST:event_CActionPerformed
    }
    private void FsharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FsharpActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\F_s.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_FsharpActionPerformed

    private void CsharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsharpActionPerformed
 try{
String path="E:\\netbeen projects\\piano\\piano audio\\C_s.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_CsharpActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\D.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_DActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\F.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_FActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
 try{
String path="E:\\netbeen projects\\piano\\piano audio\\A.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
 try{
String path="E:\\netbeen projects\\piano\\piano audio\\B.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_BActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
 try{
String path="E:\\netbeen projects\\piano\\piano audio\\C1.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\D1.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_D1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\E1.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_E1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\F1.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_F1ActionPerformed

    private void DsharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsharpActionPerformed
 try{
String path="E:\\netbeen projects\\piano\\piano audio\\D_s.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_DsharpActionPerformed

    private void GsharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GsharpActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\G_s.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_GsharpActionPerformed

    private void BbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\Bb.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_BbActionPerformed

    private void Csharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Csharp1ActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\C_s1.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_Csharp1ActionPerformed

    private void Dsharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dsharp1ActionPerformed
try{
String path="E:\\netbeen projects\\piano\\piano audio\\D_s1.wav";
AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
Clip player=AudioSystem.getClip();
player.open(audio);
player.start();
}catch(Exception e){
    }
    }//GEN-LAST:event_Dsharp1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new piano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton Bb;
    private javax.swing.JButton C;
    private javax.swing.JButton C1;
    private javax.swing.JButton Csharp;
    private javax.swing.JButton Csharp1;
    private javax.swing.JButton D;
    private javax.swing.JButton D1;
    private javax.swing.JButton Dsharp;
    private javax.swing.JButton Dsharp1;
    private javax.swing.JButton E;
    private javax.swing.JButton E1;
    private javax.swing.JButton F;
    private javax.swing.JButton F1;
    private javax.swing.JButton Fsharp;
    private javax.swing.JButton G;
    private javax.swing.JButton Gsharp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
