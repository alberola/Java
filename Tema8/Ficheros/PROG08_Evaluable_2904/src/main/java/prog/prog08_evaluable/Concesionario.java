/*
 * Clase concesionario la cual tendra sus atributos, Sett/Gett y métodos para insertar vehiculos en el concesionario, listar los vehiculos
 * ordenarlos...
 */
package prog.prog08_evaluable;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Integer.parseInt;
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
                return (int) (veh1.getPrecio() - veh2.getPrecio());
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
                if (veh1.getFecha_mat().isBefore(veh2.getFecha_mat())) {
                    return -1;
                } else if (veh1.getFecha_mat().isAfter(veh2.getFecha_mat())) {
                    return 1;
                }
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

    public void guardarFicheroBinario() {
        FileOutputStream fos = null;
        ObjectOutputStream entrada = null;
        try {
            fos = new FileOutputStream("concesionario.dat");
            entrada = new ObjectOutputStream(fos);
            for (Vehiculo vehiculo1 : concesionario) {
                entrada.writeObject(vehiculo1);
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e){
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void leerFicheroBinario() {
        FileInputStream fis = null;
        ObjectInputStream salida = null;
        Vehiculo vehiculo = null;
        try {
            fis = new FileInputStream("concesionario.dat");
            salida = new ObjectInputStream(fis);
            while ((vehiculo = (Vehiculo) salida.readObject()) != null) {
                //Si deseamos leer el fichero nada mas
//                    System.out.println(vehiculo);
                //Para insertarlo en la memoria del programa
                insertarVehiculo(vehiculo);
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e){
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void guardarFicheroTexto() {
        FileWriter fichero = null;
        try {
            fichero = new FileWriter("concesionarioMarcas.txt", true);
            for (Vehiculo vehiculoAux : concesionario) {
                fichero.write(vehiculoAux.toString());
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e){
            System.out.println("Final del fichero...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void leerFicheroTexto() {
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader("concesionarioMarcas.txt"));
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e){
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    //Guardar desde fichero Split
    public void guardarFicheroSplit (String fichero){
        FileWriter archivo = null;
        //Puedes crear una lista para ordenarlo segun los patrones que quieras
            try {

            archivo = new FileWriter(fichero, true);
            //Dentro del for se suele poner una lista concesionario para recorrerla.
               for (Vehiculo vehiculoAux : concesionario) {
                archivo.write(vehiculoAux.getPrecio() + "-" + vehiculoAux.getMatricula() + "-" + vehiculoAux.getMarca() + "-"+
                        vehiculoAux.getDni_propietario());
                }          
            //Excepcion para no imprimir errores.
        } catch (EOFException e){
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    //Leer desde fichero Split
    public void leerFicheroSplit (String fichero){
        //Creamos lista para insertar datos ahí.
        Vehiculo vehiculoAux = null;
        int precio;
        String matricula;
        String marca;
        String dniPropietario;
        BufferedReader brc = null;
        String datos[];
        try {

            brc = new BufferedReader(new FileReader(fichero));
            String linea = " ";
            while (linea != null) {
                linea = brc.readLine();
                if (linea !=  null){
                    datos = linea.split("-");
                    precio = parseInt(datos[0]);
                    matricula = datos[1];
                    marca = datos[2];
                    dniPropietario = datos[3];  
                    vehiculoAux = new Vehiculo (marca,matricula,precio,dniPropietario);
                }
                //Añadiremos el vehiculo nuevo con el patron al concesionario nuevo (la lista nueva)
                concesionario.add(vehiculoAux);
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e){
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                brc.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
