/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EstudianteControlador;

/**
 *
 * @author Daniela Chaux
 */
public class PnlPreguntaAbierta extends javax.swing.JPanel {

    /**
     * Creates new form PnlPreguntaAbierta
     */
    public PnlPreguntaAbierta() {
        initComponents();
    }
    
    private FormularioVisitador formulario;

    public FormularioVisitador getFormulario() {
        return formulario;
    }

    public void setFormulario(FormularioVisitador formulario) {
        this.formulario = formulario;
    }
    public void ponerTextos(String enunciado, int numero){
        txtNumero.setText(Integer.toString(numero));
        txtEnunciado.setText(enunciado);
    }
    
    public void limpiarTexto(){
        txtSolucion.setText("");
    }
    public void desactivarBotones(){
        BtnAtras.setEnabled(false);
        BtnSiguiente.setEnabled(false);
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
        BtnSiguiente = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSolucion = new javax.swing.JTextArea();
        BtnFinalizar = new javax.swing.JButton();
        txtNumero = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PREGUNTA ABIERTA");

        txtEnunciado.setBackground(new java.awt.Color(255, 255, 255));
        txtEnunciado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        txtSolucion.setColumns(20);
        txtSolucion.setRows(5);
        jScrollPane1.setViewportView(txtSolucion);

        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguiente)
                    .addComponent(BtnAtras)
                    .addComponent(BtnFinalizar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(txtNumero.getText().trim());
        String enunciado = txtEnunciado.getText();
        EstudianteControlador.getInstance().agregarPreguntaAbiertaE(numero, enunciado);
        formulario.cambiarTarjetaAbuelo("Vacio");
    }//GEN-LAST:event_BtnFinalizarActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(txtNumero.getText().trim());
        String solucion = txtSolucion.getText();
        EstudianteControlador.getInstance().agregarPreguntaAbiertaE(numero, solucion);
        formulario.cambiarTarjeta("Siguiente");
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        // TODO add your handling code here:
        formulario.cambiarTarjeta("Atras");
    }//GEN-LAST:event_BtnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtEnunciado;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JTextArea txtSolucion;
    // End of variables declaration//GEN-END:variables
}
