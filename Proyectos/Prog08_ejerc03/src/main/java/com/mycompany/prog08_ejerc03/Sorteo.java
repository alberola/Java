/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Alejandro Alberola Gopar
 * @version 2.0
 * @since 23/04/2022
 */
public class Sorteo<T extends Comparable<T>>{
    private final Set<T> elementos;
    public Sorteo(){
        elementos = new TreeSet<>();
    }
    public boolean add(T nuevo){
        return elementos.add(nuevo);
    }
    
    Set<T> premiados(int numPremiados){
        Set<T> premiados = null;
        List<T> temp = new ArrayList<>(elementos);
        Collections.singleton(temp);
        if(numPremiados <= elementos.size()){
            premiados = new TreeSet<>();
            for ( int i = 0 ; i < numPremiados; i++){
                premiados.add(temp.get(i));
            }
        }
        return premiados;
    }
    @Override
    public String toString(){
        return "---------Sorteo---------\n"+"Elementos = "+elementos;
    }
    public static void main (String[] args){
        //Prueba ejemplo.
        Sorteo<Integer> s = new Sorteo<>();
        for ( int i = 0 ; i < 100; i++){
            s.add(i);
        }
        System.out.println(s);
        System.out.println("Premiados: " + s.premiados(20));
    }
}
