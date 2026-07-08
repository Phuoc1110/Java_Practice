package com.NoVC_11_20;

public class GetMail implements Runnable{
	
	private int startTime;
	
	
	public void getMail(int startTime) {
		this.startTime = startTime;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000 * startTime);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("Checking Mail");
		
	}
	
	public GetMail(int startTime) {
		this.startTime = startTime;
	}
	
}
