package Models;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */

public class Model_Loggin {
    Model_Conexion conexion = new Model_Conexion();
    
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    CallableStatement call;
    
    private String usuario;
    private String password;
    private String tipo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String Validar(String usuario, String password) {
        String tipo = null;
        try {            
            conexion.Conexion();
            call = conexion.conexion.prepareCall("{CALL  validacion(?,?)}");            
            call.setString(1, usuario);
            call.setString(2, password);
            call.execute();
            rs = call.getResultSet();
            rs.next();
            setTipo(rs.getString("tipo_usuario"));            
            System.out.println(getTipo());
            if ("Administrador".equals(getTipo())) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido al sistema Administrador!", "Acceso Validado", JOptionPane.INFORMATION_MESSAGE);
                tipo = getTipo();
            } else if (getTipo().equals("Profesor")) {
                tipo = getTipo();
                JOptionPane.showMessageDialog(null, "¡Bienvenido al sistema Profesor!", "Acceso Validado", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Por favor revisa que tus datos sean correctos", "Acceso No Concedido", JOptionPane.INFORMATION_MESSAGE);
        }
        return tipo;
    }
}