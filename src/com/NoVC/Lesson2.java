//package com.NoVC;
//import java.util.Scanner;
//
//public class Lesson2 {
//	
//	static Scanner userInput = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		
//		System.out.print("FAV NUMBER: ");
//		if (userInput.hasNextInt()) {
//			int number = userInput.nextInt();
//			System.out.println("Fav number: " + number);
//			
//			int absNum = Math.abs(number);
//			
//			System.out.println("ABS of fav number: " + absNum);
//			int biggerNum = Math.max(absNum, absNum);
//			System.out.println("Bigger number: " + biggerNum);
//			
//			/*int round = (int) Math.round(3.5);
//			 * 
//			 */
//			return;
//		} else {
//			System.out.print("Error triggerd!!");
//		}
//	}
//}