package com.NoVC_11_20;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Lesson18_Thread_2 {
	
	public static void main(String[] args) {
		
		addThreadstoPool();
		
		
	}
	
	public static void addThreadstoPool() {
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Callender"), 10, 10, TimeUnit.SECONDS);
		
		System.out.println(Thread.activeCount());
		
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
//		Bỏ tất cả thread active vào trong array mình tạo ra
		Thread.enumerate(listOfThreads);
		
		for (Thread i : listOfThreads) {
			System.out.println(i.getName());
		}
		
		eventPool.shutdown();
		
		
		
		}
	
}