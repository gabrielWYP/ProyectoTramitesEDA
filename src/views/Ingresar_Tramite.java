/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

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
import static logica.LogicaTramite.Administrador.BuscarUsuario;


/**
 *
 * @author Maritza
 */
public class Ingresar_Tramite extends javax.swing.JFrame {

    private static final String PRIO_PLACEHOLDER = "ingresar prioridad";;
    private static final String ASUN_PLACEHOLDER = "ingresar asunto";
    private static final String DOC_PLACEHOLDER = "ingresar documento";
    private Administrador admin = Administrador.getInstance();
    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
    
    //Instancia de la clase Fecha
    private Fecha fechaTramiteIni = new Fecha();
    
    //Creación de Usuarios de la clase(Uusario)
    Usuario usu1 = new Usuario("71959397", "Pep Guardiola", "934999712", "pepitoalcachofa@gmail.com");
    Usuario usu2 = new Usuario("83Usuario usu1 = new Usuario(\"71959397\", \"941832", "Ricardo Moran", "999 975 222", "pepitoalcachofa@gmail.com");
    Usuario usu3 = new Usuario("71959397", "Pepito lagapija", "934999712", "pepitoalcachofa@gmail.com");
    
    //Creación de Documento de la clase(Documento)
    
    Documento doc1 = new Documento("Registro DNI", "registro del DNI en la base de datos");
    Documento doc2 = new Documento("Registro notas", "subir las notas del usuarios a la base de datos");
    Documento doc3 = new Documento("Declaración Jurada", "documento firmado por una notaria asumiendo la responsabilidad del usuario");
    
