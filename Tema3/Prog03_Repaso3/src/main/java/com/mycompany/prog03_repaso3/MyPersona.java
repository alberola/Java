/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog03_repaso3;
import java.util.Scanner;
/**
 *
 * @author 1daw16
 */
public class MyPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona miPersona = new Persona();
        System.out.println("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Dime tu edad: ");
        int edad =  sc.nextInt();
        System.out.println("Dime tu peso en kg: ");
        int peso = sc.nextInt();
        System.out.println("Dime tu altura en cm: ");
        int altura = sc.nextInt();
        miPersona.setEdad(edad);
        miPersona.setPeso(peso);
        miPersona.setAltura(altura);
        System.out.println(miPersona);
        System.out.println("Tu IMC = "+miPersona.calcularIMC()+".");
        System.out.println("¿Es mayor de edad? "+miPersona.esMayorDeEdad());
        
        Persona miPersona2 = new Persona("Alejandro",21,'H');
        
        Persona miPersona3 = new Persona();
        miPersona3.setNombre("Alejandro");
        miPersona3.setSexo('H');
        miPersona3.setEdad(21);
        miPersona3.setPeso(80);
        miPersona3.setAltura(172);
        System.out.println(miPersona3);
        System.out.println("Tu IMC = "+miPersona3.calcularIMC()+".");
        System.out.println("DNI aleatorio generado: "+miPersona3.generaDNI());
        System.out.println("¿Es mayor de edad? "+miPersona3.esMayorDeEdad());
        
        
    }
    
}
