/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package encomiendas.views.encomiendas;

import encomiendas.controllers.encomiendas.EncomiendaController;
import encomiendas.controllers.encomiendas.PaqueteController;
import encomiendas.database.Conexion;
import encomiendas.model.data.Agencia.AgenciaRepository;
import encomiendas.model.data.encomiendas.EncomiendaRepository;
import encomiendas.model.data.encomiendas.PaqueteRepository;
import encomiendas.model.data.usuarios.ClienteRepository;
import encomiendas.model.entity.encomiendas.Encomienda;
import encomiendas.services.encomiendas.EncomiendaService;
import encomiendas.services.encomiendas.PaqueteService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djimm
 */
public class JFInfoEncomiendas extends javax.swing.JFrame {

    Conexion con = new Conexion();
    private Encomienda encomienda = new Encomienda();
    PaqueteRepository paqueteRepository;
    PaqueteService paqueteService;
    PaqueteController paqueteController;

    EncomiendaRepository encomiendaRepository;
    EncomiendaController encomiendaController;

    ClienteRepository clienteRepository;
    AgenciaRepository agenciaRepository;

    EncomiendaService encomiedaService;

    JFListaPaquetes listaPaquetesView = new JFListaPaquetes();

    /**
     * Creates new form JFInfoEncomiendas
     */
    public JFInfoEncomiendas() {
        initComponents();
        this.setLocationRelativeTo(this);
        setTitle("Información de la encomienda");

        paqueteRepository = new PaqueteRepository(con.getInstance());
        clienteRepository = new ClienteRepository(con.getInstance());
        agenciaRepository = new AgenciaRepository(con.getInstance());

        paqueteService = new PaqueteService(paqueteRepository);
        paqueteController = new PaqueteController(this, paqueteService);

        encomiendaRepository = new EncomiendaRepository(con.getInstance());
        encomiedaService = new EncomiendaService(encomiendaRepository, clienteRepository, agenciaRepository, paqueteService);
        encomiendaController = new EncomiendaController(this, encomiedaService);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDesembarcar1 = new javax.swing.JButton();
        panelDatosEncomienda = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtIdEncomienda = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtcedulaEmisor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDCFechaEnvio = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckInterprovincial = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        JCheckDomicilio = new javax.swing.JCheckBox();
        txtEstadoEncomienda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAgenciaO = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCedulaReceptor = new javax.swing.JTextField();
        panelInterprovincial = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtAgenD = new javax.swing.JTextField();
        panelEntregaDomicilio = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDirEntrega = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodPostal = new javax.swing.JTextField();
        panelOpciones = new javax.swing.JPanel();
        btnVerPaquetes = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        panelOpEmpleado = new javax.swing.JPanel();
        btnDespachar = new javax.swing.JButton();
        panelConductores = new javax.swing.JPanel();
        btnDesembarcar = new javax.swing.JButton();
        btnEntregar = new javax.swing.JButton();
        btnEmbarcar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();

        btnDesembarcar1.setText("Desembarcar");
        btnDesembarcar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesembarcar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDatosEncomienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la encomienda"));

        jLabel16.setText("Número de cédula del receptor");

        txtIdEncomienda.setEditable(false);
        txtIdEncomienda.setOpaque(true);
        txtIdEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEncomiendaActionPerformed(evt);
            }
        });

        jLabel15.setText("Número de cédula del emisor");

        txtcedulaEmisor.setEditable(false);
        txtcedulaEmisor.setOpaque(true);
        txtcedulaEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaEmisorActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha de envío:");

        jDCFechaEnvio.setEnabled(false);

        jLabel13.setText("Agencia de origen");

        jLabel12.setText("Interprovincial:");

        jCheckInterprovincial.setEnabled(false);
        jCheckInterprovincial.setOpaque(true);
        jCheckInterprovincial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckInterprovincialActionPerformed(evt);
            }
        });

        jLabel11.setText("Entrega a domicilio:");

        JCheckDomicilio.setEnabled(false);
        JCheckDomicilio.setOpaque(true);
        JCheckDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCheckDomicilioActionPerformed(evt);
            }
        });

        txtEstadoEncomienda.setEditable(false);
        txtEstadoEncomienda.setOpaque(true);
        txtEstadoEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoEncomiendaActionPerformed(evt);
            }
        });

        jLabel17.setText("Estado de la encomienda:");

        txtAgenciaO.setEditable(false);
        txtAgenciaO.setOpaque(true);
        txtAgenciaO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgenciaOActionPerformed(evt);
            }
        });

        jLabel18.setText("Id Encomienda");

        txtCedulaReceptor.setEditable(false);
        txtCedulaReceptor.setOpaque(true);
        txtCedulaReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaReceptorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosEncomiendaLayout = new javax.swing.GroupLayout(panelDatosEncomienda);
        panelDatosEncomienda.setLayout(panelDatosEncomiendaLayout);
        panelDatosEncomiendaLayout.setHorizontalGroup(
            panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEncomiendaLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEstadoEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAgenciaO, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDCFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcedulaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(25, 25, 25)
                        .addComponent(jCheckInterprovincial)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11)
                        .addGap(17, 17, 17)
                        .addComponent(JCheckDomicilio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                        .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                                .addComponent(txtIdEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEncomiendaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtCedulaReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelDatosEncomiendaLayout.setVerticalGroup(
            panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEncomiendaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(21, 21, 21)
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCedulaReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcedulaEmisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCFechaEnvio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAgenciaO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtEstadoEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosEncomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jCheckInterprovincial)
                    .addComponent(jLabel11)
                    .addComponent(JCheckDomicilio))
                .addGap(51, 51, 51))
        );

        panelInterprovincial.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrega interprovincial"));

        jLabel8.setText("Agencia de destino:");

        txtAgenD.setEditable(false);
        txtAgenD.setOpaque(true);

        javax.swing.GroupLayout panelInterprovincialLayout = new javax.swing.GroupLayout(panelInterprovincial);
        panelInterprovincial.setLayout(panelInterprovincialLayout);
        panelInterprovincialLayout.setHorizontalGroup(
            panelInterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInterprovincialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(60, 60, 60)
                .addComponent(txtAgenD)
                .addContainerGap())
        );
        panelInterprovincialLayout.setVerticalGroup(
            panelInterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInterprovincialLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelInterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgenD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelEntregaDomicilio.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrega a domicilio"));

        jLabel9.setText("Dirección de entrega:");

        txtDirEntrega.setEditable(false);
        txtDirEntrega.setOpaque(true);

        jLabel10.setText("Codigo postal:");

        txtCodPostal.setEditable(false);
        txtCodPostal.setOpaque(true);

        javax.swing.GroupLayout panelEntregaDomicilioLayout = new javax.swing.GroupLayout(panelEntregaDomicilio);
        panelEntregaDomicilio.setLayout(panelEntregaDomicilioLayout);
        panelEntregaDomicilioLayout.setHorizontalGroup(
            panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntregaDomicilioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(52, 52, 52)
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDirEntrega)
                    .addComponent(txtCodPostal))
                .addContainerGap())
        );
        panelEntregaDomicilioLayout.setVerticalGroup(
            panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntregaDomicilioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDirEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnVerPaquetes.setText("Ver lista de paquetes");
        btnVerPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPaquetesActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerPaquetes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVerPaquetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelOpEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones de empleado"));

        btnDespachar.setText("Despachar");
        btnDespachar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespacharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpEmpleadoLayout = new javax.swing.GroupLayout(panelOpEmpleado);
        panelOpEmpleado.setLayout(panelOpEmpleadoLayout);
        panelOpEmpleadoLayout.setHorizontalGroup(
            panelOpEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDespachar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOpEmpleadoLayout.setVerticalGroup(
            panelOpEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDespachar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelConductores.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones del conductor"));

        btnDesembarcar.setText("Desembarcar");
        btnDesembarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesembarcarActionPerformed(evt);
            }
        });

        btnEntregar.setText("Entregar");
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        btnEmbarcar.setText("Embarcar");
        btnEmbarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmbarcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConductoresLayout = new javax.swing.GroupLayout(panelConductores);
        panelConductores.setLayout(panelConductoresLayout);
        panelConductoresLayout.setHorizontalGroup(
            panelConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConductoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmbarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDesembarcar, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(btnEntregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelConductoresLayout.setVerticalGroup(
            panelConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConductoresLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnDesembarcar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnEmbarcar)
                .addGap(18, 18, 18)
                .addComponent(btnEntregar)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMISalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDatosEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInterprovincial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEntregaDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConductores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatosEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelInterprovincial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEntregaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelOpEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelConductores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMISalirActionPerformed

    private void txtIdEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEncomiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEncomiendaActionPerformed

    private void txtcedulaEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaEmisorActionPerformed

    private void jCheckInterprovincialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckInterprovincialActionPerformed
        if (jCheckInterprovincial.isSelected()) {
            panelInterprovincial.setVisible(true);
        } else {
            panelInterprovincial.setVisible(false);
        }
    }//GEN-LAST:event_jCheckInterprovincialActionPerformed

    private void JCheckDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCheckDomicilioActionPerformed

        if (JCheckDomicilio.isSelected()) {
            panelEntregaDomicilio.setVisible(true);
        } else {
            panelEntregaDomicilio.setVisible(false);
        }
    }//GEN-LAST:event_JCheckDomicilioActionPerformed

    private void txtEstadoEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoEncomiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoEncomiendaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPaquetesActionPerformed
        JFListaPaquetes listaPaquetes = new JFListaPaquetes();
        listaPaquetes.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        listaPaquetes.setVisible(true);
        listaPaquetes.txtIdEncomienda.setText(txtIdEncomienda.getText().toString());
        paqueteController.mostrarPaquetes((DefaultTableModel) listaPaquetes.jTListaPaquetes.getModel(), Integer.parseInt(txtIdEncomienda.getText().toString()));

    }//GEN-LAST:event_btnVerPaquetesActionPerformed

    private void txtAgenciaOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgenciaOActionPerformed

    }//GEN-LAST:event_txtAgenciaOActionPerformed

    private void btnDespacharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespacharActionPerformed
        try {
            encomiendaController.actionPerformedInfo(evt);
        } catch (SQLException ex) {
            Logger.getLogger(JFInfoEncomiendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDespacharActionPerformed

    private void btnDesembarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesembarcarActionPerformed
        try {
            encomiendaController.actionPerformedInfo(evt);
        } catch (SQLException ex) {
            Logger.getLogger(JFInfoEncomiendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDesembarcarActionPerformed

    private void btnDesembarcar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesembarcar1ActionPerformed
        try {
            encomiendaController.actionPerformedInfo(evt);
        } catch (SQLException ex) {
            Logger.getLogger(JFInfoEncomiendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDesembarcar1ActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        try {
            encomiendaController.actionPerformedInfo(evt);
        } catch (SQLException ex) {
            Logger.getLogger(JFInfoEncomiendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnEmbarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmbarcarActionPerformed
        try {
            encomiendaController.actionPerformedInfo(evt);
        } catch (SQLException ex) {
            Logger.getLogger(JFInfoEncomiendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEmbarcarActionPerformed

    private void txtCedulaReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaReceptorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaReceptorActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(JFInfoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInfoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInfoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInfoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInfoEncomiendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox JCheckDomicilio;
    private javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnDesembarcar;
    public javax.swing.JButton btnDesembarcar1;
    public javax.swing.JButton btnDespachar;
    public javax.swing.JButton btnEmbarcar;
    public javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnVerPaquetes;
    private javax.swing.JButton btnVolver;
    public javax.swing.JCheckBox jCheckInterprovincial;
    public com.toedter.calendar.JDateChooser jDCFechaEnvio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelConductores;
    private javax.swing.JPanel panelDatosEncomienda;
    private javax.swing.JPanel panelEntregaDomicilio;
    private javax.swing.JPanel panelInterprovincial;
    private javax.swing.JPanel panelOpEmpleado;
    private javax.swing.JPanel panelOpciones;
    public javax.swing.JTextField txtAgenD;
    public javax.swing.JTextField txtAgenciaO;
    public javax.swing.JTextField txtCedulaReceptor;
    public javax.swing.JTextField txtCodPostal;
    public javax.swing.JTextField txtDirEntrega;
    public javax.swing.JTextField txtEstadoEncomienda;
    public javax.swing.JTextField txtIdEncomienda;
    public javax.swing.JTextField txtcedulaEmisor;
    // End of variables declaration//GEN-END:variables
}
