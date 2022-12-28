/**
 * Poi (Poor Obfuscation Implementation) write to excel
 */
package example.poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Poi (Poor Obfuscation Implementation) write to excel
 *
 * @author dean grammass
 */

public class PoiWriteExcel
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(PoiWriteExcel.class.getName());
    
    /**
     * File name prefix
     */
    private String fileNamePrefix;
    
    /**
     * File name suffix
     */
    private String fileNameSuffix;
    
    /**
     * Excel workbook
     */
    private XSSFWorkbook workbook;
    
    /**
     * Constructor
     *
     * @param fileNamePrefix - file name prefix
     * @param fileNameSuffix - file name prefix
     */
    public PoiWriteExcel(String fileNamePrefix, String fileNameSuffix)
    {
	this.setWorkbook(new XSSFWorkbook());
	this.setFileNamePrefix(fileNamePrefix);
	this.setFileNameSuffix(fileNameSuffix);
    }
    
    /**
     * Adds the data to the excel workbook
     *
     * @param worksheetName - worksheet name
     */
    public void addToWorkbook(String worksheetName)
    {
	XSSFSheet sheet = this.getWorkbook().createSheet(worksheetName);
	Row row = null;
	Cell cell = null;
	
	ArrayList<Object> dataListRow = null;
	Object field = null;
	
	ArrayList<ArrayList<Object>> dataList = null;
	
	dataList = PoiExcelTestData.getArrayListData();
	logger.debug(dataList.toString());
	
	for (int i = 0; i < dataList.size(); i++)
	{
	    row = sheet.createRow(i);
	    
	    dataListRow = dataList.get(i);
	    for (int j = 0; j < dataListRow.size(); j++)
	    {
		cell = row.createCell(j);
		field = dataListRow.get(j);
		logger.debug("field=" + field.toString());
		
		setCell(cell, field);
	    }
	}
	
    }
    
    /**
     * Returns the file name prefix
     *
     * @return the fileNamePrefix
     */
    private String getFileNamePrefix()
    {
	return fileNamePrefix;
    }
    
    /**
     * Returns the file name suffix
     *
     * @return the fileNameSuffix
     */
    private String getFileNameSuffix()
    {
	return fileNameSuffix;
    }
    
    /**
     * Returns the workbook
     *
     * @return the workbook
     */
    private XSSFWorkbook getWorkbook()
    {
	return workbook;
    }
    
    /**
     * Sets cell with the field value
     *
     * @param cell  the sell to set
     * @param field the field
     */
    private void setCell(Cell cell, Object field)
    {
	if (field instanceof String)
	{
	    cell.setCellValue((String) field);
	} else if (field instanceof Integer)
	{
	    cell.setCellValue((Integer) field);
	} else if (field instanceof Double)
	{
	    cell.setCellValue((Double) field);
	} else if (field instanceof Character)
	{
	    String str = String.valueOf(field);
	    cell.setCellValue(str.charAt(0));
	} else
	{
	    logger.error("ERROR. Unable to add cell data to: cell= " + cell.toString() + " field=" + field.toString());
	}
    }
    
    /**
     * Sets the file name suffix
     *
     * @param fileNamePrefix the fileNamePrefix to set
     */
    private void setFileNamePrefix(String fileNamePrefix)
    {
	this.fileNamePrefix = fileNamePrefix;
    }
    
    /**
     * Sets the file name suffix
     *
     * @param fileNameSuffix the fileNameSuffix to set
     */
    private void setFileNameSuffix(String fileNameSuffix)
    {
	this.fileNameSuffix = fileNameSuffix;
    }
    
    /**
     * Sets the workbook
     *
     * @param workbook the workbook to set
     */
    private void setWorkbook(XSSFWorkbook workbook)
    {
	this.workbook = workbook;
    }
    
    /**
     * Write the excel file
     */
    public void writeExcelFile()
    {
	try
	{
	    StringBuilder sb = new StringBuilder();
	    sb.append(this.getFileNamePrefix());
	    sb.append(UUID.randomUUID());
	    sb.append(this.getFileNameSuffix());
	    logger.debug(sb.toString());
	    FileOutputStream outputStream = new FileOutputStream(sb.toString());
	    this.getWorkbook().write(outputStream);
	    this.getWorkbook().close();
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
} // end PoiTest