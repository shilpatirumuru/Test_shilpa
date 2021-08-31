package keyworddriven;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Class {
	
	// static String folderpath=" X:\\";
	public static Workbook wb;
	public static Sheet sh;
	public static void createconnection(String filename,String sheetname)
	{
		try {
			FileInputStream fis=new FileInputStream(filename);
			wb=Workbook.getWorkbook(fis);
			sh=wb.getSheet(sheetname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		}
	// read the data from a particular cell
	public static String readdata(int cnum,int rnum)
	{
		return sh.getCell(cnum, rnum).getContents();
	}
	
	//get no of rows
	public static int rowcount()
	{
		return sh.getRows();
	}
	//get no of columns
	public static int columncount()
	{
		return sh.getColumns();
		
	}
	//save workbook
		public static void saveWorkbook(){
			
				wb.close();
			
				
		}
	}
	


