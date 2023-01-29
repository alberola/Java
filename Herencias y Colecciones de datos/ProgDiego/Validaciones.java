/**
 * Clase Validaciones.
 */
package com.mycompany.prog06_4;

/**
 * @date 7 mar 2022
 * @author Diego Rodríguez Jacinto <drplaybasketball@gmail.com> 1DAW Número 26.
 * @version 1.0 Nombre de la Clase: Validaciones
 */
public class Validaciones {
//Método para validar el pattern del Dni del alumno.
    public static boolean comprobarDni(String DNI) {

        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");

    }
}
