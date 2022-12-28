/**
 * Poi (Poor Obfuscation Implementation) Read File Test
 */
package example.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Poi (Poor Obfuscation Implementation) Read File Test
 *
 * @author dean grammas
 */

public class PoiReadExcel
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(PoiReadExcel.class.getName());
    
    /**
     * file name
     */
    private String fileName;
    
    /**
     * Constructor
     *
     * @param fileName the fileName to set
     */
    public PoiReadExcel(String fileName)
    {
	this.setFileName(fileName);
    }
    
    /**
     * Returns file name
     *
     * @return the fileName
     */
    private String getFileName()
    {
	return this.fileName;
    }
    
    /**
     * Read the excel file.
     *
     * @param worksheetNumber - the worksheet number (worksheets are numbered starting at 0)
     */
    public void readExcel(int worksheetNumber)
    {
	try
	{
	    FileInputStream excelFile = new FileInputStream(new File(this.getFileName()));
	    @SuppressWarnings("resource")
	    Workbook workbook = new XSSFWorkbook(excelFile);
	    
	    // worksheets are numbered starting at 0
	    Sheet datatypeSheet = workbook.getSheetAt(worksheetNumber);
	    
	    // loop for the rows
	    for (Row currentRow : datatypeSheet)
	    {
		logger.debug("--Row Begin--");
		for (Cell currentCell : currentRow)
		{
		    if (currentCell.getCellType() == CellType.STRING)
		    {
			logger.debug("\tCellType.STRING=" + currentCell.getStringCellValue());
		    } else if (currentCell.getCellType() == CellType.NUMERIC)
		    {
			logger.debug("\tCellType.NUMERIC=" + currentCell.getNumericCellValue());
		    } else if (currentCell.getCellType() == CellType.FORMULA)
		    {
			logger.debug("\tCellType.FORMULA=" + currentCell.getCellFormula());
		    } else if (currentCell.getCellType() == CellType.BLANK)
		    {
			logger.debug("\tCellType.BLANK=");
		    } else if (currentCell.getCellType() == CellType.BOOLEAN)
		    {
			logger.debug("\tCellType.BOOLEAN=" + currentCell.getBooleanCellValue());
		    } else if (currentCell.getCellType() == CellType.ERROR)
		    {
			logger.debug("\tCellType.ERROR=" + currentCell.getErrorCellValue());
		    } else
		    {
			logger.error("\tCellType._NONE=");
		    }
		} // end while for cols
		logger.debug("--Row End--");
	    } // end while for rows
	} catch (FileNotFoundException e)
	{
	    e.printStackTrace();
	    logger.error(ExceptionUtils.getStackTrace(e));
	} catch (IOException e)
	{
	    e.printStackTrace();
	    logger.error(ExceptionUtils.getStackTrace(e));
	}
    }
    
    /**
     * Sets the file name
     *
     * @param fileName the fileName to set
     */
    private void setFileName(String fileName)
    {
	this.fileName = fileName;
    }
} // end PoiTest