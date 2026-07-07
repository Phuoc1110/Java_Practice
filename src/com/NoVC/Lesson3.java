package com.NoVC;

public class Lesson3 {
	
	public static void main(String[] args) {
		
		/*
		int value1 = 11;
		int value2 = 9;
		
		int biggestValue = value1 > value2 ? value1 : value2;
		
		System.out.println("Biggest value is " + biggestValue);
		*/
		
		
		char myGrade = 'c';
		System.out.print("Your garde is ");
		switch (myGrade) 
		{
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		case 'C':
		case 'c':
			System.out.println("C");
			break;
		case 'D':
			System.out.println("D");
			break;
		default:
			System.out.println("Failed");
			break;
		}
	}
	
}