package Frames;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author acxel
 */
public class VentanaDivisas extends javax.swing.JFrame {

    private String divisa1 = "";
    private String divisa2 = "";
    private String cantiad = "";
    private double dinero, cambio;
    private boolean punto = true;

    public VentanaDivisas() {
        initComponents();
        this.setSize(300, 450);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton2 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        etiquetaDivisa1 = new javax.swing.JLabel();
        etiquetaCambio1 = new javax.swing.JLabel();
        comboDivisas1 = new javax.swing.JComboBox<>();
        etiquetaDivisa2 = new javax.swing.JLabel();
        etiquetaCambio2 = new javax.swing.JLabel();
        comboDivisas2 = new javax.swing.JComboBox<>();
        btnC = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        calculadoraEstandar = new javax.swing.JMenuItem();
        conversorDivisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Divisas");

        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaDivisa1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaDivisa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiquetaDivisa1, gridBagConstraints);

        etiquetaCambio1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaCambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaCambio1, gridBagConstraints);

        comboDivisas1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "México - Peso Mexicano", "Europa - Euro" }));
        comboDivisas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas1, gridBagConstraints);

        etiquetaDivisa2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaDivisa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa2.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiquetaDivisa2, gridBagConstraints);

        etiquetaCambio2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaCambio2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaCambio2, gridBagConstraints);

        comboDivisas2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "México - Peso Mexicano", "Europa - Euro" }));
        comboDivisas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas2, gridBagConstraints);

        btnC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(btnC, gridBagConstraints);

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(btnBorrar, gridBagConstraints);

        btn7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn7, gridBagConstraints);

        btn8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn8, gridBagConstraints);

        btn9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn9, gridBagConstraints);

        btn4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn4, gridBagConstraints);

        btn5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn5, gridBagConstraints);

        btn6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn6, gridBagConstraints);

        btn1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn1, gridBagConstraints);

        btn2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn2, gridBagConstraints);

        btn3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btn3, gridBagConstraints);

        btnCero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnCero, gridBagConstraints);

        btnPunto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(btnPunto, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        calculadoraEstandar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        calculadoraEstandar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        calculadoraEstandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/calculadora.png"))); // NOI18N
        calculadoraEstandar.setText("Calculadora Estandar");
        calculadoraEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraEstandarActionPerformed(evt);
            }
        });
        menu.add(calculadoraEstandar);

        conversorDivisas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        conversorDivisas.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        conversorDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/divisas.png"))); // NOI18N
        conversorDivisas.setText("Conversor de Divisas");
        menu.add(conversorDivisas);
        menu.add(jSeparator1);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        salir.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salida.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void calculadoraEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraEstandarActionPerformed
        VentanaCalculadora c = new VentanaCalculadora();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_calculadoraEstandarActionPerformed

    private void comboDivisas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas1ActionPerformed
        divisa1 = (String) comboDivisas1.getSelectedItem();

        if (divisa1.equals("Estados Unidos - Dólar")) {
            etiquetaDivisa1.setText("$");
        }
        if (divisa1.equals("Europa - Euro")) {
            etiquetaDivisa1.setText("€");
        }
        if (divisa1.equals("México - Peso Mexicano")) {
            etiquetaDivisa1.setText("$");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboDivisas1ActionPerformed

    private void comboDivisas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas2ActionPerformed
        divisa2 = (String) comboDivisas2.getSelectedItem();

        if (divisa2.equals("Estados Unidos - Dólar")) {
            etiquetaDivisa2.setText("$");
        }
        if (divisa2.equals("Europa - Euro")) {
            etiquetaDivisa2.setText("€");
        }
        if (divisa2.equals("México - Peso Mexicano")) {
            etiquetaDivisa2.setText("$");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboDivisas2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "1";
        } else {
            cantiad += "1";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "2";
        } else {
            cantiad += "2";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "3";
        } else {
            cantiad += "3";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "4";
        } else {
            cantiad += "4";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "5";
        } else {
            cantiad += "5";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "6";
        } else {
            cantiad += "6";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "7";
        } else {
            cantiad += "7";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "8";
        } else {
            cantiad += "8";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (etiquetaCambio1.getText().equals("0")) {
            cantiad = "9";
        } else {
            cantiad += "9";
        }
        etiquetaCambio1.setText(cantiad);
        obtenerDinero();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        if (cantiad != "") {
            if (etiquetaCambio1.getText().equals("0")) {
                cantiad = "0";
            } else {
                cantiad += "0";
            }
            etiquetaCambio1.setText(cantiad);
            obtenerDinero();
        }
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (punto) {
            if (cantiad.equals("")) {
                cantiad = "0.";
            } else {
                cantiad += ".";
            }
            etiquetaCambio1.setText(cantiad);
            punto = false;
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int tamaño = cantiad.length();
        if (tamaño > 0) {
            if (tamaño == 1) {
                cantiad = "0";
            } else {
                cantiad = cantiad.substring(0, cantiad.length() - 1);
            }
            etiquetaCambio1.setText(cantiad);
            obtenerDinero();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        cantiad = "";
        punto = true;
        etiquetaCambio1.setText("");
        etiquetaCambio2.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void obtenerDinero() {
        cantiad = etiquetaCambio1.getText();
        dinero = Double.parseDouble(cantiad);
        cambioDivisas();
        dinero *= cambio;
        etiquetaCambio2.setText(String.format("%.2f", dinero));
    }

    private void cambioDivisas() {
        if (divisa1.equals(divisa2)) {
            cambio = 1;
        } else if (divisa1.equals("Estados Unidos - Dólar") && divisa2.equals("México - Peso Mexicano")) {
            cambio = 18.90;
        } else if (divisa1.equals("Estados Unidos - Dólar") && divisa2.equals("Europa - Euro")) {
            cambio = .86;
        } else if (divisa1.equals("México - Peso Mexicano") && divisa2.equals("Estados Unidos - Dólar")) {
            cambio = .053;
        } else if (divisa1.equals("México - Peso Mexicano") && divisa2.equals("Europa - Euro")) {
            cambio = .045;
        } else if (divisa1.equals("Europa - Euro") && divisa2.equals("Estados Unidos - Dólar")) {
            cambio = 1.16;
        } else if (divisa1.equals("Europa - Euro") && divisa2.equals("México - Peso Mexicano")) {
            cambio = 22.02;
        }
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            new VentanaDivisas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnPunto;
    private javax.swing.JMenuItem calculadoraEstandar;
    private javax.swing.JComboBox<String> comboDivisas1;
    private javax.swing.JComboBox<String> comboDivisas2;
    private javax.swing.JMenuItem conversorDivisas;
    private javax.swing.JLabel etiquetaCambio1;
    private javax.swing.JLabel etiquetaCambio2;
    private javax.swing.JLabel etiquetaDivisa1;
    private javax.swing.JLabel etiquetaDivisa2;
    private javax.swing.JButton jButton2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
