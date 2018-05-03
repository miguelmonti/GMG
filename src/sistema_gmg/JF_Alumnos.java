/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_gmg;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.util.logging.*;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author mike
 */
public class JF_Alumnos extends javax.swing.JFrame {

    private Connection conexion = null;
    private Statement st;
    private ResultSet rs;
    private TableModel alumnos; 
    JF_Principal principal;

    public JF_Alumnos(JF_Principal principal) {
        setTitle("Alumnos");
        this.principal = principal;
        initComponents();
        //this.JF_Principal = new JF_Principal();
    }

    public JF_Alumnos() {
        initComponents();
        Conectar();
    }

    public void Conectar() {
        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistema_gmg", "root", "1405");

            st = conexion.createStatement();

            //Modificaciones
            rs = st.executeQuery("Select *from alumnos");
            jt_alumnos.setModel(DbUtils.resultSetToTableModel(rs));
            rs.next();

            rs = st.executeQuery("Select * from alumnos");
            rs.next();            

            this.jtf_id_alumno.setText(rs.getString("id_alumno"));

            this.jtf_nombre_alum.setText(rs.getString("nombre_alum"));

            this.jtf_ap_paterno_alum.setText(rs.getString("ap_paterno_alum"));

            this.jtf_ap_materno_alum.setText(rs.getString("ap_materno_alum"));

            this.jtf_curp.setText(rs.getString("curp"));

            this.jtf_f_nacimiento.setText(rs.getString("f_nacimiento"));

            jb_cancelar.setEnabled(false);
            jb_guardar.setEnabled(false);
            jb_actualizar.setEnabled(false);

            jb_primero.setEnabled(true);
            jb_ultimo.setEnabled(true);
            jb_siguiente.setEnabled(true);
            jb_anterior.setEnabled(true);
            jb_buscar.setEnabled(true);
            jb_borrar.setEnabled(true);
            jb_editar.setEnabled(true);
            jb_nuevo.setEnabled(true);

            //todos los textfield se bloquean y los id se ponen invisibles con el metodo setVisible
            jtf_id_alumno.setVisible(false);
            jtf_id_alumno.setEditable(false);
            jtf_nombre_alum.setEditable(false);
            jtf_ap_paterno_alum.setEditable(false);
            jtf_ap_materno_alum.setEditable(false);
            jtf_curp.setEditable(false);
            jtf_f_nacimiento.setEditable(false);

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "No se ha detectado conexión con la base de datos", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_tabla = new javax.swing.JPanel();
        jl_menu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttons_2 = new javax.swing.JPanel();
        jb_nuevo = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jl_f_nacimiento = new javax.swing.JLabel();
        jl_nombre_alum = new javax.swing.JLabel();
        jl_curp = new javax.swing.JLabel();
        jl_ap_paterno_alum = new javax.swing.JLabel();
        jl_ap_materno_alum = new javax.swing.JLabel();
        jtf_nombre_alum = new javax.swing.JTextField();
        jtf_ap_paterno_alum = new javax.swing.JTextField();
        jtf_ap_materno_alum = new javax.swing.JTextField();
        jtf_f_nacimiento = new javax.swing.JTextField();
        jtf_curp = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jb_siguiente = new javax.swing.JButton();
        jb_ultimo = new javax.swing.JButton();
        jb_primero = new javax.swing.JButton();
        jb_anterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jtf_id_alumno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jt_alumno = new javax.swing.JScrollPane();
        jt_alumnos = new javax.swing.JTable();
        jb_buscar = new javax.swing.JButton();
        jtf_buscar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alumnos");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("jf_alumno"); // NOI18N
        setResizable(false);

        panel_tabla.setBackground(new java.awt.Color(10, 34, 64));

        jl_menu.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jl_menu.setForeground(new java.awt.Color(255, 255, 255));
        jl_menu.setText("Menú");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        buttons_2.setBackground(new java.awt.Color(106, 116, 145));

        jb_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new.png"))); // NOI18N
        jb_nuevo.setText("Nuevo");
        jb_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_nuevoMouseClicked(evt);
            }
        });

        jb_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        jb_borrar.setText("Borrar");
        jb_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarMouseClicked(evt);
            }
        });
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jb_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Guardar Filled-50.png"))); // NOI18N
        jb_guardar.setText("Guardar");
        jb_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarMouseClicked(evt);
            }
        });

        jb_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        jb_editar.setText("Editar");
        jb_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_editarMouseClicked(evt);
            }
        });

        jb_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciclo.png"))); // NOI18N
        jb_actualizar.setText("Actualizar");
        jb_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_actualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttons_2Layout = new javax.swing.GroupLayout(buttons_2);
        buttons_2.setLayout(buttons_2Layout);
        buttons_2Layout.setHorizontalGroup(
            buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttons_2Layout.createSequentialGroup()
                .addGroup(buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_guardar)
                    .addGroup(buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttons_2Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jb_nuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jb_editar, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(buttons_2Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jb_borrar))
                        .addGroup(buttons_2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jb_actualizar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttons_2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jb_cancelar))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        buttons_2Layout.setVerticalGroup(
            buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttons_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jb_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jb_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        jb_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tablaLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(buttons_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tablaLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_tablaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jl_menu))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_tablaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jb_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jb_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jl_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttons_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));

        jl_f_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jl_f_nacimiento.setText("Fecha de nacimiento (AAAA-MM-DD):");

        jl_nombre_alum.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre_alum.setText("Nombre:");

        jl_curp.setForeground(new java.awt.Color(255, 255, 255));
        jl_curp.setText("Curp:");

        jl_ap_paterno_alum.setForeground(new java.awt.Color(255, 255, 255));
        jl_ap_paterno_alum.setText("Apellido Paterno:");

        jl_ap_materno_alum.setForeground(new java.awt.Color(255, 255, 255));
        jl_ap_materno_alum.setText("Apellido Materno:");

        jtf_nombre_alum.setBackground(new java.awt.Color(32, 47, 90));
        jtf_nombre_alum.setForeground(new java.awt.Color(255, 255, 255));
        jtf_nombre_alum.setBorder(null);
        jtf_nombre_alum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nombre_alumKeyTyped(evt);
            }
        });

        jtf_ap_paterno_alum.setBackground(new java.awt.Color(32, 47, 90));
        jtf_ap_paterno_alum.setForeground(new java.awt.Color(255, 255, 255));
        jtf_ap_paterno_alum.setBorder(null);
        jtf_ap_paterno_alum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_ap_paterno_alumKeyTyped(evt);
            }
        });

        jtf_ap_materno_alum.setBackground(new java.awt.Color(32, 47, 90));
        jtf_ap_materno_alum.setForeground(new java.awt.Color(255, 255, 255));
        jtf_ap_materno_alum.setBorder(null);
        jtf_ap_materno_alum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_ap_materno_alumKeyTyped(evt);
            }
        });

        jtf_f_nacimiento.setBackground(new java.awt.Color(32, 47, 90));
        jtf_f_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jtf_f_nacimiento.setBorder(null);
        jtf_f_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_f_nacimientoKeyTyped(evt);
            }
        });

        jtf_curp.setBackground(new java.awt.Color(32, 47, 90));
        jtf_curp.setForeground(new java.awt.Color(255, 255, 255));
        jtf_curp.setBorder(null);
        jtf_curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_curpKeyTyped(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jb_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Doble derecha-48.png"))); // NOI18N
        jb_siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_siguienteMouseClicked(evt);
            }
        });

        jb_ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecho.png"))); // NOI18N
        jb_ultimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ultimoMouseClicked(evt);
            }
        });
        jb_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ultimoActionPerformed(evt);
            }
        });

        jb_primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Galón izquierdo-26.png"))); // NOI18N
        jb_primero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_primeroMouseClicked(evt);
            }
        });

        jb_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Doble izquierda-48.png"))); // NOI18N
        jb_anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_anteriorMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Desplazamiento");

        jtf_id_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_alumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_ap_paterno_alum)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_ap_paterno_alum)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_f_nacimiento)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_f_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_ap_materno_alum)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_ap_materno_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_curp)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5)
                                    .addComponent(jtf_curp, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jSeparator6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_nombre_alum)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_nombre_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtf_id_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jb_primero)
                                .addGap(8, 8, 8)
                                .addComponent(jb_anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_siguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_ultimo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre_alum)
                    .addComponent(jtf_nombre_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_id_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_ap_paterno_alum)
                            .addComponent(jtf_ap_paterno_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_ap_materno_alum)
                                    .addComponent(jtf_ap_materno_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb_siguiente)
                                    .addComponent(jb_anterior)
                                    .addComponent(jb_ultimo)
                                    .addComponent(jb_primero))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_f_nacimiento)
                            .addComponent(jtf_f_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_curp)
                            .addComponent(jtf_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jt_alumnos.setForeground(new java.awt.Color(0, 0, 0));
        jt_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_alumno", "nombre", "ap_paterno", "ap_materno", "curp", "fecha_nacimiento"
            }
        ));
        jt_alumnos.setGridColor(new java.awt.Color(0, 0, 0));
        jt_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_alumnosMouseClicked(evt);
            }
        });
        jt_alumno.setViewportView(jt_alumnos);

        jb_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        jb_buscar.setText("Buscar Registro");
        jb_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_buscarMouseClicked(evt);
            }
        });
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        jtf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_buscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jt_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_buscar)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jt_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_editarMouseClicked
        if (this.jb_editar.isEnabled()) {

            jtf_nombre_alum.setEditable(true);
            jtf_ap_paterno_alum.setEditable(true);
            jtf_ap_materno_alum.setEditable(true);
            jtf_curp.setEditable(true);
            jtf_f_nacimiento.setEditable(true);

            jb_editar.setEnabled(false);
            jb_primero.setEnabled(false);
            jb_ultimo.setEnabled(false);
            jb_siguiente.setEnabled(false);
            jb_anterior.setEnabled(false);
            jb_buscar.setEnabled(false);
            jb_borrar.setEnabled(false);
            jb_actualizar.setEnabled(true);
            jb_cancelar.setEnabled(true);
            jb_guardar.setEnabled(false);
            jb_nuevo.setEnabled(false);
        } else {
        }
    }//GEN-LAST:event_jb_editarMouseClicked

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        if (this.jb_cancelar.isEnabled()) {
            Conectar();
        } else {
        }
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarMouseClicked
        if (this.jb_borrar.isEnabled()) {
            String registro = this.jtf_nombre_alum.getText();

            int alerta = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar el registro del alumno " + registro + "?", "Se borrarrá el registro", JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE);

            if (JOptionPane.OK_OPTION == alerta) {                
                borrar_registro();
            } else {

            }
        } else {
        }
    }//GEN-LAST:event_jb_borrarMouseClicked

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jb_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_actualizarMouseClicked
        if (this.jb_actualizar.isEnabled()) {
            /*no agregar esta parte*/ String registro = this.jtf_nombre_alum.getText();
            int alerta = JOptionPane.showConfirmDialog(null, "¿Quiere actualizar el registro del alumno " + registro + "?", "Actualizar", JOptionPane.WARNING_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
            if (JOptionPane.OK_OPTION == alerta) {
                JOptionPane.showMessageDialog(null, "Se actualizó el registro del alumno: " + registro + " exitosamente", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
                actualizar_registro();

            } else {

            }
        } else {
        }
    }//GEN-LAST:event_jb_actualizarMouseClicked

    private void jb_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarMouseClicked
        if (this.jb_guardar.isEnabled()) {
            guardar_registro();
        } else {
        }
    }//GEN-LAST:event_jb_guardarMouseClicked

    private void jb_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_nuevoMouseClicked
        if (this.jb_nuevo.isEnabled()) {
            nuevo_registro();
        } else {
        }
    }//GEN-LAST:event_jb_nuevoMouseClicked

    private void jtf_ap_paterno_alumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_ap_paterno_alumKeyTyped
        char cadena = evt.getKeyChar();
        if (Character.isLowerCase(cadena)) {
            String cad = ("" + cadena).toUpperCase();
            cadena = cad.charAt(0);
            evt.setKeyChar(cadena);
        }
    }//GEN-LAST:event_jtf_ap_paterno_alumKeyTyped

    private void jtf_nombre_alumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombre_alumKeyTyped
        char cadena = evt.getKeyChar();
        if (Character.isLowerCase(cadena)) {
            String cad = ("" + cadena).toUpperCase();
            cadena = cad.charAt(0);
            evt.setKeyChar(cadena);
        }
    }//GEN-LAST:event_jtf_nombre_alumKeyTyped

    private void jtf_f_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_f_nacimientoKeyTyped
        char cadena = evt.getKeyChar();
        if (Character.isLowerCase(cadena)) {
            String cad = ("" + cadena).toUpperCase();
            cadena = cad.charAt(0);
            evt.setKeyChar(cadena);
        }
    }//GEN-LAST:event_jtf_f_nacimientoKeyTyped

    private void jtf_curpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_curpKeyTyped
        char cadena = evt.getKeyChar();
        if (Character.isLowerCase(cadena)) {
            String cad = ("" + cadena).toUpperCase();
            cadena = cad.charAt(0);
            evt.setKeyChar(cadena);
        }
    }//GEN-LAST:event_jtf_curpKeyTyped

    private void jtf_ap_materno_alumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_ap_materno_alumKeyTyped
        char cadena = evt.getKeyChar();
        if (Character.isLowerCase(cadena)) {
            String cad = ("" + cadena).toUpperCase();
            cadena = cad.charAt(0);
            evt.setKeyChar(cadena);
        }
    }//GEN-LAST:event_jtf_ap_materno_alumKeyTyped

    private void jt_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_alumnosMouseClicked
        tabla();
    }//GEN-LAST:event_jt_alumnosMouseClicked

    private void jb_primeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_primeroMouseClicked
        if (this.jb_primero.isEnabled()) {
            primer_registro();
        } else {
        }
    }//GEN-LAST:event_jb_primeroMouseClicked

    private void jb_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_anteriorMouseClicked
        //se tiene que poner a todos los eventos mouse clicked condicion if
        if (this.jb_anterior.isEnabled()) {
            anterior_registro();
        } else {
        }
    }//GEN-LAST:event_jb_anteriorMouseClicked

    private void jb_siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_siguienteMouseClicked
        if (this.jb_siguiente.isEnabled()) {
            siguiente_registro();
        } else {
        }
    }//GEN-LAST:event_jb_siguienteMouseClicked

    private void jb_ultimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ultimoMouseClicked
        if (this.jb_ultimo.isEnabled()) {
            ultimo_registro();
        } else {
        }
    }//GEN-LAST:event_jb_ultimoMouseClicked

    private void jb_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ultimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_ultimoActionPerformed

    private void jtf_id_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_alumnoActionPerformed

    private void jb_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarActionPerformed

        JF_Principal principal = new JF_Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jb_regresarActionPerformed

    private void jb_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_buscarMouseClicked
        if (this.jb_buscar.isEnabled()) {
            buscar();
        } else {
        }
    }//GEN-LAST:event_jb_buscarMouseClicked

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jtf_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarKeyTyped
        char cadena = evt.getKeyChar();
        if (Character.isLowerCase(cadena)) {
            String cad = ("" + cadena).toUpperCase();
            cadena = cad.charAt(0);
            evt.setKeyChar(cadena);
        }
    }//GEN-LAST:event_jtf_buscarKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_anterior;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_editar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_nuevo;
    private javax.swing.JButton jb_primero;
    private javax.swing.JButton jb_regresar;
    private javax.swing.JButton jb_siguiente;
    private javax.swing.JButton jb_ultimo;
    private javax.swing.JLabel jl_ap_materno_alum;
    private javax.swing.JLabel jl_ap_paterno_alum;
    private javax.swing.JLabel jl_curp;
    private javax.swing.JLabel jl_f_nacimiento;
    private javax.swing.JLabel jl_menu;
    private javax.swing.JLabel jl_nombre_alum;
    private javax.swing.JScrollPane jt_alumno;
    private javax.swing.JTable jt_alumnos;
    private javax.swing.JTextField jtf_ap_materno_alum;
    private javax.swing.JTextField jtf_ap_paterno_alum;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_curp;
    private javax.swing.JTextField jtf_f_nacimiento;
    private javax.swing.JTextField jtf_id_alumno;
    private javax.swing.JTextField jtf_nombre_alum;
    private javax.swing.JPanel panel_tabla;
    // End of variables declaration//GEN-END:variables

    private void buscar() {
        try {
            rs = st.executeQuery("select * from alumnos where nombre_alum like '" + this.jtf_buscar.getText() + "%'");

            jtf_id_alumno.setText(null);
            jtf_nombre_alum.setText(null);
            jtf_ap_paterno_alum.setText(null);
            jtf_ap_materno_alum.setText(null);
            jtf_curp.setText(null);
            jtf_f_nacimiento.setText(null);
            jt_alumnos.setModel(DbUtils.resultSetToTableModel(rs));

            jb_cancelar.setEnabled(true);
            rs = st.executeQuery("select *from alumnos");
        } catch (SQLException ex) {
            Logger.getLogger(JF_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void nuevo_registro() {
        jtf_id_alumno.setText(null);
        jtf_nombre_alum.setText(null);
        jtf_ap_paterno_alum.setText(null);
        jtf_ap_materno_alum.setText(null);
        jtf_curp.setText(null);
        jtf_f_nacimiento.setText(null);

        jb_primero.setEnabled(false);
        jb_ultimo.setEnabled(false);
        jb_siguiente.setEnabled(false);
        jb_anterior.setEnabled(false);
        jb_buscar.setEnabled(false);
        jb_borrar.setEnabled(false);
        jb_actualizar.setEnabled(false);
        jb_cancelar.setEnabled(true);
        jb_guardar.setEnabled(true);
        jb_editar.setEnabled(false);

        jtf_nombre_alum.setEditable(true);
        jtf_ap_paterno_alum.setEditable(true);
        jtf_ap_materno_alum.setEditable(true);
        jtf_curp.setEditable(true);
        jtf_f_nacimiento.setEditable(true);
    }

    private void actualizar_registro() {
        try {

            jtf_id_alumno.getText();
            jtf_nombre_alum.getText();
            jtf_ap_paterno_alum.getText();
            jtf_ap_materno_alum.getText();
            jtf_curp.getText();
            jtf_f_nacimiento.getText();

            st.executeUpdate("update alumnos set nombre_alum= '" + jtf_nombre_alum.getText() + "', ap_paterno_alum = '" + jtf_ap_paterno_alum.getText() + "', ap_materno_alum = '"
                    + jtf_ap_materno_alum.getText() + "',curp ='" + jtf_curp.getText() + "',f_nacimiento ='" + jtf_f_nacimiento.getText()
                    + "' where id_alumno = " + this.jtf_id_alumno.getText());

            Conectar();

            this.primer_registro();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Rellene correctamente los campos", "Error al actualizar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void guardar_registro() {
        try {

            String nombre_alum = this.jtf_nombre_alum.getText();
            String ap_paterno_alum = this.jtf_ap_paterno_alum.getText();
            String ap_materno_alum = this.jtf_ap_materno_alum.getText();
            String curp = this.jtf_curp.getText();
            String f_nacimiento = this.jtf_f_nacimiento.getText();

            st.executeUpdate("Insert into alumnos (nombre_alum,ap_paterno_alum,ap_materno_alum,curp,f_nacimiento)" + "values ('" + nombre_alum + "','" + ap_paterno_alum + "','" + ap_materno_alum + "','" + curp + "','" + f_nacimiento + "');");

            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);

            jb_primero.setEnabled(true);
            jb_ultimo.setEnabled(true);
            jb_siguiente.setEnabled(true);
            jb_anterior.setEnabled(true);
            jb_buscar.setEnabled(true);
            jb_borrar.setEnabled(true);
            jb_actualizar.setEnabled(true);
            jb_cancelar.setEnabled(false);
            jb_guardar.setEnabled(false);
            Conectar();
            this.primer_registro();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "El registro no se ha podido guardar. Rellene correctamente todos los campos", "Error al guardar", JOptionPane.WARNING_MESSAGE);

        }

    }

    private void siguiente_registro() {
        try {
            if (rs.isLast() == false) {
                rs.next();
                this.jtf_id_alumno.setText(rs.getString("id_alumno"));
                this.jtf_nombre_alum.setText(rs.getString("nombre_alum"));
                this.jtf_ap_paterno_alum.setText(rs.getString("ap_paterno_alum"));
                this.jtf_ap_materno_alum.setText(rs.getString("ap_materno_alum"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_f_nacimiento.setText(rs.getString("f_nacimiento"));

            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void anterior_registro() {
        try {
            if (rs.isFirst() == false) {
                rs.previous();
                this.jtf_id_alumno.setText(rs.getString("id_alumno"));
                this.jtf_nombre_alum.setText(rs.getString("nombre_alum"));
                this.jtf_ap_paterno_alum.setText(rs.getString("ap_paterno_alum"));
                this.jtf_ap_materno_alum.setText(rs.getString("ap_materno_alum"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_f_nacimiento.setText(rs.getString("f_nacimiento"));
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void ultimo_registro() {
        try {
            if (rs.isLast() == false) {
                rs.last();
                this.jtf_id_alumno.setText(rs.getString("id_alumno"));
                this.jtf_nombre_alum.setText(rs.getString("nombre_alum"));
                this.jtf_ap_paterno_alum.setText(rs.getString("ap_paterno_alum"));
                this.jtf_ap_materno_alum.setText(rs.getString("ap_materno_alum"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_f_nacimiento.setText(rs.getString("f_nacimiento"));
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void primer_registro() {
        try {
            if (rs.isFirst() == false) {
                rs.first();
                this.jtf_id_alumno.setText(rs.getString("id_alumno"));
                this.jtf_nombre_alum.setText(rs.getString("nombre_alum"));
                this.jtf_ap_paterno_alum.setText(rs.getString("ap_paterno_alum"));
                this.jtf_ap_materno_alum.setText(rs.getString("ap_materno_alum"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_f_nacimiento.setText(rs.getString("f_nacimiento"));
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void borrar_registro() {
        try {
            String registro = this.jtf_nombre_alum.getText();
            st.executeUpdate("delete from alumnos where id_alumno=" + this.jtf_id_alumno.getText());
            Conectar();
            JOptionPane.showMessageDialog(null, "Se borro el registro del alumno: " + registro + "", "Eliminado", JOptionPane.WARNING_MESSAGE);
            this.primer_registro();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "No se ha podido borrar el registro debido a que esta vinculado con un tutor (elimine primero la asignación)", "Error al borrar", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void tabla() {
        try {
            int seleccion = jt_alumnos.getSelectedRow();
            
            jtf_id_alumno.setText(String.valueOf(jt_alumnos.getValueAt(seleccion, 0)));
            jtf_nombre_alum.setText(String.valueOf(jt_alumnos.getValueAt(seleccion, 1)));
            jtf_ap_paterno_alum.setText(String.valueOf(jt_alumnos.getValueAt(seleccion, 2)));
            jtf_ap_materno_alum.setText(String.valueOf(jt_alumnos.getValueAt(seleccion, 3)));
            jtf_curp.setText(String.valueOf(jt_alumnos.getValueAt(seleccion, 4)));
            jtf_f_nacimiento.setText(String.valueOf(jt_alumnos.getValueAt(seleccion, 5)));

            rs = st.executeQuery("select * from alumnos;");
            jt_alumnos.setModel(DbUtils.resultSetToTableModel(rs));
            rs = st.executeQuery("select *from alumnos;");
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(JF_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
