package com.NoVC_11_20;

public class Animal {

	private String name = "Animal";
	public String favFood = "Food";
	
	
	
	protected final void changeName(String name) {
		this.name = name;
	}
	
	protected final String getName() {
		return this.name;
	}
	
	public void eatStuff() {
		System.out.println("YUM!!");
	}
	
	public void walkAround() {
		System.out.println(this.name + " walks around.");
	}
	
	public Animal() {
		
	}
	
	public Animal(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}
	
}
