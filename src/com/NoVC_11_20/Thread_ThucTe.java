package com.NoVC_11_20;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_ThucTe {

	public static void main(String[] args) {
		
		// Tạo một Pool chứa tối đa 5 luồng chạy song song
	    ExecutorService executor = Executors.newFixedThreadPool(5);
	    
	    Runnable getMail = new GetMail(5);
	    Runnable getMail2 = new GetMail(10);
	    
	    // Giao việc cho Pool xử lý, không dùng new Thread().start() nữa
	    executor.submit(getMail);
	    executor.submit(getMail2);
	    
	    // Đóng Pool khi không còn nhận thêm task mới
	    executor.shutdown();
	    
	    System.out.println("FINAL");
		
	}
}
