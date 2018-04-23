

public class Car {

	private int speed;
	private int milege; // 인스턴스 변수
	private String color;
	private Tire tire; //인터페이스 기능
	
	
	public void drive() {
		System.out.println("자동차 굴러갑니다.");
		tire.roll();
	}
	
	public Car(Tire tire) {
		this.tire = tire;
	}

	static final String MODEL = "쏘나타";
	
	//현재 만들어진 객체가 몇개인지 체크하는 변수
	static int numOfCars;

	public Car() {

		numOfCars++; // 객체가 생성될 때마다, 1증가
		speed = 100; // 초기값
	}
	public static void printNumOfCars() {
		System.out.println(numOfCars);
	}
	

	public void speedUp() {
		if (speed >= 150) {
			System.out.println("최대 속도입니다.");

		} else {
			speed += 10;
			System.out.println("속도가 증가합니다.");
		}
	

	}

	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMilege() {
		return milege;
	}

	public void setMilege(int milege) {
		this.milege = milege;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", milege=" + milege + ", color=" + color + "]";
	}

}
