/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Desktop;
import java.net.*; 

/**
 *
 * @author bdoor
 */
public class BiologyExamPaperGUI extends javax.swing.JFrame {

    /**
     * Creates new form BiologyExamPaper
     */
    public BiologyExamPaperGUI() {
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

        titleLbl = new javax.swing.JLabel();
        year14Btn = new javax.swing.JButton();
        year13Btn = new javax.swing.JButton();
        year12Btn = new javax.swing.JButton();
        yearLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 550));
        getContentPane().setLayout(null);

        titleLbl.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(102, 102, 102));
        titleLbl.setText("Biology Exam papers");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(80, 40, 363, 47);

        year14Btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        year14Btn.setForeground(new java.awt.Color(0, 153, 204));
        year14Btn.setText("2014");
        year14Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year14BtnActionPerformed(evt);
            }
        });
        getContentPane().add(year14Btn);
        year14Btn.setBounds(180, 200, 190, 50);

        year13Btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        year13Btn.setForeground(new java.awt.Color(0, 153, 204));
        year13Btn.setText("2013");
        year13Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year13BtnActionPerformed(evt);
            }
        });
        getContentPane().add(year13Btn);
        year13Btn.setBounds(180, 270, 190, 50);

        year12Btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        year12Btn.setForeground(new java.awt.Color(0, 153, 204));
        year12Btn.setText("2012");
        year12Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year12BtnActionPerformed(evt);
            }
        });
        getContentPane().add(year12Btn);
        year12Btn.setBounds(180, 350, 190, 50);

        yearLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yearLbl.setForeground(new java.awt.Color(102, 102, 102));
        yearLbl.setText("Choose Year:");
        getContentPane().add(yearLbl);
        yearLbl.setBounds(40, 140, 130, 22);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 153, 204));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(60, 453, 90, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Science.jpg"))); // NOI18N
        backgroundLbl.setText("jLabel1");
        getContentPane().add(backgroundLbl);
        backgroundLbl.setBounds(-270, -20, 780, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void year14BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year14BtnActionPerformed
        // TODO add your handling code here:
       try
        { 
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2014/LC025ALP000EV.pdf").toURI());
        
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_year14BtnActionPerformed

    private void year13BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year13BtnActionPerformed
        // TODO add your handling code here:
        try
        { 
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2013/LC025ALP000EV.pdf").toURI());
        
        }
        catch(Exception e){}
        
                              
    }//GEN-LAST:event_year13BtnActionPerformed

    private void year12BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year12BtnActionPerformed
       // TODO add your handling code here:
         try
        { 
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2012/LC025ALP000EV.pdf").toURI());
        
        }
        catch(Exception e){}
    }//GEN-LAST:event_year12BtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         SciGUI i = new SciGUI();
         i.setVisible(true);
          dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BiologyExamPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiologyExamPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiologyExamPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiologyExamPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiologyExamPaperGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton year12Btn;
    private javax.swing.JButton year13Btn;
    private javax.swing.JButton year14Btn;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration//GEN-END:variables
}
