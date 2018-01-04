package Controllers;

import Models.Model_Ciclos;
import Models.Model_Conexion;
import Views.View_Ciclos;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mike
 */
public class Controller_Ciclos {
    
    Model_Ciclos model_Ciclos;
    Model_Conexion model_Conexion;
    View_Ciclos view_Ciclos;

    public Controller_Ciclos(Model_Ciclos model_Ciclos,Model_Conexion model_Conexion, View_Ciclos view_Ciclos) {
        this.model_Ciclos = model_Ciclos;
        this.model_Conexion = model_Conexion;
        this.view_Ciclos = view_Ciclos;   
        initComponents();
        this.view_Ciclos.jb_cancelar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_cancelar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_cancelar_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_cancelar.isEnabled()) {
                    view_Ciclos.jb_cancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_cancelar.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_cancelar.isEnabled()) {
                    view_Ciclos.jb_cancelar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_cancelar.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_actualizar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_actualizar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_actualizar_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_actualizar.isEnabled()) {
                    view_Ciclos.jb_actualizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_actualizar.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_actualizar.isEnabled()) {
                    view_Ciclos.jb_actualizar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_actualizar.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_anterior.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_anterior_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_anterior.isEnabled()) {
                    view_Ciclos.jb_anterior.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_anterior.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_anterior.isEnabled()) {
                    view_Ciclos.jb_anterior.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_anterior.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_siguiente.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_siguiente_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_siguiente.isEnabled()) {
                    view_Ciclos.jb_siguiente.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_siguiente.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_siguiente.isEnabled()) {
                    view_Ciclos.jb_siguiente.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_siguiente.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_ultimo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_ultimo_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_ultimo.isEnabled()) {
                    view_Ciclos.jb_ultimo.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_ultimo.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_ultimo.isEnabled()) {
                    view_Ciclos.jb_ultimo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_ultimo.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_primero.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_primero_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_primero.isEnabled()) {
                    view_Ciclos.jb_primero.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_primero.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_primero.isEnabled()) {
                    view_Ciclos.jb_primero.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_primero.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_nuevo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_nuevo_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_nuevo.isEnabled()) {
                    view_Ciclos.jb_nuevo.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_nuevo.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_nuevo.isEnabled()) {
                    view_Ciclos.jb_nuevo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_nuevo.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_editar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_editar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_editar.isEnabled()) {
                    view_Ciclos.jb_editar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_editar.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_editar.isEnabled()) {
                    view_Ciclos.jb_editar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_editar.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_guardar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_guardar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_guardar.isEnabled()) {
                    view_Ciclos.jb_guardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_guardar.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_guardar.isEnabled()) {
                    view_Ciclos.jb_guardar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_guardar.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_eliminar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_borrar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_eliminar.isEnabled()) {
                    view_Ciclos.jb_eliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_eliminar.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_eliminar.isEnabled()) {
                    view_Ciclos.jb_eliminar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_eliminar.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Ciclos.jb_buscar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {               
                jb_buscar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {   
                jb_buscar_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {                
            }

            @Override
            public void mouseEntered(MouseEvent e) {                
            }

            @Override
            public void mouseExited(MouseEvent e) {                
            }
        });
        this.view_Ciclos.jtf_ciclo.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char cadena = e.getKeyChar();
                if (Character.isLowerCase(cadena)) {
                    String cad = ("" + cadena).toUpperCase();
                    cadena = cad.charAt(0);
                    e.setKeyChar(cadena);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        this.view_Ciclos.jtf_buscar.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });   
        this.view_Ciclos.jt_ciclos.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {    
                selecion_Tabla();
            }

            @Override
            public void mousePressed(MouseEvent e) {                
                selecion_Tabla();
            }

            @Override
            public void mouseReleased(MouseEvent e) {               
            }

            @Override
            public void mouseEntered(MouseEvent e) {                
            }

