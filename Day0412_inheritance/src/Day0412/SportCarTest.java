package Day0412;

import Day04012_1.SportsCar;

public class SportCarTest {
	public static void main(String[] args) {
		SportsCar myCar = new SportsCar(0);
		
		myCar.setColor("빨강");
		myCar.setSpeed(100);
		myCar.speedUp();
		
		System.out.println(myCar);
	}
}
