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
        
                            /*Inicialización del objeto Model_Conexion*/
                                
        Model_Conexion model_Conexion = new Model_Conexion();
        
                            /*Inicializacion del objeto Inicio*/
                            
        Model_Inicio model_Inicio = new Model_Inicio();
        View_Inicio view_Inicio = new View_Inicio();
        Controller_Inicio controller_Inicio = new Controller_Inicio(view_Inicio);
        
                            /* Inicializacion de los objetos para Ciclos */
                            
        Model_Ciclos model_Ciclos = new Model_Ciclos();
        View_Ciclos view_Ciclos = new View_Ciclos();
        Controller_Ciclos controller_Ciclos = new Controller_Ciclos(model_Ciclos, model_Conexion, view_Ciclos);
                            
                            /* Inicializacion del los objetos para Tutores*/
        Model_Tutores model_Tutores = new Model_Tutores();
        View_Tutores view_Tutores = new View_Tutores();
        
                            /* Objetos para inicializar Prinicipal */
                           
        Model_Inicio model_Principal =  new Model_Inicio();
        View_Principal view_Principal = new View_Principal();
        Controller_Principal controller_Principal = new Controller_Principal(view_Principal, view_Inicio,
                view_Ciclos, view_Tutores);
                
                            /* Objetos para inicializar Loggin */
                
        Model_Loggin model_Loggin = new Model_Loggin();        
        View_Loggin view_Loggin = new View_Loggin();                
        Controller_Loggin controller_Loggin = new Controller_Loggin(model_Loggin, model_Conexion, view_Loggin, view_Principal);
        
        
                           
        
        
    }
}
