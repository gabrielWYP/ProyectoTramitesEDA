
package views;

import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.LogicaTramite.*;
import logica.*;
import views.IniBusqueda;

public class VisualizarTramite extends javax.swing.JFrame {

    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
    private Administrador admin = Administrador.getInstance();
    private Tramite actual;
    
    public VisualizarTramite(Tramite Tra) {
        initComponents();
        RecibirTra(Tra);
        
    }
    
      public VisualizarTramite() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void RecibirTra(Tramite Tra)
    {
        if(Tra != null)
        {
            this.actual = Tra;
            int prio = Tra.getPrio();
            String prioridad = String.valueOf(prio);
            
        InformaUID.setText(Tra.getUID());
        InformaASUNTO.setText(Tra.getAsunto());
        informaNOMUSU.setText(Tra.getDatos().getNombre());
        informaDNIUSU.setText(Tra.getDatos().getDni());
        informaFONOUSU.setText(Tra.getDatos().getFono());
        informaEMAILUSU.setText(Tra.getDatos().getEmail());
        informaTIPDOC.setText(Tra.getRef().getTipo());
        informaDESDOC.setText(Tra.getRef().getDescrip());
        InformaDEPE.setText(Tra.getDepe().getNombre());
        InformaPRIO.setText(prioridad);
        
        
        //No permitido la edición
        InformaUID.setEditable(false);
        InformaASUNTO.setEditable(false);
        informaNOMUSU.setEditable(false);
        informaDNIUSU.setEditable(false);
        informaFONOUSU.setEditable(false);
        informaEMAILUSU.setEditable(false);
        informaTIPDOC.setEditable(false);
        informaDESDOC.setEditable(false);
        InformaDEPE.setEditable(false);
        InformaDEPE.setEditable(false);
        InformaPRIO.setEditable(false);
        
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Error"); 
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        InformaASUNTO = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        InformaUID = new javax.swing.JTextField();
        informaNOMUSU = new javax.swing.JTextField();
        informaDNIUSU = new javax.swing.JTextField();
        informaFONOUSU = new javax.swing.JTextField();
        informaEMAILUSU = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        informaTIPDOC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informaDESDOC = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        InformaPRIO = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        InformaDEPE = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        verEventos1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 60, -1));

        InformaASUNTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformaASUNTOActionPerformed(evt);
            }
        });
        getContentPane().add(InformaASUNTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setText("UID:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        InformaUID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InformaUIDFocusGained(evt);
            }
        });
        InformaUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformaUIDActionPerformed(evt);
            }
        });
        getContentPane().add(InformaUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 100, -1));
        getContentPane().add(informaNOMUSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, -1));
        getContentPane().add(informaDNIUSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 100, -1));
        getContentPane().add(informaFONOUSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 100, -1));
        getContentPane().add(informaEMAILUSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 100, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setText("información del Usuario:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, -1));
        getContentPane().add(informaTIPDOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 110, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setText("Asunto:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel14.setText("Dependencia:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 90, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel15.setText("DNI:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 40, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel16.setText("Telefono:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel17.setText("Nombre:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel18.setText("Tipo:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        informaDESDOC.setColumns(20);
        informaDESDOC.setRows(5);
        jScrollPane1.setViewportView(informaDESDOC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 280, 70));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel19.setText("Descripción:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 80, -1));
        getContentPane().add(InformaPRIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 110, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel20.setText("Prioridad:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 80, -1));
        getContentPane().add(InformaDEPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 110, -1));

        Regresar.setBackground(new java.awt.Color(0, 0, 0));
        Regresar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Cancelar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 270, 40));

        verEventos1.setBackground(new java.awt.Color(0, 0, 0));
        verEventos1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        verEventos1.setForeground(new java.awt.Color(255, 255, 255));
        verEventos1.setText("Visualizar Eventos");
        verEventos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEventos1ActionPerformed(evt);
            }
        });
        getContentPane().add(verEventos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 270, 40));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tramite en curso");
        jPanel5.add(jLabel1);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 670, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("Información del Documento:");
        jPanel1.add(jLabel10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 670, 330));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sesion:Administrador");
        jPanel2.add(jLabel6);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InformaUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformaUIDActionPerformed
        
    }//GEN-LAST:event_InformaUIDActionPerformed

    private void InformaASUNTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformaASUNTOActionPerformed
        
    }//GEN-LAST:event_InformaASUNTOActionPerformed

    private void InformaUIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InformaUIDFocusGained
        
    }//GEN-LAST:event_InformaUIDFocusGained

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        JOptionPane.showMessageDialog(null, "Operación cancelada");
        IniBusqueda busCa = new IniBusqueda();
        busCa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void verEventos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEventos1ActionPerformed
        JOptionPane.showMessageDialog(null, actual.MostrarInfo());
    }//GEN-LAST:event_verEventos1ActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarTramite().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InformaASUNTO;
    private javax.swing.JTextField InformaDEPE;
    private javax.swing.JTextField InformaPRIO;
    private javax.swing.JTextField InformaUID;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextArea informaDESDOC;
    private javax.swing.JTextField informaDNIUSU;
    private javax.swing.JTextField informaEMAILUSU;
    private javax.swing.JTextField informaFONOUSU;
    private javax.swing.JTextField informaNOMUSU;
    private javax.swing.JTextField informaTIPDOC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton verEventos1;
    // End of variables declaration//GEN-END:variables
}
