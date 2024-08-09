package com.Amazon.generic.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Amazon.generic.common.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant {
	FileInputStream fis;
	FileOutputStream fos;
    Workbook w;
   public String readdata(String Sheet,int row,int col) {
	 //convert the physical excel file into java understandable
	try {
		fis = new FileInputStream(Excelpath);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	   // create the workbook
		 try {
			w=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String data=w.getSheet(Sheet).getRow(row).getCell(col).getStringCellValue();
	return data;
     }
   
     public void writedata(String Sheet,int row,int col,String data)  
     {
	//create instance for file output stream
	try {
		fis=new FileInputStream(Excelpath);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	 // create the workbook
	  try {
		w=WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	  // create a new column and write data on it
	  w.getSheet(Sheet).getRow(row).createCell(col).setCellValue(data);
	  
	  //convert java data into physical file
		try {
			fos=new FileOutputStream(Excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  //write the data
	  try {
		w.write(fos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  //close the workbook
	  try {
		w.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
   }
     public  void displydata(String Sheet,int row,int col) {
    	//convert the physical excel file into java understandable
 		 try {
			fis = new FileInputStream(Excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		//create the workbook
 		try {
			w=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		//using workbook go to sheet,row,column and cell fetch the data
 		String data=w.getSheet(Sheet).getRow(row).getCell(col).getStringCellValue();
 		
 		//print the data
 		System.out.println(data);
     }
     public  void displymultipledata(String Sheet,int col) {
    	//create instance for file output stream
    		try {
				fis=new FileInputStream(Excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		 // create the workbook
    		  try {
				w=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    		
    		  Sheet sheet=w.getSheet(Sheet);
    		  
 		    int count  =  sheet.getLastRowNum();
 		for (int i = 1; i <=count; i++) {
 			 
 			//using cell go to data
 			String data = w.getSheet(Sheet).getRow(i).getCell(col).getStringCellValue();
 			
 			System.out.println(data);
 		}
 		
     }
     
}
