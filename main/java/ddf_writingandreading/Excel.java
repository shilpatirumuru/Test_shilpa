package ddf_writingandreading;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel {
	
public static String Folderpath="X:\\";
public static Workbook book;
public static Sheet worksheet;
public static WritableWorkbook wrbook;
public static WritableSheet wrsheet;

//create excel connection
public static void createexcelconnection(String filename,String sheetname)

{
	try {
		FileInputStream ifs= new FileInputStream(Folderpath+filename);
		book=Workbook.getWorkbook(ifs);
		worksheet=book.getSheet(sheetname);
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

public static String  readdata(int columnnumber,int rownumber)
{
	return worksheet.getCell(columnnumber, rownumber).getContents();
}
public static int rowcount()
{
	return worksheet.getRows();
}
public static int columncount()
{
	return worksheet.getColumns();
}
//create output excel connection
public static void createoutputexcelconnection(String ifilename,String ofilename,String sheetname)
{
	try {
	FileInputStream ifs= new FileInputStream(Folderpath+ifilename);
	book=Workbook.getWorkbook(ifs);
	FileOutputStream ofs=new FileOutputStream(Folderpath+ofilename);
	wrbook=Workbook.createWorkbook(ofs,book);
	wrsheet=wrbook.getSheet(sheetname);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
//write data into cell
public static void writedata(int columnnumber,int rownumber,String data)
{
	try {
		wrsheet.addCell(new Label(rownumber, rownumber, data));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}

	


