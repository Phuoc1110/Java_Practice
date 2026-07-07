package com.NoVC;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.lang.Exception;
import java.util.*;

public class Lesson6 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
//		getFile("./Secret.txt");
		
		
		
		/*
		System.out.print("Age :");
		int age = checkValidAge();
		
		if (age != 0) {
			
			System.out.println("Your age is " + age);
			
		}
		*/
				
		
		/*
		try {
			divideByZero(2);
		} catch (IndexOutOfBoundsException e) {
			System.out.print("Bug occured");
		} catch (ArithmeticException e) {
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("I don't know");
		} 
		*/
		
	
	}
	
	/*
	public static void getFile(String fileName) {
		
		try {
			FileInputStream file = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	*/
	
	public static int checkValidAge() {
		
		int age = 0;
		
		try {
			age = scanner.nextInt();
			return age;
		} catch (InputMismatchException e ) {
			System.out.println(e.getMessage());
			scanner.next();
			return 0;
		}
	}
	
	public static int divideByZero(int x) {
		
		return x / 0;
		
	}
	
}