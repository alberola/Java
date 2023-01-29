/*
 * Clase validaciones que servirá para realizar las comprobaciones que se requieran.
 */
package com.mycompany.prog06_4;

/**
 *
 * @author Alejandro Alberola Gopar
 */
public class Validaciones {
    //Metodo para comprobar validacion del dni.
    public static boolean validarDni(String dni) {
        return dni.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }
    /*
        //Metodo para comprobar validacion del nombre (2 espacios para tener 2 apellidos).
        public static boolean validarNombre(String nombre) {
            int indice = nombre.indexOf(" ");
            if (indice == -1) {
                return false;
            }
            indice = nombre.indexOf(" ", indice + 1);
            if (indice != -1) {
                return true;
            }
            return false;
        }
    */
}
