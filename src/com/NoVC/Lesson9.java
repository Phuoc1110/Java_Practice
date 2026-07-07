package com.NoVC;

import java.util.Arrays;

class Lesson9 {
	
	public static void main(String[] args) {
		
		int x = 0;
		int[] array1 = new int[5];
		
		
		for (int num : array1 ) {
			num = x;
			array1[x] = num;
			System.out.print(num);
			x++;
		}
		System.out.println("\narr: " + array1[2]);
		
		int[] copyArr = array1;
		
//		正解
		int[] copyArray2 = Arrays.copyOf(array1, 5);
		
		System.out.println("CopyArr2:");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArray2[i]);
		}
		
		array1[2] = 99;
		
		System.out.println("array1:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
//		間違い
		array1[2] = 99;
		
		System.out.println("CopyArr:");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i]);
		}
		
		
		System.out.println("array1:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println(Arrays.toString(copyArr));
		
	}
	
}