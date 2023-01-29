/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro08_ejer5_academ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class Academico implements Comparable<Academico> {

    String nombre;
    int aIngreso;

    public Academico(String nombre, int aIngreso) {

        this.nombre = nombre;

        this.aIngreso = aIngreso;
    }

    @Override
    public int compareTo(Academico o) {

        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Academico{" + "nombre=" + nombre
                + ", año de ingreso=" + aIngreso + "}\n";
    }

    
    
    
    public static void main(String[] args) {
        /*Programa principal: Con TreeMap tenemos un mapa ordenado por las claves (la letra), 
             donde vamos a insertar cinco académicos */
        System.out.println("\n Gestión de Académicos");
        Scanner sc = new Scanner(System.in);
        Map<Character, Academico> academia = new TreeMap<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\n Letra: ");            
            Character letra = sc.nextLine().charAt(0);
            // new Scanner(System.in).next().charAt(0);
            System.out.println("\n Nombre: ");
            String nombre = sc.nextLine();
            //sc.nextLine();
            System.out.println("\n Año de ingreso: ");
            int ingreso = new Scanner(System.in).nextInt();
            //sc.nextLine();
            nuevoAcademico(academia, new Academico(nombre, ingreso), letra);
        }

        System.out.println(
                "Orden por letra: " + academia);
        /*Para ordenar por los valores, tenemos que obtener una vista del mapa. Si nos conformamos con mostrar solo los valores (nombre y año de ingreso de los académicos, bastará una vista de los valores, transformada en lista para poder ordenar: */
        Collection<Academico> sinLetra = academia.values();
        List<Academico> listaSinLetra = new ArrayList<>(sinLetra);

        Collections.sort(listaSinLetra);

        System.out.println(
                "Por nombre sin letra: " + listaSinLetra);
        /*por año de ingreso: */
        Comparator<Academico> comparaIngresos = new Comparator<>() {
            @Override
            public int compare(Academico o1, Academico o2) {

                return o1.aIngreso - o2.aIngreso;
            }
        };

        Collections.sort(listaSinLetra, comparaIngresos);

        System.out.println(
                "Por año sin letra: " + listaSinLetra);
        /*Si queremos que aparezca la clave (la letra) trabajaremos con una vista de las entradas: */
        Set<Map.Entry<Character, Academico>> conLetra = academia.entrySet();
        /*Convertimos en lista para ordenar las entradas:*/
        List<Map.Entry<Character, Academico>> listaConLetra = new ArrayList<>(conLetra);

        /* Ordenamos por año de ingreso : */
        Collections.sort(listaConLetra,
                new Comparator<>() {   /* el tipo se infiere de listaConLetra        */
            @Override
            public int compare(Map.Entry< Character, Academico> ol, Map.Entry< Character, Academico> o2) {
                return ol.getValue().aIngreso - o2.getValue().aIngreso;
            }
        });
        
        
        System.out.println(" Orden por año de ingreso : " + listaConLetra);
        
        
        /* Ordenamos por orden natural(nombres) de los académicos */
        Collections.sort(listaConLetra, new Comparator<>() {          /* el tipo se infiere de listaConLetra            */
            @Override
            public int compare(Map.Entry< Character, Academico> o1, Map.Entry< Character, Academico> o2) {
                return o1.getValue().compareTo(o2.getValue()
                );
            }
        });
        System.out.println(" Orden por nombre : " + listaConLetra);

    }

    static boolean nuevoAcademico(Map< Character, Academico> academia, Academico nuevo, Character letra) {
        boolean insertado = false;
        if ((letra >= 'A' && letra <= 'Z')
                || (letra >= 'a' && letra <= 'z')
                || letra == 'ñ' || letra == 'Ñ') {
            academia.put(letra, nuevo);
            insertado = true;
        } else {
            System.out.println(" Letra no válida ");
        }

        return insertado;
    }
}
