/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.Categoria_DAO;
import DAO.Jugador_DAO;
import DAO.Pregunta_DAO;
import DAO.Premio_DAO;
import DAO.Ronda_DAO;
import Entity.Jugador;
import Entity.Opcion;
import Entity.Pregunta;
import Entity.Premio;
import Entity.Ronda;
import java.util.Enumeration;
import java.util.Random;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Game extends javax.swing.JFrame {

    private Jugador jugador_actual;
    private Ronda ronda_actual;
    private Premio premio_actual;
    private String dificultad_actual;
    Categoria_DAO cdao = new Categoria_DAO();
    Pregunta_DAO pdao = new Pregunta_DAO();
    Ronda_DAO rdao = new Ronda_DAO();
    Premio_DAO prdao = new Premio_DAO();
    private Pregunta pregunta;

    /**
     * Creates new form Game
     */
    public Game() {

        initComponents();
        this.setLocationRelativeTo(null);
        enabledG(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtIdJugador = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        txtOpcC = new javax.swing.JRadioButton();
        txtOpcA = new javax.swing.JRadioButton();
        txtOpcB = new javax.swing.JRadioButton();
        txtOpcD = new javax.swing.JRadioButton();
        summitBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblRonda = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPremio = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIdJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdJugadorActionPerformed(evt);
            }
        });
        txtIdJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdJugadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdJugadorKeyTyped(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        registerBtn.setText("Registrar");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Registro");

        jLabel4.setText("_______________________________________________________________");

        jLabel5.setText("Juego");

        jLabel6.setText("Jugador: ");

        buttonGroup1.add(txtOpcC);
        txtOpcC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcCActionPerformed(evt);
            }
        });

        buttonGroup1.add(txtOpcA);

        buttonGroup1.add(txtOpcB);

        buttonGroup1.add(txtOpcD);
        txtOpcD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcDActionPerformed(evt);
            }
        });

        summitBtn.setText("Siguiente");
        summitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summitBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Ronda");

        jLabel8.setText("Premio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPregunta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 113, Short.MAX_VALUE)
                                        .addComponent(txtIdJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombre))
                                .addGap(37, 37, 37)
                                .addComponent(registerBtn)))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOpcB)
                            .addComponent(txtOpcC)
                            .addComponent(txtOpcA)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblRonda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(135, 135, 135)
                                .addComponent(jLabel5)
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPremio))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNombre)))))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOpcD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(summitBtn)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(registerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(lblNombre)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRonda)
                    .addComponent(jLabel8)
                    .addComponent(lblPremio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCategoria)
                .addGap(18, 18, 18)
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtOpcA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOpcB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOpcC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOpcD)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(summitBtn)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdJugadorActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        if (validation()) {

            int resp = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de que desea registrar este jugador?", "Attention!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {

                Jugador_DAO jdao = new Jugador_DAO();
                jugador_actual = new Jugador(Integer.parseInt(txtIdJugador.getText()), txtNombre.getText());

                if (jdao.saveJugador(jugador_actual)) {

                    JOptionPane.showMessageDialog(rootPane, "Registro existoso !");
                    initGame();

                } else {

                    int resp2 = JOptionPane.showConfirmDialog(rootPane, "El jugador ya existe, ??desea continuar con este jugador?", "Attention!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (resp == JOptionPane.YES_OPTION) {
                        jugador_actual = jdao.getJugador(Integer.parseInt(txtIdJugador.getText()));
                        initGame();
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Rellena todos los campos !");
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void initGame() {

        disabledR();
        enabledG(true);
        lblNombre.setText(jugador_actual.getNombre());
        resetFields();
        ronda_actual = new Ronda(1, false, 1, jugador_actual.getId());
        premio_actual = new Premio(0, jugador_actual.getId());

        actualizarLabels();

    }

    private void actualizarLabels() {

        ronda_actual.setId_categoria(ronda_actual.getNum());
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(pdao.getPreguntas(ronda_actual.getId_categoria()).size());
        pregunta = pdao.getPreguntas(ronda_actual.getId_categoria()).get(index);
        lblRonda.setText("" + ronda_actual.getNum());
        lblPremio.setText("" + premio_actual.getCantidad());
        lblPregunta.setText(pregunta.getEnunciado());
        dificultad_actual = cdao.getCategoriaDificultad(ronda_actual.getNum());
        lblCategoria.setText(dificultad_actual);
        txtOpcA.setText(pregunta.getOpciones().get(0).getText());
        txtOpcB.setText(pregunta.getOpciones().get(1).getText());
        txtOpcC.setText(pregunta.getOpciones().get(2).getText());
        txtOpcD.setText(pregunta.getOpciones().get(3).getText());

    }

    private void resetFields() {

        txtIdJugador.setText("");
        txtNombre.setText("");

    }
    private void txtIdJugadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdJugadorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdJugadorKeyReleased

    private void txtIdJugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdJugadorKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if (Character.isLetter(character)) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "numbers only!");
        }
    }//GEN-LAST:event_txtIdJugadorKeyTyped

    private void txtOpcCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpcCActionPerformed

    private void txtOpcDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpcDActionPerformed

    private void summitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summitBtnActionPerformed
        // TODO add your handling code here:
        for (Opcion op : pregunta.getOpciones()) {

            if (op.getText().equals(getSelectedButtonText())) {

                if (op.isIsCorrect()) {

                    JOptionPane.showMessageDialog(rootPane, "Respuesta Correcta");
                    ronda_actual.setIsPassed(true);
                    rdao.saveRonda(ronda_actual);
                    premio_actual.setCantidad(premio_actual.getCantidad() + 10000);
                    if (ronda_actual.getNum() == 5) {

                        prdao.savePremio(premio_actual);
                        JOptionPane.showMessageDialog(rootPane, "Felicitaciones su premio es de: " + premio_actual.getCantidad());
                        Config config = new Config();
                        config.setVisible(true);
                        Game.this.dispose();
                    } else {

                        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea continuar?", "Attention!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (resp == JOptionPane.YES_OPTION) {
                            ronda_actual.setNum(ronda_actual.getNum() + 1);
                            actualizarLabels();

                        } else {
                            prdao.savePremio(premio_actual);
                            JOptionPane.showMessageDialog(rootPane, "Felicitaciones su premio es de: " + premio_actual.getCantidad());
                            Config config = new Config();
                            config.setVisible(true);
                            Game.this.dispose();
                        }
                    }
                } else {
                    ronda_actual.setIsPassed(false);
                    rdao.saveRonda(ronda_actual);
                    JOptionPane.showMessageDialog(rootPane, "Respuesta incorrecta");
                    Config config = new Config();
                    config.setVisible(true);
                    Game.this.dispose();

                }

                break;
            }

        }
    }//GEN-LAST:event_summitBtnActionPerformed

    public void disabledR(){
        
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        txtNombre.setVisible(false);
        txtNombre.setEnabled(false);
        txtIdJugador.setVisible(false);
        txtIdJugador.setEnabled(false);
        registerBtn.setEnabled(false);
        registerBtn.setVisible(false);

    }
    
    public void enabledG( boolean status){   
        jLabel5.setVisible(status);
        jLabel6.setVisible(status);
        jLabel7.setVisible(status);
        jLabel8.setVisible(status);
        txtOpcA.setEnabled(status);
        txtOpcB.setEnabled(status);
        txtOpcC.setEnabled(status);
        txtOpcD.setEnabled(status);
        summitBtn.setEnabled(status);
        txtOpcA.setVisible(status);
        txtOpcB.setVisible(status);
        txtOpcC.setVisible(status);
        txtOpcD.setVisible(status);
        summitBtn.setVisible(status);
    }
    public String getSelectedButtonText() {

        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    private boolean validation() {

        if (txtIdJugador.getText().equals("") || txtNombre.getText().equals("")) {
            return false;
        }
        return true;

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPremio;
    private javax.swing.JLabel lblRonda;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton summitBtn;
    private javax.swing.JTextField txtIdJugador;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JRadioButton txtOpcA;
    private javax.swing.JRadioButton txtOpcB;
    private javax.swing.JRadioButton txtOpcC;
    private javax.swing.JRadioButton txtOpcD;
    // End of variables declaration//GEN-END:variables
}
