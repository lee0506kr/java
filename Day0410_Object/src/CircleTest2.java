import java.util.Scanner;

public class CircleTest2 {
	
	// 사용자로부터 다수의 원의 반지름과 중심점의 좌표를 입력받아서
	// 출력하는 프로그램을 작성하라
	/*
	 * 배열에다가 circle 을 저장해서 출력하기 입출력 예) 저장할 원의 개수를 입력하세요 3 원의 반지름을 입력하세요 10 원의 x좌표를
	 * 입력하세요 3 원의 y좌표를 입력하세요 5 //3번 반복
	 * 
	 * 원 1의 반지름은 3, 넓이는 xxx.xx 중심좌표는 3,5
	      원 2의 반지름은 3, 넓이는 xxx.xx 중심좌표는 3,5
              원 3의 반지름은 3, 넓이는 xxx.xx 중심좌표는 3,5
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("저장할 원의 개수를 입력하세요");
		int number = input.nextInt();
		Circle[] arr = new Circle[number]; // circle 이라는 배열 바구니에다가 담는다.
		
		// b[1] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int x, y;
			int radius;

			arr[i] = new Circle();

			System.out.println("원의 반지름을 입력하세요");
			radius = input.nextInt();
			System.out.println("원의 x의좌표를 입력하세요");
			x = input.nextInt();
			System.out.println("원의 y의좌표를 입력하세요");
			y = input.nextInt();

			arr[i].setRadius(radius);
			Point point = arr[i].getCenter();
			point.setX(x);
			point.setY(y); //애들을 반복문을 통해서 접근하기

			//arr[o].getCenter();센터 값을 가져온다 point 클래스 객체
		}

		for (int i = 0; i < arr.length; i++) {
			int radius;
			double area;
			int x, y;

			radius = arr[i].getRadius();
			area = arr[i].circleArea(radius);
			x = arr[i].getCenter().getX(); //센터에서 가져온다. x좌표를 가져온더ㅏ
			y = arr[i].getCenter().getY();

			System.out.printf("원 %d의 반지름은 %d, 넓이는 %.2f 중심좌표는 %d,%d \r "+ ""+ "\n", i + 1, radius, area, x, y);

		}

	}
}
