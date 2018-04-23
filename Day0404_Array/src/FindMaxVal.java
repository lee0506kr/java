
public class FindMaxVal {
	public static void main(String[] args) {
		// 1.{77,50,64,100,25}형태의 임의의 숫자 5개로 초기화된 배열을 생성
		// 2.해당 배열에서 가장 큰 숫자를 찾아서 화면에 출력
		// 출력예)
		// 가장 큰 숫자는 100입니다.

		int[] arr = { -77, -50, -64, -100, -25 };// 값이 초기화된 배열생성
		int max = arr[0]; // 가장 큰값을 저장할 max변수 선언
		// int max = 0; 배열중에서 가장 큰 값을 찾아야하는데 외부값이 비교대상에 포함됨
		// 음수로 하였을때에 0이면 0으로 된다.
		
		for (int i = 0; i < arr.length; i++) { // length 예외는 있지만 대부분 <이렇게쓴다.
			if (max < arr[i]) {
				max = arr[i]; // 저장한값
			}

		}

		/*
		 * for (int number : arr) { if (max < number) { max = number; } }
		 */
		System.out.println(max);

	}

}
