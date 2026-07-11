package com.NoVC_11_20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson19_Regex {
	
	public static void main(String[] args) {
		
		String longString = "Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234";
		String strangeString = "1Z aaa **** *** {{{{{ { \"";
		
		//Word this is 2-20 char in length
		
		//[A-za-z]{2,20} \\w{2,20}
		
//		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		regexReplace(longString);
		
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while (regexMatcher.find()) {
			
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Starting index: " + regexMatcher.start());
			System.out.println("Ending index: " + regexMatcher.end());
			
		}
	}
	
	public static void regexReplace(String str2Replace) {
		
		Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		Matcher regexMatcher = pattern.matcher(str2Replace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
	}
	
}
