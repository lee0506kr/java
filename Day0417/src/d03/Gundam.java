package d03;

public  class Gundam extends Robot {

	public Gundam(Attackable attack, Moveable move) {
		this.name = "건담";
		this.attack = attack;
		this.move = move;
		// super.name = "" //부모의 이름을 바꾼는것
	}

	/*
	 * public void attack() { //System.out.println("총으로 공격!!"); //5만줄
	 * attack.attack(); }
	 * 
	 * 
	 * public void move() { move.move(); //10만줄 }
	 */

}
