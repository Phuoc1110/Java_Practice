package com.NoVC;
import java.util.Scanner;

public class Lesson4 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		
		
		/*
		int k = 100;
		
		do {
			System.out.println(k);
		} while (k <10);
		*/
		
		
		/*
		String contYorN = "Y";
		int h = 1;
		
		while (contYorN.equalsIgnoreCase("y")) {
			
			System.out.println(h);
			System.out.println("Continue y or n?");
			contYorN = scanner.nextLine();
			h++;
		}
		*/
		
		/*
		int i = 1;
		
		while (i <= 20) {
			if (i == 3) {
				i += 2;
				continue;
			}
			System.out.println("i = " + i);
			i++;
			
			if (i >10) {
				break;
			}
		}
		*/
		
		/*
		float myPi = 4.0F;
		float j = 3.0F;
		
		while (j < 90) {
			System.out.print(myPi);
			myPi = myPi - 4/j;
			System.out.print(" - 4/" + j);
			j += 2.0;
			myPi = myPi + 4/j;
			j += 2;
			System.out.println(" + 4/" + j);
		}
		System.out.print("your number is " + myPi);
		
		*/		
	}
	
}