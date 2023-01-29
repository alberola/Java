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
public class Mamifero extends Animal {

    //attributes
    private boolean fur;
    public int limbs;

    //constructor
    public Mamifero(String sex, String breed, String colour, String age, String id, int limbs, boolean fur) {
        super(sex, breed, colour, age, id);
        this.limbs = limbs;
        this.fur = fur;
    }

    //getters & setter
    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {    
        this.limbs = limbs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    //methods
    public boolean feed() {
        return true;
    }
    

}
