package interface2;

public class HomeNetwork {
	public static void main(String[] args) {
		// 무선으로 조종할 수 있는 기능을 가진 제품을 조종

		// 무선으로 켜고, 끄기 : 문선으로 조작가능한 객체여야 한다.
		// turnOn(), turnOff()

		/*
		 * RemoteController r= null;
		 * 
		 * r.turnOn(); r.turnOff();
		 */

		/*
		 * //하나의 통로로 한꺼번에 관리 하려고 한다. Television t =new Television(); Aircondition a =
		 * new Aircondition();
		 * 
		 * t.turnOn(); a.turnOn();
		 */
		Electronic[] r = new Electronic[2];
		
		RemoteController r1 = new Television();

		r[0] = new Television();
		r[1] = new Aircondition();

		for (Electronic remote : r) {
			remote.turnOn();
			remote.work();
//			if(remote instanceof Television) {
//			((Television)remote).showScreen();
//		}else if(remote instanceof Aircondition){
//			((Aircondition)remote).wind();
//		}
	}
}
}