            @Override
            public void mouseExited(MouseEvent e) {              
            }
        });        
        initView();
        llenado_Tabla();
    }

    public void selecion_Tabla() {
        int seleccion = view_Ciclos.jt_ciclos.getSelectedRow();
        view_Ciclos.jtf_id_ciclo.setText(String.valueOf(view_Ciclos.jt_ciclos.getValueAt(seleccion, 0)));
        view_Ciclos.jtf_ciclo.setText(String.valueOf(view_Ciclos.jt_ciclos.getValueAt(seleccion, 1)));
        view_Ciclos.jtf_fecha_inicio.setText(String.valueOf(view_Ciclos.jt_ciclos.getValueAt(seleccion, 2)));
        view_Ciclos.jtf_fecha_termino.setText(String.valueOf(view_Ciclos.jt_ciclos.getValueAt(seleccion, 3)));
        llenado_Tabla();
    }

    public void llenado_Tabla() {
        model_Ciclos.llenar_Tabla();
        view_Ciclos.jt_ciclos.setModel(DbUtils.resultSetToTableModel(model_Ciclos.rs));
        model_Ciclos.llenarTodos();
    }

    public void getValores() {
        view_Ciclos.jtf_id_ciclo.setText("" + model_Ciclos.getId_ciclo());
        view_Ciclos.jtf_ciclo.setText("" + model_Ciclos.getCiclo());
        view_Ciclos.jtf_fecha_inicio.setText("" + model_Ciclos.getFecha_inicio());
        view_Ciclos.jtf_fecha_termino.setText("" + model_Ciclos.getFecha_termino());
    }

    public void setValores() {
        model_Ciclos.setId_ciclo(Integer.parseInt(view_Ciclos.jtf_id_ciclo.getText()));
        model_Ciclos.setCiclo(view_Ciclos.jtf_ciclo.getText());
        model_Ciclos.setFecha_inicio(view_Ciclos.jtf_fecha_inicio.getText());
        model_Ciclos.setFecha_termino(view_Ciclos.jtf_fecha_termino.getText());
    }

    private void jb_anterior_click() {
        if (this.view_Ciclos.jb_anterior.isEnabled()) {
            model_Ciclos.moverAnterior();
            getValores();
        }
    }

    private void jb_ultimo_click() {
        if (this.view_Ciclos.jb_ultimo.isEnabled()) {
            model_Ciclos.moverUltimo();
            getValores();
        }
    }

    private void jb_siguiente_click() {
        if (this.view_Ciclos.jb_siguiente.isEnabled()) {
            model_Ciclos.moverSiguiente();
            getValores();
        }
    }

    private void jb_primero_click() {
        if (this.view_Ciclos.jb_primero.isEnabled()) {
            model_Ciclos.moverPrimero();
            getValores();
        }
    }

    private void jb_nuevo_click() {
        if (this.view_Ciclos.jb_nuevo.isEnabled()) {

            //Se habilitan los botones a usar
            view_Ciclos.jb_cancelar.setVisible(true);
            view_Ciclos.jb_cancelar.setEnabled(true);
            view_Ciclos.jb_cancelar.setBackground(new Color(14, 47, 88));
            view_Ciclos.jb_guardar.setEnabled(true);
            view_Ciclos.jb_guardar.setBackground(new Color(14, 47, 88));

            //Se inabilitan los botones y cambian de color
            view_Ciclos.jb_nuevo.setEnabled(false);
            view_Ciclos.jb_nuevo.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_editar.setEnabled(false);
            view_Ciclos.jb_editar.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_eliminar.setEnabled(false);
            view_Ciclos.jb_eliminar.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_actualizar.setEnabled(false);
            view_Ciclos.jb_actualizar.setBackground(new Color(153, 153, 153));

            //Se inabilitan los botones de desplazamiento
            view_Ciclos.jb_primero.setEnabled(false);
            view_Ciclos.jb_primero.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_ultimo.setEnabled(false);
            view_Ciclos.jb_ultimo.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_siguiente.setEnabled(false);
            view_Ciclos.jb_siguiente.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_anterior.setEnabled(false);
            view_Ciclos.jb_anterior.setBackground(new Color(153, 153, 153));

            //Se resetean los campos de Texto
            view_Ciclos.jtf_ciclo.setText("");
            view_Ciclos.jtf_fecha_inicio.setText("");
            view_Ciclos.jtf_fecha_termino.setText("");
            view_Ciclos.jtf_id_ciclo.setEditable(false);
            view_Ciclos.jtf_ciclo.setEditable(true);
            view_Ciclos.jtf_fecha_inicio.setEditable(true);
            view_Ciclos.jtf_fecha_termino.setEditable(true);

            //Se inabilita las opciones de buscar
            view_Ciclos.jb_buscar.setEnabled(false);
            view_Ciclos.jtf_buscar.setEditable(false);
        }
    }

    private void jb_cancelar_click() {
        if (this.view_Ciclos.jb_cancelar.isEnabled()) {
            initComponents();
            getValores();
        }
    }

    private void jb_editar_click() {
        if (view_Ciclos.jb_editar.isEnabled()) {

            //Botones que se habilitarán
            view_Ciclos.jb_actualizar.setEnabled(true);
            view_Ciclos.jb_actualizar.setBackground(new Color(14, 47, 88));
            view_Ciclos.jb_actualizar.setVisible(true);
            view_Ciclos.jb_cancelar.setEnabled(true);
            view_Ciclos.jb_cancelar.setBackground(new Color(14, 47, 88));
            view_Ciclos.jb_cancelar.setVisible(true);

            //Botones que se inhabilitarán                                                
            view_Ciclos.jb_nuevo.setEnabled(false);
            view_Ciclos.jb_nuevo.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_editar.setEnabled(false);
            view_Ciclos.jb_editar.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_eliminar.setEnabled(false);
            view_Ciclos.jb_eliminar.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_guardar.setEnabled(false);
            view_Ciclos.jb_guardar.setBackground(new Color(153, 153, 153));

            //Se inabilitan los botones de desplazamiento
            view_Ciclos.jb_primero.setEnabled(false);
            view_Ciclos.jb_primero.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_ultimo.setEnabled(false);
            view_Ciclos.jb_ultimo.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_siguiente.setEnabled(false);
            view_Ciclos.jb_siguiente.setBackground(new Color(153, 153, 153));
            view_Ciclos.jb_anterior.setEnabled(false);
            view_Ciclos.jb_anterior.setBackground(new Color(153, 153, 153));

            //Se inabilita las opciones de buscar
            view_Ciclos.jb_buscar.setEnabled(false);
            view_Ciclos.jtf_buscar.setEditable(false);

            //Se habilitan los campos de texto para editar
            view_Ciclos.jtf_ciclo.setEditable(true);
            view_Ciclos.jtf_fecha_inicio.setEditable(true);
            view_Ciclos.jtf_fecha_termino.setEditable(true);
        }
    }

    private void jb_actualizar_click() {
        if (this.view_Ciclos.jb_actualizar.isEnabled()) {
            setValores();
            String registro = this.view_Ciclos.jtf_ciclo.getText();
            int alerta = JOptionPane.showConfirmDialog(null, "¿Quiere actualizar el ciclo: " + registro + "?", "Actualizar", JOptionPane.WARNING_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
            if (JOptionPane.OK_OPTION == alerta) {
                JOptionPane.showMessageDialog(null, "Se actualizó el ciclo " + registro + " exitosamente", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
                model_Ciclos.Actualizar(model_Ciclos.getId_ciclo(), model_Ciclos.getCiclo(), model_Ciclos.getFecha_inicio(), model_Ciclos.getFecha_termino());
                getValores();
                llenado_Tabla();
                initComponents();
            }
        }
    }

    private void jb_buscar_click() {
        if (this.view_Ciclos.jb_buscar.isEnabled()) {

            //Bloqueo de campos de texto
            view_Ciclos.jtf_id_ciclo.setText(null);
            view_Ciclos.jtf_ciclo.setText(null);
            view_Ciclos.jtf_fecha_inicio.setText(null);
            view_Ciclos.jtf_fecha_termino.setText(null);

            //Inicio de la busqueda
            model_Ciclos.setBusqueda_palabra(view_Ciclos.jtf_buscar.getText());
            model_Ciclos.buscar_Registro(model_Ciclos.getBusqueda_palabra());
            view_Ciclos.jt_ciclos.setModel(DbUtils.resultSetToTableModel(model_Ciclos.rs));
        }
        model_Ciclos.llenarTodos();
        llenado_Tabla();

    }

    private void jb_guardar_click() {
        if (this.view_Ciclos.jb_guardar.isEnabled()) {
            setValores();
            String registro = this.view_Ciclos.jtf_ciclo.getText();
            int alerta = JOptionPane.showConfirmDialog(null, "¿Quiere guardar el ciclo " + registro + "", "Guardar", JOptionPane.WARNING_MESSAGE, JOptionPane.INFORMATION_MESSAGE);

            if (JOptionPane.OK_OPTION == alerta) {
                JOptionPane.showMessageDialog(null, "Se ha guardado el registro del ciclo " + registro + " exitosamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
                model_Ciclos.Borrar(model_Ciclos.getId_ciclo());
                getValores();
                llenado_Tabla();
                initComponents();
            }
            setValores();
            model_Ciclos.Insertar(model_Ciclos.getCiclo(), model_Ciclos.getFecha_inicio(), model_Ciclos.getFecha_termino());
            getValores();
            llenado_Tabla();
            initComponents();
        }
    }

    private void jb_borrar_click() {
        if (this.view_Ciclos.jb_eliminar.isEnabled()) {
            setValores();
            String registro = this.view_Ciclos.jtf_ciclo.getText();

            int alerta = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar el ciclo " + registro + "", "Se borrarrá el registro", JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE);

            if (JOptionPane.OK_OPTION == alerta) {
                JOptionPane.showMessageDialog(null, "Se borro el registro del ciclo " + registro + "", "Eliminado", JOptionPane.WARNING_MESSAGE);
                model_Ciclos.Borrar(model_Ciclos.getId_ciclo());
                getValores();
                llenado_Tabla();
                initComponents();
            }
        }
    }

    private void initComponents() {

        //Componentes que se habilitan
        view_Ciclos.jb_nuevo.setEnabled(true);
        view_Ciclos.jb_nuevo.setBackground(new Color(14, 47, 88));
        view_Ciclos.jb_editar.setEnabled(true);
        view_Ciclos.jb_editar.setBackground(new Color(14, 47, 88));
        view_Ciclos.jb_eliminar.setEnabled(true);
        view_Ciclos.jb_eliminar.setBackground(new Color(14, 47, 88));

        //Componentes inibilitados y cambio de color
        view_Ciclos.jb_guardar.setEnabled(false);
        view_Ciclos.jb_guardar.setBackground(new Color(153, 153, 153));

        view_Ciclos.jb_cancelar.setEnabled(false);
        view_Ciclos.jb_cancelar.setBackground(new Color(153, 153, 153));
        view_Ciclos.jb_cancelar.setVisible(false);

        view_Ciclos.jb_actualizar.setEnabled(false);
        view_Ciclos.jb_actualizar.setBackground(new Color(153, 153, 153));
        view_Ciclos.jb_actualizar.setVisible(false);

        //Se habilitan los botones de desplazamineto
        view_Ciclos.jb_primero.setEnabled(true);
        view_Ciclos.jb_primero.setBackground(new Color(14, 47, 88));
        view_Ciclos.jb_ultimo.setEnabled(true);
        view_Ciclos.jb_ultimo.setBackground(new Color(14, 47, 88));
        view_Ciclos.jb_siguiente.setEnabled(true);
        view_Ciclos.jb_siguiente.setBackground(new Color(14, 47, 88));
        view_Ciclos.jb_anterior.setEnabled(true);
        view_Ciclos.jb_anterior.setBackground(new Color(14, 47, 88));

        //Se inabilitan la opción de buscar
        view_Ciclos.jb_buscar.setEnabled(true);
        view_Ciclos.jtf_buscar.setEditable(true);

        //todos los textfield se bloquean y los id se ponen invisibles con el metodo setVisible        
        view_Ciclos.jtf_id_ciclo.setVisible(false);
        view_Ciclos.jtf_id_ciclo.setEditable(false);
        //Campos de texto
        view_Ciclos.jtf_ciclo.setEditable(false);
        view_Ciclos.jtf_fecha_inicio.setEditable(false);
        view_Ciclos.jtf_fecha_termino.setEditable(false);
    }

    private void initView() {
        model_Conexion.Conexion();
        model_Ciclos.llenarTodos();
        view_Ciclos.setVisible(true);
        model_Ciclos.moverPrimero();
        getValores();
    }
}
