package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getData(String SheetName , int rowNum , int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("G:\\java work\\SeleniumtestNG\\OrangeHRM\\src\\test\\resources\\orangeHRM.xlsx");
		String value =WorkbookFactory.create(file).getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value; 
	}
}
