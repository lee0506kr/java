import java.util.Scanner;

public class Multiply2 {
	public static void main(String[] args) {
		// 정수 2개를 입력받아서 곱을 구하는 프로그램 작성
		// 입력받은 숫자를 저장하기 위한 a,b 결과를 저장하기 위한 c변수선언

		int a, b, c;

		Scanner str = new Scanner(System.in);

		System.out.println("a에 값을 입력해주세요");
		a = str.nextInt();
		System.out.println("b에 값을 입력해주세요");
		b = str.nextInt();

		c = a * b;

		System.out.println("a곱하기b는" + c + "입니다.");

	}
}
