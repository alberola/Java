/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog10_evaluable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author 1daw16
 */
public class Biblioteca{
    private Set<Publicacion> biblioteca = new LinkedHashSet<>();
    private final String SEPARADOR = "****";
    
    Biblioteca (){
        
    }
    //COMO ES UN LINKEDHASHSET NO HACE FALTA COMPROBAR QUE SE REPITAN YA QUE NO PUEDEN ENTRAR REPETIDOS.
    public boolean insertarPublicacion(Publicacion publicacion){
        return biblioteca.add(publicacion);
    }
   

    public Set<Publicacion> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Set<Publicacion> biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    //Como tenemos un LinkedHashSet Se insertaran en orden de entrada.
    public void insertarEjemplos(){        
        Publicacion publi1 = new Libro("Si", "42418602R", "1", 2000, "Titulo1");
        insertarPublicacion(publi1);
        Publicacion publi2 = new Libro("Si", "42418602R", "2", 1000, "Titulo2");
        insertarPublicacion(publi2);
        Publicacion publi3 = new Libro("Si", "42418602R", "3", 3000, "Titulo3");
        insertarPublicacion(publi3);
        Publicacion publi4 = new Libro("Si", "42418602R", "4", 2000, "Titulo4");
        insertarPublicacion(publi4);
        Publicacion publi5 = new Libro("Si", "42418602R", "5", 2000, "Titulo5");
        insertarPublicacion(publi5);
        Publicacion publi6 = new Libro("Si", "42418602R", "6", 2000, "Titulo6");
        insertarPublicacion(publi6);
        Publicacion publi7 = new Libro("Si", "42418602R", "7", 2000, "Titulo7");
        insertarPublicacion(publi7);
        Publicacion publi8 = new Libro("Si", "42418602R", "8", 2000, "Titulo8");
        insertarPublicacion(publi8);
        Publicacion publi9 = new Libro("Si", "42418602R", "9", 2000, "Titulo9");
        insertarPublicacion(publi9);
        Publicacion publi10 = new Libro("Si", "42418602R", "10", 2000, "Titulo10");
        insertarPublicacion(publi10);
    }
    
    public boolean borrarIsbn(String isbn){
        for(Publicacion publi: biblioteca){
            if(publi.getIsbn().equalsIgnoreCase(isbn)){
                return biblioteca.remove(publi);
            }
        }
        return false;
    }
    //Metodo para listar 1 publicacion.
    public void buscarIsbn (String isbn){
        for(Publicacion publi: biblioteca){
            if(publi.getIsbn().equalsIgnoreCase(isbn)){
                System.out.println(publi.toString());
            }
        }
    }
    //Metodo para listar todas las cuentas
    public void listarCuentas(){
        for (Publicacion publicacion : biblioteca){
            System.out.println(publicacion.toString());
        }
    }
    
    public void guardarFicheroTxt (){
        PrintWriter salida = null;
        try {
            salida =  new PrintWriter("Publicaciones.txt");
            List<Publicacion> listaTitulo = new ArrayList<>(biblioteca);
            Comparator<Publicacion> ordenarTitulo = new Comparator<>(){
                @Override
                public int compare(Publicacion o1, Publicacion o2) {
                    return o1.getTitulo().compareToIgnoreCase(o2.getTitulo()); //To change body of generated methods, choose Tools | Templates.
                }
                
            };
            listaTitulo.sort(ordenarTitulo);
            for (Publicacion publicacion : listaTitulo) {
                salida.print(publicacion.getIsbn()+SEPARADOR+publicacion.getTitulo()+SEPARADOR+publicacion.getAnioPublicacion()+SEPARADOR);
                if (publicacion instanceof Libro){
                    Libro libroAux = (Libro) publicacion;
                    salida.print("1"+SEPARADOR+libroAux.getDni()+SEPARADOR+libroAux.getPrestado()+"\n");
                } else {
                    Investigacion investigacionAux = (Investigacion) publicacion;
                    salida.print("2"+SEPARADOR+investigacionAux.getTematica()+SEPARADOR+investigacionAux.getNumero()+SEPARADOR+
                            investigacionAux.getMes()+SEPARADOR+investigacionAux.getRevisado()+SEPARADOR+ 
                            investigacionAux.getDniRevisor()+"\n");
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el Fichero.");
        } finally {
            if (salida != null){
                salida.close();
            }
        }
    }
    public void ordenarAnio(){
        List<Publicacion> listaAnio = new ArrayList<>(biblioteca);
            Comparator<Publicacion> ordenarAnio = new Comparator<>(){
                @Override
                public int compare(Publicacion o1, Publicacion o2) {
                    return o1.getAnioPublicacion()-(o2.getAnioPublicacion());
                }    
            };
            listaAnio.sort(ordenarAnio);
            System.out.println(listaAnio);
            
    }
    public void ordenarIsbn (){
        List<Publicacion> listaIsbn = new ArrayList<>(biblioteca);
            Comparator<Publicacion> ordenarIsbn = new Comparator<>(){
                @Override
                public int compare(Publicacion o1, Publicacion o2) {
                    return o2.getIsbn().compareTo(o1.getIsbn());
                }    
            };
            listaIsbn.sort(ordenarIsbn);
            System.out.println(listaIsbn);
    }
    public void binnarySearch(String isbn){
//        List<Publicacion> listaIsbn = new ArrayList<>(biblioteca);
//            Comparator<Publicacion> ordenarIsbn = new Comparator<>(){
//                @Override
//                public int compare(Publicacion o1, Publicacion o2) {
//                    return o2.getIsbn().compareTo(o1.getIsbn());
//                }    
//            };
//            listaIsbn.sort(ordenarIsbn);
//        int posicion = Collections.binarySearch(listaIsbn, isbn);
        
    }
    
    @Override
    public String toString() {
        return "Biblioteca{" + "biblioteca=" + biblioteca + '}';
    }

    
    
    
    
}
