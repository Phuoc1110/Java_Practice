package com.NoVC_11_20;

public class Lesson16 {
	
	public static void main(String[] args) {
		
//		Thực tế khi khởi tạo 1 object và bỏ vào Vehicle thì nó vẫn giữ các content của Vehicle nhưng bị ẩn
		Object superCar = new Vehicle();
//		Ta có thể lấy ra những content ẩn bằng cách ép kiểu trở lại lớp con
		Vehicle car = (Vehicle) superCar;
		System.out.println(car.getCarStrength());
		
		
		Vehicle superTruck = new Vehicle();
		System.out.println(superTruck.equals(superCar));
		
		System.out.println(superTruck.toString());
		
//		CLONE
		
		
	}
	
}