/**
 * Práctica 6 DAW - Programación  
 *
 * 6.- Diseña un programa Java  denominado PROG02_Ejerc6 que cree un tipo enumerado para las siguientes
 * razas de perro: Mastín, Terrier, Bulldog, Pekines, Caniche y Galgo.
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 05/11/2021
 */
package com.mycompany.prog02_ejerc6;
public class prog02_ejerc6 {
    enum Razas {
       Mastin, Terrier, Bulldog, Pekines, Caniche, Galgo;     //Creamos el enum llamado razas donde incluiremos las distintas razas.
    }
    public static void main(String[] args){
        Razas var1 = Razas.Mastin;//Como no se me ocurre como pedirlo por pantalla para realizar el ejercicio, creamos la variable con la raza ya integrada.
        System.out.println(var1);//Imprimimos la raza que ya le hemos asignado previamente a var1.
        Razas var2 = Razas.Bulldog;
        System.out.println(var2);
        System.out.printf("¿Es la raza %s igual a la raza %s?\n",var1,var2);//Una vez tenemos las dos variables de razas las comparamos
        if (var1.equals(var2)){ // También se podria realizar con un doble igual ==.
            System.out.println("Son iguales.");//Imprimimos por pantalla si son iguales (en este caso si).
        }else {
            System.out.println("No son iguales.");//Imprimimos por pantalla si no son iguales (en este caso no)
        }
        System.out.println("Como añadido del ejercicio vamos a mostrar la posición en el enum:\nMastin = "+var1.ordinal()+".\n Bulldog = "+ var2.ordinal()+".");
        System.out.println("El número de elementos del enum es "+Razas.values().length+".");
    }    
}
