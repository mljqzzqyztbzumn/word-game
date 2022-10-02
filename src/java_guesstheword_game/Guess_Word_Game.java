/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guesstheword_game;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author 1BestCsharp
 */
public class Guess_Word_Game extends javax.swing.JFrame {

    /**
     * Creates new form Guess_Word_Game
     */
    
    String[] words = {"driver","signature","history", "response","president","highway", 
                      "computer", "appartment", "forest", "chocolat", "lawyer"};
    int index = -1;
    
    Border panel_border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
    
    public Guess_Word_Game() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        jPanel1.setBorder(panel_border);
        
        displayWord();
        
        jButton_Next_.setEnabled(false);
    }
    
    
    // create a function to display the word
    public void displayWord()
    {
        // default text
        if(index == -1)
            // changed from 0 to -1, now it will accept all words from the starting
        {
            jLabel_Word.setText("--Word--");
            jTextField_Guess.setText("--Guess--");
        }
        else
        {
            // get random position
            int pos1 = (int) (Math.random() * words[index].length());
            int pos2 = (int) (Math.random() * words[index].length());
            int pos3 = (int) (Math.random() * words[index].length());
            
            // set '_' at random positions
            StringBuilder newtext = new StringBuilder(words[index]);
            newtext.setCharAt(pos1, '_');
            newtext.setCharAt(pos2, '_');
            newtext.setCharAt(pos3, '_');
            
            // set text to the jlabel
            jLabel_Word.setText(newtext.toString());
        }
    }
    
    // create a function to check if the user guessed the correct word
    public void checkWord()
    {
        // if the guess is correct
        if(jTextField_Guess.getText().equals(words[index]))
        {
            jLabel_Result.setText("Correct");
            jLabel_Result.setBackground(Color.green);
        }
        // if not
        else
        {
            jLabel_Result.setText("Wrong");
            jLabel_Result.setBackground(Color.red);
        }
        
        if(index == words.length - 1)
        {
            jButton_Next_.setEnabled(false);
            jButton_Start_.setEnabled(true);
        }
        jTextField_Guess.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Close_ = new javax.swing.JLabel();
        jLabel_Word = new javax.swing.JLabel();
        jTextField_Guess = new javax.swing.JTextField();
        jButton_Next_ = new javax.swing.JButton();
        jButton_Start_ = new javax.swing.JButton();
        jLabel_Result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel_Close_.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Close_.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_Close_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close_.setText("X");
        jLabel_Close_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Close_MouseClicked(evt);
            }
        });

        jLabel_Word.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Word.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_Word.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Word.setText("WORD");
        jLabel_Word.setOpaque(true);

        jTextField_Guess.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTextField_Guess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Guess.setText("GUESS");

        jButton_Next_.setBackground(new java.awt.Color(255, 102, 0));
        jButton_Next_.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_Next_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next_.setText("Next");
        jButton_Next_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_ActionPerformed(evt);
            }
        });

        jButton_Start_.setBackground(new java.awt.Color(0, 153, 204));
        jButton_Start_.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_Start_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Start_.setText("Start");
        jButton_Start_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Start_ActionPerformed(evt);
            }
        });

        jLabel_Result.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Result.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_Result.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Result.setText("Result");
        jLabel_Result.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Close_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Next_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Word, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Guess)
                    .addComponent(jButton_Start_, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jLabel_Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Close_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Guess, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton_Next_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Start_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
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

    private void jLabel_Close_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Close_MouseClicked
        // close the form
        System.exit(0);
    }//GEN-LAST:event_jLabel_Close_MouseClicked

    private void jButton_Start_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Start_ActionPerformed
        // start or restart the game
        index = 0;
        jTextField_Guess.setText("");
        jButton_Next_.setEnabled(true);
        jButton_Start_.setEnabled(false);
        jLabel_Result.setText("Result");
        jLabel_Result.setBackground(new java.awt.Color(102, 102, 102));
        displayWord(); 
    }//GEN-LAST:event_jButton_Start_ActionPerformed

    private void jButton_Next_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_ActionPerformed
        // check the word / display the next word
        checkWord();
        if(index < words.length - 1)
        {
           index++;
           displayWord(); 
        }
    }//GEN-LAST:event_jButton_Next_ActionPerformed

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
            java.util.logging.Logger.getLogger(Guess_Word_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guess_Word_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guess_Word_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guess_Word_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guess_Word_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Next_;
    private javax.swing.JButton jButton_Start_;
    private javax.swing.JLabel jLabel_Close_;
    private javax.swing.JLabel jLabel_Result;
    private javax.swing.JLabel jLabel_Word;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Guess;
    // End of variables declaration//GEN-END:variables
}
