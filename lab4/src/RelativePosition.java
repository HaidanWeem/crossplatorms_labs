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
     * @param xPos The X coordinate value
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
     * @param obj The object, where coordinates of the current
     *                         position are set
     */
    public void getPosition(RelativePosition obj) {
        obj.x = x;
    }

    /**
     * Method sets the X coordinate value
     *
     * @param xPos The X coordinate value
     */
    public void setXPosition(int xPos) {
        if (xPos < 0) {
            xPos = 0;
        }
        x = xPos;
    }
}