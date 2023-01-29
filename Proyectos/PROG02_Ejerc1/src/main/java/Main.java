/*
* Crea un proyecto en Netbeans denominado PROG02_Ejerc1 
* con una clase clase y método main y declara e inicializa 
* una variable para almacenar cada uno de los siguientes valores. 
* Trata de utilizar el tipo de datos de mas se ajuste a los datos. 
* Justifica tu elección.
*
* @author  Edwin Alvarez Perez
* @version 1.0
* @since   31/10/2021
*/
public class Main {

//Variable de tipo "enumerado" con 2 posibles valores (V y M)
    public enum sexo {V,M}
    public static void main(String[] args) {
        
//1. Valor máximo no modificable: 5000.------------------------------------
//En este ejercicio utilice el tipo de variable "short" ya que su rango es 
//-32,768 a 32,767 por lo que va perfecto para una cantidad como 5000.
        final short maximo = 5000;
        
//2. Si el nuevo empleado tiene carnet de conducir o no.-------------------
//Elegí el tipo de variable boolean ya que es una variable que solo puede tener
// dos valores (true o false). Y para decir si el empleado tiene carnet o no
// va perfecto.
        boolean carnet = true;
        
//3. Un mes del año en formato numérico y como cadena.---------------------
//Elegí el tipo de variable byte cuyo valor es -128 a 127 ya que para
//representar el número de uno de los meses del algo es mas que suficiente.
//Luego elegi el tipo de string para representar el mes como cadena.
        byte mesNumero = 4;
        String mesNombre = "Abril";
        
//4. El nombre y apellidos de una persona.---------------------------------
//Al tener que representar un nombre y apellidos elegí separarlos en dos
//tipos de variables string y luego a la hora de presentarlo 
//concatenar los strings.
        String nombre = "Edwin";
        String apellido = "Alvarez Perez";
        
//5. Sexo: con dos valores posibles 'V' o 'M'.-----------------------------
//Aqui elegimos V como valor.
        sexo genero = sexo.V;
        
//6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.---
//Dada la cantidad de milisegundos que tenemos el tipo de variable que mejor 
//se ajusta a esta cantidad es "long" que tiene un valor de 
//-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        long miliseg = System.currentTimeMillis();
        
//7. Saldo de una cuenta bancaria.-----------------------------------------
//El tipo de variable float nos permite tener una parte entera y otra 
//decimal por lo para representar una cuenta bancaria utilice esta variable.
        float saldoBanco = (float) 12345.678;
        
//8. Distancia en kms desde la Tierra a Júpiter.---------------------------
//Utilice el tipo de variable int ya que su rango es -2,147,483,648 a 
//2,147,483,647 por lo que es mas que suficiente para los km que separan 
//el planeta Tierra con Jupiter.
        int tierraJupiter = 588000000;
        
//Visualización de las variables con printf----------------------------------
        System.out.print("1. Valor máximo no modificable: "+ maximo);
        System.out.print("\n2. Si el nuevo empleado tiene carnet de conducir o no: "+ carnet);
        System.out.print("\n3. Un mes del año en formato numérico y como cadena: "+ mesNumero+(" "+mesNombre));
        System.out.print("\n4. El nombre y apellidos de una persona: "+ nombre.concat(" "+apellido));
        System.out.print("\n5. Sexo: con dos valores posibles 'V' o 'M': "+ genero);
        System.out.print("\n6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días: "+ miliseg+(" ms"));
        System.out.print("\n7. Saldo de una cuenta bancaria: "+ saldoBanco+(" €"));
        System.out.print("\n8. Distancia en kms desde la Tierra a Júpiter: "+ tierraJupiter+(" kms"));
    
    
//Intercambiar valores de variables------------------------------------------    
        int distanciakm = 594000000;
        int distanciakmluna = 120000;
        int aux;
        
        aux = distanciakm;
        distanciakm = distanciakmluna;
        distanciakmluna = distanciakm;
        
        System.out.print("\n distanciakm: "+distanciakmluna);
        System.out.print("\n distanciakmluna: "+aux);
        
    }// Cierre de la clase main.
    
}// Cierre de la clase ejerciciovariables.
