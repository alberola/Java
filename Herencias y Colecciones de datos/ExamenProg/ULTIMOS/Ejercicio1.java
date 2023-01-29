/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_avanzado_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 1DAW16
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for ( int i = 0 ; i < 20 ; i++){
            lista.add((int) (Math.random()*10) + 1);
        }
        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        System.out.println("Lista original: "+ lista);
        Set<Integer> sinRepeticiones = new TreeSet<>();
        sinRepeticiones.addAll(lista);
        System.out.println("Sin repeticiones: "+sinRepeticiones);
        Set<Integer> repetidos = new TreeSet<>();
        for (Integer e : sinRepeticiones){
            lista.remove(e);           
        }
        //Despues de eliminar de la lista uno de cada, solo quedan las repeticiones.
        repetidos.addAll(lista);
        System.out.println("Repetidos: "+repetidos);
        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(sinRepeticiones);
        unicos.removeAll(repetidos);
        System.out.println("Elementos no repetidos: " + unicos );
    }
    
}
