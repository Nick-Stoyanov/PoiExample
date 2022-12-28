/**
 * Solo cup
 * @author dean grammas
 */
package edu.ccri.lesson02.example.cookout.papergoods;

/**
 * Solo cup
 *
 * @author dean grammas
 */
public class SoloCup extends Cup
{
    /**
     * cup color
     */
    private String color = null;
    
    /**
     * Constructor
     *
     */
    public SoloCup()
    {
	super(true, true);
    }
    
    /**
     * Constructor
     *
     * @param recyclable - true if recylable
     * @param plastic    - true if plastic
     * @param color      - color
     */
    public SoloCup(boolean recyclable, boolean plastic, String color)
    {
	super(recyclable, plastic);
	this.setColor(color);
    }
    
    /**
     * Gets the colors
     *
     * @return the color
     */
    public String getColor()
    {
	return this.color;
    }
    
    /**
     * Sets the color
     *
     * @param color the color to set
     */
    public void setColor(String color)
    {
	this.color = color;
    }
    
    /**
     * Returns a string representation
     *
     * @return string representation
     */
    @Override
    public String toString()
    {
	StringBuilder sb = new StringBuilder();
	sb.append(super.toString());
	sb.append(" this.getColor()=").append(this.getColor());
	return (sb.toString());
    } // end main
}
