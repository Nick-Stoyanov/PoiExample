/**
 * Poi test data
 */
package example.poi;

import java.util.ArrayList;

/**
 * Poi test data
 *
 * @author dean grammas
 */
public class PoiExcelTestData
{
    /**
     * Returns a list of objects
     *
     * @param obj1 - object 1
     * @param obj2 - object 2
     * @param obj3 - object 3
     * @return a list of objects
     */
    private static ArrayList<Object> addRowListData(Object obj1, Object obj2, Object obj3)
    {
	ArrayList<Object> dataList = new ArrayList<>();
	dataList.add(obj1);
	dataList.add(obj2);
	dataList.add(obj3);
	return dataList;
    }
    
    /**
     * Returns a list of list of objects
     *
     * @return a list of list of objects
     */
    public static ArrayList<ArrayList<Object>> getArrayListData()
    {
	ArrayList<ArrayList<Object>> dataList = new ArrayList<>();
	dataList.add(PoiExcelTestData.addRowListData("Datatype", "Type", "Size(in bytes)"));
	dataList.add(PoiExcelTestData.addRowListData("int", "Primitive", 2));
	dataList.add(PoiExcelTestData.addRowListData("float", "Primitive", 4.4));
	dataList.add(PoiExcelTestData.addRowListData("double", "Primitive", 8.8));
	dataList.add(PoiExcelTestData.addRowListData("char", "Primitive", 120)); // 120 == 'x'
	dataList.add(PoiExcelTestData.addRowListData("char", "Primitive", 'x')); // 120 == 'x'
	dataList.add(PoiExcelTestData.addRowListData("String", "Non-Primitive", "No fixed size"));
	
	return dataList;
    }
    
    /**
     * Default constructor
     */
    public PoiExcelTestData()
    {
	super();
    }
}
