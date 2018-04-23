public class CarTest {
	public static void main(String[] args) {

		Tire chinaTire = new Tire() {
			public void roll() {
				System.out.println("중국타이어 굴러가다 터진다.");
			}
		};
		
		Tire chinaTire1
		= () ->System.out.println("중국타이어 굴러가다 터진다.");
			
		
		Tire KoreaTire = new KoreaTire();

		Car myCar = new Car(chinaTire);
		

		myCar.drive();

	}
}
