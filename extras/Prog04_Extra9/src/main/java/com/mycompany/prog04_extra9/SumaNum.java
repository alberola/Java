/*
 * Realiza un programa en Java que pida 10 números por teclado, haga la suma de esos 10 números
 * pasados por teclado, cuente los números positivos y cuente los números negativos. Usa <<do-while>>
 */
package com.mycompany.prog04_extra9;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class SumaNum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, contador = 0, neg = 0, pos = 0;
        do{
            System.out.println("Dame un número");
            int num = sc.nextInt();
            contador++;
            suma +=num;
            if(num > 0){
                pos++;
            }else{
                neg++;
            }
            
        } while (contador < 10);
        System.out.println("La suma total es : "+ suma +".\n"+
                "El número de positivos es: "+pos+".\nEl de negativos: "+neg+".");       
    }
    
}
