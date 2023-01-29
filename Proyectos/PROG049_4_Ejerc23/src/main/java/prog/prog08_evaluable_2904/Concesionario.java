/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.prog08_evaluable_2904;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Diego Brito
 * @edited Alejandro Alberola
 * @version 2.0
 * @since 11/05/2022
 */

//Ya que yo no tenia el concesionario Diego Brito me lo pasó para hacer los apartados del ejercicio 23.

public class Concesionario implements Serializable {

    //Podríamos usar un TreeHashSet en lugar de un HashSet para guardar los vehículos ordenados desde un principio según uno de sus campos
    Set<Vehiculo> concesionario = new HashSet<>();

    //Constructor
    public Concesionario() {
    }


    public String buscaVehiculo(String matricula) {  //
        for (Vehiculo i : concesionario) {
            if (i.getMatricula().equalsIgnoreCase(matricula)) {
                return i.toString();
            }
        }
        return null;
    }

//    public int buscarVehiculoPosicion(String matricula) {  //
//        for (int i = 0; i < numVehiculos; i++) {
//            if (concesionario[i] != null && matricula!=null && concesionario[i].getMatricula().equals(matricula) ) {
//                return i;
//            }else if (concesionario[i] == null && matricula == null ){  //Si paso matrícula a null devulvo la primera posición vacía es decir a null
//                return i;
//            }
//        }
//        return -2;
//    }
//        
    public int insertarVehiculo(Vehiculo vehiculo) {
        if (!concesionario.add(vehiculo)) {
            return -1;
        }
        return 0;
    }
//    
//    public void listaVehiculos (){
//        int i=0;
//        while (i<numVehiculos){
//            System.out.println ("Vehículo:" + concesionario[i].getMarca() + " Matrícula: " + concesionario[i].getMatricula() + " Precio: " + concesionario[i].getPrecio() + " Descripción: " + concesionario[i].getDescripcion());
//            i++;
//        }
//    }
//    

    public boolean actualiza_kmVeh(String matricula, int kms) {
        for (Vehiculo i : concesionario) {
            if (i.getMatricula().equalsIgnoreCase(matricula)) {
                i.setNum_kms(i.getNum_kms() + kms);
                return true;
            }
        }
        return false;
    }

    public List<Vehiculo> ordenaVehiculo() {
        List<Vehiculo> listadoMatricula = new ArrayList<>(concesionario);
        Collections.sort(listadoMatricula);
        return listadoMatricula;
    }

    public List<Vehiculo> ordenarDni() {
        List<Vehiculo> listado = new ArrayList<>(concesionario);
        Comparator<Vehiculo> lista = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getDni_propietario().compareTo(veh2.getDni_propietario());
            }
        };
        Collections.sort(listado, lista);
        return listado;
    }

    public List<Vehiculo> ordenarKms() {
        List<Vehiculo> listado = new ArrayList<>(concesionario);
        Comparator<Vehiculo> lista = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getNum_kms() - veh2.getNum_kms();
            }
        };
        Collections.sort(listado, lista);
        return listado;
    }

    public List<Vehiculo> ordenarPrecio() {
        List<Vehiculo> listado = new ArrayList<>(concesionario);
        Comparator<Vehiculo> lista = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return (int) (veh1.getPrecio()- veh2.getPrecio());
            }
        };
        Collections.sort(listado, lista);
        return listado;
    }

    public List<Vehiculo> ordenarNombre() {
        List<Vehiculo> listado = new ArrayList<>(concesionario);
        Comparator<Vehiculo> lista = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getPropietario().compareTo(veh2.getPropietario());
            }
        };
        Collections.sort(listado, lista);
        return listado;
    }

    public List<Vehiculo> ordenarMarca() {
        List<Vehiculo> listado = new ArrayList<>(concesionario);
        Comparator<Vehiculo> lista = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getMarca().compareTo(veh2.getMarca());
            }
        };
        Collections.sort(listado, lista);
        return listado;
    }

    public List<Vehiculo> ordenarAntiguedad() {
        List<Vehiculo> listado = new ArrayList<>(concesionario);
        Comparator<Vehiculo> lista = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                //Usando la salida del método compare, hacemos que en funcion si una fecha es anterior a otra nos devuelva un valor positivo o negativo
                //en caso de ser iguales nos devuelve el 0.
                if (veh1.getFecha_mat().isBefore(veh2.getFecha_mat())) return -1;
                else if (veh1.getFecha_mat().isAfter(veh2.getFecha_mat())) return 1;
                return 0;
            }
        };
        Collections.sort(listado, lista);
        return listado;
    }

    @Override
    public String toString() {
        return concesionario.toString();
    }

    public boolean eliminarVehiculo(String matricula) {
        for (Vehiculo i : concesionario) {
            if (i.getMatricula().equalsIgnoreCase(matricula)) {
                concesionario.remove(i);
                return true;
            }
        }
        return false;
    }

    public int insertaEjemplo() {
        insertarVehiculo(new Vehiculo("nissan", "2579GHJ", 0, LocalDate.of(1997, 8, 31), "", 15000, "diego", "42418841X"));
        insertarVehiculo(new Vehiculo("opel", "5554BZH", 1300, LocalDate.of(1995, 6, 1), "", 500, "ejemplo", "12345678Z"));
        insertarVehiculo(new Vehiculo("citroen", "1234FFF", 13, LocalDate.of(2000, 5, 25), "", 1500, "prueba", "78541289D"));
        //Intentamos insertar 2 vehiculos repetidos
        insertarVehiculo(new Vehiculo("opel", "5554BZH", 1300, LocalDate.of(1995, 6, 1), "", 500, "ejemplo", "12345678Z"));
        insertarVehiculo(new Vehiculo("citroen", "1234FFF", 13, LocalDate.of(2000, 5, 25), "", 1500, "prueba", "78541289D"));
        return concesionario.size();
    }
    
    public Vehiculo buscaExtra(String matricula){
        List<Vehiculo> listado = new ArrayList<>(concesionario);
        return listado.get(Collections.binarySearch(listado, new Vehiculo(matricula)));
    }
    public void escribirFichero(Concesionario concesionario){
        
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        try {

            //Cargamos el fichero.
            
            fos = new FileOutputStream("concesionario.dat");
            salida = new ObjectOutputStream(fos);
            
            //Insertamos los datos del concesionario en el fichero.
            
            salida.writeObject(concesionario);
            
            //Captamos los posibles errores genéricos
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

            //Bloque de codigo que siempre se ejecutara cuya funcionalidad es cerrar los archivos.
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void leerFichero(Concesionario concesionario){
            
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        
        try {
            fis = new FileInputStream("concesionario.dat");
            entrada = new ObjectInputStream(fis);
            concesionario = (Concesionario) entrada.readObject();
            System.out.println(concesionario);
            //Se capturarán los posibles errores genéricos
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

            //Para finalizar se cerrarán los ficheros si se han tocado(Modificado) correctamente
            //Este bloque de código siempre se ejecutará.
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    
}
