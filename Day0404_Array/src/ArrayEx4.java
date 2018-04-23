import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String[] args) {
		// 사용자에게 10개 정수를 입력받아서
		// 배열에다가 저장해서
		// 짝수 번째 입력받은 수의 합과 %2
		// 홀수 번째 입력받은 수의 합을 각각 출력하시오. %3

		// 10칸 짜리 정수형 배열만들어서 입력받으세요

		int[] arr;
		arr = new int[10];

		Scanner input = new Scanner(System.in);

		int oddsum = 0;
		int evensum = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("숫자를 입력 해주세요");
			arr[i] = input.nextInt();
		} //사용자가 입력하는곳 반복
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) { // 짝수 인덱스 홀수 번째입력받은수
				oddsum = oddsum + arr[i];
			} else { // 홀수 인덱스, 짝수 번째 입력받은수
				evensum = evensum + arr[i];
			}
		}
		//for문 밖에다가 쓰기 
		System.out.println("짝수 번째합:" + evensum);
		System.out.println("홀수 번째합:" + oddsum);
	}

}
