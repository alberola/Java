/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc02;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 22/04/2022
 */
public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static byte mostrarMenu(){
        System.out.println("1.-Alta.");
        System.out.println("2.-Baja.");
        System.out.println("3.-Modificación.");
        System.out.println("4.-Listado por DNI.");
        System.out.println("5.-Listado por antiguedad.");
        System.out.println("6.-Salir");
        
        byte opcion = sc.nextByte();
        sc.nextLine();
        return opcion;
    }
    public static void main(String[] args) {
        byte opt;
        Set<Socio> socios = new TreeSet<>();
        try(ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("socios.dat"))){
            
            socios = (TreeSet<Socio>)in.readObject();
        } catch (IOException ex){
            System.out.println("Lista de socios vacia.");
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
        
        do{
            opt = Principal.mostrarMenu();
            switch(opt){
                case 1:
                    System.out.println("dni: ");
                    String dni = sc.nextLine();
                    boolean resultado = alta (socios, dni);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("dni socio: ");
                    String dniBaja = sc.nextLine();
                    socios.remove(new Socio(dniBaja));
                    
                    break;
                case 3:
                    System.out.println("dni: ");
                    String dniModificacion = sc.nextLine();
                    socios.remove(new Socio(dniModificacion));      
                    alta (socios, dniModificacion);
                    break;
                    
                case 4:
                    System.out.println(socios);
                    break;
                    
                case 5:
                    Comparator<Socio> c = new Comparator<>(){
                        @Override
                        public int compare (Socio o1, Socio o2){
                            return o2.antiguedad() - o1.antiguedad();
                        }
                        
                    };
                        Set<Socio> s = new TreeSet<>(c);
                        s.addAll(socios);
                        System.out.println(s);
                    break;
                    
            }
        } while (opt != 6);
    }
    public static boolean alta (Set<Socio> socios, String dni){
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Fecha de alta: ");
        System.out.println("Años:");
        int años = sc.nextInt();
        sc.nextLine();
        System.out.println("Meses: ");
        int meses = sc.nextInt();
        sc.nextLine();
        System.out.println("Dias: ");
        int dias = sc.nextInt();
        sc.nextLine();
        LocalDate fechaAlta = LocalDate.of(años, meses, dias);
        Socio nuevo = new Socio (dni,nombre,fechaAlta);
        return socios.add(nuevo);
    }
}
