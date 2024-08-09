package com.Amazon.generic.javautility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.apache.poi.hpsf.Date;

public class JavaUtility
{
	public int getRandomNumber() {
		Random random=new Random();
		int ranDomNumber=random.nextInt(5000);
		return ranDomNumber;
	}
	public String getSystemDateYYYYDDMM() {
		Date dateobj = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date =sdf.format(dateobj);
		return date;	
	}
	public String getRequiredDateYYYYDDMM(int days) {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal= sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqDate=sim.format(cal.getTime());
		return reqDate;
		
	}

}
