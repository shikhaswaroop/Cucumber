package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ExcelFileUtil {
	
static Workbook wb;

//constructor for accessing excel path

public ExcelFileUtil(String excelpath) throws Throwable
{
 FileInputStream fi = new FileInputStream(excelpath);
 wb = WorkbookFactory.create(fi);
 
}



// counting no of rows in a sheet
public int rowCount(String sheetname){
	return wb.getSheet(sheetname).getLastRowNum();
	
}

//counting no of cells in  row
public int cellCount(String sheetname){
	return  wb.getSheet(sheetname).getRow(0).getLastCellNum();
	
}

//read data from cell

public String getCellData(String sheetname,int row,int column)
{
	String data = "";
	if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==CellType.NUMERIC)
	{
	
		//capture integer type cell
		
		int celldata = (int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
		
		//convert integer into string type
		data = String.valueOf(celldata);
	 }
	   else 
	{
		data = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	return data;
	
}
//set results into new tab

public void setCellData(String sheetname, int row,int column,String status,String writeexcel) throws Throwable

{
 // get sheet 
	
	Sheet ws = wb.getSheet(sheetname);
	
//get row from sheet	
	Row rowNum = ws.getRow(row);
	
//create cell in a row
	
Cell cell = rowNum.createCell(column);

//write status

cell.setCellValue(status);

if(status.equalsIgnoreCase("Pass"))
	
{
	CellStyle style = wb.createCellStyle();
	
	//create Font
	Font font = wb.createFont();
	font.setColor(IndexedColors.GREEN.getIndex());
	font.setBold(true);
	
	style.setFont(font);
	rowNum.getCell(column).setCellStyle(style);
	
}

else if(status.equalsIgnoreCase("Blocked"))
{
CellStyle style = wb.createCellStyle();
	
	//create Font
	Font font = wb.createFont();
	font.setColor(IndexedColors.BLUE.getIndex());
	font.setBold(true);

	style.setFont(font);
	rowNum.getCell(column).setCellStyle(style);
}
	
FileOutputStream fo = new FileOutputStream(writeexcel);
wb.write(fo);	
	
	
	
	

}

public String getalldata(String sheetname){
	
	String data = "";
	Sheet ws=wb.getSheet(sheetname);
	int lastRowNumber = ws.getLastRowNum();
	
	for (int i=0;i<=lastRowNumber;i++){
		
	  
		Row r=ws.getRow(i);
		int cellcount=r.getLastCellNum();

		for (int j=i;j<cellcount;j++){
		
		
	if(wb.getSheet(sheetname).getRow(i).getCell(j).getCellType()==CellType.NUMERIC)
	{
	
		//capture integer type cell
		
		int celldata = (int)wb.getSheet(sheetname).getRow(i).getCell(j).getNumericCellValue();
		
		//convert integer into string type
		data = String.valueOf(celldata);
	 }
	   else 
	{
		data = wb.getSheet(sheetname).getRow(i).getCell(j).getStringCellValue();
	}
	
	
	
}}
	return data;}

}
