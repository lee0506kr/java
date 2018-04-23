
public class Car {
	/*
	 * 상태값 색깔(문자열), 현재속도(정수), 주행거리(정수)
	 * 
	 * 동작 void sppedUp():현재속도를 5증가 시칸다.
	 *  void sppedDow():현재속도를 5감소 시킨다.
	 * void printCar():현재 상태값 출력 생성자 기본생성자 : 색깔="빨강",현재속도=0;주행거리는 =0 으로 초기화 색깔, 현재속도,
	 * 주행거리를 매개변수로 전달받아서 멤버 변수로 초기화하는 생성자 생성자 2개 메소드 3 상태값 3
	 * 
	 */

	//

	private String color;
	private int speed;
	private int milege;
	
	
	
	//color getter : color를 반환
	public String getColor() {
		return color;
	}
	//color setter : color의 값을 저장
	//매개변수로 색깔을 받아와서 color에 저장
	public void setColor(String c) {
		color = c;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		//속도가 150을 넘어가면 150으로 고정하겠다.
		if(s>150) {
			s=150;
		}
		speed = s;
	}

	// 생성자의 모양은 수식자 클래스 이름(){ }
	public Car() {
		color = "빨강";
		speed = 0;
		milege = 0;
	}

	public Car(String c, int s, int m) {
		color = c;
		speed = s;
		milege = m;
	}

	public void speedUp() {
		// speed 5증가
		speed += 5;
	}

	public void speedDown() {
		// speed 5감소
		speed -= 5;
		
		
	}

	public void printCar() {
		
		System.out.println("색깔:"+color);
		System.out.println("속도:"+speed);
		System.out.println("주행거리:"+milege);
	}
//	public String toString() {
//		return "Color : "+color+"Speed : "+speed+"Milege : "+milege;
//	}
	
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", milege=" + milege + "]";
	}


	

}