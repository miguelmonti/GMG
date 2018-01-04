package Models;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class Model_Ciclos {

    Model_Conexion conexion = new Model_Conexion();

    public ResultSet rs;
    CallableStatement call;

    private int id_ciclo;
    private String ciclo;
    private String fecha_inicio;
    private String fecha_termino;
    private String busqueda_palabra;
    
    public String getBusqueda_palabra(){
        return busqueda_palabra;
    }
    
    public void setBusqueda_palabra(String busqueda_palabra){
        this.busqueda_palabra = busqueda_palabra;
    }
    
    public int getId_ciclo() {
        return id_ciclo;
    }

    public void setId_ciclo(int id_ciclo) {
        this.id_ciclo = id_ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(String fecha_termino) {
        this.fecha_termino = fecha_termino;
    }

    public void llenarValores() {
        try {
            setId_ciclo(rs.getInt("id_ciclo"));
            setCiclo(rs.getString("ciclo"));
            setFecha_inicio(rs.getString("fecha_inicio"));
            setFecha_termino(rs.getString("fecha_termino"));
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "No se han llenado correctamente los campos", "Error de llenado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void llenar_Tabla() {
        try {
            conexion.Conexion();
            call = conexion.conexion.prepareCall("{CALL vista_ciclos()}");
            call.execute();
            rs = call.getResultSet();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Verifique la Base de Datos", "Error BD-1", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void llenarTodos() {
        try {
            conexion.Conexion();
            call = conexion.conexion.prepareCall("{CALL select_ciclos()}");
            call.execute();
            rs = call.getResultSet();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Verifique la Base de Datos", "Error BD-2", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Insertar(String ciclo, String fecha_inicio, String fecha_termino) {
        try {
            conexion.Conexion();
            call = conexion.conexion.prepareCall("{CALL  insert_ciclos(?,?,?)}");
            call.setString(1, ciclo);
            call.setString(2, fecha_inicio);
            call.setString(3, fecha_termino);
            call.executeUpdate();
            llenarTodos();
            moverPrimero();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            // JOptionPane.showMessageDialog(null, "Verifique los datos que se insertan", "Error al insertar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Borrar(int id_ciclo) {
        try {
            conexion.Conexion();
            call = conexion.conexion.prepareCall("{CALL  delete_ciclos(?)}");
            call.setInt(1, id_ciclo);
            call.executeUpdate();
            llenarTodos();
            moverPrimero();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Verifique que se esta eliminando correctamente", "Error al Eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Actualizar(int id_ciclo, String ciclo, String fecha_inicio, String fecha_termino) {
        try {
            conexion.Conexion();
            call = conexion.conexion.prepareCall("{CALL  update_ciclos(?,?,?,?)}");
            call.setInt(1, id_ciclo);
            call.setString(2, ciclo);
            call.setString(3, fecha_inicio);
            call.setString(4, fecha_termino);
            call.executeUpdate();
            llenarTodos();
            moverPrimero();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //JOptionPane.showMessageDialog(null, "Verifique que los datos sean correctos", "Error al Actualizar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscar_Registro(String busqueda_palabra){
        try{
            conexion.Conexion();
            call = conexion.conexion.prepareCall("{CALL  busqueda_ciclo(?)}");
            call.setString(1, busqueda_palabra);            
            call.execute();  
            rs = call.getResultSet();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error en la busqueda", JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    public void moverUltimo() {
        try {
            if (rs.isLast() == false) {
                rs.last();
                llenarValores();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error, consulte al DESARROLLADOR!", "Error de desplazamiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void moverSiguiente() {
        try {
            if (rs.isLast() == false) {
                rs.next();
                llenarValores();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error, consulte al DESARROLLADOR!", "Error de desplazamiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void moverAnterior() {
        try {
            if (rs.isFirst() == false) {
                rs.previous();
                llenarValores();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error, consulte al DESARROLLADOR!", "Error de desplazamiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void moverPrimero() {
        try {
            if (rs.isFirst() == false) {
                rs.first();
                llenarValores();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error, consulte al DESARROLLADOR!", "Error de desplazamiento", JOptionPane.ERROR_MESSAGE);
        }
    }
}