    public Ingresar_Tramite() {
        initComponents();
        AddPlaceHolder(prioridad, PRIO_PLACEHOLDER);
        AddPlaceHolder(asunto, ASUN_PLACEHOLDER);
        llenarBoxUsuarios();
        llenarBoxDependencias();
        llenarBoxDocumentos();
        this.setLocationRelativeTo(this);
        SetImageIcon(jLabel4,"src/imagenes/traimagen.jpg");
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
      
      
    public void llenarBoxDocumentos()
      {
          docu.removeAllItems();
          docu.addItem("Seleccionar Documento");
          docu.addItem(doc1.getTipo());
          docu.addItem(doc2.getTipo());
          docu.addItem(doc3.getTipo());
          
    }
      
    public void llenarBoxDependencias() {
        depe.removeAllItems();
        depe.addItem("Seleccionar Dependencia");

        Lista<Dependencia> nomDepe = GT.getDepes();

        for(int i = 1; i < nomDepe.longitud() +1; i++) {
            depe.addItem(nomDepe.iesimo(i).getNombre());
        }
    }
    
  public void llenarBoxUsuarios() {
        usuario.addItem("Seleccionar Dependencia");
        usuario.removeAllItems();
        

        Lista<Usuario> users = GT.getUser();

        for(int i = 1; i < users.longitud() +1; i++) {
            usuario.addItem(users.iesimo(i).getNombre());
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Rellenar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        vaciarcampos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        prioridad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        asunto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        docu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        depe = new javax.swing.JComboBox<>();
        usuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Tramite");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sesion:Administrador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Rellenar.setBackground(new java.awt.Color(0, 0, 0));
        Rellenar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Rellenar.setForeground(new java.awt.Color(255, 255, 255));
        Rellenar.setText("OK");
        Rellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 0, 0));
        cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        vaciarcampos.setBackground(new java.awt.Color(0, 0, 0));
        vaciarcampos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vaciarcampos.setForeground(new java.awt.Color(255, 255, 255));
        vaciarcampos.setText("Limpiar");
        vaciarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarcamposActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Prioridad:");

        prioridad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prioridadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prioridadFocusLost(evt);
            }
        });
        prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Asunto:");
        jLabel7.setToolTipText("");

        asunto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                asuntoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                asuntoFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Documento:");
        jLabel8.setToolTipText("");

        docu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dependencia:");
        jLabel9.setToolTipText("");

        depe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vaciarcampos)
                                    .addComponent(jLabel9))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(depe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(docu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(docu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(depe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar)
                    .addComponent(cancelar)
                    .addComponent(vaciarcampos))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vaciarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarcamposActionPerformed
        prioridad.setText("");
        asunto.setText("");
    }//GEN-LAST:event_vaciarcamposActionPerformed

    private void RellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarActionPerformed
    //Seleccion Prioridad
    String Prioridad = prioridad.getText();
    int PrioInt = 0;

    if (Prioridad.matches("\\d+")) {
        PrioInt = Integer.parseInt(Prioridad);
    } else {
        JOptionPane.showMessageDialog(null, "La prioridad debe ser un número.");
        return;
    }

    String Asunto = asunto.getText();
    if (Asunto == null || Asunto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El asunto está vacío.");
        return;
    }

    if (usuario.getSelectedItem() == null || usuario.getSelectedItem().toString().equals("Seleccionar Usuario")) {
        JOptionPane.showMessageDialog(null, "No se ha seleccionado un usuario.");
        return;
    }
    //Seleccion Usuario
    
    String nombreUsu = usuario.getSelectedItem().toString();
    Usuario usuarioSeleccionado = BuscarUsuario(GT, nombreUsu);

    if (usuarioSeleccionado == null) {
        JOptionPane.showMessageDialog(null, "Usuario no seleccionada.");
        return;
    }
    
    //Seleccion Documentos
    
    if (docu.getSelectedItem() == null || docu.getSelectedItem().toString().equals("Seleccionar Documento")) {
        JOptionPane.showMessageDialog(null, "No se ha seleccionado un documento.");
        return;
    }
    
    String TipoDoc = docu.getSelectedItem().toString();
    Documento documentoSeleccionado = null;

    if (TipoDoc.equals(doc1.getTipo())) {
        documentoSeleccionado = doc1;
    } else if (TipoDoc.equals(doc2.getTipo())) {
        documentoSeleccionado = doc2;
    } else if (TipoDoc.equals(doc3.getTipo())) {
        documentoSeleccionado = doc3;
    }

    if (documentoSeleccionado == null) {
        JOptionPane.showMessageDialog(null, "Documento no seleccionado.");
        return;
    }

    //Seleccion Dependencias
    
    if (depe.getSelectedItem() == null || depe.getSelectedItem().toString().equals("Seleccionar Dependencia")) {
        JOptionPane.showMessageDialog(null, "No se ha seleccionado una dependencia.");
        return;
    }

    String nombreDep = depe.getSelectedItem().toString();
    
    Dependencia dependenciaSeleccionada = BuscarDepe(GT, nombreDep);
    
    if (dependenciaSeleccionada == null) {
        JOptionPane.showMessageDialog(null, "Dependencia no seleccionada.");
        return;
    }
    
    //Realizar Ingreso
    if (!Prioridad.isEmpty() && !Asunto.isEmpty() &&
        dependenciaSeleccionada != null && usuarioSeleccionado != null &&
        documentoSeleccionado != null) {         

        // Función tomada de Gestion_Tramite
        Tramite tramit = admin.registrarIngreso(usuarioSeleccionado, Asunto, PrioInt, documentoSeleccionado, dependenciaSeleccionada);
        String fechaFTra = fechaTramiteIni.FechaFormateada("dd/MM/yyyy HH:mm:ss");
        JOptionPane.showMessageDialog(null, "Se registró todo correctamente\n Fecha:" + fechaFTra);
        
        // Termino de crear trámite
        PestanaAdmin po = new PestanaAdmin();
        po.setVisible(true);
        this.dispose();
        
    } else {
        JOptionPane.showMessageDialog(null, "Falta rellenar un apartado");
    }

    }//GEN-LAST:event_RellenarActionPerformed

    private void prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadActionPerformed

    private void prioridadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prioridadFocusGained
        if(prioridad.getText().equals(PRIO_PLACEHOLDER))
     {
         prioridad.setText("");
         RemovePlaceHolder(prioridad);
     }
    }//GEN-LAST:event_prioridadFocusGained

    private void asuntoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_asuntoFocusGained
      if(asunto.getText().equals(ASUN_PLACEHOLDER));
     {
         asunto.setText("");
         RemovePlaceHolder(asunto);
     }
    }//GEN-LAST:event_asuntoFocusGained

    private void prioridadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prioridadFocusLost
        if(prioridad.getText().isEmpty())
        {
            AddPlaceHolder(prioridad, PRIO_PLACEHOLDER);
        }
    }//GEN-LAST:event_prioridadFocusLost

    private void asuntoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_asuntoFocusLost
        if(asunto.getText().isEmpty())
        {
            AddPlaceHolder(asunto, ASUN_PLACEHOLDER);
        }
    }//GEN-LAST:event_asuntoFocusLost

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        
    }//GEN-LAST:event_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Tramite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rellenar;
    private javax.swing.JTextField asunto;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> depe;
    private javax.swing.JComboBox<String> docu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField prioridad;
    private javax.swing.JComboBox<String> usuario;
    private javax.swing.JButton vaciarcampos;
    // End of variables declaration//GEN-END:variables
}
