/**
 * Generic cup
 */
package edu.ccri.lesson02.example.cookout.papergoods;

/**
 * Generic cup
 *
 * @author dean grammas
 *
 */
public class Cup extends Papergoods
{
    /**
     * True if the cup is plastic
     */
    private boolean plastic;
    
    /**
     * Constructor
     *
     * @param plastic - true if plastic
     */
    public Cup(boolean plastic)
    {
	super(false);
	this.setPlastic(plastic);
    }
    
    /**
     * Constructor
     *
     * @param recyclable - true if recylable
     * @param plastic    - true if plastic
     */
    public Cup(boolean recyclable, boolean plastic)
    {
	super(recyclable);
	this.setPlastic(plastic);
    }
    
    /**
     * Return true if the cup is plastic
     *
     * @return true if the cup is plastic
     */
    public boolean isPlastic()
    {
	return plastic;
    }
    
    /**
     * Set to true if plastic
     *
     * @param plastic set to true if plastic
     */
    public void setPlastic(boolean plastic)
    {
	this.plastic = plastic;
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
	sb.append(" this.isPlastic()= ").append(this.isPlastic());
	return (sb.toString());
    } // end main
    
}
