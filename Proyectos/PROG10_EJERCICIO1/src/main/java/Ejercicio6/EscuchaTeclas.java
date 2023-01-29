/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio6;

import javax.swing.* ;
import java.awt.event.* ;
/**
 *
 * @author JJBH EDITED BY ALEJANDRO ALBEROLA GOPAR
 * @version 2.0
 * @since 23/05/2022
 */
// Definimos la clase que hereda de JFrame
public class EscuchaTeclas extends JFrame {
    // Variables para escribir
    private String linea1 = "", linea2 = "", linea3 = "";
    private JTextArea areaTexto;

    // Constructor de la clase
    public EscuchaTeclas () {
        // Crear objeto JTextArea
        
        //Creamos un area de Texto de 10x15 con un mensaje predefinido...
        areaTexto = new JTextArea( 10, 15 );
        areaTexto.setText( "Pulsa cualquier tecla del teclado..." );
        areaTexto.setEnabled( false );

        // Añadir al JFrame el objeto areaTexto
        //Añadimos el area de texto al panel 
        this.getContentPane().add( areaTexto );

        // Crear el objeto oyente de teclas
        //Creamos un objeto de tipo OyenteTeclas (metodo que tenemos debajo).
        OyenteTeclas oyenteTec = new OyenteTeclas() ;

        // Registrar el oyente en el JFrame
        //Registramos (escribimos en el cuadro de texto) lo que nos llega por el objeto oyenteTec de tipo OyenteTeclas.
        this.addKeyListener(oyenteTec);

    }

    // Implementar la clase oyente que implemente el interface KeyListener
    //Clase OyenteTeclas que implementa KeyListener para tener registro de las teclas que se tocan.
    class OyenteTeclas implements KeyListener{
        // Gestionar evento de pulsación de cualquier tecla
        //Método keyPressed el cual detecta un evento de tipo KeyEvent para detectar cuando se pulso una tecla y que tecla se pulso.
        public void keyPressed( KeyEvent evento )
        {
            linea1 = "Se oprimió tecla: " + evento.getKeyText( evento.getKeyCode() );
            establecerTexto( evento );
        }

        // Gestionar evento de liberación de cualquier tecla
        //Método keyReleased que detecta un evento de tipo KeyEvent para detectar cuando se soltó una tecla pulsada previamente.
        public void keyReleased( KeyEvent evento )
        {
           linea1 = "Se soltó tecla: " + evento.getKeyText( evento.getKeyCode() );
            establecerTexto( evento );
        }

        // manejar evento de pulsación de una tecla de acción
        //Método que registra que tecla se escribió y la almacena en un string llamado linea1.
        public void keyTyped( KeyEvent evento )
         {
          linea1 = "Se escribió tecla: " + evento.getKeyChar();
          establecerTexto( evento );
         }
    }

    // Establecer texto en el componente areaTexto
    //Método para introducir texto en el area de texto creada previamente.
    private void establecerTexto( KeyEvent evento )
    {
        // getKeyModifiersText devuelve una cadena que indica
        // el modificador de la tecla, por ejemplo Shift
        String temp = evento.getKeyModifiersText( evento.getModifiers() );
        
        //String llamado linea2(representa la segunda linea del panel de texto) que detectará si lo que pulsamos es una tecla de acción o no (CTR - Block Mayus...).
        linea2 = "Esta tecla " + ( evento.isActionKey() ? "" : "no " ) +
         "es una tecla de acción";
        //String llamado linea3 (representa la tercera linea del panel de texto) que nos indica si la tecla que mantenemos pulsada es modificadora o no.
        linea3 = "Teclas modificadoras oprimidas: " + ( temp.equals( "" ) ? "ninguna" : temp );

        // Establecer texto en el componente areaTexto
        areaTexto.setText( linea1 + "\n" + linea2 + "\n" + linea3 + "\n" );
    }
    
    //Método principal (main) del programa donde invocaremos los distintos paneles así como las acciones que hemos creado en los distintos métodos.
    public static void main( String args[] )
    {
      // Crear objeto y establecer propidades
      EscuchaTeclas ventana = new EscuchaTeclas();
      //Le indicamos a la ventana que se cerrará al finalizar el programa(darle a la x) ya que si lo cerraramos de golpe podriamos matar procesos que se estuvieran ejecutando.
      ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      ventana.setTitle("Título de la ventana");
      //Seteamos el tamaño de la ventana
      ventana.setSize( 360, 120 );
      //Indicamos que la ventana será visible.
      ventana.setVisible(true);
      
    }
}
