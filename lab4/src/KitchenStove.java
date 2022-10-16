import java.io.*;

/**
 * Class <code>ComputerMouse</code> implements computer mouse
 *
 * @author EOM Stuff
 * @version 1.0
 */
public abstract class KitchenStove {

    private StovesButton leftUpButtonForBurner;
    private StovesButton leftDownButtonForBurner;
    private StovesButton rightUpButtonForBurner;
    private StovesButton rightDownButtonForBurner;
    public static int countOfStoves;

    /**
     * Constructor
     *
     * @throws FileNotFoundException
     */
    public KitchenStove() throws FileNotFoundException {
        leftUpButtonForBurner = new StovesButton(Location.leftUP);
        leftDownButtonForBurner = new StovesButton(Location.leftDown);
        rightUpButtonForBurner = new StovesButton(Location.RightUP);
        rightDownButtonForBurner = new StovesButton(Location.RightDown);
    }

    /**
     * Constructor
     *
     * @param resource Button clicks resource
     * @throws FileNotFoundException
     */
    public KitchenStove(int resource) throws FileNotFoundException {
        countOfStoves++;
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
        leftUpButtonForBurner.turnOffButton();
    }

    /**
     * Method implement turn on Left Down plate
     *
     */
    public void turnOffLeftDownButton() {
        leftDownButtonForBurner.turnOffButton();
    }

    /**
     * Method implement turn on Right Up plate
     *
     */
    public void turnOffRightUpButton() {
        rightUpButtonForBurner.turnOffButton();
    }

    /**
     * Method implement turn on Right Down plate
     *
     */
    public void turnOffRightDownButton() {
        rightDownButtonForBurner.turnOffButton();
    }
}