package com.NoVC;
import java.util.Arrays;

class MonsterTwo {
	
	static char[][] battleBoard = new char[10][10];
	static int[] test = new int[10];
	
	public static void buildBattleBoard() {
		
		for (char[] row : battleBoard) {
			
			Arrays.fill(row, '*');
			
		}
		
	}
	
	public static void redrawBoard() {
		
		int k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		for (int i = 0; i < battleBoard.length; i++) {
			
			for (int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			
			System.out.println();
			
		}
		
		k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
	}
	
	public static void drawBoard() {
		for (char[] row : battleBoard) {
			for (char c : row) {
				System.out.print("|" + c + "|");
			}
			System.out.println();
		}
	}
	
	
	public final String TOMBSTONE = "Here lies a dead monster";
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numberOfMonsters = 0;
	
	
	private int health = 500;
	private int attack = 50;
	private int movement = 2;
	private boolean isAlive = true;
	
	public String name = "Big Monster";
	public char nameChar = 'B';
	
	public int getAttack() {
		return attack;
	}
	
	public int getHeath() {
		return health;
	}

	public int getMovement() {
		return movement;
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
	
	public MonsterTwo(int Heath, int Attack, int Movement, String name) {
		this.health = Heath;
		this.attack = Attack;
		this.movement = Movement;	
		this.name = name;
		
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		int randomX,randomY;
		
		do {
			randomX = (int) (Math.random() * maxXBoardSpace);
			randomY = (int) (Math.random() * maxYBoardSpace);
		} while (battleBoard[randomX][randomY] != '*');
		
		this.xPosition = randomX;
		this.yPosition = randomY;
		this.nameChar = this.name.charAt(0);
		
		battleBoard[this.yPosition][this.xPosition] = this.nameChar;
		
		numberOfMonsters++;
	}
	
	
	//this = MonsterTwo()
	public MonsterTwo(int Heath, int Attack, int Movement, boolean isAlive, String name) {
		this(Heath,Attack,Movement, name);
		this.isAlive = isAlive;
		numberOfMonsters++;
	}

	//駄目
	public static void main(String[] args) {
		buildBattleBoard();
		MonsterTwo mon0 = new MonsterTwo(10, 2, 300, true, "Cai");
		MonsterTwo mon1 = new MonsterTwo(10, 2, 300, true, "Mai");
//		redrawBoard();
		System.out.println(numberOfMonsters);
		
		drawBoard();
	}
		
}