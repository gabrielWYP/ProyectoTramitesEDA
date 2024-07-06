/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JOptionPane;
import logica.LogicaTramite.Administrador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import static java.time.LocalDateTime.now;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.*;
import logica.LogicaTramite.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static logica.LogicaTramite.Administrador.BuscarDepe;
/**
 *
 * @author Maritza
 */
public class MoverTramite extends javax.swing.JFrame {
    
    private Administrador admin = Administrador.getInstance();
    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
    /**
     * Creates new form MoverTramite
     */
    public MoverTramite() {
        initComponents();
        llenarBoxDependenciasOrigen();
        llenarBoxDependenciasFin();
        this.setLocationRelativeTo(this);
        SetImageIcon(jLabel5,"src/imagenes/traimagen.jpg");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DepeFin = new javax.swing.JComboBox<>();
        Cancelar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DepeOrigen = new javax.swing.JComboBox<>();
        RealizarCambio = new javax.swing.JToggleButton();
        prio = new javax.swing.JRadioButton();
        antiguo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mover Tramite");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 40));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sesion:Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(103, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Hasta:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 20, -1, -1));

        DepeFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepeFinActionPerformed(evt);
            }
        });
        jPanel2.add(DepeFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        Cancelar.setBackground(new java.awt.Color(0, 0, 0));
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel4.setText("¿Desea mover por prioridad o antigüedad?");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel2.setText("Desde:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        DepeOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepeOrigenActionPerformed(evt);
            }
        });
        jPanel2.add(DepeOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        RealizarCambio.setBackground(new java.awt.Color(0, 0, 0));
        RealizarCambio.setForeground(new java.awt.Color(255, 255, 255));
        RealizarCambio.setText("Mover Trámite");
        RealizarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCambioActionPerformed(evt);
            }
        });
        jPanel2.add(RealizarCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        buttonGroup1.add(prio);
        prio.setText("Prioridad");
        prio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioActionPerformed(evt);
            }
        });
        jPanel2.add(prio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        buttonGroup1.add(antiguo);
        antiguo.setText("Antigüedad");
        jPanel2.add(antiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, 520, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioActionPerformed

    private void RealizarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCambioActionPerformed
        //Buscamos las dependencias
        String nombreDepOrigen = DepeOrigen.getSelectedItem().toString();
        Dependencia Origen = BuscarDepe(GT, nombreDepOrigen);
        String nombreDepFinal = DepeFin.getSelectedItem().toString();
        Dependencia Final = BuscarDepe(GT, nombreDepFinal);
        System.out.println(Origen.getNombre());
        System.out.println(Final.getNombre());
        if(Origen == null || Final == null) {
            throw new RuntimeException("No existen las dependencias");
        } else if (Origen.getNombre() == null ? Final.getNombre() == null : Origen.getNombre().equals(Final.getNombre())) {
            JOptionPane.showMessageDialog(null, "No se puede mover a la misma dependencia");
            throw new RuntimeException("No se puede encolar y desencolar entre dependencias iguales");
        } else if(Origen.getEncolados().esVacia()){
            JOptionPane.showMessageDialog(null, "Debe existir minimo un tramite en la dependencia de origen.");
            throw new RuntimeException("Debe existir minimo un tramite en la dependencia de origen.");
        } else {
            boolean compro = false;
            if (prio.isSelected()) {
                compro = true;
            }
            admin.registrarMovimiento(compro, Origen, Final);
        }
        JOptionPane.showMessageDialog(this, "Tramite movido satisfactoriamente");
        PestanaAdmin po = new PestanaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RealizarCambioActionPerformed

    private void DepeOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepeOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepeOrigenActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        PestanaAdmin po = new PestanaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void DepeFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepeFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepeFinActionPerformed
    public void llenarBoxDependenciasOrigen() {
        DepeOrigen.removeAllItems();
        DepeOrigen.addItem("Seleccionar Dependencia");

        Lista<Dependencia> nomDepe = GT.getDepes();
        for(int i = 1; i < nomDepe.longitud() +1; i++) {
            DepeOrigen.addItem(nomDepe.iesimo(i).getNombre());
        }
    }
    public void llenarBoxDependenciasFin() {
        DepeFin.removeAllItems();
        DepeFin.addItem("Seleccionar Dependencia");

        Lista<Dependencia> nomDepe = GT.getDepes();
        for(int i = 1; i < nomDepe.longitud() +1; i++) {
            DepeFin.addItem(nomDepe.iesimo(i).getNombre());
        }
    }
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
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoverTramite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Cancelar;
    private javax.swing.JComboBox<String> DepeFin;
    private javax.swing.JComboBox<String> DepeOrigen;
    private javax.swing.JToggleButton RealizarCambio;
    private javax.swing.JRadioButton antiguo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton prio;
    // End of variables declaration//GEN-END:variables
}
