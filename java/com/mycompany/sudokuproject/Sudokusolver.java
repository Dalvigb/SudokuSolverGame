/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sudokuproject;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author subodh
 */
public class Sudokusolver extends javax.swing.JFrame {
    
    private String turn="1";
    
    private boolean globalflag=true;
    
    private String solvedBoard [][] ={
        {"5","6","8","2","4","7","9","1","3"},
        {"3","4","2","1","9","5","6","8","7"},
        {"1","9","7","8","6","3","2","5","4"},
        {"6","8","5","3","1","2","4","7","9"},
        {"7","3","4","9","5","8","1","6","2"},
        {"2","1","9","6","7","4","5","3","8"},
        {"9","2","6","7","8","1","3","4","5"},
        {"4","7","3","5","2","6","8","9","1"},
        {"8","5","1","4","3","9","7","2","6"}
    
    };
    
    private void assignTurn(JButton btn)
    {
        set1.setBackground(Color.black);
        set2.setBackground(Color.black);
        set3.setBackground(Color.black);
        set4.setBackground(Color.black);
        set5.setBackground(Color.black);
        set6.setBackground(Color.black);
        set7.setBackground(Color.black);
        set8.setBackground(Color.black);
        set9.setBackground(Color.black);
        
        btn.setBackground(blue);
    }
    
