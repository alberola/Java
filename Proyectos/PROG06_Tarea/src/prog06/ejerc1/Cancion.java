/*
 * Clase cancion la cual contendrá los atributos de la clase cancion.
 */
package prog06.ejerc1;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Cancion {
    private int duracion;
    private String Titulo, interprete, album;

    public Cancion() {
    }

    public Cancion(int duracion, String Título, String interprete, String album) {
        this.duracion = duracion;
        this.Titulo = Título;
        this.interprete = interprete;
        this.album = album;
    } 
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
}
