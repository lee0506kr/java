import java.util.Scanner;

public class Rhkwp_te {
	public static void main(String[] args) {
		// 정올 실력키우기 1291 구구단 출력하기
		// s와e를 입력받아서 해당 범위의 구구단 출력하기
		// s와e의 범위는 2이상 9이하, 작은수 부터 입력 받아야 하는건 아니다.
		// 입력을 잘못받으면 에러메시지 출력후 다시 받는다.
		// 한번이란 말이 없음: 입력이 잘못되면 반복해서 계속 입력받는다.

		// 가로 구구단 출력 가져와서 출력 형식 맞추기
		// 입력받기

		Scanner input = new Scanner(System.in);

		int s; // 시작 범위
		int e; // 종료범위

		// 일단 해야 할일은 s와e가 정상 범위인지 아닌지 확인
		// 1.s 가 2이상이고 9이하이다.
		// 2.e 가 2이상이고 9이하이다.

		while (true) {
			// 입력 받는 부분이 반복되어야 함
			s = input.nextInt(); // 시작점 입력 받기
			e = input.nextInt(); // 종료점 입력받기

			if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) {

				break; // 정상적으로 입력받았다면 더 이상 반복은 필요없다.
			} else {
				System.out.println("INPUT ERROR");
			}

		}
		
		
		if (s <= e) {
			for (int i = 1; i <= 9; i++) {

				// 이 반복문은 s가 작을때나 같을 때 정상 동작하는 반복문
				for (int j = s; j <= e; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);

				}

				System.out.print("\n");

			}
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j >= e; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);

				}
				// s가e보다 큰경우
				System.out.println();
			}

		}

	}
}
