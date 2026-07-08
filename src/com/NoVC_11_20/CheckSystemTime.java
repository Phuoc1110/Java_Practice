package com.NoVC_11_20;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CheckSystemTime implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		String timeOutput;
		
		rightNow = new Date();
		currentLocale = new Locale("vi", "VN");
		
		timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
		timeOutput = timeFormatter.format(rightNow);
		
		System.out.println("Time: " + timeOutput);
		
	}
	
	
}
