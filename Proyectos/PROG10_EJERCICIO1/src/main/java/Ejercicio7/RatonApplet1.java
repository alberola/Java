/*
 * Clase RattonApplet la cual implementa la clase MouseListener para capturar eventos de ratón.
 */
package Ejercicio7;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.JFrame;

/**
 *
 * @author http://www.sc.ehu.es/sbweb/fisica/cursoJava/applets/events/raton.htm
 * @Edited Alejandro Alberola Gopar
 * @version 2.0
 * @since 27/05/2022
 */

public class RatonApplet1 extends Applet implements MouseListener {

    private final int radio = 8;

    public void init() {
        setBackground(Color.white);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent ev) {
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.fillOval(ev.getX() - radio, ev.getY() - radio, 2 * radio, 2 * radio);
        g.dispose();
    }

    public void mouseExited(MouseEvent event) {
    }

    public void mouseReleased(MouseEvent event) {
    }

    public void mouseClicked(MouseEvent event) {
    }

    public void mouseEntered(MouseEvent event) {
    }
    
    public static void main( String args[] ) {
     
        RatonApplet1 ventana = new RatonApplet1();
    
        ventana.setSize( 360, 120 );

        ventana.setVisible(true);
    }
}
