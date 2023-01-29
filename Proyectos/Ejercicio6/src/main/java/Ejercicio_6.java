/*
*6. Diseña un programa Java  denominado PROG02_Ejerc6 que cree un 
*tipo enumerado para las siguientes razas de perro: Mastín, Terrier, 
*Bulldog, Pekines, Caniche y Galgo.
*
* @author  Edwin Alvarez Perez
* @version 1.0
* @since   12/11/2021 
*/

public class Ejercicio_6 {
    
    public enum razas {Mastin, Terrier, Bulldog, Pekines, Caniche, Galgo}
    public static void main(String[] args) {
        razas var1 = razas.Bulldog;
        razas var2 = razas.Galgo;
        
        System.out.println("La primera raza de perro es: "+var1);
        System.out.println("La segunda raza de perro es: "+var2);
        System.out.println("Resultado de comparar las dos variables: "+(var1==var2));
        System.out.println("El puesto en el que se encuentra la primera raza es: "+var1.ordinal());
        System.out.println("El puesto en el que se encuentra la segunda raza es: "+var2.ordinal());
}
    
}
