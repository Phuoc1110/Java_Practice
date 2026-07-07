package com.NoVC;

public class Lesson1 {
	
	static  String randomString = "ok",randomString1 = "String to print";
	
	static final double PINUM = 3.14;
	
	public static void main(String[] args)
	{
		System.out.println(randomString + randomString1);
		System.out.println(randomString1);
		
		int interger1 = 3, interger2 = 5;
//		long bigLong = 999999999999L;
//		float bigFloat = 1.3F;
		System.out.println(interger1 + "" + interger2);
		String parseBool = "false";
		boolean bool = Boolean.parseBoolean(parseBool);
		System.out.println(bool);
	}
}