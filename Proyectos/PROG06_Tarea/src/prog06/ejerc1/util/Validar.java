/*
 * Clase que se encarga de las validaciones necesarias (en este caso solo se usará la validación del código).
 */
package prog06.ejerc1.util;

import java.time.LocalDate;
import java.util.regex.Pattern;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Validar {
    
    public static boolean comparaFecha (LocalDate fecha_mat){
        return fecha_mat.isBefore(LocalDate.now());
    }
    
    public static boolean validaDNI (String dni){
        return dni.matches("^[0-9]{8}[A-Z]$");  //Versión simple para validar un DNI.
        
    }
    
    public static boolean validaMatricula (String matricula){        
        return matricula.matches("^[0-9]{4}[A-Z]{3}$"); //Versión simple para validar una matrícula.
    }
    
    public static boolean validaNombre (String nombre){
        
        if (nombre.length()>40) return false; //comprobamos que el tamaño no supera los 40 caracteres
         
        int posicion = nombre.indexOf(" "); //buscamos el primer espacio en blanco.
        
        if (posicion==-1) return false; //Si no existe
        else {
            posicion=nombre.indexOf(" ", posicion+1); //Buscamos el siguiente espacio en blanco.
            if (posicion==-1) return false; //Si no lo encontramos
            
        }
        return true;
        
    }
    public static boolean validaCodigo (String codigo){        
        return codigo.matches("^[A-Za-z]{2}[-][A-Za-z]{3}[-][0-9]{2}[-][0-9]{5}$"); //Versión para validar un codigo.
    }
    
}
