/**
 * Poi (Poor Obfuscation Implementation) Read File Test
 */
package example.poi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Poi (Poor Obfuscation Implementation) Read File Test
 *
 * @author dean grammas
 */

public class PoiReadExcelTest
{
    /**
     * Fully qualified input file name Note this path must exist, otherwise you will get a java.io.FileNotFoundException when it is run.
     */
    private static final String INPUT_FILE_NAME = "src/main/resources/lesson02/example/in/MyInputExcel.xlsx";
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(PoiReadExcelTest.class.getName());
    
    /**
     * Main method
     *
     * @param args - ignored
     */
    public static void main(String[] args)
    {
	PoiReadExcel poiReadExcel = new PoiReadExcel(INPUT_FILE_NAME);
	
	poiReadExcel.readExcel(0);
	logger.debug("Have a great day! :-)");
    } // end main
    
    /**
     * Default constructor
     */
    public PoiReadExcelTest()
    {
	super();
    }
    
} // end PoiTest