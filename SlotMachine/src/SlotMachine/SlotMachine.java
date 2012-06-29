package SlotMachine;

import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import  sun.audio.*;    //import the sun.audio package
import  java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SlotMachine extends javax.swing.JFrame {
    
    public int Credits = 0;
    

    public SlotMachine() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HelpPopup = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exitHelpButton = new javax.swing.JButton();
        ConfirmExit = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        ConfirmResumeButton = new javax.swing.JButton();
        ConfirmExitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Reel1 = new javax.swing.JTextField();
        Reel3 = new javax.swing.JTextField();
        Reel2 = new javax.swing.JTextField();
        AddCred = new javax.swing.JButton();
        Spin = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        SpinText = new javax.swing.JLabel();
        CredText = new javax.swing.JLabel();
        WinText = new javax.swing.JLabel();
        Win = new javax.swing.JTextField();
        SpinAva = new javax.swing.JTextField();
        CredAva = new javax.swing.JTextField();
        soundCheckbox = new javax.swing.JCheckBox();

        HelpPopup.setMinimumSize(new java.awt.Dimension(419, 400));

        jPanel2.setMinimumSize(new java.awt.Dimension(419, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(419, 400));

        jTextField1.setEditable(false);
        jTextField1.setText("This is where you learn the rules of the game");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("7-7-7");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("5-5-5");

        jTextField4.setEditable(false);
        jTextField4.setText("3-3-3");

        jTextField5.setEditable(false);
        jTextField5.setText("1-1-1");

        jTextField6.setEditable(false);
        jTextField6.setText("Use the 'Add Credit' button to place a bed. Press 'Spin' to spin start the machine");

        jTextField7.setEditable(false);
        jTextField7.setText("1:1");

        jTextField8.setEditable(false);
        jTextField8.setText("5:1");

        jTextField9.setEditable(false);
        jTextField9.setText("7:1");

        jTextField10.setEditable(false);
        jTextField10.setText("3:1");

        jLabel1.setText("Numbers Showing");

        jLabel2.setText("Payout Ratio");

        exitHelpButton.setText("Exit Help");
        exitHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitHelpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
            .addComponent(jTextField1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(exitHelpButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(exitHelpButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout HelpPopupLayout = new javax.swing.GroupLayout(HelpPopup.getContentPane());
        HelpPopup.getContentPane().setLayout(HelpPopupLayout);
        HelpPopupLayout.setHorizontalGroup(
            HelpPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HelpPopupLayout.setVerticalGroup(
            HelpPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ConfirmExit.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel3.setText("Are you sure?");

        ConfirmResumeButton.setText("Resume");
        ConfirmResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmResumeButtonActionPerformed(evt);
            }
        });

        ConfirmExitButton.setText("Exit");
        ConfirmExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConfirmExitLayout = new javax.swing.GroupLayout(ConfirmExit.getContentPane());
        ConfirmExit.getContentPane().setLayout(ConfirmExitLayout);
        ConfirmExitLayout.setHorizontalGroup(
            ConfirmExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmExitLayout.createSequentialGroup()
                .addGroup(ConfirmExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfirmExitLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel3))
                    .addGroup(ConfirmExitLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(ConfirmResumeButton)
                        .addGap(65, 65, 65)
                        .addComponent(ConfirmExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        ConfirmExitLayout.setVerticalGroup(
            ConfirmExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmExitLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ConfirmExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmResumeButton)
                    .addComponent(ConfirmExitButton))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Slot Machine"));

        Reel1.setEditable(false);
        Reel1.setFont(new java.awt.Font("Broadway", 1, 72)); // NOI18N
        Reel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Reel1.setText("7");
        Reel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Reel1.setPreferredSize(new java.awt.Dimension(60, 20));

        Reel3.setEditable(false);
        Reel3.setFont(new java.awt.Font("Broadway", 1, 72)); // NOI18N
        Reel3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Reel3.setText("7");
        Reel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Reel3.setPreferredSize(new java.awt.Dimension(60, 20));

        Reel2.setEditable(false);
        Reel2.setFont(new java.awt.Font("Broadway", 1, 72)); // NOI18N
        Reel2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Reel2.setText("7");
        Reel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Reel2.setPreferredSize(new java.awt.Dimension(60, 20));

        AddCred.setText("Add Credits");
        AddCred.setInheritsPopupMenu(true);
        AddCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCredActionPerformed(evt);
            }
        });

        Spin.setText("SPIN!");
        Spin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpinActionPerformed(evt);
            }
        });

        Help.setText("Help");
        Help.setInheritsPopupMenu(true);
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        SpinText.setText("Avaliable Spins:");

        CredText.setText("Avaliable Credits:");

        WinText.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        WinText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WinText.setText("You Won:");

        Win.setBackground(new java.awt.Color(255, 204, 51));
        Win.setEditable(false);
        Win.setFont(new java.awt.Font("BankGothic Lt BT", 0, 48)); // NOI18N
        Win.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Win.setText("0");

        SpinAva.setEditable(false);
        SpinAva.setText("0");
        SpinAva.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CredAva.setEditable(false);
        CredAva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CredAva.setText("0");
        CredAva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CredAva.setFocusable(false);

        soundCheckbox.setText("Toggle Sound");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Reel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddCred, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CredAva, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CredText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(WinText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Reel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Win, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Reel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SpinText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinAva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(soundCheckbox)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(Spin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinText)
                    .addComponent(SpinAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Spin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WinText)
                    .addComponent(AddCred)
                    .addComponent(Help))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Win, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CredText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CredAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Exit)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpinActionPerformed
        // TODO add your handling code here:
        // Random number generator that gives a 7,5,3, or 1.
        // Create array[3] from Rand()
        // If all numbers are the same
        // Winnings = Retrieve credits bet, multiply by a case?
        // For now we can multiply by array[0]
        
        // Add winnings to current amount available
        Win.setText("0");
        Random generator = new Random();
        int[] spinGenerator = new int[3];
        int oddNumber;
        int i = 0;
        
        int creds = Integer.parseInt(CredAva.getText());
        if (creds >= 1)
        { 
            creds--;
            CredAva.setText(String.valueOf(creds));
            SpinAva.setText(String.valueOf(creds));
            
            while(i<=2)
            {
                oddNumber = generator.nextInt(9);
                if (oddNumber % 2 != 0)
                {
                    switch(i){
                            case 0:
                                Reel1.setText(String.valueOf(oddNumber));
                                break;
                            case 1:
                                Reel2.setText(String.valueOf(oddNumber));
                                break;
                            case 2:
                                Reel3.setText(String.valueOf(oddNumber));
                                break;
                            default:
                                break;
                    }
                    spinGenerator[i] = oddNumber;
                    i++;
                }
            }
            
            if(spinGenerator[0] == spinGenerator[1]
            && spinGenerator[0] == spinGenerator[2]
            && spinGenerator[1] == spinGenerator[2])
            {
                int win = spinGenerator[0];
                int current = Integer.parseInt(CredAva.getText());
                int last = win + current;
                Win.setText(String.valueOf(win));
                CredAva.setText(String.valueOf(last));
                SpinAva.setText(String.valueOf(last));
                
                if(soundCheckbox.isSelected())
                {
                    URL soundByte = null;
                    try {
                        soundByte = new URL("http://www.shockwave-sound.com/sound-effects/slot-machine-sounds/slot54.wav");
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(SlotMachine.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AudioStream as = null;
                    try {
                        as = new AudioStream (soundByte.openStream());
                    } catch (IOException ex) {
                        Logger.getLogger(SlotMachine.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AudioPlayer.player.start(as);
                }
            }
        }
        else
            JOptionPane.showMessageDialog(null, "You have run out of credits. Please add more to continue playing.", "Insufficient Credits", JOptionPane.ERROR_MESSAGE);
        
        
        
        //Compare numbers in the array;
        /*if(spinGenerator[0] != spinGenerator[1]
        || spinGenerator[0] != spinGenerator[2]
        || spinGenerator[1] != spinGenerator[2])
        {
            System.out.printf("Not a winner");
        }
        else
        {
            System.out.printf("Winner!");
        }*/
    }//GEN-LAST:event_SpinActionPerformed

    private void AddCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCredActionPerformed
        // TODO add your handling code here:
        String CredAvaText = CredAva.getText();
        int creds = Integer.parseInt(CredAvaText);
        
        JTextField AddCred = new JTextField();
        final JComponent[] inputs = new JComponent[] {
            new JLabel("Enter Amount: "),
            AddCred
        };
        JOptionPane.showMessageDialog(null, inputs, "Add Credits", JOptionPane.PLAIN_MESSAGE);
        int add = Integer.parseInt(AddCred.getText());
        int newValue = add + creds;
        CredAva.setText(String.valueOf(newValue));
        SpinAva.setText(CredAva.getText());
    }//GEN-LAST:event_AddCredActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void exitHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitHelpButtonActionPerformed
        HelpPopup.dispose();
    }//GEN-LAST:event_exitHelpButtonActionPerformed

    private void ConfirmResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmResumeButtonActionPerformed
        ConfirmExit.dispose();
    }//GEN-LAST:event_ConfirmResumeButtonActionPerformed

    private void ConfirmExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmExitButtonActionPerformed
        JOptionPane.showMessageDialog(null, "You have won: " + CredAva.getText() + " credits", "BYE!", JOptionPane.PLAIN_MESSAGE);
        this.dispose();
        ConfirmExit.dispose();
    }//GEN-LAST:event_ConfirmExitButtonActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        // TODO add your handling code here:
        HelpPopup.setVisible(true);
    }//GEN-LAST:event_HelpActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        ConfirmExit.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SlotMachine().setVisible(true);
            }
        });      
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCred;
    private javax.swing.JDialog ConfirmExit;
    private javax.swing.JButton ConfirmExitButton;
    private javax.swing.JButton ConfirmResumeButton;
    private javax.swing.JTextField CredAva;
    private javax.swing.JLabel CredText;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Help;
    private javax.swing.JDialog HelpPopup;
    private javax.swing.JTextField Reel1;
    private javax.swing.JTextField Reel2;
    private javax.swing.JTextField Reel3;
    private javax.swing.JButton Spin;
    private javax.swing.JTextField SpinAva;
    private javax.swing.JLabel SpinText;
    private javax.swing.JTextField Win;
    private javax.swing.JLabel WinText;
    private javax.swing.JButton exitHelpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JCheckBox soundCheckbox;
    // End of variables declaration//GEN-END:variables
}
