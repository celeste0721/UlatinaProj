/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quiz2mcva;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author celes
 */
public class FrmPrincipal extends javax.swing.JFrame {

    
ArrayList<Administrativo>listaAd=new ArrayList<>();
ArrayList<Administrativo>listaTxtAdmin=new ArrayList<>();
ArrayList<MecanicoGeneral>listaMec=new ArrayList<>();
ArrayList<MecanicoGeneral>listaTxtMec=new ArrayList<>();

String Cedula;
String Nombre;
String Apellido1;
String Apellido2;
String Correo;
int Edad;
String GradoAcademico;
int anniosExperienciaMec; 



    public FrmPrincipal() {
       CargarDatostxtMec();
        CargarDatostxt();
        
        initComponents();
        
        
        ReadDataTableAdmin();
        ReadDataTableMec();
        
        
        this.setLocationRelativeTo(null);
        
        
         tblAdministrativo.addMouseListener(new MouseAdapter() 
        {
            DefaultTableModel model=new DefaultTableModel();
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int i= tblAdministrativo.getSelectedRow();
                Cedula=tblAdministrativo.getValueAt(i,0).toString();
                Nombre=tblAdministrativo.getValueAt(i,1).toString();
                Apellido1=tblAdministrativo.getValueAt(i,2).toString();
                Apellido2=tblAdministrativo.getValueAt(i,3).toString();
                Edad= Integer.parseInt(tblAdministrativo.getValueAt(i,4).toString());
                Correo=tblAdministrativo.getValueAt(i,5).toString();
                GradoAcademico=tblAdministrativo.getValueAt(i,6).toString();
           
                
            
            }
        }
        
        
        
        );
        
        
        
