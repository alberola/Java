/*
 * Clase concesionario la cual tendra sus atributos, Sett/Gett y métodos para insertar vehiculos en el concesionario, listar los vehiculos
 * ordenarlos...
 */
package prog.prog08_evaluable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 14/05/2022
 */
public class Concesionario {

    //Lista llamada concesionario de tipo HashSet (Atributo)
    Set<Vehiculo> concesionario = new LinkedHashSet<>();

    //Constructor
    public Concesionario() {
    }

    
    //METODOS
    
    //metodo para buscar vehiculo
    public String buscaVehiculo(String matricula) {  //
        for (Vehiculo i : concesionario) {
            if (i.getMatricula().equalsIgnoreCase(matricula)) {
                return i.toString();
            }
        }
        return null;
    }
    
    //metodo para insertar vehiculo
    public int insertarVehiculo(Vehiculo vehiculo) {
        if (!concesionario.add(vehiculo)) {
            return -1;
        }
        return 0;
    } 

    //metodo para actualizar los km de un vehiculo
    public boolean actualiza_kmVeh(String matricula, int kms) {
        for (Vehiculo i : concesionario) {
            if (i.getMatricula().equalsIgnoreCase(matricula)) {
                i.setNum_kms(i.getNum_kms() + kms);
                return true;
            }
        }
        return false;
    }
    
    //metodo para ordenar los vehiculos del concesionario según su matricula.
    public List<Vehiculo> ordenaVehiculo() {
        List<Vehiculo> listadoMatricula = new ArrayList<>(concesionario);
        Collections.sort(listadoMatricula);
        return listadoMatricula;
    }
    
    //metodo para ordenar los vehiculos del concesionario según su DNI.
    public List<Vehiculo> ordenarDni() {
        List<Vehiculo> listaDni = new ArrayList<>(concesionario);
        Comparator<Vehiculo> ordenaDni = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getDni_propietario().compareTo(veh2.getDni_propietario());
            }
        };
        listaDni.sort(ordenaDni);
        return listaDni;
    }

    //metodo para ordenar los vehiculos del concesionario según sus KMS.
    public List<Vehiculo> ordenarKms() {
        List<Vehiculo> listaKm = new ArrayList<>(concesionario);
        Comparator<Vehiculo> ordenaKm = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getNum_kms() - veh2.getNum_kms();
            }
        };
        listaKm.sort(ordenaKm);
        return listaKm;
    }
     
    //metodo para ordenar los vehiculos del concesionario según su precio.
    public List<Vehiculo> ordenarPrecio() {
        List<Vehiculo> listaPrecio = new ArrayList<>(concesionario);
        Comparator<Vehiculo> ordenaPrecio = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return (int) (veh1.getPrecio()- veh2.getPrecio());
            }
        };
        listaPrecio.sort(ordenaPrecio);
        return listaPrecio;
    }

    //metodo para ordenar los vehiculos del concesionario según el nombre de propietario.
    public List<Vehiculo> ordenarNombre() {
        List<Vehiculo> listaNombre = new ArrayList<>(concesionario);
        Comparator<Vehiculo> ordenaNombre = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getPropietario().compareTo(veh2.getPropietario());
            }
        };
        listaNombre.sort(ordenaNombre);
        return listaNombre;
    }
    
    //metodo para ordenar los vehiculos del concesionario según su marca.
    public List<Vehiculo> ordenarMarca() {
        List<Vehiculo> listaMarca = new ArrayList<>(concesionario);
        Comparator<Vehiculo> ordenaMarca = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                return veh1.getMarca().compareTo(veh2.getMarca());
            }
        };
        listaMarca.sort(ordenaMarca);
        return listaMarca;
    }

    //metodo para ordenar los vehiculos del concesionario según su antiguedad.
    public List<Vehiculo> ordenarAntiguedad() {
        List<Vehiculo> listaAntiguedad = new ArrayList<>(concesionario);
        Comparator<Vehiculo> ordenaAntiguedad = new Comparator<>() {//Creamos un comparador personalizado
            @Override
            public int compare(Vehiculo veh1, Vehiculo veh2) {
                if (veh1.getFecha_mat().isBefore(veh2.getFecha_mat())) 
                    return -1;
                else if (veh1.getFecha_mat().isAfter(veh2.getFecha_mat())) 
                    return 1;
                return 0;
            }
        };
        listaAntiguedad.sort(ordenaAntiguedad);
        return listaAntiguedad;
    }
    
    //Metodo toString para imprimir los datos del vehiculo
    @Override
    public String toString() {
        return concesionario.toString();
    }
    
    //metodo para eliminar los vehiculos segun su matricula.
    public boolean eliminarVehiculo(String matricula) {
        for (Vehiculo i : concesionario) {
            if (i.getMatricula().equalsIgnoreCase(matricula)) {
                concesionario.remove(i);
                return true;
            }
        }
        return false;
    }
    
    //metodo de ejemplo para insertar vehiculos y hacer pruebas con ellos
    public int insertaEjemplo() {
        insertarVehiculo(new Vehiculo("nissan", "1111AAA", 100, LocalDate.of(1989, 5, 2), "Coche prueba", 5000, "Alejandro", "42418602R"));
        insertarVehiculo(new Vehiculo("opel", "2222AAA", 200, LocalDate.of(1995, 11, 29), "Coche prueba", 2500, "Eduardo", "42418603W"));
        insertarVehiculo(new Vehiculo("citroen", "3333AAA", 50, LocalDate.of(2000, 4, 14), "Coche prueba", 1000, "Jose", "42196820P"));
        
        //Intentamos insertar 2 vehiculos repetidos
        insertarVehiculo(new Vehiculo("audi", "1111AAA", 100, LocalDate.of(1995, 6, 1), "", 500, "Alejandro", "42418602R"));
        insertarVehiculo(new Vehiculo("volskwagen", "1111AAA", 200, LocalDate.of(2000, 4, 14), "", 1500, "Eduardo", "42418603W"));
        
        //Retornamos el tamaño del concesionario para ver que efectivamente solo se han insertado 3.
        return concesionario.size();
    }

    
}
