import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// while- break 연습예제
		// 사용자에게 숫자(정수)를 입력받아서 계속해서 더합니다.
		// -1을 입력받으면 그 전까지 더한 숫자를 총합과 평균을 출력하는 프로그램을 작성

		/*
		 * 단 평균은 소수점 둘째 자리에서 반올림하여 한 자리만 표시 입출력 예) 5 10 6 7 -1 총합은 28 평균은 7.0입니다.
		 * 
		 */
		
		int number; // 입력 하는곳
		int sum = 0; // 합계 저장하는 변수
		double avg = 0; // 평균 저장하는 변수
		int count = 1; // 횟수 저장하는 변수
		
		Scanner input = new Scanner(System.in); // 스캐너

		while (true) {
			System.out.println("숫자를 입력해주세요");
			number = input.nextInt(); // 입력해주는곳

			if (number == -1) {

				System.out.println("총점:" + sum);
				System.out.println("평균:" + avg);

				break;
			}

			// 횟수를 저장 시키기

			sum += number; // 합구하기
			avg = sum / count;

			
			count++; // 증가시
		}

	}

}
