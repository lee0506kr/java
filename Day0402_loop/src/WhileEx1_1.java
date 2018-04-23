import java.util.Scanner;

public class WhileEx1_1 {
	public static void main(String[] args) {
		/*
		 * 사용자에게 숫자를 하나 입력받아서 1부터 입력 받은 수 사이의 짝수(2로 나누어 떨어지는 수, n%2==0)를 출력하기 ex)숫자를
		 * 입력하세요. 11 2 4 6 8 10
		 */
		int number;
		int a = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		number = input.nextInt();

		while (a <= number) {

			if (a % 2 == 0) {

				System.out.printf("%d ", a);
			}

			a++;

		}

	}
}
