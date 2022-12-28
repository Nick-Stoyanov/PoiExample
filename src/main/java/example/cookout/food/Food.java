/**
 * Food
 */
package edu.ccri.lesson02.example.cookout.food;

import edu.ccri.lesson02.example.cookout.common.Cookout;

/**
 * Food
 *
 * @author dean grammas
 */
public abstract class Food implements Cookout
{
    /**
     * calories
     */
    private double calories;
    /**
     * carbs
     */
    private double carbs;
    /**
     * fat
     */
    private double fat;
    /**
     * proteins
     */
    private double protein;
    
    /**
     * Constructor
     *
     * @param calories - number of calories
     * @param fat      - amount of fat
     * @param carbs    - amount of carbs
     * @param protein  - amount of protein
     */
    public Food(double calories, double fat, double carbs, double protein)
    {
	super();
	this.calories = calories;
	this.fat = fat;
	this.carbs = carbs;
	this.protein = protein;
    }
    
    /**
     * Get the calories
     *
     * @return the calories
     */
    protected double getCalories()
    {
	return calories;
    }
    
    /**
     * Get the carbs
     *
     * @return the carbs
     */
    protected double getCarbs()
    {
	return carbs;
    }
    
    /**
     * Get the fat
     *
     * @return the fat
     */
    protected double getFat()
    {
	return fat;
    }
    
    /**
     * Get the protein
     *
     * @return the protein
     */
    protected double getProtein()
    {
	return protein;
    }
    
    /**
     * True if foods are edible
     *
     * @return true foods are edible
     */
    @Override
    public boolean isEdible()
    {
	return true;
    }
    
    /**
     * Set calories
     *
     * @param calories the calories to set
     */
    protected void setCalories(double calories)
    {
	this.calories = calories;
    }
    
    /**
     * Set carbs
     *
     * @param carbs the carbs to set
     */
    protected void setCarbs(double carbs)
    {
	this.carbs = carbs;
    }
    
    /**
     * Set fat
     *
     * @param fat the fat to set
     */
    protected void setFat(double fat)
    {
	this.fat = fat;
    }
    
    /**
     * Set protein
     *
     * @param protein the protein to set
     */
    protected void setProtein(double protein)
    {
	this.protein = protein;
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
	sb.append(" this.getCalories()= ").append(this.getCalories());
	sb.append(" this.getFat()= ").append(this.getFat());
	sb.append(" this.getCarbs()= ").append(this.getCarbs());
	sb.append(" this.getProtein()= ").append(this.getProtein());
	return (sb.toString());
    } // end main
} // end class