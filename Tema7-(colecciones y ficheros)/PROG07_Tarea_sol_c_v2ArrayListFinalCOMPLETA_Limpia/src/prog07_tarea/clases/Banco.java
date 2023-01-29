/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog07_tarea.clases;

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
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 16/05/2022
 */
public class Banco {

    //final int MAX_CUENTAS=100;
    private ArrayList<CuentaBancaria> listaCuentas;
    //int numCuentas;

    public Banco() {

        listaCuentas = new ArrayList<>();

        //new CuentaBancaria[MAX_CUENTAS];
        //numCuentas = 0;
    }

    public ArrayList<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<CuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    //---------------------------------------------------------------        
    // MÉTODO abrirCuenta: Creación de una nueva cuenta bancaria
    //--------------------------------------------------------------- 
    public boolean abrirCuenta(CuentaBancaria cuenta) throws Exception {

        if (buscaCuenta(cuenta.getCCC()) != null) {
            return false;
        }

        // Ingresamos el saldo inicial en la cuenta
        // if (numCuentas <  MAX_CUENTAS) {
        return listaCuentas.add(cuenta);

    }

    public CuentaBancaria buscaCuenta(String ccc) {
        for (int i = 0; i < listaCuentas.size(); i++) {
            if (listaCuentas.get(i).getCCC().trim().equalsIgnoreCase(ccc)) {
                return listaCuentas.get(i);
            }
        }
        return null;
    }

    //---------------------------------------------------------------        
    // MÉTODO listadoCuentas: Devuelve un array de cadenas con la información de cada cuenta.
    //---------------------------------------------------------------       
    public void listadoCuentas() throws Exception {

        System.out.println("LISTADO DE CUENTAS DISPONIBLES");
        System.out.println("Cuentas: " + listaCuentas);
        System.out.println("TOTAL de Cuentas: " + listaCuentas.size());

    }

    public void crearCuentasEjemplo() throws Exception {
        Persona persona1 = new Persona("Alejandro", "Alberola", "42418602R");
        CuentaBancaria cuenta1 = new CuentaAhorro(persona1, "ES00000000000000000000", 2.3);
        abrirCuenta(cuenta1);
        Persona persona2 = new Persona("Eduardo", "Alberola", "42418603W");
        CuentaBancaria cuenta2 = new CuentaAhorro(persona2, "ES12345678912345678912", 2.0);
        abrirCuenta(cuenta2);
        Persona persona3 = new Persona("Angela", "Gopar", "42166364G");
        CuentaBancaria cuenta3 = new CuentaCorrientePersonal(persona3, "ES98765432198765432198", 2.5);
        abrirCuenta(cuenta3);
        Persona persona4 = new Persona("Aram", "Hernandez", "42196820P");
        CuentaBancaria cuenta4 = new CuentaCorrientePersonal(persona4, "ES12345678912345671234", 2.4);
        abrirCuenta(cuenta4);
        Persona persona5 = new Persona("Diego", "Brito", "42141860Z");
        CuentaBancaria cuenta5 = new CuentaCorrienteEmpresa(persona5, "ES99999999999999999999", 2.1, 2.0, 3.0);
        abrirCuenta(cuenta5);
        if (listaCuentas.size() == 5) {
            System.out.println("Cuentas Introducidas correctamente.");
        }
    }

