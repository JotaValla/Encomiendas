/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package encomiendas.views.usuarios;

import encomiendas.controllers.usuarios.AdministradorController;
import encomiendas.database.Conexion;
import encomiendas.model.data.usuarios.UsuarioRepository;
import encomiendas.model.entity.usuarios.Usuario;
import encomiendas.services.usuarios.UsuarioService;

/**
 *
 * @author kedos
 */
public class AEdicionUsuario extends javax.swing.JFrame {

    Conexion con = new Conexion();

    UsuarioRepository usuarioRepository;
    UsuarioService usuarioService;

    AdministradorController administradorController;
    String cedula;

    public AEdicionUsuario() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Actualizar datos del usuario");

        bloquearCampos();
        
        //instancia del controlador
        usuarioRepository = new UsuarioRepository(con.getInstance());
        usuarioService = new UsuarioService(usuarioRepository);
        administradorController = new AdministradorController(this, usuarioService);

    }

    private void resetearCampos() {
        jTFCedula.setText("");
        jTFNombres.setText("");
        jTFApellidos.setText("");
        jTFCorreo.setText("");
        jTFTelefono.setText("");
        jTFTelefonoAdicional.setText("");
        jTFCiudad.setText("");
        jTFAgencia.setText("");

        jCBRol.setSelectedIndex(0); // Selecciona el primer elemento del ComboBox
        jCBTípoLicencia.setSelectedIndex(0); // Selecciona el primer elemento del ComboBox
        jCBActivo.setSelectedIndex(0); // Selecciona el primer elemento del ComboBox

        // Si tienes botones u otros componentes que necesitan restablecerse, puedes hacerlo aquí.
    }

    private void bloquearCampos() {
        jTFCedula.setEnabled(false);
        jTFNombres.setEnabled(false);
        jTFApellidos.setEnabled(false);
        jTFCorreo.setEnabled(false);
        jTFTelefono.setEnabled(false);
        jTFTelefonoAdicional.setEnabled(false);
        jTFCiudad.setEnabled(false);
        jCBRol.setEnabled(false);
        jCBActivo.setEnabled(false);
        jCBTípoLicencia.setEnabled(false);
        jTFAgencia.setEnabled(false);
        jBActualizar.setEnabled(false);
    }

    private void desbloquearCampos() {
        jTFTelefono.setEnabled(true);
        jTFTelefonoAdicional.setEnabled(true);
        jTFCiudad.setEnabled(true);
        jCBRol.setEnabled(true);
        jCBActivo.setEnabled(true);
        jTFAgencia.setEnabled(true);
        jBActualizar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPRegistroAdministrador = new javax.swing.JPanel();
        jLCédula = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jLApellidos = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLTeléfono = new javax.swing.JLabel();
        jLCiudad = new javax.swing.JLabel();
        jLRol = new javax.swing.JLabel();
        jTeléfonoAdicional = new javax.swing.JLabel();
        jCBRol = new javax.swing.JComboBox<>();
        jLTípoLicencia = new javax.swing.JLabel();
        jCBTípoLicencia = new javax.swing.JComboBox<>();
        jLActivo = new javax.swing.JLabel();
        jCBActivo = new javax.swing.JComboBox<>();
        jTFCedula = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFTelefonoAdicional = new javax.swing.JTextField();
        jTFCiudad = new javax.swing.JTextField();
        jLAgencia = new javax.swing.JLabel();
        jTFAgencia = new javax.swing.JTextField();
        jBValidarUsuario = new javax.swing.JButton();
        jLTablaAgencía1 = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCédula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLCédula.setText("Cédula:");

        jLNombres.setText("Nombres:");

        jLApellidos.setText("Apellidos:");

        jLCorreo.setText("Correo:");

        jLTeléfono.setText("Teléfono:");

        jLCiudad.setText("Ciudad:");

        jLRol.setText("Rol:");

        jTeléfonoAdicional.setText("Teléfono Adicional:");

        jCBRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado", "Conductor" }));
        jCBRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRolActionPerformed(evt);
            }
        });

        jLTípoLicencia.setText("Típo Licencia:");

        jCBTípoLicencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "B", "C", "E" }));

        jLActivo.setText("Activo:");

        jCBActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Desabilitado" }));

        jLAgencia.setText("Agencia:");

        jBValidarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBValidarUsuario.setText("Validar Usuario");
        jBValidarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBValidarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroAdministradorLayout = new javax.swing.GroupLayout(jPRegistroAdministrador);
        jPRegistroAdministrador.setLayout(jPRegistroAdministradorLayout);
        jPRegistroAdministradorLayout.setHorizontalGroup(
            jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroAdministradorLayout.createSequentialGroup()
                        .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jTeléfonoAdicional)
                                .addGap(67, 67, 67)
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFTelefonoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLTeléfono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jLTípoLicencia)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTípoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jLRol)
                                .addGap(18, 18, 18)
                                .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jLCiudad)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLActivo)
                                    .addComponent(jLAgencia))
                                .addGap(18, 18, 18)
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                        .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistroAdministradorLayout.createSequentialGroup()
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLApellidos)
                                    .addComponent(jLCorreo))
                                .addGap(18, 18, 18)
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistroAdministradorLayout.createSequentialGroup()
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombres)
                                    .addComponent(jLCédula))
                                .addGap(18, 18, 18)
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNombres)
                                    .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                        .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jBValidarUsuario)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 311, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPRegistroAdministradorLayout.setVerticalGroup(
            jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                        .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCédula)
                            .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroAdministradorLayout.createSequentialGroup()
                        .addComponent(jBValidarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRol)
                    .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombres)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTípoLicencia)
                    .addComponent(jCBTípoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidos)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLActivo)
                    .addComponent(jCBActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTeléfono)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAgencia))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeléfonoAdicional)
                    .addComponent(jTFTelefonoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCiudad))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLTablaAgencía1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLTablaAgencía1.setText("Edición de Usuarios");

        jBActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLTablaAgencía1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPRegistroAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTablaAgencía1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPRegistroAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        String cedula = jTFCedula.getText();
        administradorController.actualizarUsuario(this, cedula);
        resetearCampos();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBValidarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBValidarUsuarioActionPerformed
        cedula = jTFCedula.getText();
        administradorController.buscarUsuarioParaEdicion(this, cedula);
        desbloquearCampos();
    }//GEN-LAST:event_jBValidarUsuarioActionPerformed

    private void jCBRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRolActionPerformed
        String selectedRole = (String) jCBRol.getSelectedItem();

        // Habilitar campos según el rol seleccionado
        switch (selectedRole) {
            case "Administrador":
                // Campos adicionales para Administrador
                desbloquearCampos();
                break;
            case "Empleado":
                // Campos adicionales para Empleado
                desbloquearCampos();
                break;
            case "Conductor":
                desbloquearCampos();
                jCBTípoLicencia.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jCBRolActionPerformed

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
            java.util.logging.Logger.getLogger(AEdicionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AEdicionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AEdicionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AEdicionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AEdicionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    public javax.swing.JButton jBValidarUsuario;
    public javax.swing.JComboBox<String> jCBActivo;
    public javax.swing.JComboBox<String> jCBRol;
    public javax.swing.JComboBox<String> jCBTípoLicencia;
    private javax.swing.JLabel jLActivo;
    private javax.swing.JLabel jLAgencia;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLCédula;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLRol;
    private javax.swing.JLabel jLTablaAgencía1;
    private javax.swing.JLabel jLTeléfono;
    private javax.swing.JLabel jLTípoLicencia;
    public javax.swing.JPanel jPRegistroAdministrador;
    public javax.swing.JTextField jTFAgencia;
    public javax.swing.JTextField jTFApellidos;
    public javax.swing.JTextField jTFCedula;
    public javax.swing.JTextField jTFCiudad;
    public javax.swing.JTextField jTFCorreo;
    public javax.swing.JTextField jTFNombres;
    public javax.swing.JTextField jTFTelefono;
    public javax.swing.JTextField jTFTelefonoAdicional;
    private javax.swing.JLabel jTeléfonoAdicional;
    // End of variables declaration//GEN-END:variables
}
