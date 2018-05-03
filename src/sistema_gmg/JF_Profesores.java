package sistema_gmg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class JF_Profesores extends javax.swing.JFrame {

    private Connection conexion = null;
    private Statement st;
    private ResultSet rs;
    private TableModel ciclos;

    public void Conectar() {
        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistema_gmg", "root", "1405");

            st = conexion.createStatement();

            rs = st.executeQuery("SELECT * FROM sistema_gmg.profe;");
            jt_profesores.setModel(DbUtils.resultSetToTableModel(rs));
            rs.next();

            rs = st.executeQuery("Select * from profesores");
            rs.next();

            this.jtf_id_profesor.setText(rs.getString("id_profesor"));

            this.jtf_nombre_prof.setText(rs.getString("nombre_profe"));

            this.jtf_ap_paterno_prof.setText(rs.getString("ap_paterno_prof"));

            this.jtf_ap_materno_prof.setText(rs.getString("ap_materno_prof"));

            this.jtf_curp.setText(rs.getString("curp"));

            this.jtf_fecha_ingreso.setText(rs.getString("fecha_ingreso"));

            this.jtf_telefono.setText(rs.getString("telefono"));
            
            jp_tipo.setVisible(false);
            
            jtf_id_tipo.setVisible(false);
            jtf_id_profesor.setVisible(false);
            jtf_nombre_prof.setEditable(false);
            jtf_ap_paterno_prof.setEditable(false);
            jtf_ap_materno_prof.setEditable(false);
            jtf_curp.setEditable(false);
            jtf_fecha_ingreso.setEditable(false);
            jtf_telefono.setEditable(false);
            
            jb_primero.setEnabled(true);
            jb_ultimo.setEnabled(true);
            jb_siguiente.setEnabled(true);
            jb_anterior.setEnabled(true);
            jb_buscar.setEnabled(true);
            jb_borrar.setEnabled(true);
            jb_editar.setEnabled(true);
            jb_nuevo.setEnabled(true);
            jb_cancelar.setEnabled(false);
            jb_actualizar.setEnabled(false);
            jb_guardar.setEnabled(false);
            
        } catch (SQLException err) {

            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    public void combobox() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistema_gmg", "root", "1405");

            PreparedStatement preparedStatement = null;

            String strSQL = "select tipo from tipo_profe";
            
            preparedStatement = conexion.prepareStatement(strSQL);
            ResultSet rs = preparedStatement.executeQuery();
            
            this.jcb_tipo.removeAllItems();         
            
            while (rs.next()) {
                this.jcb_tipo.addItem(rs.getString("tipo"));
            }          

        } catch (SQLException err) {

            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());

        }
    }

    public JF_Profesores() {
        initComponents();        
        combobox();
        Conectar();
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
        jb_guardar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_nuevo = new javax.swing.JButton();
        jb_regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jb_siguiente = new javax.swing.JButton();
        jb_ultimo = new javax.swing.JButton();
        jb_primero = new javax.swing.JButton();
        jb_anterior = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jtf_id_profesor = new javax.swing.JTextField();
        JP_campos = new javax.swing.JPanel();
        jtf_telefono = new javax.swing.JTextField();
        jtf_curp = new javax.swing.JTextField();
        jl_fecha_ingreso = new javax.swing.JLabel();
        jtf_ap_paterno_prof = new javax.swing.JTextField();
        jtf_fecha_ingreso = new javax.swing.JTextField();
        jl_curp1 = new javax.swing.JLabel();
        jl_nombre_prof = new javax.swing.JLabel();
        jtf_ap_materno_prof = new javax.swing.JTextField();
        jtf_nombre_prof = new javax.swing.JTextField();
        jl_telefono = new javax.swing.JLabel();
        jl_ap_materno_prof = new javax.swing.JLabel();
        jl_ap_paterno_prof = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jp_tipo = new javax.swing.JPanel();
        jcb_tipo = new javax.swing.JComboBox<>();
        jl_tipo = new javax.swing.JLabel();
        jtf_id_tipo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jb_buscar = new javax.swing.JButton();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_profesores = new javax.swing.JTable();

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
        setTitle("Profesores");
        setResizable(false);

        panel_tabla.setBackground(new java.awt.Color(10, 34, 64));

        jl_menu.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jl_menu.setForeground(new java.awt.Color(255, 255, 255));
        jl_menu.setText("Menú");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        buttons_2.setBackground(new java.awt.Color(106, 116, 145));

        jb_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Guardar Filled-50.png"))); // NOI18N
        jb_guardar.setText("Guardar");
        jb_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarMouseClicked(evt);
            }
        });
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cancelarMouseClicked(evt);
            }
        });

        jb_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciclo.png"))); // NOI18N
        jb_actualizar.setText("Actualizar");
        jb_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_actualizarMouseClicked(evt);
            }
        });
        jb_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizarActionPerformed(evt);
            }
        });

        jb_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        jb_borrar.setText("Borrar");
        jb_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarMouseClicked(evt);
            }
        });

        jb_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        jb_editar.setText("Editar");
        jb_editar.setAutoscrolls(true);
        jb_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_editarMouseClicked(evt);
            }
        });

        jb_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new.png"))); // NOI18N
        jb_nuevo.setText("Nuevo");
        jb_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_nuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttons_2Layout = new javax.swing.GroupLayout(buttons_2);
        buttons_2.setLayout(buttons_2Layout);
        buttons_2Layout.setHorizontalGroup(
            buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttons_2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jb_guardar)
                        .addGroup(buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_nuevo)
                            .addComponent(jb_editar)
                            .addComponent(jb_borrar))
                        .addComponent(jb_cancelar)
                        .addComponent(jb_actualizar))
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        buttons_2Layout.setVerticalGroup(
            buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
            .addGroup(buttons_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttons_2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jb_nuevo)
                    .addGap(18, 18, 18)
                    .addComponent(jb_editar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_borrar)
                    .addGap(18, 18, 18)
                    .addComponent(jb_actualizar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jb_cancelar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_guardar)
                    .addGap(18, 18, 18)))
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
                .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tablaLayout.createSequentialGroup()
                        .addComponent(buttons_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tablaLayout.createSequentialGroup()
                        .addComponent(jl_menu)
                        .addGap(105, 105, 105))))
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tablaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jb_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_tablaLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jb_regresar)
                .addGap(33, 33, 33)
                .addComponent(jl_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttons_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Doble derecha-48.png"))); // NOI18N
        jb_siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_siguienteMouseClicked(evt);
            }
        });
        jPanel2.add(jb_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 104, -1, -1));

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
        jPanel2.add(jb_ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 104, -1, -1));

        jb_primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Galón izquierdo-26.png"))); // NOI18N
        jb_primero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_primeroMouseClicked(evt);
            }
        });
        jPanel2.add(jb_primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 104, -1, -1));

        jb_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-Doble izquierda-48.png"))); // NOI18N
        jb_anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_anteriorMouseClicked(evt);
            }
        });
        jPanel2.add(jb_anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 104, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desplazamiento");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 46, -1, -1));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 142, 10));
        jPanel2.add(jtf_id_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 59, -1));

        JP_campos.setBackground(new java.awt.Color(32, 47, 90));
        JP_campos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_telefono.setBackground(new java.awt.Color(32, 47, 90));
        jtf_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jtf_telefono.setBorder(null);
        jtf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_telefonoActionPerformed(evt);
            }
        });
        JP_campos.add(jtf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 151, 20));

        jtf_curp.setBackground(new java.awt.Color(32, 47, 90));
        jtf_curp.setForeground(new java.awt.Color(255, 255, 255));
        jtf_curp.setBorder(null);
        JP_campos.add(jtf_curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 186, 30));

        jl_fecha_ingreso.setForeground(new java.awt.Color(255, 255, 255));
        jl_fecha_ingreso.setText("Fecha de ingreso:");
        JP_campos.add(jl_fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 209, -1, -1));

        jtf_ap_paterno_prof.setBackground(new java.awt.Color(32, 47, 90));
        jtf_ap_paterno_prof.setForeground(new java.awt.Color(255, 255, 255));
        jtf_ap_paterno_prof.setBorder(null);
        jtf_ap_paterno_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ap_paterno_profActionPerformed(evt);
            }
        });
        JP_campos.add(jtf_ap_paterno_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 20));

        jtf_fecha_ingreso.setBackground(new java.awt.Color(32, 47, 90));
        jtf_fecha_ingreso.setForeground(new java.awt.Color(255, 255, 255));
        jtf_fecha_ingreso.setBorder(null);
        JP_campos.add(jtf_fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 122, 30));

        jl_curp1.setForeground(new java.awt.Color(255, 255, 255));
        jl_curp1.setText("CURP:");
        JP_campos.add(jl_curp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jl_nombre_prof.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre_prof.setText("Nombre:");
        JP_campos.add(jl_nombre_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jtf_ap_materno_prof.setBackground(new java.awt.Color(32, 47, 90));
        jtf_ap_materno_prof.setForeground(new java.awt.Color(255, 255, 255));
        jtf_ap_materno_prof.setBorder(null);
        JP_campos.add(jtf_ap_materno_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 20));

        jtf_nombre_prof.setBackground(new java.awt.Color(32, 47, 90));
        jtf_nombre_prof.setForeground(new java.awt.Color(255, 255, 255));
        jtf_nombre_prof.setBorder(null);
        jtf_nombre_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombre_profActionPerformed(evt);
            }
        });
        JP_campos.add(jtf_nombre_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 176, 20));

        jl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jl_telefono.setText("Telefono:");
        JP_campos.add(jl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jl_ap_materno_prof.setForeground(new java.awt.Color(255, 255, 255));
        jl_ap_materno_prof.setText("Apellido Materno:");
        JP_campos.add(jl_ap_materno_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, -1, -1));

        jl_ap_paterno_prof.setForeground(new java.awt.Color(255, 255, 255));
        jl_ap_paterno_prof.setText("Apellido Paterno:");
        JP_campos.add(jl_ap_paterno_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));
        JP_campos.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 190, 10));
        JP_campos.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 142, 10));
        JP_campos.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 142, 10));
        JP_campos.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, 10));
        JP_campos.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 142, 10));
        JP_campos.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 142, 10));

        jPanel2.add(JP_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 250));

        jp_tipo.setBackground(new java.awt.Color(32, 47, 90));

        jcb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_tipoActionPerformed(evt);
            }
        });

        jl_tipo.setForeground(new java.awt.Color(255, 255, 255));
        jl_tipo.setText("Tipo de profesor:");

        javax.swing.GroupLayout jp_tipoLayout = new javax.swing.GroupLayout(jp_tipo);
        jp_tipo.setLayout(jp_tipoLayout);
        jp_tipoLayout.setHorizontalGroup(
            jp_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_tipoLayout.createSequentialGroup()
                        .addComponent(jl_tipo)
                        .addGap(13, 13, 13)
                        .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf_id_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jp_tipoLayout.setVerticalGroup(
            jp_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_tipo)
                    .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jtf_id_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jp_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jt_profesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Title 2", "Title 3", "Title 4"
            }
        ));
        jt_profesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_profesoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_profesores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_buscar)
                .addGap(18, 18, 18)
                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_buscar)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarMouseClicked
        if (this.jb_guardar.isEnabled()) {
            guardar_registro();
        } else {
        }
    }//GEN-LAST:event_jb_guardarMouseClicked

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cancelarMouseClicked
        if (this.jb_cancelar.isEnabled()) {
            Conectar();
        } else {
        }
    }//GEN-LAST:event_jb_cancelarMouseClicked

    private void jb_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_actualizarMouseClicked
        if (this.jb_actualizar.isEnabled()) {
            String registro = this.jtf_nombre_prof.getText();
            int alerta = JOptionPane.showConfirmDialog(null, "¿Quiere actualizar el registro del profesor " + registro + "?", "Actualizar", JOptionPane.WARNING_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
            if (JOptionPane.OK_OPTION == alerta) {
                JOptionPane.showMessageDialog(null, "Se actualizó el registro del profesor " + registro + " exitosamente", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
                actualizar_registro();

            } else {

            }
        } else {
        }
    }//GEN-LAST:event_jb_actualizarMouseClicked

    private void jb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_actualizarActionPerformed

    private void jb_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarMouseClicked
        if (this.jb_borrar.isEnabled()) {
            String registro = this.jtf_nombre_prof.getText();

            int alerta = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar el registro del profesor " + registro + "?", "Se borrarrá el registro", JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE);

            if (JOptionPane.OK_OPTION == alerta) {
                JOptionPane.showMessageDialog(null, "Se borro el registro del profesor" + registro + " exitosamente", "Eliminado", JOptionPane.WARNING_MESSAGE);
                borrar_registro();
            } else {

            }
        } else {
        }
    }//GEN-LAST:event_jb_borrarMouseClicked

    private void jb_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_editarMouseClicked
        if (this.jb_editar.isEnabled()) {
            jtf_nombre_prof.setEditable(true);
            jtf_ap_paterno_prof.setEditable(true);
            jtf_ap_materno_prof.setEditable(true);
            jtf_curp.setEditable(true);
            jtf_fecha_ingreso.setEditable(true);
            jtf_telefono.setEditable(true);
            
            jp_tipo.setVisible(true);
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

    private void jb_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_nuevoMouseClicked
        if (this.jb_nuevo.isEnabled()) {
            nuevo_registro();
        } else {
        }
    }//GEN-LAST:event_jb_nuevoMouseClicked

    private void jb_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarActionPerformed

        JF_Principal principal = new JF_Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jb_regresarActionPerformed

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

    private void jtf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_telefonoActionPerformed

    private void jtf_ap_paterno_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ap_paterno_profActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ap_paterno_profActionPerformed

    private void jtf_nombre_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombre_profActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombre_profActionPerformed

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

    private void jt_profesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_profesoresMouseClicked
            tabla();
    }//GEN-LAST:event_jt_profesoresMouseClicked

    private void jcb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tipoActionPerformed
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistema_gmg", "root", "1405");
            st = conexion.createStatement();
            ResultSet rs1 = st.executeQuery("select id_tipo from tipo_profe where tipo= '" + this.jcb_tipo.getSelectedItem() + "'");
            rs1.next();
            this.jtf_id_tipo.setText(String.valueOf(rs1.getString("id_tipo")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jcb_tipoActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Profesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_campos;
    private javax.swing.JPanel buttons_2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
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
    private javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JLabel jl_ap_materno_prof;
    private javax.swing.JLabel jl_ap_paterno_prof;
    private javax.swing.JLabel jl_curp1;
    private javax.swing.JLabel jl_fecha_ingreso;
    private javax.swing.JLabel jl_menu;
    private javax.swing.JLabel jl_nombre_prof;
    private javax.swing.JLabel jl_telefono;
    private javax.swing.JLabel jl_tipo;
    private javax.swing.JPanel jp_tipo;
    private javax.swing.JTable jt_profesores;
    private javax.swing.JTextField jtf_ap_materno_prof;
    private javax.swing.JTextField jtf_ap_paterno_prof;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_curp;
    private javax.swing.JTextField jtf_fecha_ingreso;
    private javax.swing.JTextField jtf_id_profesor;
    private javax.swing.JTextField jtf_id_tipo;
    private javax.swing.JTextField jtf_nombre_prof;
    private javax.swing.JTextField jtf_telefono;
    private javax.swing.JPanel panel_tabla;
    // End of variables declaration//GEN-END:variables

    private void nuevo_registro() {
        jtf_id_profesor.setText(null);
        jtf_nombre_prof.setText(null);
        jtf_ap_paterno_prof.setText(null);
        jtf_ap_materno_prof.setText(null);
        jtf_curp.setText(null);
        jtf_fecha_ingreso.setText(null);
        jtf_telefono.setText(null);
        
        jp_tipo.setVisible(true);
        
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
        
        jtf_nombre_prof.setEditable(true);
        jtf_ap_paterno_prof.setEditable(true);
        jtf_ap_materno_prof.setEditable(true);
        jtf_curp.setEditable(true);
        jtf_telefono.setEditable(true);
        jtf_fecha_ingreso.setEditable(true);
        jtf_nombre_prof.setEditable(true);
    }

    private void actualizar_registro() {
        try {

            jtf_nombre_prof.getText();
            jtf_ap_paterno_prof.getText();
            jtf_ap_materno_prof.getText();
            jtf_curp.getText();
            jtf_fecha_ingreso.getText();
            jtf_telefono.getText();
            jtf_id_tipo.getText();

            st.executeUpdate("update profesores set nombre_profe= '" + jtf_nombre_prof.getText()
                    + "', ap_paterno_prof = '" + jtf_ap_paterno_prof.getText() + "', ap_materno_prof = '" + jtf_ap_materno_prof.getText()
                    + "', curp = '" + jtf_curp.getText() + "', fecha_ingreso = '" + jtf_fecha_ingreso.getText() + "', telefono = '" + jtf_telefono.getText()
                    + "', id_tipo= '" + jtf_id_tipo.getText() +"' where id_profesor = "
                    + this.jtf_id_profesor.getText());

            Conectar();
            this.primer_registro();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Rellene correctamente los campos", "Error al actualizar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void guardar_registro() {
        try {
            String nombre_profe = this.jtf_nombre_prof.getText();
            String ap_paterno_prof = this.jtf_ap_paterno_prof.getText();
            String ap_materno_prof = this.jtf_ap_materno_prof.getText();
            String curp = this.jtf_curp.getText();
            String fecha_ingreso = this.jtf_fecha_ingreso.getText();
            String telefono = this.jtf_telefono.getText();
            String id_tipo = this.jtf_id_tipo.getText();
            
            st.executeUpdate("Insert into profesores(nombre_profe,ap_paterno_prof,ap_materno_prof,curp,fecha_ingreso,telefono,id_tipo)" + "values "
                    + "('" + nombre_profe + "','" + ap_paterno_prof + "','" + ap_materno_prof + "','" + curp + "','" + fecha_ingreso + "','" + telefono + "','" + id_tipo + "');");

            Conectar();            
            this.primer_registro();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Rellene correctamente los campos", "Error al guardar", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void siguiente_registro() {
        try {
            if (rs.isLast() == false) {
                rs.next();
                this.jtf_id_profesor.setText(rs.getString("id_profesor"));
                this.jtf_nombre_prof.setText(rs.getString("nombre_profe"));
                this.jtf_ap_paterno_prof.setText(rs.getString("ap_paterno_prof"));
                this.jtf_ap_materno_prof.setText(rs.getString("ap_materno_prof"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_fecha_ingreso.setText(rs.getString("fecha_ingreso"));
                this.jtf_telefono.setText(rs.getString("telefono"));                
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void anterior_registro() {
        try {
            if (rs.isFirst() == false) {
                rs.previous();
                this.jtf_id_profesor.setText(rs.getString("id_profesor"));
                this.jtf_nombre_prof.setText(rs.getString("nombre_profe"));
                this.jtf_ap_paterno_prof.setText(rs.getString("ap_paterno_prof"));
                this.jtf_ap_materno_prof.setText(rs.getString("ap_materno_prof"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_fecha_ingreso.setText(rs.getString("fecha_ingreso"));
                this.jtf_telefono.setText(rs.getString("telefono"));
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void ultimo_registro() {
        try {
            if (rs.isLast() == false) {
                rs.last();
                this.jtf_id_profesor.setText(rs.getString("id_profesor"));
                this.jtf_nombre_prof.setText(rs.getString("nombre_profe"));
                this.jtf_ap_paterno_prof.setText(rs.getString("ap_paterno_prof"));
                this.jtf_ap_materno_prof.setText(rs.getString("ap_materno_prof"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_fecha_ingreso.setText(rs.getString("fecha_ingreso"));
                this.jtf_telefono.setText(rs.getString("telefono"));
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void primer_registro() {
        try {
            if (rs.isFirst() == false) {
                rs.first();
                this.jtf_id_profesor.setText(rs.getString("id_profesor"));
                this.jtf_nombre_prof.setText(rs.getString("nombre_profe"));
                this.jtf_ap_paterno_prof.setText(rs.getString("ap_paterno_prof"));
                this.jtf_ap_materno_prof.setText(rs.getString("ap_materno_prof"));
                this.jtf_curp.setText(rs.getString("curp"));
                this.jtf_fecha_ingreso.setText(rs.getString("fecha_ingreso"));
                this.jtf_telefono.setText(rs.getString("telefono"));
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }

    private void borrar_registro() {
        try {
            st.executeUpdate("delete from profesores where id_profesor=" + this.jtf_id_profesor.getText());
            Conectar();
            this.primer_registro();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());

        }
    }

    private void buscar() {
         try {
            rs = st.executeQuery("select * from sistema_gmg.profe where nombre_profe like '" + this.jtf_buscar.getText() + "%'");

            jt_profesores.setModel(DbUtils.resultSetToTableModel(rs));

            jb_cancelar.setEnabled(true);
            rs = st.executeQuery("Select * from profesores");
        } catch (SQLException ex) {
            Logger.getLogger(JF_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void tabla() {
        try {
            int seleccion = jt_profesores.getSelectedRow();

            jtf_id_profesor.setText(String.valueOf(jt_profesores.getValueAt(seleccion, 0)));
            jtf_nombre_prof.setText(String.valueOf(jt_profesores.getValueAt(seleccion, 1)));
            jtf_ap_paterno_prof.setText(String.valueOf(jt_profesores.getValueAt(seleccion, 2)));
            jtf_ap_materno_prof.setText(String.valueOf(jt_profesores.getValueAt(seleccion, 3)));
            jtf_curp.setText(String.valueOf(jt_profesores.getValueAt(seleccion, 4)));
            jtf_fecha_ingreso.setText(String.valueOf(jt_profesores.getValueAt(seleccion, 5)));
            jtf_telefono.setText(String.valueOf(jt_profesores.getValueAt(seleccion, 6)));
            

           rs = st.executeQuery("SELECT * FROM sistema_gmg.profe;");
            jt_profesores.setModel(DbUtils.resultSetToTableModel(rs));
            rs = st.executeQuery("SELECT * FROM profesores;");
        } catch (SQLException ex) {
            Logger.getLogger(JF_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
