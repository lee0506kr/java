import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		// if-else문과 마찬가지로 선택 제어문 중 하나
		// 하지마, if-else 는 조건문을 검사하는데 반하여,
		// switch는 변수의 상태값에 따른 선택
		/*
		 * switch(검사할 변수) { case 값: 문장; break; }
		 */

		Scanner input = new Scanner(System.in);

		int number;
		while (true) {

			System.out.println("숫자좀 적어");
			number = input.nextInt();

			switch (number) {

			case 0:
				System.out.println("ㅋㅋㅋㅋ");
				break;
			case 1:
				System.out.println("ㅎㅎㅎㅎ");
				break;
			case 2:
				System.out.println("안녕");
				break;

			default: // 마무리 작업하기
				System.out.println("무엇을 할까요?");
				break;

			}

		}

	}
}
