/*
 *
 */
package Biblioteca;

/**
 *
 * @author Diego Brito Sánchez
 * @version 1.0
 * @date 31 mar. 2022
 */
public class Validar {

    public static boolean validateISBN(String isbn) {
        return isbn.matches("[0-9]{6}");
        //isbn.matches("[0-9]{3}-[0-9]{2}-[0-9]{5}-[0-9]{2}-[0-9]{1}")
    }
}
