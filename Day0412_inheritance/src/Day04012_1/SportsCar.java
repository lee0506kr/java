package Day04012_1;

import Day0412.Car;

public class SportsCar extends Car {
	// SportCar 상복받는 클래스 Car (부모)슈퍼클래스

	boolean isTurbo;
	public SportsCar(int a
			) {
		//부모클래스의 기본 생성자 호출 부분 생략
		//super(1); //부모클래스 생성자 호출
		System.out.println("자식클래스 생성자 호출!!");
	}

	public void turboOn() {

		if (!isTurbo) {
			System.out.println("터보 온!!");
			isTurbo = true;
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			speed =100;
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
