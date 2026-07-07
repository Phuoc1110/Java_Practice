package com.NoVC;

public class Monster {
	
	public final String TOMBSTONE = "Here lies a dead monster";
	
	private int health = 500;
	private int attack = 50;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean isAlive = true;
	
	public String name = "Big Monster";
	
	public int getAttack() {
		return attack;
	}
	
	public int getHeath() {
		return health;
	}

	public int getMovement() {
		return movement;
	}

	public int getyPosition() {
		return yPosition;
	}

	public int getxPosition() {
		return xPosition;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public void setHealth(int decreasedHealth) {
		health = health - decreasedHealth;
		if (health < 0) {
			isAlive = false;
		}
	}
	
	public void setHealth(double decreasedHealth) {
		health = health - (int) decreasedHealth;
		if (health < 0) {
			isAlive = false;
		}
	}
	
	public Monster(int Heath, int Attack, int Movement) {
		this.health = Heath;
		this.attack = Attack;
		this.movement = Movement;	
	}
	
	
	//this = Monster()
	public Monster(int Heath, int Attack, int Movement, boolean isAlive) {
		this(Heath,Attack,Movement);
		this.isAlive = isAlive;
	}
	
	public Monster() {
		
	}
	
	//駄目
	public static void main(String[] args) {
		
		Monster monsterA = new Monster();
		System.out.println(monsterA.attack);
		
	}
	
	
	
	
	
}