    //Metodo para guardar una lista de tipo arrayList en un fichero binario.
    public void guardarFicheroBinario() {
        FileOutputStream acceso = null;
        ObjectOutputStream entrada = null;
        try {
            acceso = new FileOutputStream("datoscuentasbancarias.dat");
            entrada = new ObjectOutputStream(acceso);
            for (CuentaBancaria cuenta1 : listaCuentas) {
                entrada.writeObject(cuenta1);
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e) {
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (acceso != null) {
                    acceso.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Metodo para leer el fichero binario sin estar cargado en la memoria del programa
    public void leerFicheroBinario() {
        FileInputStream acceso = null;
        ObjectInputStream salida = null;
        CuentaBancaria cuenta = null;
        try {
            acceso = new FileInputStream("datoscuentasbancarias.dat");
            salida = new ObjectInputStream(acceso);
            while ((cuenta = (CuentaBancaria) salida.readObject()) != null) {
                System.out.println(cuenta.toString());
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e) {
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (acceso != null) {
                    acceso.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Metodo para cargar automaticamente al iniciar los datos que hay en el fichero binario en la memoria del programa. 
    public void cargarFicheroBinario() {
        FileInputStream acceso = null;
        ObjectInputStream salida = null;
        CuentaBancaria cuenta = null;
        try {
            acceso = new FileInputStream("datoscuentasbancarias.dat");
            salida = new ObjectInputStream(acceso);
            while ((cuenta = (CuentaBancaria) salida.readObject()) != null) {
                abrirCuenta(cuenta);
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e) {
            System.out.println("Final del fichero...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (acceso != null) {
                    acceso.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Metodo para guardar fichero de texto ordenado por Dni.
    public void guardarFicheroTexto() {
        FileWriter fichero = null;
        List<CuentaBancaria> cuentaDni = new ArrayList<>(listaCuentas);
        //Creamos un comparador personalizado
        Comparator<CuentaBancaria> ordenaDni = new Comparator<>() {
            @Override
            public int compare(CuentaBancaria cuenta1, CuentaBancaria cuenta2) {
                return cuenta1.getTitular().getDni().compareTo(cuenta2.getTitular().getDni());
            }
        };
        cuentaDni.sort(ordenaDni);
        try {
            fichero = new FileWriter("ListadoClientesCCC.txt", true);
            for (CuentaBancaria cuentaAux : cuentaDni) {
                fichero.write(cuentaAux.getTitular().getDni() + " " + cuentaAux.getTitular().getNombre() +" "
                        + cuentaAux.getTitular().getApellidos() + " " + cuentaAux.getSaldo() + "\n");
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e) {
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
    
    
    //Metodo para guardar ordenador por Dni en fichero de texto.
    public void leerFicheroTexto() {
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader("ListadoClientesCCC.txt"));
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            //Excepcion para no imprimir errores.
        } catch (EOFException e) {
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
    public void guardarFicheroSplit() {
        PrintWriter archivo = null;
        List<CuentaBancaria> cuentaSaldo = new ArrayList<>(listaCuentas);
        //Creamos un comparador personalizado
        Comparator<CuentaBancaria> ordenaSaldo = new Comparator<>() {
            @Override
            public int compare(CuentaBancaria cuenta1, CuentaBancaria cuenta2) {
                return (int) (cuenta1.getSaldo() - cuenta2.getSaldo());
            }
        };
        cuentaSaldo.sort(ordenaSaldo);
        try {

            archivo = new PrintWriter("Listado cuentas.txt");

            for (CuentaBancaria cuentaAux : cuentaSaldo) {
                archivo.print(cuentaAux.getTitular().getDni()+"###"+cuentaAux.getTitular().getNombre()
                        + "###" +cuentaAux.getCCC()+"###"+cuentaAux.getTipoCuenta()+"###"+cuentaAux.getSaldo()+"###");
                switch(cuentaAux.getTipoCuenta()){  
                    case 1:
                        CuentaAhorro cuentaCasteo = (CuentaAhorro) cuentaAux;
                        archivo.print(cuentaCasteo.obtenerTipoInteres()+"\n");
                        break;
                    case 2:
                        CuentaCorrientePersonal cuentaCasteo2 = (CuentaCorrientePersonal) cuentaAux;
                        archivo.print(cuentaCasteo2.obtenerComisionMantenimiento()+"\n");
                        break;      
                    case 3:
                        CuentaCorrienteEmpresa cuentaCasteo3 = (CuentaCorrienteEmpresa) cuentaAux;
                        archivo.print(cuentaCasteo3.obtenerComisionFijaDescubierto()+"###"+cuentaCasteo3.obtenermaximoDescubierto()+
                        "###"+cuentaCasteo3.obtenertipoInteresDescubierto()+"\n");
                        break;
                }
            }
            archivo.print("Hay un total de "+cuentaSaldo.size()+" cuentas.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
                archivo.close();
        }
    }

    //Leer desde fichero Split
    public void leerFicheroSplit() throws Exception {
        //Creamos lista para insertar datos ahí.
        CuentaBancaria cuentaAux = null;
        double saldo;
        String dni = null;
        String nombre = null;
        String apellidos = null;
        Persona persona = new Persona(nombre,apellidos,dni);
        String ccc;
        BufferedReader brc = null;
        String[] posicion;
        try {

            brc = new BufferedReader(new FileReader("Listado cuentas.txt"));
            String linea = " ";
            while (linea != null) {
                linea = brc.readLine();
                if (linea != null) {
                    posicion = linea.split("###");
                    dni = posicion[0];
                    nombre = posicion[1];
                    ccc = posicion[2];
                    saldo = parseDouble (posicion[3]);
                    System.out.println(linea);
                    cuentaAux = new CuentaAhorro(persona,ccc, 2.0);
                    System.out.println(cuentaAux);
                }
        }
//Para el apartado 3(iria antes del split) que no me da tiempo solo faltaria crear un tipo de lista distinta, en este caso HashSet
//Ya que este tipo de listas no aceptan valores repetidos. por lo que copiariamos el valor de la lista principal en esta.

            
            //Excepcion para no imprimir errores.
        } catch (EOFException e) {
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

    //---------------------------------------------------------------        
    // MÉTODO informacionCuenta: Devuelve String con información de una cuenta
    //---------------------------------------------------------------      
    public String informacionCuenta(String iban) {
        CuentaBancaria cuenta = buscaCuenta(iban);
        //CuentaBancaria.getNumeroCuenta(iban));
        if (cuenta != null) {
            return cuenta.devolverContenidoString();
        }
        return null;
    }

    //---------------------------------------------------------------        
    // MÉTODO ingresoCuenta: Ingreso de una cantidad en una cuenta
    //---------------------------------------------------------------       
    public boolean ingresoCuenta(String iban, double cantidad) throws Exception {

        CuentaBancaria cuenta = buscaCuenta(iban);
        //CuentaBancaria.getNumeroCuenta(iban));
        if (cuenta != null) {
            cuenta.ingresar(cantidad);
            return true;
        }
        return false;
    }

    public boolean retiradaCuenta(String iban, double cantidad) throws Exception {

        CuentaBancaria cuenta = buscaCuenta(iban);
        //CuentaBancaria.getNumeroCuenta(iban));
        if (cuenta != null) {
            cuenta.retirar(cantidad);
            return true;
        }
        return false;
    }

    public double obtenerSaldo(String iban) throws Exception {

        CuentaBancaria cuenta = buscaCuenta(iban);
        //CuentaBancaria.getNumeroCuenta(iban));
        if (cuenta != null) {
            return cuenta.getSaldo();
        }
        return -1;
    }

}
