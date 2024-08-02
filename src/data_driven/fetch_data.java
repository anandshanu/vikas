package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class fetch_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    FileInputStream fis = new FileInputStream("./TestData/Book1.xlsx");
	    Workbook workbook = WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheet("Sheet1");
	   Row row = sheet.getRow(1);
	   String cell = row.getCell(0).getStringCellValue();
	   System.out.println(cell);
	    
	}

}
