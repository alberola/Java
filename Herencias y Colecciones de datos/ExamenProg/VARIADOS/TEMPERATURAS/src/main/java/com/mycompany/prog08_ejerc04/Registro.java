/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author 1daw16
 */
public class Registro implements Serializable{
    LocalTime hora;
    double temperatura;
    
    public Registro(double temperatura){
        this.temperatura = temperatura;
        this.hora = LocalTime.now();       
    }
    
    public boolean equals(Object o){
        return hora.equals(((Registro) o).hora);       
    }
    @Override
    public String toString(){
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "---------Registro---------\n"+"Hora = "+ hora.format(f)+
                "\nTemperatura = "+ temperatura +"ºC\n";
    }
    
    public static void main (String[] args){
        Set<Registro> temperaturas = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        try ( ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("temperaturas.dat"))){
            temperaturas = (Set<Registro>) in.readObject();
        } catch (IOException ex){
            System.out.println("Listado vacio");
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
        
        byte opt;
        do {
                System.out.println("1.-Nuevo Registro.");
                System.out.println("2.-Listar Registros del día.");
                System.out.println("3.-Mostrar estadísticas.");
                System.out.println("4.-Salir.");
                opt = sc.nextByte();
                sc.nextLine();
                switch(opt){
                    case 1: 
                        System.out.println("Introduce la temperatura: ");
                        double temperatura = sc.nextDouble();
                        temperaturas.add(new Registro(temperatura));
                        break;
                    case 2:
                        System.out.println(temperaturas);
                        break;
                    case 3:
                        Comparator<Registro> c = new Comparator<Registro>(){
                            @Override
                            public int compare(Registro o1, Registro o2){
                                return (int) Math.signum(o1.temperatura - o2.temperatura);
                            }
                        };
                    {
                        System.out.println("Máxima:\n "+Collections.max(temperaturas, c));
                        System.out.println("Mínima:\n "+Collections.min(temperaturas, c));
                        double suma = 0;
                        for ( Registro t : temperaturas) {
                            suma += t.temperatura;
                        }
                        System.out.println("Media: "+suma /temperaturas.size());
                    }
                        break;

                }
        } while (opt != 4);
        try (ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("temperaturas.dat"))){
            out.writeObject(temperaturas);
        } catch (IOException ex){
            System.out.println(ex);
        }
    
    }
}
