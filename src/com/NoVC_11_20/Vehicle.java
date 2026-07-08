package com.NoVC_11_20;

public class Vehicle extends Crashable implements Drivable {
	
	private int numOfWheels = 4;
	private double speed = 0;
	private int carStrength = 0;
	
	
	public int getWheel() {
		
		return numOfWheels;
		
	}

	public void setWheel(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	public Vehicle() {
		
	}
	
	public Vehicle(int numOfWheels, double speed, int carStrength) {
		this.numOfWheels = numOfWheels;
		this.speed = speed;
		this.carStrength = carStrength;
	}
	
	
	public Object clone() {
		Vehicle car;
		
		try {
			car = (Vehicle) super.clone();
		}
		catch (CloneNotSupportedException e) {
			// TODO: handle exception
			return null;
		}
		return car;
	}

	@Override
	public void setCarStrength(int carStrength) {
		this.carStrength = carStrength;
		
	}

	@Override
	public int getCarStrength() {
		return this.carStrength;
	}
	
	@Override
	public String toString() {
		return "Number of wheels: " + this.numOfWheels;
	}
	
	
	
	
	
	
}