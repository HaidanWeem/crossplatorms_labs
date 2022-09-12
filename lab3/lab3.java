
/**
* lab 3 package
*/
package example.test.lab3;

import java.io.*;
import java.util.List;

import javax.swing.text.Position;

/**
 * Class <code>ComputerMouse</code> implements computer mouse
 * 
 * @author EOM Stuff
 * @version 1.0
 */
public class KitchenStove {

    private StovesButton leftUpButtonForBurner;
    private StovesButton leftDownButtonForBurner;
    private StovesButton rightUpButtonForBurner;
    private StovesButton rightDownButtonForBurner;

    /**
     * Constructor
     * 
     * @throws FileNotFoundException
     */
    public KitchenStove() throws FileNotFoundException {
        leftUpButtonForBurner = StovesButton(Location.leftUP);
        leftDownButtonForBurner = StovesButton(Location.leftDown);
        rightUpButtonForBurner = StovesButton(Location.RightUP);
        rightDownButtonForBurner = StovesButton(Location.RightDown);
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor
     * 
     * @param <code>resource</code> Button clicks resource
     * @throws FileNotFoundException
     */
    public KitchenStove(int resource) throws FileNotFoundException {
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method implement turn on Left Up plate
     * 
     */
    public void turnOnLeftUpButton() {
        leftUpButtonForBurner.turnOnButton(5);
    }

    /**
     * Method implement turn on Left Down plate
     * 
     */
    public void turnOnLeftDownButton() {
        leftDownButtonForBurner.turnOnButton(4);
    }

    /**
     * Method implement turn on Right Up plate
     * 
     */
    public void turnOnRightUpButton() {
        rightUpButtonForBurner.turnOnButton(7);
    }

    /**
     * Method implement turn on Right Down plate
     * 
     */
    public void turnOnRightDownButton() {
        rightDownButtonForBurner.turnOnButton(2);
    }

    /**
     * Method implement turn on Left Up plate
     * 
     */
    public void turnOffLeftUpButton() {
        leftUpButtonForBurner.stopBurn();
    }

    /**
     * Method implement turn on Left Down plate
     * 
     */
    public void turnOffLeftDownButton() {
        leftDownButtonForBurner.stopBurn(0);
    }

    /**
     * Method implement turn on Right Up plate
     * 
     */
    public void turnOffRightUpButton() {
        rightUpButtonForBurner.stopBurn();
    }

    /**
     * Method implement turn on Right Down plate
     * 
     */
    public void turnOffRightDownButton() {
        rightDownButtonForBurner.stopBurn();
    }

}

public class StovesButton {

    private Location location;
    private Burner burner;
    private RelativePosition position;

    public StovesButton(Loction location) throws FileNotFoundException {
        this.location = location;
        this.burner.location = location;
        this.position = RelativePosition();
    }

    /**
     * Method implements pressing on a button og kitchen stove
     * 
     * @param <code>burner</code>
     */
    public void turnOnButton(int xPos) {
        position.setXPosition(xPos);
        fout.print("Button" + this.location.toString() + "is pressed\n");
        if (xPos > 0) {
            burner.burn();
        }
    }

    public void turnOffButton() {
        position.setXPosition(0);
        fout.print("Button" + this.location.toString() + "is pressed\n");
        burner.stopBurn();
    }

    public class Burner {
        public Location location;

        public Burner(Location location) throws FileNotFoundException {
            this.location = location;
        }

        /**
         * Method implements burning of one plate
         * 
         */
        public void burn() {
            fout.print("Burner" + this.location.toString() + "is burning \n");
        }

        /**
         * Method implements stopBurning
         * 
         */
        public void stopBurn() {
            fout.print("Burner" + this.location.toString() + "stops burning");
        }

    }

    enum Location {
        leftUP,
        leftDown,
        RightUP,
        RightDown,
    }

    /**
     * Class <code>RelativePosition</code> implements relative positioning
     * coordinate system
     *
     * @author EOMStuff
     * @version 1.0
     */
    class RelativePosition {
        // coordinates of the mouse position
        private int x;

        /**
         * Constructor
         */
        public RelativePosition() {
            x = 0;
        }

        /**
         * Constructor
         * 
         * @param <code>xPos</code> The X coordinate value
         */
        public RelativePosition(int xPos) {
            x = xPos;
        }

        /**
         * Method returns the X coordinate value
         * 
         * @return The X coordinate value
         */
        public int getXPosition() {
            return x;
        }

        /**
         * Method returns coordinates of the position in the <code>obj</code>,
         * that is passed into method through method parameter
         * 
         * @param <code>obj</code> The object, where coordinates of the current
         *                         position are set
         */
        public void getPosition(RelativePosition obj) {
            obj.x = x;
        }

        /**
         * Method sets the X coordinate value
         * 
         * @param <code>xPos</code> The X coordinate value
         */
        public void setXPosition(int xPos) {
            if (xPos < 0) {
                xPos = 0;
            }
            x = xPos;
        }

    }
}