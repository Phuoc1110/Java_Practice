package com.NoVC_11_20;

public class Cat extends Animal {
	
	public String favToy = "Yarn";
	
	
	public void playWith() {
		System.out.println("にゃー" + "(" + favToy + ")");
	}
	
	public void walkAround() {
		System.out.println("そっと歩く。");
	}
	
	public String getToy() {
		return this.favFood;
	}
	
	
	public Cat() {
		
	}
	
//	super = Animal  (là super class/cha của Cat)
	public Cat(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}
}
