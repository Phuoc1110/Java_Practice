package com.NoVC_11_20;

class Lesson14_inherit_polymorphism {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Cat cat1 = new Cat("ころねこ", "魚", "ネズミ");
		
//		A cat is an animal (phai sang trai)
//		Mien la cai ben phai co day du(hon cung dc) nhung gi cai ben trai can thi no se chay duoc
		Animal animal2 = new Cat("ころねこ1", "魚", "ネズミ");
		
//		Can also accept cat because cat is an animal
		acceptAnimal(cat1);
		
		
		
	}
	
	
	public static void acceptAnimal(Animal ani) {
		
		System.out.println();
		System.out.println(ani.getName());
		System.out.println(ani.favFood);
		ani.walkAround();//Nó sẽ check biến nhận vào có phải là 1 subclass của Animal không trước khi chạy
		System.out.println();
		
//		Muốn truy cập lại các trường bị "giấu" khi khởi tạo thì phải ép kiểu trở về thành CAT
		Cat tempCat = (Cat) ani;
		System.out.println(tempCat.favToy);
	}
	
}