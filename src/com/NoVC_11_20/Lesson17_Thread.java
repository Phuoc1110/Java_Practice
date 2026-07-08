package com.NoVC_11_20;

public class Lesson17_Thread {
	
	public static void main(String[] args) {
		
		
		/*
		 * cơ bản cách dùng luồng là tạo ra 1 class kế thừa class thread => override run, k
		 * hi ở hàm main muốn thêm 1 thread thì Thread time = new GetTime20(); và time.start()
		 *  thì sẽ có thread main và thread vừa thêm là time chạy song song
		 *  nó sẽ không đợi time chạy xong mà đi thẳng xuống
		 */
		Thread time = new GetTime20();
		time.start();
		System.out.println("OK");
		
		Runnable getMail = new GetMail(5);
		Runnable getMail2 = new GetMail(10);
		
		
		new Thread(getMail).start();
		new Thread(getMail2).start();
		
		System.out.println("FINAL");
		
		
	}
	
}