/**
 * Práctica 5 DAW - Programación  
 *
 * 5.- Diseña un programa Java denominado PROG02_Ejerc5 que dado un número de segundos,
 * muestre en pantalla cuántos minutos, horas y días contiene.
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 05/11/2021
 */
package com.mycompany.prog02_ejerc5;
import java.util.Scanner;
public class prog02_ejerc5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int minutos, horas, dias;//Insertamos variables que posteriormente calcularemos
        System.out.println("Dame una cantidad de segundos: ");
        int segundos = sc.nextInt();//Creamos y pedimos por pantalla la varriable segundos
        minutos = (segundos/60);//Una vez tenemos la variable segundos calculamos los correspondientes minutos,horas,días.
        horas = (segundos/3600);
        dias = (segundos/216000);//Se podria hacer con TimeUnit.HOURS.convert...
        System.out.printf("%d segundos equivalen a:\n %d minutos.\n %d horas.\n %d días.",segundos,minutos,horas,dias);//Se imprimen las variables .         
    }
    
}
