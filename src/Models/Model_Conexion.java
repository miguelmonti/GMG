package Models;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class Model_Conexion {
    
     Statement st;
     Connection conexion;
    
    public void Conexion(){        
        try{                                    
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistema_gmg","root", "1405");      
            st = conexion.createStatement();             
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se ha detectado conexión con la base de datos", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
}
