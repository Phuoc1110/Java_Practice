package com.NoVC_11_20;

public class Cat extends Animal {
	
	public String favToy = "Yarn";
	
	
	public void playWith() {
		System.out.println("にゃー" + "(" + favToy + ")");
	}
	
	public void walkAround() {
		System.out.println("そっと歩く。");
	}
}
