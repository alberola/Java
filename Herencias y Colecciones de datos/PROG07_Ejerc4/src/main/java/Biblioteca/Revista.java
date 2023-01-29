/*
 *
 */
package Biblioteca;

/**
 *
 * @author Diego Brito Sánchez
 * @date 25 mar. 2022
 * @version 1.0
 */
public class Revista extends Publicacion {

    protected int number;

    //constructor
    public Revista(String ISBN, String title, int year, int number, String type) {
        super(ISBN, title, year, type);
        this.number = number;
    }

    //getters & setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //methods
    @Override
    public String toString() {
        return "\n--------------------------\nRevista:\nISBN: " + ISBN + "\nTítulo: " + title
                + "\nAño de publicación: " + year + "\nNúmero de publicación: " + number;
    }
}
