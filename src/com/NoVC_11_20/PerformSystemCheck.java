package com.NoVC_11_20;

import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable{
	
	String checkWhat;
	
	static ReentrantLock lock = new ReentrantLock();
	
	public PerformSystemCheck(String checkWhat) {
		this.checkWhat = checkWhat;
	}
	
	@Override
	public void run() {
		lock.lock();
		
		try {
			System.out.println(this.checkWhat + "is OK");
		}
		finally {
			lock.unlock();
		}
	}
	
	
}