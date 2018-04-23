package collection;

import java.util.ArrayList;
import java.util.List;

public class LottoMaker {
	// 기능은 >>메서드
	// 상태값(데이터)>>변수
	List<Integer> lotto;

	public LottoMaker() {
		// List : 인터페이스 이기 떄문에 객체 생성 x
		// 인터페이스를 구현한 구현 클래스를 이용해서 객체를 만들어야 한다.
		// 길이 0인 리스트를 생성
		lotto = new ArrayList<Integer>();
	}

	public void makeNumber() {
		// 난수를 만들어 내고 출력

		for (int i = 0; i < 6; i++) {
			lotto.add(((int) (Math.random() * 45)) + 1);

			for (int j = 0; j < i; j++) {

				if (lotto.get(i) == lotto.get(j)) {

					lotto.remove(2);
					i--;

					break;
				}

			}

		}
		/*
		 * for (int i = 0; i < 6; i++) { int a = ((int) (Math.random() * 45)) + 1;
		 * 
		 * boolean isDup = false; // 중복되면 true for (int j = 0; j < i; j++) {
		 * 
		 * if (a == lotto.get(j)) {
		 * 
		 * isDup = true; i--;
		 * 
		 * break; }
		 * 
		 * } if (!isDup == true) { // 중복이 일어나면 아무 작업 하지 않음 // >>중복이 일어나지 않았다면 생성한 숫자를 추가
		 * } else { lotto.add(a); }
		 * 
		 * }
		 */

		for (int number : lotto) {
			System.out.print(number + " ");
		}
		System.out.println();

	}

}
