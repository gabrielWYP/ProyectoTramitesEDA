/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import logica.Cola;
import logica.Gestion_Tramite;
import logica.Lista;
import logica.LogicaTramite.*;
import static logica.LogicaTramite.Administrador.BuscarDepe;
import logica.LogicaTramite.Dependencia;
import logica.Nodo;

/**
 *
 * @author gaway
 */
public class FinalizarTramite extends javax.swing.JFrame {
    
    private Administrador admin = Administrador.getInstance();
    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
  

    /**
     * Creates new form FinalizarTramite
     */
    public FinalizarTramite() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageIcon(jLabel4,"src/imagenes/traterminado.png");
    }

    private void SetImageIcon(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon= new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight(),Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        prioridad = new javax.swing.JRadioButton();
        antiguedad = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Rellenar = new javax.swing.JButton();
        Rellenar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ingrese dependencia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 260, -1));

        buttonGroup1.add(prioridad);
        prioridad.setText("Prioridad");
        prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadActionPerformed(evt);
            }
        });
        getContentPane().add(prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        buttonGroup1.add(antiguedad);
        antiguedad.setText("Antigüedad");
        antiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiguedadActionPerformed(evt);
            }
        });
        getContentPane().add(antiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel3.setText("¿Desea finalizar por prioridad o antigüedad?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FINALIZAR TRAMITE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sesion:Administrador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Rellenar.setBackground(new java.awt.Color(0, 0, 0));
        Rellenar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Rellenar.setForeground(new java.awt.Color(255, 255, 255));
        Rellenar.setText("Finalizar");
        Rellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarActionPerformed(evt);
            }
        });

        Rellenar1.setBackground(new java.awt.Color(0, 0, 0));
        Rellenar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Rellenar1.setForeground(new java.awt.Color(255, 255, 255));
        Rellenar1.setText("Cancelar");
        Rellenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rellenar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(Rellenar1)
                .addGap(75, 75, 75)
                .addComponent(Rellenar)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar)
                    .addComponent(Rellenar1))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadActionPerformed

    private void antiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiguedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antiguedadActionPerformed

    private void RellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarActionPerformed
       String depeselected = jTextField1.getText();
        Lista<Dependencia> nomDepe = GT.getDepes();
        Dependencia dependenciaEncontrada = BuscarDepe(GT,depeselected);
        
        if (dependenciaEncontrada != null) {
            if(dependenciaEncontrada.getEncolados().esVacia()) {
                JOptionPane.showMessageDialog(this, "Debe contener como minimo un tramite");
                throw new RuntimeException("No se hallan tramites.");
            } else {
            boolean prio = false;
            if (prioridad.isSelected()) {
                prio = true;
            }
            admin.registrarFinal(prio, GT, dependenciaEncontrada);
            JOptionPane.showMessageDialog(this, "Tramite finalizado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro dependencia");
            throw new RuntimeException("No se encontro la dependencia.");
        }
    }//GEN-LAST:event_RellenarActionPerformed

    private void Rellenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rellenar1ActionPerformed
        // TODO add your handling code here:
        PestanaAdmin po = new PestanaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Rellenar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizarTramite().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rellenar;
    private javax.swing.JButton Rellenar1;
    private javax.swing.JRadioButton antiguedad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton prioridad;
    // End of variables declaration//GEN-END:variables
}
