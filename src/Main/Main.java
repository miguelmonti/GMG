package Main;

import Models.*;
import Views.*;
import Controllers.*;

/**
 *
 * @author Mike
 */
public class Main {
    
    public static void main (String maom[]){
        
        Model_Conexion model_Conexion = new Model_Conexion();
        Model_Loggin model_Loggin = new Model_Loggin();
        
        View_Loggin view_Loggin = new View_Loggin();
        View_Principal view_Principal = new View_Principal();
        
        Controller_Loggin controller_Loggin = new Controller_Loggin(model_Loggin, model_Conexion, view_Loggin, view_Principal);
    }
}
