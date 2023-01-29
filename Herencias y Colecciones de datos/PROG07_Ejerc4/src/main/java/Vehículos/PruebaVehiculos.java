/*
 *
 */
package Vehículos;

import java.util.Scanner;

/**
 *
 * @author Diego Brito Sánchez
 * @date 25 mar. 2022
 * @version 1.0
 */
public class PruebaVehiculos {

    static Scanner sca = new Scanner(System.in);

    //Muestra el menú en pantalla.
    public static int mostrarMenu() {

        System.out.println("GESTIÓN DE VEHÍCULO");

        System.out.println("1.Anda con la bicicleta.");
        System.out.println("2.Haz el caballito con la bicicleta.");
        System.out.println("3.Anda con el coche.");
        System.out.println("4.Quema rueda con el coche.");
        System.out.println("5.Ver kilometraje de la bicicleta.");
        System.out.println("6.Ver kilometraje del coche.");
        System.out.println("7. Ver kilometraje total.");
        System.out.println("8.Salir");

        int opt = sca.nextInt();
        sca.nextLine(); //consumimos el salto de línea sino al leer el siguiente error tenemos error.
        return opt;
    }

    public static void main(String[] args) {
        int opt, cantidad;
        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();
        do {            
            opt = mostrarMenu();
            switch (opt){
                case 1:
                    System.out.println("¿Cuántos kilómetros avanza?");
                    cantidad = sca.nextInt();
                    sca.nextLine();
                    bici.run(cantidad);
                    System.out.println("La bicicleta ha recorrido "+cantidad+" kilometros.");
                    break;
                case 2:
                    if (bici.makeAWheelie()){System.out.println("La bicicleta está haciendo un caballito.");}
                    break;
                case 3:
                    System.out.println("¿Cuántos kilómetros avanza?");
                    cantidad = sca.nextInt();
                    sca.nextLine();
                    coche.run(cantidad);
                    System.out.println("El coche ha recorrido "+cantidad+" kilometros.");
                    break;
                case 4:
                    if (coche.quemarRueda()){System.out.println("El coche está quemando rueda.");}
                    break;
                case 5:
                    System.out.println("La bicileta ha recorrido "+bici.getKm()+" kilómetros en total.");
                    break;
                case 6:
                    System.out.println("El coche ha recorrido "+coche.getKm()+" kilómetros en total.");
                    break;
                case 7:
                    System.out.println("En total se han recorrido "+bici.totalKmRunned()+" kilómetros.");
                    break;
                    
            }
        } while (opt != 8);
    }

}
