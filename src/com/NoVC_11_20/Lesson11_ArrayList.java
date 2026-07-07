package com.NoVC_11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Lesson11_ArrayList {
	
	public static void main(String[] args) {
		
		//DO NOT DO THIS, you shoud declair the datatype of the ArrayList
		ArrayList arrayListOne;
		arrayListOne = new ArrayList();
		
		arrayListOne.add(1);
		arrayListOne.add("String");
		arrayListOne.add(true);
		arrayListOne.add('A');
		
		System.out.println(arrayListOne);
		
		//
		ArrayList<String> names = new ArrayList<String>();
		names.add("Name 1");
		names.add("Name 2");
		names.add("Name 4");
		
		names.add(2, "Name 3"); //Add to index 2 of the ArrayList
		
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " | ");
		}
		System.out.println();
		System.out.println(names);
		
		names.set(0, "Name 1 (names.set(0, \"Name 1 (2)\");)");
		names.remove(2);
		System.out.println(names);
		System.out.println("\n\n");
		
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("\n\n");
		
		//Iterator
		Iterator i = names.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\n\n");
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		String paul = "Paul";
		
		names.add(paul);
		if (names.contains("Paul")) {
			System.out.println(names.indexOf(paul));
		}
		
		if (names.containsAll(nameCopy)) {
			System.out.println("YES");
		}
		
		names.clear();
		System.out.println(names);
		
		int x = 3;
		
		Object[] moreNames = new Object[4];
		
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
		char[] c = new char[4];
		c[0] = 'a';
		c[1] = 'a';
		c[2] = 'a';
		c[3] = 'a';
		System.out.println(Arrays.toString(c));
		int t = 3;
		System.out.println(c);
		
		
	}
	
}