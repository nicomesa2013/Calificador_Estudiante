/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EstudianteControlador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniela Chaux
 */
public class PnlPreguntaCerrada extends javax.swing.JPanel{

    /**
     * Creates new form PnlPreguntaCerrada
     */
    public PnlPreguntaCerrada() {
        initComponents();
    }
    private FormularioVisitador formulario;

    public FormularioVisitador getFormulario() {
        return formulario;
    }

    public void setFormulario(FormularioVisitador formulario) {
        this.formulario = formulario;
    }
    public void ponerTextos(String enunciado,List <String> respuestas, int numero ){
        txtNumero.setText(Integer.toString(numero));
        txtEnunciado.setText(enunciado);
        for(int i = 0; i < respuestas.size(); i++){
            switch (i) {
                case 0:
                    txtA.setText(respuestas.get(i));
                    break;
                case 1:
                    txtB.setText(respuestas.get(i));
                    break;
                case 2:
                    txtC.setText(respuestas.get(i));
                    break;
                case 3:
                    txtD.setText(respuestas.get(i));
                    break;
                default:
                    break;
            }      
        }
    }
    public void desactivarBotones(){
        BtnAtras.setEnabled(false);
        BtnSiguiente.setEnabled(false);
    }
    
    public void limpiarTexto(){
        RBtnA.setSelected(false);
        RBtnB.setSelected(false);
        RBtnC.setSelected(false);
        RBtnD.setSelected(false);
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
        jSeparator1 = new javax.swing.JSeparator();
        txtEnunciado = new javax.swing.JLabel();
        RBtnA = new javax.swing.JRadioButton();
        txtA = new javax.swing.JLabel();
        RBtnB = new javax.swing.JRadioButton();
        txtB = new javax.swing.JLabel();
        RBtnC = new javax.swing.JRadioButton();
        txtC = new javax.swing.JLabel();
        RBtnD = new javax.swing.JRadioButton();
        txtD = new javax.swing.JLabel();
        BtnFinalizar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        BtnSiguiente = new javax.swing.JButton();
        txtNumero = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PREGUNTA CERRADA");

        txtEnunciado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RBtnA.setText("A.");
        RBtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnAActionPerformed(evt);
            }
        });

        txtA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        RBtnB.setText("B.");
        RBtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnBActionPerformed(evt);
            }
        });

        txtB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        RBtnC.setText("C.");
        RBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnCActionPerformed(evt);
            }
        });

        txtC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        RBtnD.setText("D.");
        RBtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnDActionPerformed(evt);
            }
        });

        txtD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.setMinimumSize(new java.awt.Dimension(80, 23));
        BtnFinalizar.setPreferredSize(new java.awt.Dimension(80, 23));
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });

        BtnAtras.setText("Atras");
        BtnAtras.setMinimumSize(new java.awt.Dimension(80, 23));
        BtnAtras.setPreferredSize(new java.awt.Dimension(80, 23));
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.setMinimumSize(new java.awt.Dimension(80, 23));
        BtnSiguiente.setPreferredSize(new java.awt.Dimension(80, 23));
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        txtNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBtnB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBtnC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBtnD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RBtnA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnunciado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RBtnA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RBtnB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RBtnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RBtnD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RBtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtnAActionPerformed

    private void RBtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtnBActionPerformed

    private void RBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtnCActionPerformed

    private void RBtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtnDActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        // TODO add your handling code here:
        
        boolean[] solucion = new boolean[4];
        int numero = Integer.parseInt(txtNumero.getText().trim());
        solucion[0] = RBtnA.isSelected();
        solucion[1] = RBtnB.isSelected();
        solucion[2] = RBtnC.isSelected();
        solucion[3] = RBtnD.isSelected();
        
        EstudianteControlador.getInstance().agregarPreguntaCerradaE(numero, solucion);
        formulario.cambiarTarjeta("Siguiente");
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        // TODO add your handling code here:
        desactivarBotones();
        boolean[] solucion = new boolean[4];
        int numero = Integer.parseInt(txtNumero.getText().trim());
        solucion[0] = RBtnA.isSelected();
        solucion[1] = RBtnB.isSelected();
        solucion[2] = RBtnC.isSelected();
        solucion[3] = RBtnD.isSelected();
        formulario.cambiarTarjetaAbuelo("Vacio");
    }//GEN-LAST:event_BtnFinalizarActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        // TODO add your handling code here:
        formulario.cambiarTarjeta("Atras");
    }//GEN-LAST:event_BtnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JRadioButton RBtnA;
    private javax.swing.JRadioButton RBtnB;
    private javax.swing.JRadioButton RBtnC;
    private javax.swing.JRadioButton RBtnD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtA;
    private javax.swing.JLabel txtB;
    private javax.swing.JLabel txtC;
    private javax.swing.JLabel txtD;
    private javax.swing.JLabel txtEnunciado;
    private javax.swing.JLabel txtNumero;
    // End of variables declaration//GEN-END:variables
}
