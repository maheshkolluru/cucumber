package Genericlib;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutils {
	/**
	 * this method helps to fetch the data from rowwise in excel sheet
	 * @return 
	 * 
	 */
	public List<String> fetchrow(String path,String sheet,int cell) throws Throwable
	{
		List<String> l = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream(path);
		Workbook book=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh=book.getSheet(sheet);
		 sh.getLastRowNum();
		for(int i=0;i< sh.getLastRowNum();i++)
		{
	String data=	df.formatCellValue(sh.getRow(i).getCell(cell));
		l.add(data);
		}	
		return l;
		
	}
	/**
	 * 
	 * @param path of the sheet
	 * @param sheet name of the sheet
	 * @return 
	 * @throws Throwable
	 * fetchig the data from row and columnwise in excel
	 */
	public List<String> fetchrowncolumn(String path ,String sheet) throws Throwable
	{
		List<String> l = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream(path);
		Workbook book =WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = book.getSheet(sheet);
	for(int i=0;i<=sh.getLastRowNum();i++)
	{
		int lastcell=sh.getRow(i).getLastCellNum();
		for(int j=0;j<=lastcell;j++)
		{
			String s=df.formatCellValue(sh.getRow(i).getCell(j));
			l.add(s);
			
		}	
	}
	return l;
	}
	/**
	 * fetching the value from single cell
	 * @return 
	 * @throws Throwable 
	 * @throws  
	 * @throws EncryptedDocumentException 
	 */
	public String singlecellfetch(String path,String sheetname,int row,int cell) throws Throwable
	{
		DataFormatter df = new DataFormatter();
		FileInputStream fis= new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = book.getSheet(sheetname);
	return	df.formatCellValue(sh.getRow(row).getCell(cell));
		
	}
	

}
