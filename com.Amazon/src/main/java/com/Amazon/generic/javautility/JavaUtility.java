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
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		return sdf.format(date);
		
	}
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
		
	}
	public void pauss(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
