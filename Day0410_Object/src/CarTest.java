
public class CarTest {
	public static void main(String[] args) {

		// car 클래스의 외부영역
		// 클래스 내부와 외부에서의 메서드 호출 방법이 다름
		// 클래스 내부에서는 멤버메서드의 이름만 호출하면됨

		// 클래스 외부에서는 객체먼저 만들고 객체를통해서 호출

		Car c = new Car();
		
		c.printCar();
		
		c.speedDown();

		// 클래스들은 다양한 종류의 메서드를 가지고 있음
		// 특정 목적을 가지는 메서드들도 있음
		// getter, setter
		// 멤버변수에 값을 가져오거나,멤버변수에 값을 할당할떄 사용하는 메서드

		// c객체의 멤버 변수값 바꾸기
		// 객체안의 변수를 함부러 바꾸지 못하게 막자 >>캡슐화
		// color를 외부에서 볼 수 있게 하자
		// getter를 사용하면, 설정은 못하게, 값은 사용할 수 한다.
		System.out.println(c.getColor());
		c.setColor("파랑");
		System.out.println(c.getColor());
		c.setSpeed(200);
		
		System.out.println(c);

	}
}
