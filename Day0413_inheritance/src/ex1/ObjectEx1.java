package ex1;

public class ObjectEx1 {
	public static void main(String[] args) {
		// 자식클래스의 객체를 부모클래스의 참조변수에 참조 시키키 /형변환

		Car c1 = new SportsCar();
		Car c2 = new Bus();
				

		if (c1 instanceof Bus) {
			System.out.println("맞아용~");
			Bus bus = (Bus) c1;
			bus.switchGate();
		} else if (c1 instanceof SportsCar) {
			System.out.println("아닙니다.");
			/*SportsCar sc = (SportsCar)c1; // 형변환 c2는 버스에 객체지만 카에 들어가기 때문이다.
			sc.turboOff();
			sc.turboOn();*/
			SportsCar sc = (SportsCar)c1;
			sc.turboOff();
			sc.turboOn();
		}

	}

}
