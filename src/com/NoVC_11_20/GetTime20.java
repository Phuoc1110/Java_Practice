package com.NoVC_11_20;

import java.util.*;
import java.text.DateFormat;

public class GetTime20 extends Thread{
	
	@Override
	public void run() {
		
		Date now;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for (int i = 1; i <= 20; i++) {
			
			now = new Date();
			currentLocale = new Locale("vi", "VN");
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			timeOutput = timeFormatter.format(now);
			dateOutput = dateFormatter.format(now);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println("");
			
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
		
		
		
		
	}
	
}
