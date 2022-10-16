import java.io.FileNotFoundException;

public class StovesButton {

    private Location location;
    private Burner burner;
    private RelativePosition position;
    private static boolean turnOn;

    public StovesButton(Location location) throws FileNotFoundException {
        this.location = location;
        this.burner = new Burner();
        this.burner.location = this.location;
        this.position = new RelativePosition();
        turnOn = false;
    }

    /**
     * Method implements pressing on a button og kitchen stove
     *
     * @param xPos
     */
    public void turnOnButton(int xPos) {
        position.setXPosition(xPos);
        System.out.println("Button" + this.location.toString() + "is pressed\n");
        if (xPos > 0) {
            burner.burn();
            turnOn = true;
        }
    }

    boolean isTurnOn() {
        return turnOn;
    }

    public void turnOffButton() {
        position.setXPosition(0);
        System.out.println("Button" + this.location.toString() + "is pressed\n");
        if(!isTurnOn())
        {
            System.out.println("Plate was turned off");
            return;
        }
        turnOn = false;
        burner.stopBurn();
    }
}