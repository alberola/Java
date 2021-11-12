/**
 * Práctica 1 DAW - Programación  
 * El programa PROG02_ejerc1 implementa una aplicación que
 * simplemente declara los distintos tipos de variables
 * para poder ver su funcionalidad y los imprime por pantalla
 * utilizando un (System.out.printf) ya que no se puede utilizar println.
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 02/11/2021
 */
public class prog02_ejerc1 {
    public static void main (String[] args){
        
        //1. Valor máximo no modificable: 5000.
        final short MAX=5000; 
        System.out.printf("El valor no modificable máximo es: %d.\n", MAX);
        
        //2.Si el nuevo empleado tiene carnet de conducir o no
        boolean carnet = true; //En este caso como tengo carnet el valor de carnet será true en caso contrario seria false.
        System.out.printf("En mi caso tengo carnet = %b. \n",carnet); //Al ser true cuando imprimimos carnet nos saldra true.
        
        //3. Un mes del año en formato numérido y como cadena.
        String abril = "Abril"; 
        byte mes = 4;
        System.out.printf("El mes es: %s y en formato numerico: 0%d.\n",abril,mes);
        
        //4.El nombre y apellidos de una persona.
        String nombre = "Alejandro";
        String apellidos = "Alberola Gopar";
        System.out.printf("Mi nombre es %s y mis apellidos %s.\n",nombre,apellidos);
        
        //5.Sexo: con dos valores posibles 'V' o 'M'.
        char sexv = 'V';
        char sexm = 'M';
        System.out.printf("En mi caso mi sexo es: %s.\n",sexv);
        
        //6.Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
        long unixtime = System.currentTimeMillis();
        System.out.printf("El valor de unix es: %s.\n",unixtime);
        
        //7.Saldo de una cuenta bancaria.
        int dinero = 4000; //Para poner el dinero del banco usaremos la variable int (Es la más acorde al supuesto caso)
        System.out.printf("El dinero actual de la cuenta es: %d.\n",dinero);
        
        //8.Distancia en kms desde la Tierra a Júpiter.
        int distancia = 588000000;//Con el int tendriamos para la distancia entre la tierra y jupiter 
        System.out.printf("La distancia entre la Tierra y Júpiter es de: %dkm.\n",distancia);
                       
    }
    
}
