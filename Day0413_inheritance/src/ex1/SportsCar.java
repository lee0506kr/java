package ex1;

public class SportsCar extends Car {
	// SportCar 상복받는 클래스 Car (부모)슈퍼클래스

	boolean isTurbo;

	public void turboOn() {

		if (!isTurbo) {
			System.out.println("터보 온!!");
			isTurbo = true;
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			
		} else {
			System.out.println("터보 상태입니다.");
		}
		
	}

	public void turboOff() {

		if (!isTurbo) {
			System.out.println("터보 끕니다!!");
			isTurbo = false;
			setSpeed(getSpeed()-50);
			
		} else {
			System.out.println("이미 꺼져있습니다.");
		}
	}

}
