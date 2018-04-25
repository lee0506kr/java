import org.omg.Messaging.SyncScopeHelper;

public class Lotto {
	/*
	 * 1. 1~45 사이의 중복되지 않는 6개의 수를 생성하는 Lotto 클래스 생성 2. 상태값은 생성된 로또 번호를 저장할 수 있는
	 * 크기6인정수형 배열 lotto 3. 기능은 3-1 랜덤한 숫자를 만들어 내고 lotto에 저장하는 makeNumber()void
	 * 3-2만들어진배열을 정렬하는 sort() void 3-3 만들어진 배열을 출력하는 printLotto()void 4.생성자는 배열을 받아서
	 * lotto에넣어줄수 있는 생성자 1 기본 생성자1 5. LottoTest main에서 Lotto 객체 만들어서 매서드 하나씩 실행
	 */
	int[] lotto;

	public Lotto() { // 기본생성자
		// super();
		lotto = new int[6]; 
	}

	// lotto를 배열로 입력받은 배열로 초기화
	public Lotto(int[] number) {

		lotto = number;
	}

	public void makeNumber() {
		// 난수를 만들어 내고 출력


		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ((int) (Math.random() * 45)) + 1;
		
			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) {

					i--;
					break;
				}
			}
		}
	}

	public void sort() {

		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {

				if (lotto[i] > lotto[j]) {

					int tmp; // 저장할 공간

					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;

				}

			}

		}

	}

	public void printLotto() {
		for (int number : lotto) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
