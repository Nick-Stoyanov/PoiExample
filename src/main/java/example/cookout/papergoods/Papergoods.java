/**
 * Paper goods
 */
package edu.ccri.lesson02.example.cookout.papergoods;

import edu.ccri.lesson02.example.cookout.common.Cookout;

/**
 * Paper goods
 *
 * @author dean grammas
 *
 */
public abstract class Papergoods implements Cookout
{
    /**
     * Set to true if this is recyclable
     */
    private boolean recyclable;
    
    /**
     * Constructor
     *
     * @param recyclable - true if recylable
     */
    public Papergoods(boolean recyclable)
    {
	super();
	this.recyclable = recyclable;
    }
    
    /**
     * Return false - only foods are edible
     *
     * @return false - only foods are edible
     */
    @Override
    public boolean isEdible()
    {
	return false;
    }
    
    /**
     * Return true if recyclable
     *
     * @return true if recyclable
     */
    public boolean isRecyclable()
    {
	return recyclable;
    }
    
    /**
     * Set true if recyclable
     *
     * @param recyclable the recyclable to set
     */
    public void setRecyclable(boolean recyclable)
    {
	this.recyclable = recyclable;
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
	sb.append(this.getClass());
	sb.append(" this.isRecyclable()= ").append(this.isRecyclable());
	return (sb.toString());
    } // end main
} // end class