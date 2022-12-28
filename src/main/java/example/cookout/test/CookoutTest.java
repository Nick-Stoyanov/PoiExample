/**
 * Cookout test
 */
package edu.ccri.lesson02.example.cookout.test;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Cookout test
 *
 * @author dean grammas
 */
public class CookoutTest
{
    
    /**
     * Cookout Test Data - I did this to show that member variables in POTOs work the same way as they do in POJOs
     */
    public static CookoutTestData cookoutTestData = null;
    
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(CookoutTest.class.getName());
    
    /**
     * Displays the results
     */
    private static void displayResults()
    {
	StringBuilder sb = new StringBuilder();
	sb.append(cookoutTestData.getHotdog()).append("\n\n");
	sb.append(cookoutTestData.getHotdogBun()).append("\n\n");
	sb.append(cookoutTestData.getCup()).append("\n\n");
	sb.append(cookoutTestData.getCoffeeCup()).append("\n\n");
	sb.append(cookoutTestData.getSoloCup()).append("\n\n");
	sb.append(cookoutTestData.getRedSoloCup()).append("\n\n");
	
	// Display data
	JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    /**
     * Main method
     *
     * @param args - ignored
     */
    public static void main(String[] args)
    {
	cookoutTestData = new CookoutTestData();
	logger.debug(cookoutTestData.toString());
	displayResults();
    } // end main
    
    /**
     * Default constructor
     */
    public CookoutTest()
    {
	super();
    }
    
} // end class
