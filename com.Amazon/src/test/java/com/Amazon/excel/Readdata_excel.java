package com.Amazon.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata_excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//convert the physical excel file into java understandable
		FileInputStream fis = new FileInputStream("./src/test/resources/data/Excel file1.xlsx");
		
		//create the workbook
		Workbook w=WorkbookFactory.create(fis);
		
		//usingworkbook go to sheet
		Sheet sheet=w.getSheet("Sheet1");
		
		int count  =  sheet.getLastRowNum();
		for (int i = 0; i <=count; i++) {
			 // using sheet go to row
			Row row = sheet.getRow(i);
			
			//using row go to the cell
			Cell cell=row.getCell(0);
			 
			//using cell go to data
			String data = cell.getStringCellValue();
			
			System.out.println(data);
			
		}
		
	}

}
