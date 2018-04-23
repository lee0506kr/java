import java.util.Scanner;

public class BreakEx2 {
	public static void main(String[] args) {
		// 사용자에게 정수를 입력받으면 해당 정수의 배수를 출력하다가
		// 100이 넘어가면 종료
		// 예) 숫자를 입력하세요
		// 21 42 36 84 105

		// 사용자에게 입력 한번 받음
		// 입력받은 숫자에다가 *1*2*3*4*..계속해서 반복
		// 반복할 때마다 100이 넘어가는지 확인하고, 넘어가면 반복종료
		// 필요 변수, 입력한 수를 저장할 변수, 매 반복마다 결과를 저장할 변수

		int number, result;
		int i = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를입력하세요");
		
		number = input.nextInt(); // 입력 받는곳

		while (true) {

			result = number * i; // 배수 몇에 배수 곱하기

			System.out.print(result + " ");

			if (result >= 100) {

				break;
			}

			i++;

		}

	}

}