    private void resetgame(){
        JButton predefinedButtons []={R1C1,R1C3,R1C5,R1C8,R2C2,R2C5,R2C9,R3C3,R3C5,R3C7,R4C3,R4C4,R4C8,R5C2,R5C6,R5C7,R5C9,R6C1,R6C3,R6C7,R6C8,
        R7C1,R7C3,R7C4,R7C9,R8C2,R8C5,R8C7,R8C9,R9C1,R9C3,R9C6,R9C9};
         
        JButton btns [][]={
            {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
            {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
            {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
            {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
            {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
            {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
            {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
            {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
            {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9}
            
        };
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                boolean flag=true;
                for(int k=0;k<predefinedButtons.length;k++)
                {
                    if(btns[i][j]==predefinedButtons[k])
                    {
                        flag=false;
                    }
                }
                
                if(flag==true)
                {
                    btns[i][j].setText("");
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                }
            }
        }
    }
    private void seeSolution()
    {
        JButton predefinedButtons []={R1C1,R1C3,R1C5,R1C8,R2C2,R2C5,R2C9,R3C3,R3C5,R3C7,R4C3,R4C4,R4C8,R5C2,R5C6,R5C7,R5C9,R6C1,R6C3,R6C7,R6C8,
        R7C1,R7C3,R7C4,R7C9,R8C2,R8C5,R8C7,R8C9,R9C1,R9C3,R9C6,R9C9};
         
        JButton btns [][]={
            {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
            {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
            {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
            {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
            {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
            {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
            {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
            {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
            {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9}
            
        };
        if(globalflag== true)
        {
            globalflag=false;
            SOLUTION.setText("Hide Solution");
            for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                boolean flag=true;
                for(int k=0;k<predefinedButtons.length;k++)
                {
                    if(btns[i][j]==predefinedButtons[k])
                    {
                        flag=false;
                    }
                }
                
                if(flag==true)
                {
                    btns[i][j].setText(solvedBoard[i][j]);
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                }
            }
        }
            
        }
        else
        {
            SOLUTION.setText("SOLUTION");
            globalflag=true;
            resetgame();
        }
    }
    
    private void checkMoves()
    {
        JButton predefinedButtons []={R1C1,R1C3,R1C5,R1C8,R2C2,R2C5,R2C9,R3C3,R3C5,R3C7,R4C3,R4C4,R4C8,R5C2,R5C6,R5C7,R5C9,R6C1,R6C3,R6C7,R6C8,
        R7C1,R7C3,R7C4,R7C9,R8C2,R8C5,R8C7,R8C9,R9C1,R9C3,R9C6,R9C9};
        
        JButton btns [][]={
            {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
            {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
            {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
            {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
            {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
            {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
            {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
            {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
            {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9}  
        };
        if(globalflag==true){
            globalflag=false;
            CHECK.setText("Uncheck");
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(btns[i][j].getText()!=solvedBoard[i][j] && btns[i][j].getText()!="")
                {
                    btns[i][j].setBackground(red);
                    
                }
            }
        }
    }
        else
        {
            CHECK.setText("CHECK MOVES");
            globalflag=true;
             for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
             {
                 boolean flag=true;
                for(int k=0;k<predefinedButtons.length;k++)
                {
                    if(btns[i][j]==predefinedButtons[k])
                    {
                        flag=false;
                    }
                }
                
                if(flag==true)
                {
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                }
            
        }
        }
        }
    }

    /**
     * Creates new form Sudokusolver
     */
    public Sudokusolver() {
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

        panel1 = new javax.swing.JPanel();
        R1C2 = new javax.swing.JButton();
        R1C1 = new javax.swing.JButton();
        R1C3 = new javax.swing.JButton();
        R2C1 = new javax.swing.JButton();
        R2C2 = new javax.swing.JButton();
        R2C3 = new javax.swing.JButton();
        R3C1 = new javax.swing.JButton();
        R3C3 = new javax.swing.JButton();
        R3C2 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        R1C5 = new javax.swing.JButton();
        R1C4 = new javax.swing.JButton();
        R1C6 = new javax.swing.JButton();
        R2C4 = new javax.swing.JButton();
        R2C5 = new javax.swing.JButton();
        R2C6 = new javax.swing.JButton();
        R3C4 = new javax.swing.JButton();
        R3C6 = new javax.swing.JButton();
        R3C5 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        R1C8 = new javax.swing.JButton();
        R1C7 = new javax.swing.JButton();
        R1C9 = new javax.swing.JButton();
        R2C7 = new javax.swing.JButton();
        R2C8 = new javax.swing.JButton();
        R2C9 = new javax.swing.JButton();
        R3C7 = new javax.swing.JButton();
        R3C9 = new javax.swing.JButton();
        R3C8 = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        R4C2 = new javax.swing.JButton();
        R4C1 = new javax.swing.JButton();
        R4C3 = new javax.swing.JButton();
        R5C1 = new javax.swing.JButton();
        R5C2 = new javax.swing.JButton();
        R5C3 = new javax.swing.JButton();
        R6C1 = new javax.swing.JButton();
        R6C3 = new javax.swing.JButton();
        R6C2 = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        R4C5 = new javax.swing.JButton();
        R4C4 = new javax.swing.JButton();
        R4C6 = new javax.swing.JButton();
        R5C4 = new javax.swing.JButton();
        R5C5 = new javax.swing.JButton();
        R5C6 = new javax.swing.JButton();
        R6C4 = new javax.swing.JButton();
        R6C6 = new javax.swing.JButton();
        R6C5 = new javax.swing.JButton();
        panel6 = new javax.swing.JPanel();
        R4C8 = new javax.swing.JButton();
        R4C7 = new javax.swing.JButton();
        R4C9 = new javax.swing.JButton();
        R5C7 = new javax.swing.JButton();
        R5C8 = new javax.swing.JButton();
        R5C9 = new javax.swing.JButton();
        R6C7 = new javax.swing.JButton();
        R6C9 = new javax.swing.JButton();
        R6C8 = new javax.swing.JButton();
        panel9 = new javax.swing.JPanel();
        R7C8 = new javax.swing.JButton();
        R7C7 = new javax.swing.JButton();
        R7C9 = new javax.swing.JButton();
        R8C7 = new javax.swing.JButton();
        R8C8 = new javax.swing.JButton();
        R8C9 = new javax.swing.JButton();
        R9C7 = new javax.swing.JButton();
        R9C9 = new javax.swing.JButton();
        R9C8 = new javax.swing.JButton();
        panel7 = new javax.swing.JPanel();
        R7C2 = new javax.swing.JButton();
        R7C1 = new javax.swing.JButton();
        R7C3 = new javax.swing.JButton();
        R8C1 = new javax.swing.JButton();
        R8C2 = new javax.swing.JButton();
        R8C3 = new javax.swing.JButton();
        R9C1 = new javax.swing.JButton();
        R9C3 = new javax.swing.JButton();
        R9C2 = new javax.swing.JButton();
        panel8 = new javax.swing.JPanel();
        R7C5 = new javax.swing.JButton();
        R7C4 = new javax.swing.JButton();
        R7C6 = new javax.swing.JButton();
        R8C4 = new javax.swing.JButton();
        R8C5 = new javax.swing.JButton();
        R8C6 = new javax.swing.JButton();
        R9C4 = new javax.swing.JButton();
        R9C6 = new javax.swing.JButton();
        R9C5 = new javax.swing.JButton();
        set1 = new javax.swing.JButton();
        set3 = new javax.swing.JButton();
        set2 = new javax.swing.JButton();
        set4 = new javax.swing.JButton();
        set5 = new javax.swing.JButton();
        set6 = new javax.swing.JButton();
        set7 = new javax.swing.JButton();
        set8 = new javax.swing.JButton();
        set9 = new javax.swing.JButton();
        CHECK = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        SOLUTION = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setPreferredSize(new java.awt.Dimension(146, 149));

        R1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C2ActionPerformed(evt);
            }
        });

        R1C1.setBackground(new java.awt.Color(204, 204, 255));
        R1C1.setText("5");
        R1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C1ActionPerformed(evt);
            }
        });

        R1C3.setBackground(new java.awt.Color(204, 204, 255));
        R1C3.setText("8");
        R1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C3ActionPerformed(evt);
            }
        });

        R2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C1ActionPerformed(evt);
            }
        });

        R2C2.setBackground(new java.awt.Color(204, 204, 255));
        R2C2.setText("4");
        R2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C2ActionPerformed(evt);
            }
        });

        R2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C3ActionPerformed(evt);
            }
        });

