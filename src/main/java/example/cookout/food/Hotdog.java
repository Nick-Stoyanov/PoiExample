/**
 * Hotdog
 */
package edu.ccri.lesson02.example.cookout.food;

/**
 * Hotdog
 *
 * @author costa
 */
public class Hotdog extends Food
{
    /**
     * Constructor
     *
     * @param calories - number of calories
     * @param fat      - amount of fat
     * @param carbs    - amount of carbs
     * @param protein  - amount of protein
     */
    public Hotdog(double calories, double fat, double carbs, double protein)
    {
	super(calories, fat, carbs, protein);
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
