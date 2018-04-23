import java.util.Scanner;

public class Jnuol167 {
	public static void main(String[] args) {
		// 4*2이차원 배열 생성하고, 순서대로 사용자에게 입력 받기
		// (크기 2인 정수형 배열 4개를 저장할 수 있는 배열 생성)

		int[][] arr = new int[4][2];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			// arr[0],arr[1],arr[2],arr[3] 으로 반복
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextInt();
			}

		}
		int total = 0; // 전체 합
		int count = 0; // 전체 갯수

		for (int i = 0; i < arr.length; i++) {
			int sumRow = 0; // 가로평균
			for (int j = 0; j < arr[i].length; j++) {
				sumRow = sumRow + arr[i][j];
				total = total + arr[i][j];
				count++;
			}
			// sumRow는 총합
			System.out.print(sumRow / arr[i].length + " ");
		}
		System.out.println(" ");

		// 세로 평균
		for (int i = 0; i < arr[i].length; i++) {
			int sumCol = 0; // 세로총합
			for (int j = 0; j < arr.length; j++) {
				sumCol = sumCol + arr[j][i];

			}
			System.out.print(sumCol / arr.length + " ");
		}
		System.out.println();
		System.out.print(total / count);
	}

}
