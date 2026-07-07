package com.NoVC;

class Lesson10 {
	
	public static void main(String[] args) {
		
		MonsterTwo[] mon = new MonsterTwo[4];
		
		
		MonsterTwo.buildBattleBoard();
		mon[0] = new MonsterTwo(10, 2, 300, true, "Cai");
		mon[1] = new MonsterTwo(10, 2, 300, true, "Mai");
		mon[2] = new MonsterTwo(10, 2, 300, true, "Xai");
		mon[3] = new MonsterTwo(10, 2, 300, true, "Tai");
		
		MonsterTwo.redrawBoard();
		
		
	}
	
}