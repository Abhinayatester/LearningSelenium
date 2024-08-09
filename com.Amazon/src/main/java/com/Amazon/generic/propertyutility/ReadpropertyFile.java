package com.Amazon.generic.propertyutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Amazon.generic.common.FrameworkConstant;

public class ReadpropertyFile implements FrameworkConstant{
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;
	public String readdata(String key)  {
		//convert the physical file into java understandable
		try {
			fis =new FileInputStream(ProprtyPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//creating instance for property class
		p=new Properties();
		
		//load the all common data
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//fetch the data
		String data=p.getProperty(key);
		
		return data;
	}
	public void writedata(String key,String value) 
	{
		//enter the data
		p.put(key, value);
		
		//create instance for file output stream
		try {
			fos=new FileOutputStream(ProprtyPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//store the data
		try {
			p.store(fos, "update thre new key value succesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 public  void displaydata(String key) {
	    	//convert the physical excel file into java understandable
	 		 try {
				fis = new FileInputStream(ProprtyPath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	 		p=new Properties();
	 		try {
				p.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
	 		
	 		//fetch the data
	 		String data =p.getProperty(key);
	 		
	 		
	 		System.out.println(data);
	 }
	
}
