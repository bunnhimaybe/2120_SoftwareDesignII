/**
 * PixelLocation represents a pixel's location in a 2D plane.
 * 
    @author Christopher Summa
    @version 0.1

    parse custom tags with the following command:

    javadoc -tag custom.require:cm:"Precondition:"  -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java

*/
public class PixelLocation {

    private int x; /** @invariant x >= 0 */
    private int y; /** @invariant y >= 0 */


    /**
     * Constructs a new PixelLocation with specified initial coordinates.
     * 
        @param initialX The intial horizontal coordinate of this pixel
        @param initialY The inital vertical coordinate of this pixel
        @since Wednesday, Jan 24 2018

        @custom.require initialX >= 0
        @custom.require initialY >= 0
        @custom.ensure  getX() >= 0 && getX() == initialX
        @custom.ensure  getY() >= 0 && getY() == initialY
    */
    public PixelLocation(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }


    /**
     * Retrieves current PixelLocation horizontal coordinate.
     * 
        @since Wednesday, Jan 24 2018
        @return Returns the current integer value of the PixelLocation's horizontal coordinate
        @custom.ensure getX() >=0
    */
    public int getX() {
        return this.x;
    }


    /**
     * Retrieves current PixelLocation vertical coordinate. 
     * 
        @since Wednesday, Jan 24 2018
        @return Returns the current integer value of the PixelLocation's vertical coordinate
        @custom.ensure getY() >=0
    */
    public int getY() {
        return this.y;
    }


    /**
     * Sets a new horizontal coordinate for PixelLocation.
     * 
     * @since Tuesday, Feb 6 2024
     * @param newX New horizontal coordinate set
     */
    public void setX(int newX) {
        this.x = newX; 
    }


    /** 
     * Sets a new vertical coordinate for PixelLocation.
     * 
     * @since Tuesday, Feb 6 2024
     * @param newY New vertical coordinate set
     */
    public void setY(int newY) {
        this.y = newY;
    }


    /**
     * Checks if two PixelLocation states are equal.
     * 
     * @since Tuesday, Feb 6 2024
     * @param o PixelLocation object to compare with this PixelLocation
     * @return Returns true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {

        if (o instanceof PixelLocation) {
            PixelLocation p = (PixelLocation)o;
            if ( p.getX() == this.getX() && p.getY() == this.getY())
//              if ( p.x == this.x && p.y == this.y)
                return true;
        }
        return false;
    }

} // end class Point2D