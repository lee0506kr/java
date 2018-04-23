
public class AnonymousTest {
	public static void main(String[] args) {

		// 익명클래스        코드내에서 한번만 사용될 것이기 때문에  이름이 필요없음
		Car myCar = new Car() {
			boolean isTurbo;

			public void turboON() {
				System.out.println("터보 온!!");
			}
			public void method() {
				System.out.println("이거 부를수 있나여?");
			}

			public void speedUp() {
				turboON();
				super.speedUp();
			}

		};
		//실제로는 인터페이스나, abstract 클래스 구현에 많이 사용됨
	/////////////////////////////////////////////////////////////////////////

		myCar.speedUp();
		//myCar.method();
		
	}
}
