/**
 * Poi (Poor Obfuscation Implementation) write excel test
 */
package example.poi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Poi (Poor Obfuscation Implementation) write excel test
 *
 * @author dean grammas
 */

public class PoiWriteExcelTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(PoiWriteExcelTest.class.getName());
    /**
     * Fully qualified output file name prefix <BR>
     * Note this path must exist, otherwise you will get a java.io.FileNotFoundException when it is run.
     */
    private static final String OUTPUT_FILE_NAME_PREFIX = "src/main/resources/lesson02/example/out/MyOutputExcel_";
    
    /**
     * Fully qualified output file name suffix
     */
    private static final String OUTPUT_FILE_NAME_SUFFIX = ".xlsx";
    
    /**
     * Main method
     *
     * @param args - ignored
     */
    public static void main(String[] args)
    {
	PoiWriteExcel poiWriteExcel = new PoiWriteExcel(OUTPUT_FILE_NAME_PREFIX, OUTPUT_FILE_NAME_SUFFIX);
	poiWriteExcel.addToWorkbook("Datatypes in Java");
	poiWriteExcel.addToWorkbook("Datatypes in Java2");
	poiWriteExcel.writeExcelFile();
	
	logger.debug("Have a great day! :-)");
    } // end main
    
    /**
     * Default constructor
     */
    public PoiWriteExcelTest()
    {
	super();
    }
    
} // end PoiTest