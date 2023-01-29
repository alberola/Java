/*
 *
 */
package Vehículos;

/**
 *
 * @author Diego Brito Sánchez
 * @date 25 mar. 2022
 * @version 1.0
 */
public abstract class Vehiculo {

    //attributes
    protected static int vehiclesCreated = 0;
    protected static int totalKilometers;
    protected int km;

    //constructor
    public Vehiculo() {
        this.km = 0;
        this.vehiclesCreated++;
    }

    //getters & setter
    public static int getTotalKilometers() {
        return totalKilometers;
    }

    public void setTotalKilometers(int totalKilometers) {
        this.totalKilometers = totalKilometers;
    }

    public int getKm() {
        return km;
    }

    public static int getVehiclesCreated() {
        return vehiclesCreated;
    }

    //methods
    public boolean run(int kilometers) {
        if (kilometers < 0) {
            return false;
        }
        this.km += kilometers;
        totalKilometers += kilometers;

        return true;
    }

    public int kmRunned() {
        return getKm();
    }

    public static int totalKmRunned() {
        return getTotalKilometers();
    }
}
