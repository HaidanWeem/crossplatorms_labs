import java.io.FileNotFoundException;

public class Burner {
    public Location location;

    public Burner(Location location) throws FileNotFoundException {
        this.location = location;
    }

    public Burner(){}

    /**
     * Method implements burning of one plate
     *
     */
    public void burn() {
        System.out.println("Burner" + this.location.toString() + "is burning \n");
    }

    /**
     * Method implements stopBurning
     *
     */
    public void stopBurn() {
        System.out.println("Burner" + this.location.toString() + "stops burning");
    }
}