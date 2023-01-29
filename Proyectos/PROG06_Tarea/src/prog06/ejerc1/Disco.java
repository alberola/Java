/*
 * Clase Disco la cual contendrá los atributos de la Coleccion de discos, un an array de canciones.
 * y los métodos necesarios para realizar 
 */
package prog06.ejerc1;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Disco {

    private String codigo = "LIBRE"; // BR-BMG-03-00729
    /**
     * siempre contendrá 12 caracteres, mas tres guiones, en la forma
     * "CC-XXX-00-11111" es decir tiene una longitud total de 15 caracteres.
     * "CC" es el código de país del país en que se emitió el ISRC, son dos
     * letras. "XXX" es el código de registro alfanumérico que identifica al
     * emisor del Código ISRC, son tres letras "00" son los dos últimos dígitos
     * del año de registro(en el pasado, esto representaba el año de la
     * grabación), es decir son dos números. "11111" son los 5 dígitos
     * identificadores, es decir son 5 números. Como ejemplo, la grabación de la
     * canción "Enquanto Houver Sol" por el grupo brasileño Titãs tiene como
     * ISRC BR-BMG-03-00729:
     *
     * BR para Brasil (país) BMG para BMG (registrante) 03 para el año de
     * registro 2003 00729 el número único de la canción
     */
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos
    //Canción
    private final int numMaxCanciones = 20;
    private Cancion cancion[] = new Cancion[numMaxCanciones];
    
    
    public Disco(){
        for ( int i = 0 ; i <cancion.length ; i++){
            cancion[i] = null;
        }
    }
    
    public Disco(String autor, String titulo, String genero, int duracion, String codigo) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.codigo = codigo;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\nCanciones: ---";
        cadena += "\n------------------------------------------";
        return cadena;
    }

    //Método que busca canciones según su titulo.
    public int buscarCancion(String Titulo) {
        int posicion;
        for (int i = 0; i < cancion.length; i++) {
            if (cancion[i] != null && codigo.equalsIgnoreCase(cancion[i].getTitulo())) {
                posicion = i;
                return posicion; //Retornará la posición del array donde se ha encontrado el disco.
            }
        }
        return -1; //Retornará -1 si no se ha encontrado ninguna canción con el título.
    }
    
    //Método para insertar canciones.
    public int insertarCancion(int duracion, String Titulo, String interprete, String album) {
        for (int i = 0; i < cancion.length; i++) {
            if (cancion[i] == null) {
                cancion[i] = new Cancion(duracion, titulo, interprete, album);
                return 0; //retorna 0 si se ha introducido correctamente.
            }
        }
        return -1; //retorna -1 si no se ha podido introducir.
    }
    
    //Método para borrar canciones según su título.
    public int borrarCancion(String titulo) {
        int posicion = buscarCancion(titulo);
        if (buscarCancion(titulo) != -1) {
            cancion[posicion] = null;
            return posicion;
        }

        return -1; //Si no se ha encontrado la canción retornará -1.
    }
    
}
