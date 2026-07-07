package com.NoVC;

public class Lesson8 {
	
	public static void main(String[] args) {
		
		MonsterTwo.buildBattleBoard();
		MonsterTwo mon0 = new MonsterTwo(10, 2, 300, true, "Cai");
		MonsterTwo mon1 = new MonsterTwo(10, 2, 300, true, "Mai");
		MonsterTwo.drawBoard();
		
		
	}
	
}