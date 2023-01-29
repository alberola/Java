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
public abstract class Publicacion {

    //attributes
    protected String ISBN;
    protected String title;
    protected int year;
    protected String type;

    //constructors
    public Publicacion(String ISBN, String title, int year, String type) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.type = type;
    }

    //getters & setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //methods
    @Override
    public String toString() {
        return "";  //Vacío porque lo definirán las subclases
    }
}
