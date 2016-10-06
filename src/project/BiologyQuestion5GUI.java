/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x14428778
 */
public class BiologyQuestion5GUI extends javax.swing.JFrame {
    public String questionText5;
    private String answer5;
    private ArrayList<QuestionCode> aList;
    /**
     * Creates new form BiologyQuestion5
     */
    public BiologyQuestion5GUI() {
        initComponents();
        questionText5 = new String();
        answer5 = new String();
        aList = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Quiz = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        Biology = new javax.swing.JLabel();
        Question5 = new javax.swing.JLabel();
        AnswerTf = new javax.swing.JTextField();
        Next = new javax.swing.JButton();
        CtdInfo = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        SaveFile = new javax.swing.JButton();
        loadFile = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Quiz.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Quiz.setText("Quiz");
        getContentPane().add(Quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        Text.setText("Please answer the following Questions");
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 270, -1));

        Biology.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Biology.setText("Question 5 of 5");
        getContentPane().add(Biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, -1));

        Question5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Question5.setText(" What is the name of the process used by plants to convert sunlight into food?");
        getContentPane().add(Question5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 450, -1));

        AnswerTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerTfActionPerformed(evt);
            }
        });
        getContentPane().add(AnswerTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 310, -1));

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 100, 80));

        CtdInfo.setText("Please press add, and then display, to continue with the  Quiz press Next");
        getContentPane().add(CtdInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 440, 20));

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, 80));

        Display.setText("Display");
        Display.setMaximumSize(new java.awt.Dimension(83, 23));
        Display.setMinimumSize(new java.awt.Dimension(83, 23));
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 100, 80));

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 100, 80));

        SaveFile.setText("Save File");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        getContentPane().add(SaveFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        loadFile.setText("Load File");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileActionPerformed(evt);
            }
        });
        getContentPane().add(loadFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Bg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 530, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerTfActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        BiologySummaryGUI myBiologySummary = new BiologySummaryGUI();
        myBiologySummary.setVisible(true);
        dispose();
    }//GEN-LAST:event_NextActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        //sets text field to blank
        AnswerTf.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed

        // Loop through arraylist of question objects
        for(int i = 0; i < aList.size();i++){
            JOptionPane.showMessageDialog(null, "Question: "+aList.get(i).getQuestionText5()+"\n Answer: "+aList.get(i).getAnswer5());
        }
    }//GEN-LAST:event_DisplayActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
       questionText5 = Question5.getText();
       answer5 = AnswerTf.getText();
       
       //create a new QuestionCode
       QuestionCode q = new QuestionCode();
       
       //add Contents of textfields to q
       q.setQuestionText5(questionText5);
       q.setAnswer5(answer5);
       
       //add q to arrayList of QuestionCode Objects
       aList.add(q);
    
    }//GEN-LAST:event_AddBtnActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
        // TODO add your handling code here:
        //This allows the user to save anything entered to the text fields by saving it into a file called output.data in the project folder.
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        String questionText4, answer4;

        try {
            outFile = new File("outputQuiz.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(aList);

            JOptionPane.showMessageDialog(null, "File is written successfully");

            oStream.close();
            //If there is a problem saving the file the below message will be printed out to the user.
        } catch (IOException e) {
            System.out.println("Error writing to file" + e);

        }
    }//GEN-LAST:event_SaveFileActionPerformed

    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed
        // TODO add your handling code here:
        // This button allows the user to view any information they saved into the file output.data in the project folder.
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try{
            inFile = new File("outputQuiz.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            ArrayList <QuestionCode> aList;
            aList = (ArrayList<QuestionCode>)oStream.readObject();
            for(QuestionCode x:aList){
                JOptionPane.showMessageDialog(null, "Question: " + x.getQuestionText5()+ "   Answer: " + x.getAnswer5());
            }
            oStream.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);

        }
    }//GEN-LAST:event_loadFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AnswerTf;
    private javax.swing.JLabel Biology;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel CtdInfo;
    private javax.swing.JButton Display;
    private javax.swing.JButton Next;
    private javax.swing.JLabel Question5;
    private javax.swing.JLabel Quiz;
    private javax.swing.JButton SaveFile;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel background;
    private javax.swing.JButton loadFile;
    // End of variables declaration//GEN-END:variables
}
