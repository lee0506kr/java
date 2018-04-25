import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {

		int radius; // 반지름을 저장할 변수
		final double pi = 3.14;
		double on;

		Scanner str = new Scanner(System.in);

		System.out.println("넓이를 구하고자 하는 원의 반지름을 입력하세요.");
		// 키보드로 부터 정수를 입력받음
		radius = str.nextInt();

		on = pi * radius * radius;

		System.out.println("반지름" + radius + "인 원의 넓이는"+on+"입니다.");
		//printf >> 출력시 포맷을 결정해놓고 출력하는 메서드
		System.out.printf("반지름은 %d 입니다. 넓이는 %.2f 입니다.",radius,on);
		//.2 소수 둘째자리 까지
	}

}
