/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.*;
import logica.LogicaTramite.*;
import views.PestanaAdmin;


public class IniBusqueda extends javax.swing.JFrame {

    private static final String INFOUID_PLACEHOLDER = "ingresar UID";
    private Administrador admin = Administrador.getInstance();
    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
    private Tramite tramite;
    
    
    public IniBusqueda() 
    {
        initComponents();
        AddPlaceHolder(infoUID, INFOUID_PLACEHOLDER);
        this.setLocationRelativeTo(this);
        SetImageIcon(jLabel2,"src/imagenes/lupa.png");
    }

    public void AddPlaceHolder(JTextField textField, String placeholder)
        {
            Font font = textField.getFont();
            font = font.deriveFont(Font.ITALIC);
            textField.setFont(font);
            textField.setForeground(Color.gray);
            textField.setText(placeholder);
            
        }
    
      public void RemovePlaceHolder(JTextField textField)
        {
            Font font = textField.getFont();
            font = font.deriveFont(Font.PLAIN|Font.BOLD);
            textField.setFont(font);
            textField.setForeground(Color.black);  
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        infoUID = new javax.swing.JTextField();
        bus = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("UID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        infoUID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                infoUIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                infoUIDFocusLost(evt);
            }
        });
        infoUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoUIDActionPerformed(evt);
            }
        });
        jPanel1.add(infoUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 179, -1));

        bus.setBackground(new java.awt.Color(0, 0, 0));
        bus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bus.setForeground(new java.awt.Color(255, 255, 255));
        bus.setText("Buscar");
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });
        jPanel1.add(bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, -1));

        cancelar.setBackground(new java.awt.Color(0, 0, 0));
        cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 410, 190));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda por UID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sesion:Administrador");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        if(infoUID.getText()==null){
            
            JOptionPane.showMessageDialog(null, "No coloco una UID");
            
        }
        Lista <Dependencia> dep = GT.getDepes();
        for(int i =1; i<dep.longitud()+1; i++){
            Cola <Tramite> tr = dep.iesimo(i).getEncolados();
            Cola<Tramite> tempCola = new Cola<>();
            while (!tr.esVacia()) {
            Tramite tr1 = tr.desencolar();
            
            if(tr1.getUID().equalsIgnoreCase(infoUID.getText())){
                tramite=tr1;
            }
            
            tempCola.encolar(tr1);
            }

            while (!tempCola.esVacia()) {
            tr.encolar(tempCola.desencolar());
            }
        }
        if(tramite == null){
            Lista<Tramite> hist = GT.getHistorial();
            for (int i = 1; i < hist.longitud() +1; i++) {
                if(hist.iesimo(i).getUID().equalsIgnoreCase(infoUID.getText())) {
                    tramite = hist.iesimo(i);
                }
            }
            if (tramite ==  null) {
                JOptionPane.showMessageDialog(null, "No se encontro la UID");
            } else {
                JOptionPane.showMessageDialog(null, "Se encontro UID");
                VisualizarTramite visiTra = new VisualizarTramite();
                visiTra.RecibirTra(tramite);
                visiTra.setVisible(true);
                this.dispose();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Se encontro UID");
            VisualizarTramite visiTra = new VisualizarTramite();
            visiTra.RecibirTra(tramite);
            visiTra.setVisible(true);
            this.dispose();  
        }
    }//GEN-LAST:event_busActionPerformed

    private void infoUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoUIDActionPerformed

    private void infoUIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoUIDFocusGained
     if(infoUID.getText().equals(INFOUID_PLACEHOLDER))
     {
         infoUID.setText("");
         RemovePlaceHolder(infoUID);
     }
    }//GEN-LAST:event_infoUIDFocusGained

    private void infoUIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoUIDFocusLost
    if(infoUID.getText().isEmpty())
        {
            AddPlaceHolder(infoUID, INFOUID_PLACEHOLDER);
        }
    }//GEN-LAST:event_infoUIDFocusLost

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        JOptionPane.showMessageDialog(null, "Operación cancelada");
        PestanaAdmin po = new PestanaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bus;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField infoUID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
