/*
 * Clase para validar algun dato.
 */
package com.mycompany.prog07_tarea;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 04/04/2022
 */
public class Validaciones {
    public static boolean validarIban(String iban) {
        return iban.matches("^[E][S][0-9]{21}$");
    }
}
