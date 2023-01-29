package TestLibreria;

/*
 *
*/
import Biblioteca.Libreria;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Diego Brito Sánchez
 * @version 1.0
 * @date 3 abr. 2022
 */
public class LibreriaTest {
    
    public LibreriaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of insertarPublicacion method, of class Publicacion.
     */
    @org.junit.jupiter.api.BeforeAll
    public void testAddPublicacion() {
        System.out.println("insertarPublicacion");
        String isbn = "";
        String title = "";
        int year = 0;
        String type = "";
        int number = 0;
        Libreria instance = new Libreria();
        int expResult = 1;
        int result = instance.addPublicacion(isbn, title, year, type, number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of insertarPublicacionRepetida method, of class Publicacion.
     */
    @org.junit.jupiter.api.Test
    public void testListNotLoan() {
        System.out.println("insertarPublicacionRepetida");
        String isbn = "";
        String title = "";
        int year = 0;
        String type = "";
        int number = 0;
        Libreria instance = new Libreria();
        int expResult = 2;
        instance.addPublicacion(isbn, title, year, type, number);
        int result = instance.addPublicacion(isbn, title, year, type, number);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

 
    
}