        R3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C1ActionPerformed(evt);
            }
        });

        R3C3.setBackground(new java.awt.Color(204, 204, 255));
        R3C3.setText("7");
        R3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C3ActionPerformed(evt);
            }
        });

        R3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        R1C1.getAccessibleContext().setAccessibleName("00");

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setPreferredSize(new java.awt.Dimension(146, 149));

        R1C5.setBackground(new java.awt.Color(204, 204, 255));
        R1C5.setText("4");
        R1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C5ActionPerformed(evt);
            }
        });

        R1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C4ActionPerformed(evt);
            }
        });

        R1C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C6ActionPerformed(evt);
            }
        });

        R2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C4ActionPerformed(evt);
            }
        });

        R2C5.setBackground(new java.awt.Color(204, 204, 255));
        R2C5.setText("9");
        R2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C5ActionPerformed(evt);
            }
        });

        R2C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C6ActionPerformed(evt);
            }
        });

        R3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C4ActionPerformed(evt);
            }
        });

        R3C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C6ActionPerformed(evt);
            }
        });

        R3C5.setBackground(new java.awt.Color(204, 204, 255));
        R3C5.setText("6");
        R3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel3.setPreferredSize(new java.awt.Dimension(146, 149));

        R1C8.setBackground(new java.awt.Color(204, 204, 255));
        R1C8.setText("1");
        R1C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C8ActionPerformed(evt);
            }
        });

        R1C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C7ActionPerformed(evt);
            }
        });

        R1C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C9ActionPerformed(evt);
            }
        });

        R2C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C7ActionPerformed(evt);
            }
        });

        R2C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C8ActionPerformed(evt);
            }
        });

        R2C9.setBackground(new java.awt.Color(204, 204, 255));
        R2C9.setText("7");
        R2C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C9ActionPerformed(evt);
            }
        });

        R3C7.setBackground(new java.awt.Color(204, 204, 255));
        R3C7.setText("2");
        R3C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C7ActionPerformed(evt);
            }
        });

        R3C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C9ActionPerformed(evt);
            }
        });

        R3C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R2C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R3C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel4.setPreferredSize(new java.awt.Dimension(146, 149));

        R4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C2ActionPerformed(evt);
            }
        });

        R4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C1ActionPerformed(evt);
            }
        });

        R4C3.setBackground(new java.awt.Color(204, 204, 255));
        R4C3.setText("5");
        R4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C3ActionPerformed(evt);
            }
        });

        R5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C1ActionPerformed(evt);
            }
        });

        R5C2.setBackground(new java.awt.Color(204, 204, 255));
        R5C2.setText("3");
        R5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C2ActionPerformed(evt);
            }
        });

        R5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C3ActionPerformed(evt);
            }
        });

        R6C1.setBackground(new java.awt.Color(204, 204, 255));
        R6C1.setText("2");
        R6C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C1ActionPerformed(evt);
            }
        });

        R6C3.setBackground(new java.awt.Color(204, 204, 255));
        R6C3.setText("9");
        R6C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C3ActionPerformed(evt);
            }
        });

        R6C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel5.setPreferredSize(new java.awt.Dimension(146, 149));

        R4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C5ActionPerformed(evt);
            }
        });

        R4C4.setBackground(new java.awt.Color(204, 204, 255));
        R4C4.setText("3");
        R4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C4ActionPerformed(evt);
            }
        });

        R4C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C6ActionPerformed(evt);
            }
        });

        R5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C4ActionPerformed(evt);
            }
        });

        R5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C5ActionPerformed(evt);
            }
        });

        R5C6.setBackground(new java.awt.Color(204, 204, 255));
        R5C6.setText("8");
        R5C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C6ActionPerformed(evt);
            }
        });

        R6C4.setBackground(new java.awt.Color(204, 204, 255));
        R6C4.setText("6");
        R6C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C4ActionPerformed(evt);
            }
        });

        R6C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C6ActionPerformed(evt);
            }
        });

        R6C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel6.setPreferredSize(new java.awt.Dimension(146, 149));

        R4C8.setBackground(new java.awt.Color(204, 204, 255));
        R4C8.setText("7");
        R4C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C8ActionPerformed(evt);
            }
        });

        R4C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C7ActionPerformed(evt);
            }
        });

        R4C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C9ActionPerformed(evt);
            }
        });

        R5C7.setBackground(new java.awt.Color(204, 204, 255));
        R5C7.setText("1");
        R5C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C7ActionPerformed(evt);
            }
        });

        R5C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C8ActionPerformed(evt);
            }
        });

        R5C9.setBackground(new java.awt.Color(204, 204, 255));
        R5C9.setText("2");
        R5C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C9ActionPerformed(evt);
            }
        });

        R6C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C7ActionPerformed(evt);
            }
        });

        R6C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C9ActionPerformed(evt);
            }
        });

        R6C8.setBackground(new java.awt.Color(204, 204, 255));
        R6C8.setText("3");
        R6C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R4C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R5C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R6C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel9.setPreferredSize(new java.awt.Dimension(146, 149));

        R7C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C8ActionPerformed(evt);
            }
        });

        R7C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C7ActionPerformed(evt);
            }
        });

        R7C9.setBackground(new java.awt.Color(204, 204, 255));
        R7C9.setText("5");
        R7C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C9ActionPerformed(evt);
            }
        });

        R8C7.setBackground(new java.awt.Color(204, 204, 255));
        R8C7.setText("8");
        R8C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C7ActionPerformed(evt);
            }
        });

        R8C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C8ActionPerformed(evt);
            }
        });

        R8C9.setBackground(new java.awt.Color(204, 204, 255));
        R8C9.setText("1");
        R8C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C9ActionPerformed(evt);
            }
        });

        R9C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C7ActionPerformed(evt);
            }
        });

        R9C9.setBackground(new java.awt.Color(204, 204, 255));
        R9C9.setText("6");
        R9C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C9ActionPerformed(evt);
            }
        });

        R9C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R7C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R8C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(R9C7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R9C8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R9C9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel7.setPreferredSize(new java.awt.Dimension(146, 149));

        R7C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C2ActionPerformed(evt);
            }
        });

        R7C1.setBackground(new java.awt.Color(204, 204, 255));
        R7C1.setText("9");
        R7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C1ActionPerformed(evt);
            }
        });

        R7C3.setBackground(new java.awt.Color(204, 204, 255));
        R7C3.setText("6");
        R7C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C3ActionPerformed(evt);
            }
        });

        R8C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C1ActionPerformed(evt);
            }
        });

        R8C2.setBackground(new java.awt.Color(204, 204, 255));
        R8C2.setText("7");
        R8C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C2ActionPerformed(evt);
            }
        });

        R8C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C3ActionPerformed(evt);
            }
        });

        R9C1.setBackground(new java.awt.Color(204, 204, 255));
        R9C1.setText("8");
        R9C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C1ActionPerformed(evt);
            }
        });

        R9C3.setBackground(new java.awt.Color(204, 204, 255));
        R9C3.setText("1");
        R9C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C3ActionPerformed(evt);
            }
        });

        R9C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addComponent(R9C1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R9C2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R9C3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel8.setPreferredSize(new java.awt.Dimension(146, 149));

        R7C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C5ActionPerformed(evt);
            }
        });

        R7C4.setBackground(new java.awt.Color(204, 204, 255));
        R7C4.setText("7");
        R7C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C4ActionPerformed(evt);
            }
        });

        R7C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C6ActionPerformed(evt);
            }
        });

        R8C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C4ActionPerformed(evt);
            }
        });

        R8C5.setBackground(new java.awt.Color(204, 204, 255));
        R8C5.setText("2");
        R8C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C5ActionPerformed(evt);
            }
        });

        R8C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C6ActionPerformed(evt);
            }
        });

        R9C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C4ActionPerformed(evt);
            }
        });

        R9C6.setBackground(new java.awt.Color(204, 204, 255));
        R9C6.setText("9");
        R9C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C6ActionPerformed(evt);
            }
        });

        R9C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addComponent(R9C4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R9C5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R9C6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        set1.setBackground(new java.awt.Color(0, 51, 255));
        set1.setForeground(new java.awt.Color(242, 242, 242));
        set1.setText("1");
        set1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set1ActionPerformed(evt);
            }
        });

        set3.setBackground(new java.awt.Color(0, 0, 0));
        set3.setForeground(new java.awt.Color(242, 242, 242));
        set3.setText("3");
        set3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set3ActionPerformed(evt);
            }
        });

        set2.setBackground(new java.awt.Color(0, 0, 0));
        set2.setForeground(new java.awt.Color(242, 242, 242));
        set2.setText("2");
        set2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set2ActionPerformed(evt);
            }
        });

        set4.setBackground(new java.awt.Color(0, 0, 0));
        set4.setForeground(new java.awt.Color(242, 242, 242));
        set4.setText("4");
        set4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set4ActionPerformed(evt);
            }
        });

        set5.setBackground(new java.awt.Color(0, 0, 0));
        set5.setForeground(new java.awt.Color(242, 242, 242));
        set5.setText("5");
        set5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set5ActionPerformed(evt);
            }
        });

        set6.setBackground(new java.awt.Color(0, 0, 0));
        set6.setForeground(new java.awt.Color(242, 242, 242));
        set6.setText("6");
        set6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set6ActionPerformed(evt);
            }
        });

        set7.setBackground(new java.awt.Color(0, 0, 0));
        set7.setForeground(new java.awt.Color(242, 242, 242));
        set7.setText("7");
        set7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set7ActionPerformed(evt);
            }
        });

        set8.setBackground(new java.awt.Color(0, 0, 0));
        set8.setForeground(new java.awt.Color(242, 242, 242));
        set8.setText("8");
        set8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set8ActionPerformed(evt);
            }
        });

        set9.setBackground(new java.awt.Color(0, 0, 0));
        set9.setForeground(new java.awt.Color(242, 242, 242));
        set9.setText("9");
        set9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set9ActionPerformed(evt);
            }
        });

        CHECK.setBackground(new java.awt.Color(255, 255, 0));
        CHECK.setText("CHECK MOVES");
        CHECK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(0, 204, 0));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(0, 153, 0));
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        SOLUTION.setBackground(new java.awt.Color(153, 255, 51));
        SOLUTION.setText("SOLUTION");
        SOLUTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOLUTIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(set1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(set2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(set3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(set4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(set5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(set6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(set7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(set8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(set9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(SOLUTION, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(CHECK)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(set3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(set6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(set9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(set7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(set8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(set4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(set5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(set1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(set2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHECK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SOLUTION, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void R1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_R1C1ActionPerformed

    private void R1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C2ActionPerformed
        // TODO add your handling code here:
        R1C2.setText(turn);
        R1C2.setBackground(Color.WHITE);
    }//GEN-LAST:event_R1C2ActionPerformed

    private void R2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C2ActionPerformed

    private void R3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C3ActionPerformed

    private void R4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C2ActionPerformed
        // TODO add your handling code here:
        R4C2.setText(turn);
        R4C2.setBackground(Color.WHITE);
    }//GEN-LAST:event_R4C2ActionPerformed

    private void R4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C1ActionPerformed
        // TODO add your handling code here:
        R4C1.setText(turn);
        R4C1.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_R4C1ActionPerformed

    private void R5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C2ActionPerformed

    private void R6C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C3ActionPerformed

    private void R7C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C2ActionPerformed
        // TODO add your handling code here:
        R7C2.setText(turn);
        R7C2.setBackground(Color.WHITE);
    }//GEN-LAST:event_R7C2ActionPerformed

    private void R7C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C1ActionPerformed

    private void R8C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C2ActionPerformed

    private void R9C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C3ActionPerformed

    private void set7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set7ActionPerformed
        // TODO add your handling code here:
        assignTurn(set7);
        turn="7";
    }//GEN-LAST:event_set7ActionPerformed

    private void CHECKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKActionPerformed
        // TODO add your handling code here:
        checkMoves();
        
    }//GEN-LAST:event_CHECKActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm Exit ?","Sudoku Puzzle"
                ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void SOLUTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOLUTIONActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_SOLUTIONActionPerformed

    private void R9C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C9ActionPerformed

    private void R1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C4ActionPerformed
        // TODO add your handling code here:
        R1C4.setText(turn);
        R1C4.setBackground(Color.WHITE);
    }//GEN-LAST:event_R1C4ActionPerformed

    private void R1C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C6ActionPerformed
        // TODO add your handling code here:
        R1C6.setText(turn);
        R1C6.setBackground(Color.WHITE);
    }//GEN-LAST:event_R1C6ActionPerformed

    private void R1C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C7ActionPerformed
        // TODO add your handling code here:
        R1C7.setText(turn);
        R1C7.setBackground(Color.WHITE);
    }//GEN-LAST:event_R1C7ActionPerformed

    private void R1C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C9ActionPerformed
        // TODO add your handling code here:
        R1C9.setText(turn);
        R1C9.setBackground(Color.WHITE);
    }//GEN-LAST:event_R1C9ActionPerformed

    private void R2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C1ActionPerformed
        // TODO add your handling code here:
        R2C1.setText(turn);
        R2C1.setBackground(Color.WHITE);
    }//GEN-LAST:event_R2C1ActionPerformed

    private void R2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C3ActionPerformed
        // TODO add your handling code here:
        R2C3.setText(turn);
        R2C3.setBackground(Color.WHITE);
    }//GEN-LAST:event_R2C3ActionPerformed

    private void R2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C4ActionPerformed
        // TODO add your handling code here:
        R2C4.setText(turn);
        R2C4.setBackground(Color.WHITE);
    }//GEN-LAST:event_R2C4ActionPerformed

    private void R2C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C6ActionPerformed
        // TODO add your handling code here:
        R2C6.setText(turn);
        R2C6.setBackground(Color.WHITE);
    }//GEN-LAST:event_R2C6ActionPerformed

    private void R2C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C7ActionPerformed
        // TODO add your handling code here:
        R2C7.setText(turn);
        R2C7.setBackground(Color.WHITE);
    }//GEN-LAST:event_R2C7ActionPerformed

    private void R2C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C8ActionPerformed
        // TODO add your handling code here:
        R2C8.setText(turn);
        R2C8.setBackground(Color.WHITE);
    }//GEN-LAST:event_R2C8ActionPerformed

    private void R3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C1ActionPerformed
        // TODO add your handling code here:
        R3C1.setText(turn);
        R3C1.setBackground(Color.WHITE);
    }//GEN-LAST:event_R3C1ActionPerformed

    private void R3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C2ActionPerformed
        // TODO add your handling code here:
        R3C2.setText(turn);
        R3C2.setBackground(Color.WHITE);
    }//GEN-LAST:event_R3C2ActionPerformed

    private void R3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C4ActionPerformed
        // TODO add your handling code here:
        R3C4.setText(turn);
        R3C4.setBackground(Color.WHITE);
    }//GEN-LAST:event_R3C4ActionPerformed

    private void R3C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C6ActionPerformed
        // TODO add your handling code here:
        R3C6.setText(turn);
        R3C6.setBackground(Color.WHITE);
    }//GEN-LAST:event_R3C6ActionPerformed

    private void R3C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C8ActionPerformed
        // TODO add your handling code here:
        R3C8.setText(turn);
        R3C8.setBackground(Color.WHITE);
    }//GEN-LAST:event_R3C8ActionPerformed

    private void R3C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C9ActionPerformed
        // TODO add your handling code here:
        R3C9.setText(turn);
        R3C9.setBackground(Color.WHITE);
    }//GEN-LAST:event_R3C9ActionPerformed

    private void R4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C5ActionPerformed
        // TODO add your handling code here:
        R4C5.setText(turn);
        R4C5.setBackground(Color.WHITE);
    }//GEN-LAST:event_R4C5ActionPerformed

    private void R4C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C6ActionPerformed
        // TODO add your handling code here:
        R4C6.setText(turn);
        R4C6.setBackground(Color.WHITE);
    }//GEN-LAST:event_R4C6ActionPerformed

    private void R4C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C7ActionPerformed
        // TODO add your handling code here:
        R4C7.setText(turn);
        R4C7.setBackground(Color.WHITE);
    }//GEN-LAST:event_R4C7ActionPerformed

    private void R4C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C9ActionPerformed
        // TODO add your handling code here:
        R4C9.setText(turn);
        R4C9.setBackground(Color.WHITE);
    }//GEN-LAST:event_R4C9ActionPerformed

    private void R5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C1ActionPerformed
        // TODO add your handling code here:
        R5C1.setText(turn);
        R5C1.setBackground(Color.WHITE);
    }//GEN-LAST:event_R5C1ActionPerformed

    private void R5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C3ActionPerformed
        // TODO add your handling code here:
        R5C3.setText(turn);
        R5C3.setBackground(Color.WHITE);
    }//GEN-LAST:event_R5C3ActionPerformed

    private void R5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C4ActionPerformed
        // TODO add your handling code here:
         R5C4.setText(turn);
        R5C4.setBackground(Color.WHITE);
    }//GEN-LAST:event_R5C4ActionPerformed

    private void R5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C5ActionPerformed
        // TODO add your handling code here:
         R5C5.setText(turn);
        R5C5.setBackground(Color.WHITE);
    }//GEN-LAST:event_R5C5ActionPerformed

    private void R5C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C8ActionPerformed
        // TODO add your handling code here:
         R5C8.setText(turn);
        R5C8.setBackground(Color.WHITE);
    }//GEN-LAST:event_R5C8ActionPerformed

    private void R6C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C2ActionPerformed
        // TODO add your handling code here:
         R6C2.setText(turn);
        R6C2.setBackground(Color.WHITE);
    }//GEN-LAST:event_R6C2ActionPerformed

    private void R6C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C5ActionPerformed
        // TODO add your handling code here:
        R6C5.setText(turn);
        R6C5.setBackground(Color.WHITE);
    }//GEN-LAST:event_R6C5ActionPerformed

    private void R6C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C6ActionPerformed
        // TODO add your handling code here:
        R6C6.setText(turn);
        R6C6.setBackground(Color.WHITE);
    }//GEN-LAST:event_R6C6ActionPerformed

    private void R6C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C7ActionPerformed
        // TODO add your handling code here:
        R6C7.setText(turn);
        R6C7.setBackground(Color.WHITE);
    }//GEN-LAST:event_R6C7ActionPerformed

    private void R6C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C9ActionPerformed
        // TODO add your handling code here:
        R6C9.setText(turn);
        R6C9.setBackground(Color.WHITE);
    }//GEN-LAST:event_R6C9ActionPerformed

    private void R7C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C5ActionPerformed
        // TODO add your handling code here:
        R7C5.setText(turn);
        R7C5.setBackground(Color.WHITE);
    }//GEN-LAST:event_R7C5ActionPerformed

    private void R7C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C6ActionPerformed
        // TODO add your handling code here:
        R7C6.setText(turn);
        R7C6.setBackground(Color.WHITE);
    }//GEN-LAST:event_R7C6ActionPerformed

    private void R7C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C7ActionPerformed
        // TODO add your handling code here:
        R7C7.setText(turn);
        R7C7.setBackground(Color.WHITE);
    }//GEN-LAST:event_R7C7ActionPerformed

    private void R7C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C8ActionPerformed
        // TODO add your handling code here:
        R7C8.setText(turn);
        R7C8.setBackground(Color.WHITE);
    }//GEN-LAST:event_R7C8ActionPerformed

    private void R8C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C1ActionPerformed
        // TODO add your handling code here:
        R8C1.setText(turn);
        R8C1.setBackground(Color.WHITE);
    }//GEN-LAST:event_R8C1ActionPerformed

    private void R8C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C3ActionPerformed
        // TODO add your handling code here:
        R8C3.setText(turn);
        R8C3.setBackground(Color.WHITE);
    }//GEN-LAST:event_R8C3ActionPerformed

    private void R8C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C4ActionPerformed
        // TODO add your handling code here:
        R8C4.setText(turn);
        R8C4.setBackground(Color.WHITE);
    }//GEN-LAST:event_R8C4ActionPerformed

    private void R8C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C6ActionPerformed
        // TODO add your handling code here:
        R8C6.setText(turn);
        R8C6.setBackground(Color.WHITE);
    }//GEN-LAST:event_R8C6ActionPerformed

    private void R8C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C8ActionPerformed
        // TODO add your handling code here:
        R8C8.setText(turn);
        R8C8.setBackground(Color.WHITE);
    }//GEN-LAST:event_R8C8ActionPerformed

    private void R9C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C2ActionPerformed
        // TODO add your handling code here:
        R9C2.setText(turn);
        R9C2.setBackground(Color.WHITE);
    }//GEN-LAST:event_R9C2ActionPerformed

    private void R9C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C4ActionPerformed
        // TODO add your handling code here:
        R9C4.setText(turn);
        R9C4.setBackground(Color.WHITE);
    }//GEN-LAST:event_R9C4ActionPerformed

    private void R9C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C7ActionPerformed
        // TODO add your handling code here:
        R9C7.setText(turn);
        R9C7.setBackground(Color.WHITE);
    }//GEN-LAST:event_R9C7ActionPerformed

    private void R9C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C8ActionPerformed
        // TODO add your handling code here:
        R9C8.setText(turn);
        R9C8.setBackground(Color.WHITE);
    }//GEN-LAST:event_R9C8ActionPerformed

    private void R9C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C5ActionPerformed
        // TODO add your handling code here:
        R9C5.setText(turn);
        R9C5.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_R9C5ActionPerformed

    private void R1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C3ActionPerformed

    private void R1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C5ActionPerformed

    private void R1C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C8ActionPerformed

    private void R2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C5ActionPerformed

    private void R2C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C9ActionPerformed

    private void R3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C5ActionPerformed

    private void R3C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C7ActionPerformed

    private void R4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C3ActionPerformed

    private void R4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C4ActionPerformed

    private void R4C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C8ActionPerformed

    private void R5C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C6ActionPerformed

    private void R5C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C7ActionPerformed

    private void R5C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C9ActionPerformed

    private void R6C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C1ActionPerformed

    private void R6C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C4ActionPerformed

    private void R6C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C8ActionPerformed

    private void R7C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C3ActionPerformed

    private void R7C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C4ActionPerformed

    private void R7C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C9ActionPerformed

    private void R8C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C5ActionPerformed

    private void R8C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C7ActionPerformed

    private void R8C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C9ActionPerformed

    private void R9C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C1ActionPerformed

    private void R9C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "This Place Is Already Allocated", "messgae", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C6ActionPerformed

    private void set1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set1ActionPerformed
        // TODO add your handling code here:
        assignTurn(set1);
        turn="1";
    }//GEN-LAST:event_set1ActionPerformed

    private void set2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set2ActionPerformed
        // TODO add your handling code here:
        assignTurn(set2);
        turn="2";
    }//GEN-LAST:event_set2ActionPerformed

    private void set3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set3ActionPerformed
        // TODO add your handling code here:
        assignTurn(set3);
        turn="3";
    }//GEN-LAST:event_set3ActionPerformed

    private void set4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set4ActionPerformed
        // TODO add your handling code here:
        assignTurn(set4);
        turn="4";
    }//GEN-LAST:event_set4ActionPerformed

    private void set5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set5ActionPerformed
        // TODO add your handling code here:
        assignTurn(set5);
        turn="5";
    }//GEN-LAST:event_set5ActionPerformed

    private void set6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set6ActionPerformed
        // TODO add your handling code here:
        assignTurn(set6);
        turn="6";
    }//GEN-LAST:event_set6ActionPerformed

    private void set8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set8ActionPerformed
        // TODO add your handling code here:
        assignTurn(set8);
        turn="8";
    }//GEN-LAST:event_set8ActionPerformed

    private void set9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set9ActionPerformed
        // TODO add your handling code here:
        assignTurn(set9);
        turn="9";
    }//GEN-LAST:event_set9ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Reset");
        
        if(JOptionPane.showConfirmDialog(frame, " sure you want to reset the game ?"
                ,"sudoku puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            resetgame();
        }
    }//GEN-LAST:event_RESETActionPerformed

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
            java.util.logging.Logger.getLogger(Sudokusolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudokusolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudokusolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudokusolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudokusolver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECK;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton R1C1;
    private javax.swing.JButton R1C2;
    private javax.swing.JButton R1C3;
    private javax.swing.JButton R1C4;
    private javax.swing.JButton R1C5;
    private javax.swing.JButton R1C6;
    private javax.swing.JButton R1C7;
    private javax.swing.JButton R1C8;
    private javax.swing.JButton R1C9;
    private javax.swing.JButton R2C1;
    private javax.swing.JButton R2C2;
    private javax.swing.JButton R2C3;
    private javax.swing.JButton R2C4;
    private javax.swing.JButton R2C5;
    private javax.swing.JButton R2C6;
    private javax.swing.JButton R2C7;
    private javax.swing.JButton R2C8;
    private javax.swing.JButton R2C9;
    private javax.swing.JButton R3C1;
    private javax.swing.JButton R3C2;
    private javax.swing.JButton R3C3;
    private javax.swing.JButton R3C4;
    private javax.swing.JButton R3C5;
    private javax.swing.JButton R3C6;
    private javax.swing.JButton R3C7;
    private javax.swing.JButton R3C8;
    private javax.swing.JButton R3C9;
    private javax.swing.JButton R4C1;
    private javax.swing.JButton R4C2;
    private javax.swing.JButton R4C3;
    private javax.swing.JButton R4C4;
    private javax.swing.JButton R4C5;
    private javax.swing.JButton R4C6;
    private javax.swing.JButton R4C7;
    private javax.swing.JButton R4C8;
    private javax.swing.JButton R4C9;
    private javax.swing.JButton R5C1;
    private javax.swing.JButton R5C2;
    private javax.swing.JButton R5C3;
    private javax.swing.JButton R5C4;
    private javax.swing.JButton R5C5;
    private javax.swing.JButton R5C6;
    private javax.swing.JButton R5C7;
    private javax.swing.JButton R5C8;
    private javax.swing.JButton R5C9;
    private javax.swing.JButton R6C1;
    private javax.swing.JButton R6C2;
    private javax.swing.JButton R6C3;
    private javax.swing.JButton R6C4;
    private javax.swing.JButton R6C5;
    private javax.swing.JButton R6C6;
    private javax.swing.JButton R6C7;
    private javax.swing.JButton R6C8;
    private javax.swing.JButton R6C9;
    private javax.swing.JButton R7C1;
    private javax.swing.JButton R7C2;
    private javax.swing.JButton R7C3;
    private javax.swing.JButton R7C4;
    private javax.swing.JButton R7C5;
    private javax.swing.JButton R7C6;
    private javax.swing.JButton R7C7;
    private javax.swing.JButton R7C8;
    private javax.swing.JButton R7C9;
    private javax.swing.JButton R8C1;
    private javax.swing.JButton R8C2;
    private javax.swing.JButton R8C3;
    private javax.swing.JButton R8C4;
    private javax.swing.JButton R8C5;
    private javax.swing.JButton R8C6;
    private javax.swing.JButton R8C7;
    private javax.swing.JButton R8C8;
    private javax.swing.JButton R8C9;
    private javax.swing.JButton R9C1;
    private javax.swing.JButton R9C2;
    private javax.swing.JButton R9C3;
    private javax.swing.JButton R9C4;
    private javax.swing.JButton R9C5;
    private javax.swing.JButton R9C6;
    private javax.swing.JButton R9C7;
    private javax.swing.JButton R9C8;
    private javax.swing.JButton R9C9;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SOLUTION;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JButton set1;
    private javax.swing.JButton set2;
    private javax.swing.JButton set3;
    private javax.swing.JButton set4;
    private javax.swing.JButton set5;
    private javax.swing.JButton set6;
    private javax.swing.JButton set7;
    private javax.swing.JButton set8;
    private javax.swing.JButton set9;
    // End of variables declaration//GEN-END:variables
}
