/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dagmar Mpheio
 */
public class telaHome extends javax.swing.JFrame {

    /**
     * Creates new form telaHome
     */
    public telaHome() {
        initComponents();
        /*ocultar as labels*/
        lblPercFinancas.setVisible(false);
        lblPercPresencas.setVisible(false);
        lblPercSalvacoes.setVisible(false);
        lblTotalFinancas.setVisible(false);
        lblTotalPresencas.setVisible(false);
        lblTotalSalvacoes.setVisible(false);
        lblResultFinancas.setVisible(false);
        lblResultPresencas.setVisible(false);
        lblResultSalvacoes.setVisible(false);
        btnExportar.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerSemana = new javax.swing.JSpinner();
        jSpinnerDados1Presencas = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerDados2Presencas = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerDados1Financas = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerDados1Salvacoes = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerDados2Salvacoes = new javax.swing.JSpinner();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        lblResultados = new javax.swing.JLabel();
        lblTotalPresencas = new javax.swing.JLabel();
        lblTotalFinancas = new javax.swing.JLabel();
        lblTotalSalvacoes = new javax.swing.JLabel();
        lblResultPresencas = new javax.swing.JLabel();
        lblResultFinancas = new javax.swing.JLabel();
        lblResultSalvacoes = new javax.swing.JLabel();
        lblPercPresencas = new javax.swing.JLabel();
        lblPercFinancas = new javax.swing.JLabel();
        lblPercSalvacoes = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSpinnerDados2Financas = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do GF"));

        jLabel1.setText("Semana nº");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Presenças");

        jSpinnerSemana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerSemana.setModel(new javax.swing.SpinnerNumberModel(1, 1, 52, 1));

        jSpinnerDados1Presencas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerDados1Presencas.setModel(new javax.swing.SpinnerNumberModel());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Dados1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Dados2");

        jSpinnerDados2Presencas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerDados2Presencas.setModel(new javax.swing.SpinnerNumberModel());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Finanças");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Dados1");

