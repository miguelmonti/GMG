package Controllers;

import Models.Model_Loggin;
import Models.Model_Conexion;
import Views.View_Loggin;
import Views.View_Principal;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Mike
 */
public class Controller_Loggin {
    
    Model_Loggin model_Loggin;
    Model_Conexion model_Conexion;
    View_Loggin view_Loggin;
    View_Principal view_Principal;
      
    public Controller_Loggin(Model_Loggin model_Loggin, 
            Model_Conexion model_Conexion, 
            View_Loggin view_Loggin,
            View_Principal view_Principal){
        this.model_Loggin = model_Loggin;
        this.model_Conexion = model_Conexion;
        this.view_Loggin = view_Loggin;
        this.view_Principal = view_Principal;
        this.view_Loggin.jb_entrar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_entrar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_entrar_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                view_Loggin.jb_entrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                view_Loggin.jb_entrar.setBackground(new Color(10, 34, 64));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view_Loggin.jb_entrar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                view_Loggin.jb_entrar.setBackground(new Color(14, 47, 88));
            }
        });
        initView();
    }
    
    public void getValores() {
        view_Loggin.jtf_usuario.setText("" + model_Loggin.getUsuario());
        view_Loggin.jtf_password.setText("" + model_Loggin.getPassword());
    }

    public void setValores() {
        model_Loggin.setUsuario(view_Loggin.jtf_usuario.getText());
        model_Loggin.setPassword(view_Loggin.jtf_password.getText());
    } 
    
    public void jb_entrar_click(){
        setValores();       
        model_Loggin.Validar(model_Loggin.getUsuario(), model_Loggin.getPassword());
        if ("ADMINISTRADOR".equals(model_Loggin.getTipo())) {    
            System.out.println("Entro al condicional IF");
            this.view_Loggin.setVisible(false);
            this.view_Principal.setVisible(true);            
        } else if ("PROFESOR".equals(model_Loggin.getTipo())) {                        
            System.out.println("Entro al condicional ELSEIF");
            view_Loggin.setVisible(false);
            this.view_Principal.setVisible(true);
        }
        getValores();
    }
    
    private void initView() {   
        this.model_Conexion.Conexion();        
        this.view_Loggin.setLocationRelativeTo(null);
        this.view_Loggin.setVisible(true);
    }
}
