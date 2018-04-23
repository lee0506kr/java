
public class SportCarTest {
	public static void main(String[] args) {
		SportsCar myCar = new SportsCar();
		
		
		myCar.setColor("빨강");
		myCar.setSpeed(100);
		myCar.speedUp();
		
		System.out.println(myCar);
	}
}
