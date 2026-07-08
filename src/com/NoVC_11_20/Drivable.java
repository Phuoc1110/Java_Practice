package com.NoVC_11_20;

public interface Drivable {

//	FIELD is always public static final.
//	METHOD is set to public abstract if you dont ad modifiers
	boolean isDrivable = true;
	
	int getWheel();

	void setWheel(int numWheels);
	
	double getSpeed();
	
	void setSpeed(double speed);
	
	
}