                 tblMecanico.addMouseListener(new MouseAdapter() 
        {
            DefaultTableModel model2=new DefaultTableModel();
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int i= tblMecanico.getSelectedRow();
                Cedula=tblMecanico.getValueAt(i,0).toString();
                Nombre=tblMecanico.getValueAt(i,1).toString();
                Apellido1=tblMecanico.getValueAt(i,2).toString();
                Apellido2=tblMecanico.getValueAt(i,3).toString();
                Edad= Integer.parseInt(tblMecanico.getValueAt(i,4).toString());
                Correo=tblMecanico.getValueAt(i,5).toString();
                anniosExperienciaMec=Integer.parseInt(tblMecanico.getValueAt(i,6).toString());
           
                
            
            }
        }
        
        
        
        );
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winadministrativo = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdministrativo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGradoA = new javax.swing.JTextField();
        btnGuardarAdm = new javax.swing.JButton();
        btnActualizarAdm = new javax.swing.JButton();
        btnEliminarAdm = new javax.swing.JButton();
        ErrorNom = new javax.swing.JLabel();
        ErrorApe1 = new javax.swing.JLabel();
        ErrorApe2 = new javax.swing.JLabel();
        ErrorCorre = new javax.swing.JLabel();
        ErrorEdad = new javax.swing.JLabel();
        ErrorGradAca = new javax.swing.JLabel();
        winmecanico = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMecanico = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCedulaMe = new javax.swing.JTextField();
        txtNombreMe = new javax.swing.JTextField();
        txtApe1Mec = new javax.swing.JTextField();
        txtApe2Mec = new javax.swing.JTextField();
        txtCorreoMec = new javax.swing.JTextField();
        txtEdadMec = new javax.swing.JTextField();
        txtAnnoExpMec = new javax.swing.JTextField();
        btnGuardarMec = new javax.swing.JButton();
        btnActualizarMec = new javax.swing.JButton();
        btnEliminarMec = new javax.swing.JButton();
        ErrNomMe = new javax.swing.JLabel();
        ErrorApe1Me = new javax.swing.JLabel();
        ErroApe2Mec = new javax.swing.JLabel();
        ErrorCorreMe = new javax.swing.JLabel();
        ErrorEdaMec = new javax.swing.JLabel();
        ErrorAnioExMec = new javax.swing.JLabel();
        btnAdministrativo = new javax.swing.JButton();
        btnMecanico = new javax.swing.JButton();

        winadministrativo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblAdministrativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "I Apellido", "II Apellido", "Edad", "Correo", "Grado Academico", "Salario"
            }
        ));
        tblAdministrativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdministrativoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAdministrativo);

        jLabel2.setText("Cedula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("I Apellido:");

        jLabel1.setText("II Apellido:");

        jLabel5.setText("Correo:");

        jLabel6.setText("Edad:");

        jLabel7.setText("Grado Academico:");

        btnGuardarAdm.setText("Guardar");
        btnGuardarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAdmActionPerformed(evt);
            }
        });

        btnActualizarAdm.setText("Actualizar");
        btnActualizarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdmActionPerformed(evt);
            }
        });

        btnEliminarAdm.setText("Eliminar");
        btnEliminarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdmActionPerformed(evt);
            }
        });

        ErrorNom.setForeground(new java.awt.Color(255, 0, 0));

        ErrorApe1.setForeground(new java.awt.Color(255, 0, 0));

        ErrorApe2.setForeground(new java.awt.Color(255, 0, 51));

        ErrorCorre.setForeground(new java.awt.Color(255, 0, 0));

        ErrorEdad.setForeground(new java.awt.Color(255, 0, 0));

        ErrorGradAca.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout winadministrativoLayout = new javax.swing.GroupLayout(winadministrativo.getContentPane());
        winadministrativo.getContentPane().setLayout(winadministrativoLayout);
        winadministrativoLayout.setHorizontalGroup(
            winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winadministrativoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErrorGradAca, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErrorNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErrorApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorApe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ErrorCorre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ErrorEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGradoA, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarAdm)
                        .addGap(176, 176, 176)
                        .addComponent(btnActualizarAdm)
                        .addGap(208, 208, 208)
                        .addComponent(btnEliminarAdm)
                        .addGap(72, 72, 72))))
        );
        winadministrativoLayout.setVerticalGroup(
            winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winadministrativoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ErrorNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ErrorApe1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ErrorApe2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ErrorCorre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ErrorEdad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ErrorGradAca))
                .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtGradoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(winadministrativoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(winadministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarAdm)
                            .addComponent(btnActualizarAdm)
                            .addComponent(btnEliminarAdm))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        winmecanico.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblMecanico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "I Apellido", "II Apellido", "Edad", "Correo", "Años Exp", "Informacion"
            }
        ));
        tblMecanico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMecanicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMecanico);

        jLabel8.setText("Cedula:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("I Apellido:");

        jLabel11.setText("II Apellido:");

        jLabel12.setText("Correo:");

        jLabel13.setText("Edad:");

        jLabel14.setText("Años de Experiencia:");

        btnGuardarMec.setText("Guardar");
        btnGuardarMec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMecActionPerformed(evt);
            }
        });

        btnActualizarMec.setText("Actualizar");
        btnActualizarMec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMecActionPerformed(evt);
            }
        });

        btnEliminarMec.setText("Eliminar");
        btnEliminarMec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMecActionPerformed(evt);
            }
        });

        ErrNomMe.setForeground(new java.awt.Color(255, 0, 0));

        ErrorApe1Me.setForeground(new java.awt.Color(255, 0, 0));

        ErroApe2Mec.setForeground(new java.awt.Color(255, 0, 0));

        ErrorCorreMe.setForeground(new java.awt.Color(255, 0, 0));

        ErrorEdaMec.setForeground(new java.awt.Color(255, 0, 0));

        ErrorAnioExMec.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout winmecanicoLayout = new javax.swing.GroupLayout(winmecanico.getContentPane());
        winmecanico.getContentPane().setLayout(winmecanicoLayout);
        winmecanicoLayout.setHorizontalGroup(
            winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winmecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winmecanicoLayout.createSequentialGroup()
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(winmecanicoLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ErrorApe1Me, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, winmecanicoLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ErrNomMe, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winmecanicoLayout.createSequentialGroup()
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApe2Mec, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreoMec, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdadMec, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreMe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApe1Mec, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(188, 188, 188))
                    .addGroup(winmecanicoLayout.createSequentialGroup()
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ErrorEdaMec, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(winmecanicoLayout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ErrorAnioExMec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtAnnoExpMec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCedulaMe, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(winmecanicoLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ErroApe2Mec, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ErrorCorreMe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(winmecanicoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(winmecanicoLayout.createSequentialGroup()
                        .addComponent(btnGuardarMec)
                        .addGap(179, 179, 179)
                        .addComponent(btnActualizarMec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarMec)
                        .addGap(41, 41, 41))))
        );
        winmecanicoLayout.setVerticalGroup(
            winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winmecanicoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winmecanicoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarMec)
                            .addComponent(btnActualizarMec)
                            .addComponent(btnEliminarMec))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(winmecanicoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(14, 14, 14)
                        .addComponent(txtCedulaMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ErrNomMe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ErrorApe1Me))
                        .addGap(11, 11, 11)
                        .addComponent(txtApe1Mec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ErroApe2Mec))
                        .addGap(16, 16, 16)
                        .addComponent(txtApe2Mec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ErrorCorreMe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreoMec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(ErrorEdaMec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadMec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(winmecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(ErrorAnioExMec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnnoExpMec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAdministrativo.setText("Administrativo");
        btnAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrativoActionPerformed(evt);
            }
        });

        btnMecanico.setText("Mecánico General");
        btnMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMecanicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(btnAdministrativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(btnMecanico)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdministrativo)
                    .addComponent(btnMecanico))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrativoActionPerformed
        winadministrativo.setVisible(true);
        winadministrativo.setSize(940,583);
        winadministrativo.setTitle("Ventana Administrativo");
    }//GEN-LAST:event_btnAdministrativoActionPerformed

    private void btnMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMecanicoActionPerformed
        winmecanico.setVisible(true);
        winmecanico.setSize(940,583);
        winmecanico.setTitle("Ventana Mecanico");
    }//GEN-LAST:event_btnMecanicoActionPerformed

    private void tblAdministrativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdministrativoMouseClicked
        txtcedula.setText(Cedula);
        txtcedula.setEnabled(false);
        txtNombre.setText(Nombre);
        txtApellido1.setText(Apellido1);
        txtApellido2.setText(Apellido2);
        txtCorreo.setText(Correo);
        txtEdad.setText(String.valueOf(Edad));
        txtGradoA.setText(GradoAcademico);

        btnGuardarAdm.setEnabled(false);

    }//GEN-LAST:event_tblAdministrativoMouseClicked

    private void btnGuardarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAdmActionPerformed

        if(verificarCedulaAdmin()== false & !txtcedula.getText().isEmpty() & !txtNombre.getText().isEmpty() & !txtApellido1.getText().isEmpty() & !txtApellido2.getText().isEmpty()  & !txtEdad.getText().isEmpty() & !txtCorreo.getText().isEmpty() & !txtGradoA.getText().isEmpty()){
        Administrativo administrativo=new Administrativo(txtGradoA.getText(),txtcedula.getText(),txtNombre.getText(),txtApellido1.getText(),txtApellido2.getText(),txtCorreo.getText(),Integer.parseInt(txtEdad.getText()));
         listaAd.add(administrativo);
         LimpiarCasillasAdmin();
         ReadDataTableAdmin();
        }else{
             if (verificarCedulaAdmin() == true) {

                JOptionPane.showMessageDialog(null, "La Cedula Ingresada ya se encuentra registrada");
            }

            if (txtcedula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La Cedula se encuentra en blanco");
            }

            if (txtNombre.getText().isEmpty()) {
                ErrorNom.setText("Ingrese un Dato");
            } else {
                ErrorNom.setText("");
            }

            if (txtApellido1.getText().isEmpty()) {
                ErrorApe1.setText("Ingrese un Dato");
            } else {
                ErrorApe1.setText("");
            }

            if (txtApellido2.getText().isEmpty()) {
                ErrorApe2.setText("Ingrese un Dato");
            } else {
                ErrorApe2.setText("");
            }
            
            if(txtEdad.getText().isEmpty())
            {
            ErrorEdad.setText("Ingrese un Dato");
            }else{
                ErrorEdad.setText("");
            }
            

            if (txtCorreo.getText().isEmpty()) {
                ErrorCorre.setText("Ingrese un Dato");
            } else {
                ErrorCorre.setText("");
            }

            if (txtGradoA.getText().isEmpty()) {
                ErrorGradAca.setText("Ingrese un Dato");
            } else {
                ErrorGradAca.setText("");
            }

        
        
            
            
            
            
        }
        
        
        
    }//GEN-LAST:event_btnGuardarAdmActionPerformed

    private void btnActualizarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdmActionPerformed
                for (int i = 0; i < listaAd.size(); i++) {

            if (txtcedula.getText().equals(listaAd.get(i).getCedula())) {

                listaAd.get(i).setCedula(txtcedula.getText());
                listaAd.get(i).setNombre(txtNombre.getText());
                listaAd.get(i).setApellido1(txtApellido1.getText());
                listaAd.get(i).setApellido2(txtApellido2.getText());
                listaAd.get(i).setEdad(Integer.parseInt(txtEdad.getText()));
                listaAd.get(i).setCorreo(txtCorreo.getText());
                listaAd.get(i).setGradoAcademico(txtGradoA.getText());

                  
            }
        }
        updateTxtAdministrativ();
        ReadDataTableAdmin();
        LimpiarCasillasAdmin();

    }//GEN-LAST:event_btnActualizarAdmActionPerformed

    private void btnEliminarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdmActionPerformed
        for (int i = 0; i < listaAd.size(); i++) {
            
            if(Cedula.equals(listaAd.get(i).getCedula()))
            {
            listaAd.remove(i);
            }    
        }
        ReadDataTableAdmin();
        updateTxtAdministrativ();

    }//GEN-LAST:event_btnEliminarAdmActionPerformed

    private void btnGuardarMecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMecActionPerformed

        
        if(verificarCedulaMec()== false & !txtCedulaMe.getText().isEmpty() & !txtNombreMe.getText().isEmpty() & !txtApe1Mec.getText().isEmpty() & !txtApe2Mec.getText().isEmpty()  & !txtEdadMec.getText().isEmpty() & !txtCorreoMec.getText().isEmpty() & !txtAnnoExpMec.getText().isEmpty()){
    MecanicoGeneral mecanicogeneral=new MecanicoGeneral(Integer.parseInt(txtAnnoExpMec.getText()),txtCedulaMe.getText(),txtNombreMe.getText(),txtApe1Mec.getText(),txtApe2Mec.getText(),txtCorreoMec.getText(),Integer.parseInt(txtEdadMec.getText()));
    listaMec.add(mecanicogeneral);
    updateTxtMec();
    LimpiarCasillasMeca();
    ReadDataTableMec();
        
        }else{
            
         if (verificarCedulaMec() == true) {

                JOptionPane.showMessageDialog(null, "La Cedula Ingresada ya se encuentra registrada");
            }

            if (txtCedulaMe.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La Cedula se encuentra en blanco");
            }

            if (txtNombreMe.getText().isEmpty()) {
                ErrNomMe.setText("Ingrese un Dato");
            } else {
                ErrNomMe.setText("");
            }

            if (txtApe1Mec.getText().isEmpty()) {
                ErrorApe1Me.setText("Ingrese un Dato");
            } else {
                ErrorApe2.setText("");
            }

            if (txtApe2Mec.getText().isEmpty()) {
                ErroApe2Mec.setText("Ingrese un Dato");
            } else {
                ErroApe2Mec.setText("");
            }
            
            if(txtEdadMec.getText().isEmpty())
            {
            ErrorEdaMec.setText("Ingrese un Dato");
            }else{
                ErrorEdaMec.setText("");
            }
            


            if (txtCorreoMec.getText().isEmpty()) {
                ErrorCorreMe.setText("Ingrese un Dato");
            } else {
                ErrorCorreMe.setText("");
            }

            if (txtAnnoExpMec.getText().isEmpty()) {
                ErrorAnioExMec.setText("Ingrese un Dato");
            } else {
                 ErrorAnioExMec.setText("");
            }
            

            
            
            }

        
    }//GEN-LAST:event_btnGuardarMecActionPerformed

    private void btnActualizarMecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMecActionPerformed
            
        for (int i = 0; i < listaMec.size(); i++) {

            if (txtCedulaMe.getText().equals(listaMec.get(i).getCedula())) {

                listaMec.get(i).setCedula(txtCedulaMe.getText());
                listaMec.get(i).setNombre(txtNombreMe.getText());
                listaMec.get(i).setApellido1(txtApe1Mec.getText());
                listaMec.get(i).setApellido2(txtApe2Mec.getText());
                listaMec.get(i).setEdad(Integer.parseInt(txtEdadMec.getText()));
                listaMec.get(i).setCorreo(txtCorreoMec.getText());
                listaMec.get(i).setAnniosExperiencia(Integer.parseInt(txtAnnoExpMec.getText()));

                  
            }
        }
        ReadDataTableMec();
        LimpiarCasillasMeca();
        updateTxtMec();

        
        
        
        
    }//GEN-LAST:event_btnActualizarMecActionPerformed

    private void btnEliminarMecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMecActionPerformed
        for (int i = 0; i < listaMec.size(); i++) {
            
            if(Cedula.equals(listaMec.get(i).getCedula()))
            {
            listaMec.remove(i);
            }    
        }
        ReadDataTableMec();
        updateTxtMec();
    }//GEN-LAST:event_btnEliminarMecActionPerformed

    private void tblMecanicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMecanicoMouseClicked
        txtCedulaMe.setText(Cedula);
        txtCedulaMe.setEnabled(false);
        txtNombreMe.setText(Nombre);
        txtApe1Mec.setText(Apellido1);
        txtApe2Mec.setText(Apellido2);
        txtCorreoMec.setText(Correo);
        txtEdadMec.setText(String.valueOf(Edad));
        txtAnnoExpMec.setText(String.valueOf(anniosExperienciaMec));

        btnGuardarMec.setEnabled(false);
        
        
        
    }//GEN-LAST:event_tblMecanicoMouseClicked

    
      
        public void LimpiarCasillasAdmin(){
    
        txtcedula.setText("");
        txtcedula.setEditable(true);
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtEdad.setText("");
        txtCorreo.setText("");
        txtGradoA.setText("");
        btnGuardarAdm.setEnabled(true);
        
        ErrorNom.setText("");
        ErrorApe1.setText("");
        ErrorApe2.setText("");
        ErrorEdad.setText("");
        ErrorCorre.setText("");
        ErrorGradAca.setText("");

        
        
    }
    
    public void updateTxtAdministrativ(){
        
        ContentAdminTxT.AnadirDatos(listaAd);
    }
    
    public void CargarDatostxt(){
        
        listaTxtAdmin=ContentAdminTxT.LeerDatos();
        listaAd=listaTxtAdmin;
    }
    
    public void ReadDataTableAdmin(){
        
        String matriz[][]=new String[listaAd.size()][8];
        
        for (int i = 0; i < listaAd.size(); i++) {
            
            matriz[i][0]=listaAd.get(i).getCedula();
            matriz[i][1]=listaAd.get(i).getNombre();
            matriz[i][2]=listaAd.get(i).getApellido1();
            matriz[i][3]=listaAd.get(i).getApellido2();
            matriz[i][4]=String.valueOf(listaAd.get(i).getEdad());
            matriz[i][5]=listaAd.get(i).getCorreo();
            matriz[i][6]=String.valueOf(listaAd.get(i).getGradoAcademico());
            matriz[i][7]=String.valueOf(listaAd.get(i).Informacion());

        }
        tblAdministrativo.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Cedula","Nombre","ApellidoI","ApellidoII","Edad","Correo","Grado Academico","Salario"}));
        
    }
    
    public boolean verificarCedulaAdmin(){
        
        boolean var1=false;
        CargarDatostxt();
        
        for (int i = 0; i < listaAd.size(); i++) {
            
            if(txtcedula.getText().equals(listaAd.get(i).getCedula())){
            var1=true;
            }
            
        }
        
    return var1;
    }
    
    
    
    
    
   ///////////////////////////////////////////////////////////////
    
        public void LimpiarCasillasMeca(){
    
        txtCedulaMe.setText("");
        txtCedulaMe.setEditable(true);
        txtNombreMe.setText("");
        txtApe1Mec.setText("");
        txtApe2Mec.setText("");
        txtEdadMec.setText("");
        txtCorreoMec.setText("");
        txtAnnoExpMec.setText("");
        btnGuardarMec.setEnabled(true);
        
        ErrNomMe.setText("");
        ErrorApe1Me.setText("");
        ErroApe2Mec.setText("");
        ErrorCorreMe.setText("");
        ErrorEdaMec.setText("");
        ErrorAnioExMec.setText("");

        
        
    }
    
    public void updateTxtMec(){
        
        ContentMecanicoTxT.AnadirDatosMec(listaMec);
    }
    
    public void CargarDatostxtMec(){
        listaTxtMec=ContentMecanicoTxT.LeerDatosMec();
        listaMec=listaTxtMec;
    }
    
    public void ReadDataTableMec(){
        
        String matriz[][]=new String[listaMec.size()][8];
        
        for (int i = 0; i < listaMec.size(); i++) {
            
            matriz[i][0]=listaMec.get(i).getCedula();
            matriz[i][1]=listaMec.get(i).getNombre();
            matriz[i][2]=listaMec.get(i).getApellido1();
            matriz[i][3]=listaMec.get(i).getApellido2();
            matriz[i][4]=String.valueOf(listaMec.get(i).getEdad());
            matriz[i][5]=String.valueOf(listaMec.get(i).getCorreo()); //Correo
            matriz[i][6]=String.valueOf(listaMec.get(i).getAnniosExperiencia());  //Anio exp
            matriz[i][7]=String.valueOf(listaMec.get(i).Informacion()); //Inof

        }
        tblMecanico.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"Cedula","Nombre","ApellidoI","ApellidoII","Edad","Correo","Annios Experiencia","Informacion"}));
        
    }
    
    public boolean verificarCedulaMec(){
        
        boolean var1=false;
        CargarDatostxt();
        
        for (int i = 0; i < listaMec.size(); i++) {
            
            if(txtCedulaMe.getText().equals(listaMec.get(i).getCedula())){
            var1=true;
            }
            
        }
        
    return var1;
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrNomMe;
    private javax.swing.JLabel ErroApe2Mec;
    private javax.swing.JLabel ErrorAnioExMec;
    private javax.swing.JLabel ErrorApe1;
    private javax.swing.JLabel ErrorApe1Me;
    private javax.swing.JLabel ErrorApe2;
    private javax.swing.JLabel ErrorCorre;
    private javax.swing.JLabel ErrorCorreMe;
    private javax.swing.JLabel ErrorEdaMec;
    private javax.swing.JLabel ErrorEdad;
    private javax.swing.JLabel ErrorGradAca;
    private javax.swing.JLabel ErrorNom;
    private javax.swing.JButton btnActualizarAdm;
    private javax.swing.JButton btnActualizarMec;
    private javax.swing.JButton btnAdministrativo;
    private javax.swing.JButton btnEliminarAdm;
    private javax.swing.JButton btnEliminarMec;
    private javax.swing.JButton btnGuardarAdm;
    private javax.swing.JButton btnGuardarMec;
    private javax.swing.JButton btnMecanico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAdministrativo;
    private javax.swing.JTable tblMecanico;
    private javax.swing.JTextField txtAnnoExpMec;
    private javax.swing.JTextField txtApe1Mec;
    private javax.swing.JTextField txtApe2Mec;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCedulaMe;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoMec;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdadMec;
    private javax.swing.JTextField txtGradoA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMe;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JDialog winadministrativo;
    private javax.swing.JDialog winmecanico;
    // End of variables declaration//GEN-END:variables
}
