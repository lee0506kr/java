
public class ArrayEx {
	public static void main(String[] args) {

		// 배열(Array)에 대해서 공부합니다.
		// 배열은 같은 데이터 타입 변수의 모임이다.
		// 배열 = 변수들의 모임
		// int <= 정수 저장 , int[] <=정수형 배열의 주소값 저장
		/*
		 * int s1,s2,s3; s1 = 100; s2 = 90; s3 = 80;
		 */
		// 인가이 보기에 같은 종류의 데이터라도 따로 선언을 하면 한꺼번에 처리하지 못함
		// 정수형 데이터 3개를 저장할 수 있는 배열 생성하기
		// 1.(정수형)배열의 주소를 저장할 수 있는 참조 변수 만들기
		// 만들 배열의 종류는 정수형 배열

		int[] numbers=new int[3]; // 정수배열의 주소값을 저장할 수 있는 (참조) 변수

		// 배열 만들기 & 주소값 참조변수에 넣기
//		numbers = new int[3]; // 주소값을 바로 저장을 한다.

		// 배열을 선언했으니 사용합시다.
		// number = 5; numbers 는 배열의 주소값을 저장하는 변수, 정수를 그대로 넣을 수 없음
		// 배열의 사용은 index를 통해서 할 수 있다.
		// index: 배열의 요소순서를 나타내는 번호, 0부터시작 그래서 가장큰 index는 배열길이 -1이다

		// 첫번 째칸에는 1, 두번째 칸에는 3, 세번째 칸에는 5를 넣어 봅시다.

		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 5;

		for (int i = 0; i < numbers.length; i++) { // numbers.length; 배열의 길이를 말해주는것

			System.out.println(numbers[i]);

		}

	}
}
