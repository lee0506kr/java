import java.util.Scanner;

public class Forex2 {
	public static void main(String[] args) {
		// 거꾸로

		int sum;

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요");
		sum = input.nextInt();

		// for (int i = 1; i < 10; i++) {
		//
		// System.out.println(sum + "x" + i + "=" + i * sum);
		//
		// }

		for (int i = 9; i >= 1; i--)
		{
//			int number;//연산의 결과를 저장할 변수
//			number =n*2;

			System.out.println(sum + "x" + i + "=" + i * sum);

		}
	}
}