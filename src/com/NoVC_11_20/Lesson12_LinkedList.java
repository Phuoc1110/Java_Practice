package com.NoVC_11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Lesson12_LinkedList {
	
//	Cơ bản như ArrayList nhưng arraylist đọc phần tử nhanh hơn nhưng đổi phần tử chậm hơn do phải dịch cả danh sách sang phải
//	Trong khi LinkedList có thể thay đổi các phần tử nhanh hơn nhưng đọc chậm hơn do hoạt động theo logic node chứa 3 : phần từ+địa chỉ node tiếp/trước
//	Cũng có 1 số method khác nhưng cũng chỉ  là quality of life change thôi
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		LinkedList linkedListOne = new LinkedList();
		
		names.add("Name 1");
		names.add("Name 2");
		names.addLast("Last");
		names.add(0, "name at __________");
		names.addFirst("First");
		names.addFirst("First1");
		names.addFirst("First2");
		names.add(0, "name at __________");
		
		names.remove("First");
		names.remove(0);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		ArrayList<String> arrayListNames = new ArrayList<String>();
		System.out.println("\n\nRemove First element: " + names.poll() + "\n");
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}