        jSpinnerDados1Financas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerDados1Financas.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Dados2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Salvações");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Dados1");

        jSpinnerDados1Salvacoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerDados1Salvacoes.setModel(new javax.swing.SpinnerNumberModel());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Dados2");

        jSpinnerDados2Salvacoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerDados2Salvacoes.setModel(new javax.swing.SpinnerNumberModel());

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("Calcular Percentagem");
        jButton1.setToolTipText("calcular o resultado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        lblResultados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultados.setText("Resultados");

        lblTotalPresencas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalPresencas.setText("Total de Presenças:");
        lblTotalPresencas.setToolTipText("Presenças");

        lblTotalFinancas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalFinancas.setText("Total de Finanças:");
        lblTotalFinancas.setToolTipText("Finanças");

        lblTotalSalvacoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalSalvacoes.setText("Total de Salvações:");
        lblTotalSalvacoes.setToolTipText("Salvações");

        lblResultPresencas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultPresencas.setText("jLabel15");

        lblResultFinancas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultFinancas.setText("jLabel16");

        lblResultSalvacoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultSalvacoes.setText("jLabel17");

        lblPercPresencas.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblPercPresencas.setForeground(new java.awt.Color(0, 0, 204));
        lblPercPresencas.setText("jLabel18");

        lblPercFinancas.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblPercFinancas.setForeground(new java.awt.Color(0, 0, 204));
        lblPercFinancas.setText("jLabel19");

        lblPercSalvacoes.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblPercSalvacoes.setForeground(new java.awt.Color(0, 0, 204));
        lblPercSalvacoes.setText("jLabel20");

        btnExportar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(0, 51, 204));
        btnExportar.setText("Exportar Dados");
        btnExportar.setToolTipText("Exportar para txt");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setText("Limpar");
        jButton3.setToolTipText("Limpara campos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSpinnerDados2Financas.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jSpinnerDados1Presencas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSpinnerDados2Presencas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSpinnerDados1Financas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSpinnerDados2Financas, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jSpinnerDados1Salvacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinnerDados2Salvacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(69, 69, 69)
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinnerSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jSeparator4)
                    .addComponent(lblResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalFinancas)
                                    .addComponent(lblTotalSalvacoes))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblResultFinancas, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(lblResultSalvacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPercFinancas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPercSalvacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotalPresencas)
                                .addGap(18, 18, 18)
                                .addComponent(lblResultPresencas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPercPresencas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(btnExportar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinnerDados2Presencas)
                            .addComponent(jSpinnerDados1Presencas, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSpinnerDados2Financas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSpinnerDados1Financas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDados1Salvacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDados2Salvacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPresencas)
                    .addComponent(lblResultPresencas)
                    .addComponent(lblPercPresencas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalFinancas)
                    .addComponent(lblResultFinancas)
                    .addComponent(lblPercFinancas)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalSalvacoes)
                    .addComponent(lblResultSalvacoes)
                    .addComponent(lblPercSalvacoes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Ajuda");
        jMenu1.setToolTipText("");

        jMenuItem1.setText("Sobre");
        jMenuItem1.setToolTipText("informações do programa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int semana = (int) jSpinnerSemana.getValue();
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        /*presencas*/
        int prese1 = (int) jSpinnerDados1Presencas.getValue();
        int prese2 = (int) jSpinnerDados2Presencas.getValue();
        int totalPrese;//total de presencas
        float percPrese;//percentagem de totais de presencas

        /*calculos*/
        totalPrese = totalDados(prese1, prese2);
        percPrese = percentagemDados(totalPrese, 908);

        /*mostrar os resultados de presencas*/
        lblResultados.setText("Resultados da Semana Nº " + semana);
        lblTotalPresencas.setVisible(true);
        lblResultPresencas.setVisible(true);
        lblResultPresencas.setText("" + totalPrese);
        lblPercPresencas.setVisible(true);
        lblPercPresencas.setText("=> " + Math.round(percPrese) + " %");


        /*financas*/
        float finan1 = (float) jSpinnerDados1Financas.getValue();
        float finan2 = (float) jSpinnerDados2Financas.getValue();
        float totalFinan;
        float percFinan;

        /*calculos*/
        totalFinan = totalFinancas(finan1, finan2);
        percFinan = percentagemDados(totalFinan, 81000);

        /*mostrar os resultados de financas*/
        lblTotalFinancas.setVisible(true);
        lblResultFinancas.setVisible(true);
        lblResultFinancas.setText("" + df.format(totalFinan));//mostrar as financas com as 
        lblPercFinancas.setVisible(true);
        lblPercFinancas.setText("=> " + Math.round(percFinan) + " %");

        /*salvacoes*/
        int salv1 = (int) jSpinnerDados1Salvacoes.getValue();
        int salv2 = (int) jSpinnerDados2Salvacoes.getValue();
        int totalSalv;
        float percSalv;

        /*calculos*/
        totalSalv = totalDados(salv1, salv2);
        percSalv = percentagemDados(totalSalv, 12);

        /*mostrar os resultados de salvacoes*/
        lblTotalSalvacoes.setVisible(true);
        lblResultSalvacoes.setVisible(true);
        lblResultSalvacoes.setText("" + totalSalv);
        lblPercSalvacoes.setVisible(true);
        lblPercSalvacoes.setText("=> " + Math.round(percSalv) + " %");

        btnExportar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Criado por Dagmar Mpheio\nVersão:1.0\nCopyright 2020");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
        /*dados adicionais*/
        int totalPrese = totalDados((int) jSpinnerDados1Presencas.getValue(), (int) jSpinnerDados2Presencas.getValue());
        float percPrese = percentagemDados(totalPrese, 908);
        float totalFinan = totalFinancas((float) jSpinnerDados1Financas.getValue(), (float) jSpinnerDados2Financas.getValue());;
        float percFinan = percentagemDados(totalFinan, 81000);
        int totalSalv = totalDados((int) jSpinnerDados1Salvacoes.getValue(), (int) jSpinnerDados2Salvacoes.getValue());;
        float percSalv = percentagemDados(totalSalv, 12);
        DecimalFormat df = new DecimalFormat("#,###,###.00");

        /*DATA E HORA*/
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");

        /*ESCRITA DO ARQUIVO*/
        Path caminho = Paths.get("C:/Users/Dagmar Mpheio/Downloads/DadosGF/" + ano.format(data) + "/semana" + (int) jSpinnerSemana.getValue() + ".txt");//caminho do arquivo
        try {
            Files.createDirectories(caminho.getParent());//criar o directorio
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Charset utf8 = StandardCharsets.UTF_8;//aceitar acentos  e caracteres especiais
        try (BufferedWriter w = Files.newBufferedWriter(caminho, utf8)) {//escrever no arquivo
            w.write("\t\t\t\t\t\t***Dados da Semana Nº " + (int) jSpinnerSemana.getValue() + "***\n");
            w.write("Presenças: " + totalPrese + " ,equivalente a " + Math.round(percPrese) + " %\n");
            w.write("Finanças: " + df.format(totalFinan) + " ,equivalente a " + Math.round(percFinan) + " %\n");
            w.write("Salvações: " + totalSalv + " ,equivalente a " + Math.round(percSalv) + " %\n\n\n\n");
            w.write("DADOS PROCESSADOS PELO COMPUTADOR: " + sdf2.format(data) + " " + sdf.format(data) + "\n");
            w.write("Made By Dagmar de Matos Mpheio\nCopyright 2020");
            JOptionPane.showMessageDialog(rootPane, "Dados exportados: " + caminho);

            /*LIMPAR CAMPOS*/
                /*LABELS*/
            lblPercFinancas.setVisible(false);
            lblPercFinancas.setText("");
            lblPercPresencas.setVisible(false);
            lblPercPresencas.setText("");
            lblPercSalvacoes.setVisible(false);
            lblPercSalvacoes.setText("");
            lblTotalFinancas.setVisible(false);
            lblTotalFinancas.setText("");
            lblTotalPresencas.setVisible(false);
            lblTotalPresencas.setText("");
            lblTotalSalvacoes.setVisible(false);
            lblTotalSalvacoes.setText("");
            lblResultFinancas.setVisible(false);
            lblResultFinancas.setText("");
            lblResultPresencas.setVisible(false);
            lblResultPresencas.setText("");
            lblResultSalvacoes.setVisible(false);
            lblResultSalvacoes.setText("");
            lblResultados.setText("Resultados");

            /*botao exportar*/
            btnExportar.setVisible(false);

            /*jSpinners*/
            jSpinnerDados1Financas.setValue(0);
            jSpinnerDados2Financas.setValue(0);
            jSpinnerDados1Presencas.setValue(0);
            jSpinnerDados2Presencas.setValue(0);
            jSpinnerDados1Salvacoes.setValue(0);
            jSpinnerDados2Salvacoes.setValue(0);
            jSpinnerSemana.setValue(0);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        /*ABRIR ARQUIVOS*/
//        try (BufferedReader r = Files.newBufferedReader(caminho, utf8)) {
//            String linha = null;
//            while ((linha = r.readLine()) != null) {
//                JOptionPane.showMessageDialog(rootPane,linha);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        /*LIMPAR CAMPOS*/
 /*LABELS*/
        lblPercFinancas.setVisible(false);
        lblPercFinancas.setText("");
        lblPercPresencas.setVisible(false);
        lblPercPresencas.setText("");
        lblPercSalvacoes.setVisible(false);
        lblPercSalvacoes.setText("");
        lblTotalFinancas.setVisible(false);
        lblTotalFinancas.setText("");
        lblTotalPresencas.setVisible(false);
        lblTotalPresencas.setText("");
        lblTotalSalvacoes.setVisible(false);
        lblTotalSalvacoes.setText("");
        lblResultFinancas.setVisible(false);
        lblResultFinancas.setText("");
        lblResultPresencas.setVisible(false);
        lblResultPresencas.setText("");
        lblResultSalvacoes.setVisible(false);
        lblResultSalvacoes.setText("");
        lblResultados.setText("Resultados");

        /*botao exportar*/
        btnExportar.setVisible(false);

        /*jSpinners*/
        jSpinnerDados1Financas.setValue(0);
        jSpinnerDados2Financas.setValue(0);
        jSpinnerDados1Presencas.setValue(0);
        jSpinnerDados2Presencas.setValue(0);
        jSpinnerDados1Salvacoes.setValue(0);
        jSpinnerDados2Salvacoes.setValue(0);
        jSpinnerSemana.setValue(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaHome().setVisible(true);
            }
        });
    }

    /*retornar total de dados do gf*/
    public int totalDados(int dados1, int dados2) {
        int total = dados1 + dados2;
        return total;
    }

    /*retornar percentagem do total de dados do gf*/
    public float percentagemDados(float soma, int alvo) {
        float total = (soma / alvo) * 100;
        return total;
    }

    /*retornar total de financas do gf, por ser numero real*/
    public float totalFinancas(float dados1, float dados2) {
        float total = dados1 + dados2;
        return total;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinnerDados1Financas;
    private javax.swing.JSpinner jSpinnerDados1Presencas;
    private javax.swing.JSpinner jSpinnerDados1Salvacoes;
    private javax.swing.JSpinner jSpinnerDados2Financas;
    private javax.swing.JSpinner jSpinnerDados2Presencas;
    private javax.swing.JSpinner jSpinnerDados2Salvacoes;
    private javax.swing.JSpinner jSpinnerSemana;
    private javax.swing.JLabel lblPercFinancas;
    private javax.swing.JLabel lblPercPresencas;
    private javax.swing.JLabel lblPercSalvacoes;
    private javax.swing.JLabel lblResultFinancas;
    private javax.swing.JLabel lblResultPresencas;
    private javax.swing.JLabel lblResultSalvacoes;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTotalFinancas;
    private javax.swing.JLabel lblTotalPresencas;
    private javax.swing.JLabel lblTotalSalvacoes;
    // End of variables declaration//GEN-END:variables
}
