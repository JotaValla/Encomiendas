package encomiendas.views.usuarios;

import encomiendas.controllers.usuarios.AdministradorController;
import encomiendas.database.Conexion;
import encomiendas.model.data.usuarios.UsuarioRepository;
import encomiendas.services.usuarios.UsuarioService;
import encomiendas.views.encomiendas.JFEncomiendas;
import java.awt.BorderLayout;

public class MenuAdministrador extends javax.swing.JFrame {

    Conexion con = new Conexion();

    UsuarioRepository usuarioRepository;
    UsuarioService usuarioService;
    AdministradorController administradorController;
    
    public MenuAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Lista de usuarios");

        //instancia del controlador
        usuarioRepository = new UsuarioRepository(con.getInstance());
        usuarioService = new UsuarioService(usuarioRepository);
        administradorController = new AdministradorController(this, usuarioService);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMenúAdministrador = new javax.swing.JPanel();
        jPAdministradorMétodos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLAdministrador = new javax.swing.JLabel();
        jTFUsuarioAdministrador = new javax.swing.JTextField();
        btListaUsuarios = new javax.swing.JButton();
        btIngresoUsuarios = new javax.swing.JButton();
        btnAbrirEncomiendas = new javax.swing.JButton();
        btActualizarUsuarios1 = new javax.swing.JButton();
        jFrameAdministrador = new javax.swing.JPanel();
        jLBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú - Administrador");
        setResizable(false);

        jPMenúAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPAdministradorMétodos.setBackground(new java.awt.Color(0, 0, 0));
        jPAdministradorMétodos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getSize()-2f));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo - copia.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPAdministradorMétodos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 90));

        jLAdministrador.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLAdministrador.setText("Administrador:");
        jPAdministradorMétodos.add(jLAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jTFUsuarioAdministrador.setEditable(false);
        jPAdministradorMétodos.add(jTFUsuarioAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, -1));

        btListaUsuarios.setBackground(new java.awt.Color(200, 0, 0));
        btListaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btListaUsuarios.setText("Lista de Usuarios");
        btListaUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jPAdministradorMétodos.add(btListaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 30));

        btIngresoUsuarios.setBackground(new java.awt.Color(200, 0, 0));
        btIngresoUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btIngresoUsuarios.setText("Ingreso Usuarios");
        btIngresoUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jPAdministradorMétodos.add(btIngresoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 150, 30));

        btnAbrirEncomiendas.setBackground(new java.awt.Color(200, 0, 0));
        btnAbrirEncomiendas.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirEncomiendas.setText("Abrir encomiendas");
        btnAbrirEncomiendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        btnAbrirEncomiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirEncomiendasActionPerformed(evt);
            }
        });
        jPAdministradorMétodos.add(btnAbrirEncomiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, 30));

        btActualizarUsuarios1.setBackground(new java.awt.Color(200, 0, 0));
        btActualizarUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        btActualizarUsuarios1.setText("Actualizar Usuarios");
        btActualizarUsuarios1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jPAdministradorMétodos.add(btActualizarUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 150, 30));

        jPMenúAdministrador.add(jPAdministradorMétodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 430));

        jFrameAdministrador.setBackground(new java.awt.Color(37, 37, 61));

        jLBienvenida.setFont(new java.awt.Font("Segoe UI", 3, 44)); // NOI18N
        jLBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        jLBienvenida.setText("BIENVENIDO ");

        javax.swing.GroupLayout jFrameAdministradorLayout = new javax.swing.GroupLayout(jFrameAdministrador);
        jFrameAdministrador.setLayout(jFrameAdministradorLayout);
        jFrameAdministradorLayout.setHorizontalGroup(
            jFrameAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameAdministradorLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLBienvenida)
                .addGap(195, 195, 195))
        );
        jFrameAdministradorLayout.setVerticalGroup(
            jFrameAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAdministradorLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jPMenúAdministrador.add(jFrameAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 690, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenúAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenúAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirEncomiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirEncomiendasActionPerformed
        JFEncomiendas viewEncomiendas = new JFEncomiendas();
        viewEncomiendas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewEncomiendas.setVisible(true);
    }//GEN-LAST:event_btnAbrirEncomiendasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btActualizarUsuarios1;
    public javax.swing.JButton btIngresoUsuarios;
    public javax.swing.JButton btListaUsuarios;
    public javax.swing.JButton btnAbrirEncomiendas;
    private javax.swing.JPanel jFrameAdministrador;
    private javax.swing.JLabel jLAdministrador;
    private javax.swing.JLabel jLBienvenida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPAdministradorMétodos;
    private javax.swing.JPanel jPMenúAdministrador;
    public javax.swing.JTextField jTFUsuarioAdministrador;
    // End of variables declaration//GEN-END:variables
}
