package com.Amazon.generic.common;

import com.Amazon.generic.excelutility.ReadExcelFile;
import com.Amazon.generic.javautility.JavaUtility;
import com.Amazon.generic.listenerutility.Listener;
import com.Amazon.generic.propertyutility.ReadpropertyFile;
import com.Amazon.generic.webdriverutility.Webdriverutility;

public class ObjectUtility implements FrameworkConstant {
	public ReadExcelFile excelobj;
	public JavaUtility javaobj;
	public ReadpropertyFile propertyobj;
	public Webdriverutility webdriverobj;
	public Listener listenerobj;
	public void objectcreation() 
	{
		
		 excelobj=new ReadExcelFile();
		javaobj=new JavaUtility();
		 propertyobj=new ReadpropertyFile();
		 webdriverobj =new Webdriverutility();
		 listenerobj=new Listener();
	}
	
}
