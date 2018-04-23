import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		// 사용자에게 숫자를 입력받고 , *2 한 수를 축력하다가
		// -1을 입력받으면 출력하지 않고 종료
		int i = 1;
		int number;
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("숫자를 입력해주세요");
			number = input.nextInt();
			// if (number != -1) {
			// //number가 -1이 아니면
			// System.out.println(number + "x 2는" + number * 2 + "입니다.");
			// }else {
			// //number가 -1이면
			// System.out.println("종료합니다.");
			// break;
			// }
			if (number == -1) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println(number + "x 2는" + number * 2 + "입니다.");

		} // while end

	}

}
