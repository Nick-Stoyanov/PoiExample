/**
 * Coffe cup
 */
package edu.ccri.lesson02.example.cookout.papergoods;

/**
 * Coffe cup
 *
 * @author dean grammas
 */
public class CoffeeCup extends Cup
{
    /**
     * Constructor
     */
    public CoffeeCup()
    {
	super(false, false);
    }
    
    /**
     * Constructor
     *
     * @param recyclable - true if recylable
     * @param plastic    - true if plastic
     */
    public CoffeeCup(boolean recyclable, boolean plastic)
    {
	super(recyclable, plastic);
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
	return (sb.toString());
    } // end main
}
