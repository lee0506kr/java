import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		// 1~45 까지의 정수 중에 **중복되지 않는** 정수 6개를 생성
		// 크기 6인 정수형 배열에
		// 배열, 중첩반복문

		// 1. 크기 6인 정수형 배열 생성 int[] arr; arr[]= new int[6]
		// 2. 1~45 사이의 난수 생성 Random ran = new Random();
		// 3. 생성한 난수가 이전에 생성한 난수인지 확인
		// 4. 4-1 이전에 생성한 난수가 아니라면, 다음 난수 생성
		// 4-2 이전에 생성한 난수라면, 현재 난수 다시 생성
		// 5. 6개의 난수가 모두 생성되면 배열에 있는 숫자 출력(중복 x) //인덱스 뭐라고
		// 난수 6개 생성해서 배열에 넣고 출력하기
		int[] lotto = new int[6]; // 발생한 로또 번호 6개를 저장하기 위한 배열
		// 1~45사이의 난수 만드는 방법
		// ((int)(Math.random()*45))+1;
		// 난수 만드는 작업을 6번 반복 >> 반복문
		// 난수 만들고 나서 배열에다가 0번부터 5번까지 차례대로 저장
		int count = 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ((int) (Math.random() * 45)) + 1;
			count++;
			// 중복을 없애는 방법이 필요
			// [31][7][15][24][x][]
			// 중복 검사 수행 반복문
			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) {
					// 중복이 발생한것!!
					// i번째 만든 난수를 새롭게 생성해줘야함
					i--; // i를 1감소 시킨다.
					break; // 중복 로직을 빠져나간다.
				}
			}

		}
		// 출력
		for (int number : lotto) {
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println(count);
	}
}
