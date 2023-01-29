/*
 *
 */
package Biblioteca;

import java.util.Scanner;

/**
 *
 * @author Diego Brito Sánchez
 * @version 1.0
 * @date 31 mar. 2022
 */
public class MenuCRUD {

    static Scanner sca = new Scanner(System.in);

    public static int mostrarMenu() {
        System.out.println("\nMenú de control de las publicaciones.");

        System.out.println("1. Crear publicación.");
        System.out.println("2. Listar publicaciones no prestadas.");
        System.out.println("3. Obtener datos de una publicación.");
        System.out.println("4. Realizar devolución.");
        System.out.println("5. Realizar un préstamo.");
        System.out.println("6. Consultar el listado total de publicaciones.");
        System.out.println("7. Listar revistas.");
        System.out.println("8. Listar libros.");
        System.out.println("9. Listar los préstamos.");
        System.out.println("0. Salir.");

        int opt = sca.nextInt();
        sca.nextLine();

        return opt;
    }

    public static void main(String[] args) {

        int opt, year, control;
        int number = 0;
        String ISBN = null;
        String tittle;
        String type = null;
        boolean flag;
        boolean added = true;

        Libreria showcase = new Libreria();

        do {
            opt = mostrarMenu();

            switch (opt) {
                case 1:
                    flag = false;

                    while (!flag) {
                        System.out.println("Introduce el ISBN:");
                        ISBN = sca.nextLine();
                        if (Validar.validateISBN(ISBN)) {
                            flag = true;
                        } else {
                            System.out.println("Formato incorrecto, vuelve a intentarlo.");
                        }
                    }

                    System.out.println("Introduce el título:");
                    tittle = sca.nextLine();

                    System.out.println("Introduce el año de publicación:");
                    year = sca.nextInt();
                    sca.nextLine();

                    flag = false;
                    while (!flag) {
                        System.out.println("Introduce el tipo de publicación: (Libro o Revista)");
                        type = sca.nextLine();
                        if (type.equalsIgnoreCase("libro")) {
                            flag = true;
                        } else if (type.equalsIgnoreCase("revista")) {
                            System.out.println("Introduce el número de publicación de la revista:");
                            number = sca.nextInt();
                            sca.nextLine();
                            flag = true;
                        } else {
                            System.out.println("Formato incorrecto, vuelve a intentarlo.");
                        }
                    }
//                    showcase.addPublicacion("123456", "prueba", 1997, "libro", number); //Pruebas para saber que el programa funciona sin tener que
//                    showcase.addPublicacion("123455", "prueba2", 1997, "libro", number); //introdcir datos en cada prueba.
//                    showcase.addPublicacion("123454", "prueba3", 1997, "revista", number);
//                    showcase.addPublicacion("123453", "prueba4", 1997, "revista", number);
                    control = showcase.addPublicacion("123456", "prueba2", 1997, "libro", number);
                    switch (control) {
                        case 1:
                            System.out.println("Introducido con éxito.");
                            added = true;
                            break;
                        case 2:
                            System.out.println("ISBN repetido, prueba otra vez.");
                            break;
                        case 3:
                            System.out.println("La librería está llena.");
                            break;
                    }
                    break;
                case 2:
                    if (added){
                        System.out.println(showcase.listNotLoan());
                    } else {
                        System.out.println("No ha introducido publicaciones.");
                    }
                    break;
                case 3:
                    if (added){
                        System.out.println("Introduce el ISBN que quieras buscar.");
                        ISBN = sca.nextLine();
                        System.out.println(showcase.findPublic(ISBN));
                    }else {
                        System.out.println("No ha introducido publicaciones.");
                    }
                    break;
                case 4:
                    if (added){
                        System.out.println("Introduce el ISBN que quieras devolver.");
                        ISBN = sca.nextLine();
                        System.out.println(showcase.returnBook(ISBN));
                    }else {
                        System.out.println("No ha introducido publicaciones.");
                    }
                    break;
                case 5:
                    if (added){
                        System.out.println("Introduce el ISBN que quieras sacar a préstamo.");
                        ISBN = sca.nextLine();
                        System.out.println(showcase.loanBook(ISBN));
                    }else {
                        System.out.println("No ha introducido publicaciones.");
                    }
                    break;
                case 6:
                    if (added){
                        System.out.println(showcase.listLibreria());
                    }
                case 7:
                    if (added){
                        System.out.println(showcase.listType("revista"));
                    }
                case 8:
                    if(added){
                        System.out.println(showcase.listType("libro"));
                    }
                case 9:
                    if (added){
                        System.out.println(showcase.listLoans());
                    }
            }
        } while (opt != 0);
    }

}
