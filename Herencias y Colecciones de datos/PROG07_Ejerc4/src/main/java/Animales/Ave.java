/*
 *
 */
package Animales;

/**
 *
 * @author Diego Brito Sánchez
 * @version 1.0
 * @date 31 mar. 2022
 */
public class Ave extends Animal {
    
    //constructor
    public Ave(String sex, String breed, String colour, String age, String id) {
        super(sex, breed, colour, age, id);
    }

    //methods
    public boolean chirp() {
        return true;
    }

    public boolean fly() {
        return true;
    }

    public boolean hatch() {
        return true;
    }
}
