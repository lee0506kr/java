package d02;

import d03.FlyMove;
import d03.GunAttack;

public class Gundam extends Robot {
	
	GunAttack attack;
	FlyMove move;
	
	public Gundam() {
		this.name = "건담";
		
	}
	
	
	public void attack() {
		//System.out.println("총으로 공격!!");  //5만줄
		attack.attack();
	}


	public void move() {
		move.move(); //10만줄
	}

}
