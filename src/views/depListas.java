/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.LogicaTramite.*;
import logica.*;
import views.PestanaAdmin;
import static logica.LogicaTramite.Administrador.BuscarDepe;
import static logica.LogicaTramite.Administrador.OrdenarPrio;
import static logica.LogicaTramite.Administrador.OrdenarPrioHistorial;


/**
 *
 * @author USUARIO
 */
public class depListas extends javax.swing.JFrame {

    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
    private Administrador ad = Administrador.getInstance();
    DefaultTableModel m1 = new DefaultTableModel();
    
    
    
    public depListas() {
        initComponents();
        String ids [] = {"UID","DATOS","ASUNTO","PRIORIDAD","TIPO"};
        m1.setColumnIdentifiers(ids);
        jTable2.setModel(m1);
        Antiguo.setSelected(true);
        Dependencia.setSelected(true);
        cargarDependencias();
        this.setLocationRelativeTo(this);
        SetImageIcon(jLabel6,"src/imagenes/Captura.PNG");
        
    }
   private void cargarDependencias() {
        NOMDEPE.removeAllItems(); 
        NOMDEPE.addItem("Seleccionar Dependencia");
        for(int i = 1; i < GT.getDepes().longitud() + 1; i++) {
            NOMDEPE.addItem(GT.getDepes().iesimo(i).getNombre());
        }
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Historial = new javax.swing.JRadioButton();
        Prio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Antiguo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ORDENAR = new javax.swing.JButton();
        NOMDEPE = new javax.swing.JComboBox<>();
        Dependencia = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(Historial);
        Historial.setText("Historial");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });

        buttonGroup2.add(Prio);
        Prio.setText("Prioridad");
        Prio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrioActionPerformed(evt);
            }
        });

        jLabel3.setText("Método de ordenamiento:");

        buttonGroup2.add(Antiguo);
        Antiguo.setText("Antigüedad");
        Antiguo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntiguoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Estructura a ordenar:");

        jLabel1.setText("SELECCIONAR DEPENDENCIA: ");

        ORDENAR.setBackground(new java.awt.Color(0, 0, 0));
        ORDENAR.setForeground(new java.awt.Color(255, 255, 255));
        ORDENAR.setText("ORDENAR");
        ORDENAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARActionPerformed(evt);
            }
        });

        NOMDEPE.setForeground(new java.awt.Color(255, 255, 255));
        NOMDEPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NOMDEPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMDEPEActionPerformed(evt);
            }
        });

        buttonGroup1.add(Dependencia);
        Dependencia.setText("Dependencia");
        Dependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DependenciaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setText("TABLA DE DEPENDENCIAS");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VISUALIZAR DEPENDENCIAS");

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sesion:Administrador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dependencia)
                                    .addComponent(ORDENAR))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Historial)
                                    .addComponent(jButton1)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Antiguo)
                                .addGap(36, 36, 36)
                                .addComponent(Prio))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NOMDEPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(228, 228, 228))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(NOMDEPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Antiguo)
                            .addComponent(Prio))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dependencia)
                            .addComponent(Historial))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ORDENAR)
                            .addComponent(jButton1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DependenciaActionPerformed
        
    }//GEN-LAST:event_DependenciaActionPerformed

    private void NOMDEPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMDEPEActionPerformed
        
        
    }//GEN-LAST:event_NOMDEPEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PestanaAdmin pa= new PestanaAdmin ();
        pa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        
    }//GEN-LAST:event_HistorialActionPerformed

    private void PrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrioActionPerformed
        
    }//GEN-LAST:event_PrioActionPerformed

    private void AntiguoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntiguoActionPerformed
        
    }//GEN-LAST:event_AntiguoActionPerformed

    private void ORDENARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARActionPerformed
        if(Dependencia.isSelected()) {
            if(Prio.isSelected()) {
                jLabel2.setText("Dependencia por prioridad");
            m1.setRowCount(0);
            if(NOMDEPE.getSelectedItem()=="Seleccionar Dependencia"){
            JOptionPane.showMessageDialog(null, "seleccione una dependencia");
            }
            else{
            String nom = (String) NOMDEPE.getSelectedItem();
            Dependencia dep = BuscarDepe(GT, nom);
            Cola<Tramite> ordenada = OrdenarPrio(dep);
            if(ordenada.esVacia()){
                JOptionPane.showMessageDialog(null, "La cola de tramites esta vacia"); 
            }
            Cola<Tramite> tempCola = new Cola<>();
            while (!ordenada.esVacia()) {
            Tramite tramite = ordenada.desencolar();
            m1.addRow(new Object[]{
                tramite.getUID(),
                tramite.getDatos().getNombre(),
                tramite.getAsunto(),
                tramite.getPrio(),
                tramite.getRef().getTipo()
            });
            tempCola.encolar(tramite);
            }
            while (!tempCola.esVacia()) {
            ordenada.encolar(tempCola.desencolar());
            }
            }
            } else if(Antiguo.isSelected()) {
                jLabel2.setText("Dependencia por antiguedad");
            m1.setRowCount(0);
            if(NOMDEPE.getSelectedItem()=="Seleccionar Dependencia"){
            JOptionPane.showMessageDialog(null, "seleccione una dependencia");
            }
            else{
            String nom = (String) NOMDEPE.getSelectedItem();
            Dependencia dep = BuscarDepe(GT, nom);
            Cola<Tramite> ordenada = dep.getEncolados();
            if(ordenada.esVacia()){
                JOptionPane.showMessageDialog(null, "La cola de tramites esta vacia"); 
            }
            Cola<Tramite> tempCola = new Cola<>();
            while (!ordenada.esVacia()) {
            Tramite tramite = ordenada.desencolar();
            m1.addRow(new Object[]{
                tramite.getUID(),
                tramite.getDatos().getNombre(),
                tramite.getAsunto(),
                tramite.getPrio(),
                tramite.getRef().getTipo()
            });
            tempCola.encolar(tramite);
            }
            while (!tempCola.esVacia()) {
            ordenada.encolar(tempCola.desencolar());
            }
            }
            }
        } else if(Historial.isSelected()) {
            if (GT.getHistorial().esVacia()) {
                JOptionPane.showMessageDialog(null, "Se debe finalizar un tramite para visualizar el historial");
            } else if(Prio.isSelected()) {
                jLabel2.setText("HISTORIAL DE TRAMITES POR PRIORIDAD");
                m1.setRowCount(0);
                Lista<Tramite> tramites = GT.getHistorial();
                if(tramites.esVacia()) {
                    JOptionPane.showMessageDialog(null, "Lista vacia, ingresar dependencias");  
                }
                Lista<Tramite> ordenada = OrdenarPrioHistorial(tramites);
                for(int i = 1; i < tramites.longitud() + 1; i++){
                    Tramite nueva= ordenada.iesimo(i);
                    m1.addRow(new Object[]{
                        nueva.getUID(),
                        nueva.getDatos().getNombre(),
                        nueva.getDepe().getNombre(),
                        nueva.getPrio(),
                        nueva.getRef().getTipo()
                    });
                }
            } else if(Antiguo.isSelected()) {
                jLabel2.setText("HISTORIAL DE TRAMITES POR ANTIGUEDAD");
                m1.setRowCount(0);
                Lista<Tramite> tramites = GT.getHistorial();
                if(tramites.esVacia()) {
                    JOptionPane.showMessageDialog(null, "Lista vacia, ingresar dependencias"); 
                }

                for(int i = 1; i < tramites.longitud() + 1; i++) {

                    Tramite nueva = tramites.iesimo(i);
                        m1.addRow(new Object[]{
                        nueva.getUID(),
                        nueva.getDatos().getNombre(),
                        nueva.getDepe().getNombre(),
                        nueva.getPrio(),
                        nueva.getRef().getTipo()
                    });
                    }
                }
            }
    }//GEN-LAST:event_ORDENARActionPerformed

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
            java.util.logging.Logger.getLogger(depListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(depListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(depListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(depListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new depListas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Antiguo;
    private javax.swing.JRadioButton Dependencia;
    private javax.swing.JRadioButton Historial;
    private javax.swing.JComboBox<String> NOMDEPE;
    private javax.swing.JButton ORDENAR;
    private javax.swing.JRadioButton Prio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
