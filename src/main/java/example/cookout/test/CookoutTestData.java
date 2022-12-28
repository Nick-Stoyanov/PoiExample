/**
 * Cookout test data
*/
package edu.ccri.lesson02.example.cookout.test;

import edu.ccri.lesson02.example.cookout.food.Hotdog;
import edu.ccri.lesson02.example.cookout.food.HotdogBun;
import edu.ccri.lesson02.example.cookout.papergoods.CoffeeCup;
import edu.ccri.lesson02.example.cookout.papergoods.Cup;
import edu.ccri.lesson02.example.cookout.papergoods.SoloCup;

/**
 * Cookout test data
 *
 * @author dean grammas
 */
public class CookoutTestData
{
    /**
     * generic coffee cup
     */
    private CoffeeCup coffeeCup;
    /**
     * generic cup
     */
    private Cup cup;
    
    /**
     * hot dog
     */
    private Hotdog hotdog;
    /**
     * hot dog bun
     */
    private HotdogBun hotdogBun;
    /**
     * generic red solo cup
     */
    private SoloCup redSoloCup;
    /**
     * generic solo cup
     */
    private SoloCup soloCup;
    
    /**
     * Constructor
     */
    public CookoutTestData()
    {
	this.setHotdog(new Hotdog(186, 17, 2, 7));
	this.setHotdogBun(new HotdogBun(140, 2, 26, 5.1));
	this.setCup(new Cup(false));
	this.setCoffeeCup(new CoffeeCup());
	this.setSoloCup(new SoloCup());
	this.setRedSoloCup(new SoloCup());
	
	// Red Solo cups are not accepted in all local recycling programs.
	// https://recyclecoach.com/recyclepedia/red-solo-cups/#:~:text=Red%20Solo%20cups%20are%20not,Solo%20cups%20in%20the%20garbage.
	this.getRedSoloCup().setRecyclable(false);
	
    }
    
    /**
     * Returns the coffee cup
     *
     * @return the coffeeCup
     */
    public CoffeeCup getCoffeeCup()
    {
	return coffeeCup;
    }
    
    /**
     * Returns the generic cup
     *
     * @return the generic cup
     */
    public Cup getCup()
    {
	return cup;
    }
    
    /**
     * Returns the hotdog
     *
     * @return the hotdog
     */
    public Hotdog getHotdog()
    {
	return hotdog;
    }
    
    /**
     * Returns the hotdog bun
     *
     * @return the hotdogBun
     */
    public HotdogBun getHotdogBun()
    {
	return hotdogBun;
    }
    
    /**
     * Returns the red solo cup
     *
     * @return the redSoloCup
     */
    public SoloCup getRedSoloCup()
    {
	return redSoloCup;
    }
    
    /**
     * Returns the solo cup
     *
     * @return the soloCup
     */
    public SoloCup getSoloCup()
    {
	return soloCup;
    }
    
    /**
     * Sets the coffee cup
     *
     * @param coffeeCup the coffeeCup to set
     */
    public void setCoffeeCup(CoffeeCup coffeeCup)
    {
	this.coffeeCup = coffeeCup;
    }
    
    /**
     * Sets the generic cup
     *
     * @param cup the cup to set
     */
    public void setCup(Cup cup)
    {
	this.cup = cup;
    }
    
    /**
     * Sets the hotdog
     *
     * @param hotdog the hotdog to set
     */
    public void setHotdog(Hotdog hotdog)
    {
	this.hotdog = hotdog;
    }
    
    /**
     * Sets the hotdog bun
     *
     * @param hotdogBun the hotdogBun to set
     */
    public void setHotdogBun(HotdogBun hotdogBun)
    {
	this.hotdogBun = hotdogBun;
    }
    
    /**
     * Sets the red solo cup
     *
     * @param redSoloCup the redSoloCup to set
     */
    public void setRedSoloCup(SoloCup redSoloCup)
    {
	this.redSoloCup = redSoloCup;
	this.redSoloCup.setColor("red");
    }
    
    /**
     * Sets the solo cup
     *
     * @param soloCup the soloCup to set
     */
    public void setSoloCup(SoloCup soloCup)
    {
	this.soloCup = soloCup;
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
	sb.append(" this.getHotdog()= ").append(this.getHotdog());
	sb.append(" this.getHotdogBun()= ").append(this.getHotdogBun());
	sb.append(" this.getCup()= ").append(this.getCup());
	sb.append(" this.getCoffeeCup()= ").append(this.getCoffeeCup());
	sb.append(" this.getSoloCup()= ").append(this.getSoloCup());
	sb.append(" this.getRedSoloCup()= ").append(this.getRedSoloCup());
	return (sb.toString());
    }
}
