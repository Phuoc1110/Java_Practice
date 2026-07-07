package com.NoVC;

import java.util.Scanner;

public class Lesson5 {

	static int randomNumber = (int) (Math.random() * 10);
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println(getRandomNum());
		int guessNum = scanner.nextInt();
		while (guessNum != getRandomNum()) {
			guessNum = scanner.nextInt();
		}
		
//		int a = 1, b = 3;
//		int c = add(a,b);
//		System.out.println(c);

//		int d = 4;
//		changeNumber(d);
//		System.out.println(d);
		
		
	}
	
	public static int checkGuess(int guess) {
		
		if (guess == randomNumber) {
			return -1;
		}
		return 0;
		
	}
	
	public static int getRandomNum() {
		
		return randomNumber;
		
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void changeNumber(int d) {
		
		d = d+ 1;
		System.out.println("changed d: " + d + "?" );
		
	}
	
}