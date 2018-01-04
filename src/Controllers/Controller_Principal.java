package Controllers;

import Views.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Mike
 */
public class Controller_Principal {

    View_Principal view_Principal;
    View_Inicio view_Inicio;
    View_Ciclos view_Ciclos;
    View_Tutores view_Tutores;

    public Controller_Principal(View_Principal view_Principal,
            View_Inicio view_Inicio,
            View_Ciclos view_Ciclos,
            View_Tutores view_Tutores) {
        this.view_Principal = view_Principal;
        this.view_Inicio = view_Inicio;
        this.view_Ciclos = view_Ciclos; 
        this.view_Tutores = view_Tutores;
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
        this.view_Inicio.jb_ciclos.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_ciclos_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_ciclos_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                view_Inicio.jb_ciclos.setCursor(new Cursor(Cursor.HAND_CURSOR));
                view_Inicio.jb_ciclos.setBackground(new Color(10, 34, 64));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view_Inicio.jb_ciclos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                view_Inicio.jb_ciclos.setBackground(new Color(14, 47, 88));
            }
        });
        this.view_Inicio.jb_tutores.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jb_tutores_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_tutores_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                view_Inicio.jb_tutores.setCursor(new Cursor(Cursor.HAND_CURSOR));
                view_Inicio.jb_tutores.setBackground(new Color(10, 34, 64));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view_Inicio.jb_tutores.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                view_Inicio.jb_tutores.setBackground(new Color(14, 47, 88));
            }
        });
        this.view_Ciclos.jb_regresar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {   
                jb_regresar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_regresar_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Ciclos.jb_regresar.isEnabled()) {
                    view_Ciclos.jb_regresar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Ciclos.jb_regresar.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Ciclos.jb_regresar.isEnabled()) {
                    view_Ciclos.jb_regresar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Ciclos.jb_regresar.setBackground(new Color(14, 47, 88));
                }
            }
        });
        this.view_Tutores.jb_regresar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {   
                jb_regresar_click();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jb_regresar_click();
            }

            @Override
            public void mouseReleased(MouseEvent e) {                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (view_Tutores.jb_regresar.isEnabled()) {
                    view_Tutores.jb_regresar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    view_Tutores.jb_regresar.setBackground(new Color(10, 34, 64));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (view_Tutores.jb_regresar.isEnabled()) {
                    view_Tutores.jb_regresar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    view_Tutores.jb_regresar.setBackground(new Color(14, 47, 88));
                }
            }
        });
        initView();
    }

    private void jb_ciclos_click(){
        view_Principal.setContentPane(view_Ciclos);
        view_Principal.revalidate();
        view_Principal.repaint();
    }
    
    private void jb_tutores_click(){
        view_Principal.setContentPane(view_Tutores);
        view_Principal.revalidate();
        view_Principal.repaint();
    }
    
    private void jb_salir_click() {
        System.exit(0);
    }
    
    private void jb_regresar_click(){
        view_Principal.setContentPane(view_Inicio);
        view_Principal.revalidate();
        view_Principal.repaint();
    }

    private void initView() {                        
        this.view_Principal.setContentPane(view_Inicio);
        this.view_Principal.setVisible(true);
    }
}
