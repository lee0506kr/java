
public class CarTest {
	public static void main(String[] args) {

		Car myCar = new Car();
		Car yourCar = new Car();

		//myCar.setColor("빨강");
		//yourCar.setColor("파랑");
		
		//static 변수는 객체당 만들어지는 변수가 아님
		//객체 이름으로 접하는 방식을 권장하지 않는다.
		//System.out.println(myCar.MODEL);
		//System.out.println(yourCar.MODEL);
		
		System.out.println(Car.MODEL);
		System.out.println(Car.numOfCars);
		
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		yourCar.speedUp();
		
		
		Car.printNumOfCars(); //클래스 이름을 출력한다.
		
		//double d = Math.random();
		
		
	
				
		
	}
}