import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 학생(점수) 점수를 입력받는 10칸짜리 배열하나 생성
		// 반복문을 이용하여서 배열에 데이터 채워넣기
		// 데이터가 입력되고 난 뒤 점수 출력하기
		/*
		 * 입출력 예)
		 * 
		 * 점수를 입력하세요 50 점수를 입력하세요 50 점수를 입력하세요 50
		 * 
		 * ...10번반복
		 * 
		 * 입력된 점수는 50 60 50 50
		 */

		// 학생점수 여러개 저장할 수 있는 배열 선언

		
		int[] score;
		score = new int[10];
		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("점수를 입력해주세요"); score[1] = input.nextInt();
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("점수를 입력해주세요"); score[2] = input.nextInt();
		 */
		for (int i = 0; i < score.length; i++) {
			
			System.out.println("점수를 입력해주세요");
			score[i] = input.nextInt();
			
		}
		System.out.println("입력된 점수는");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");

		}

	}

}
