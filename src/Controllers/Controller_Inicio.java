/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.View_Inicio;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Mike
 */
public class Controller_Inicio {
    
    View_Inicio view_Inicio;
    
    public Controller_Inicio(View_Inicio view_Inicio) {
        this.view_Inicio = view_Inicio;          
        this.view_Inicio.jb_salir.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_salir_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_salir_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                view_Inicio.jb_salir.setCursor(new Cursor(Cursor.HAND_CURSOR));
                view_Inicio.jb_salir.setBackground(new Color(10, 34, 64));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view_Inicio.jb_salir.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                view_Inicio.jb_salir.setBackground(new Color(14, 47, 88));
            }
        });
        initView();
    }
    private void jb_salir_click() {
        System.exit(0);
    }        
    
    private void initView() {        
        this.view_Inicio.setVisible(true);
    }
}
