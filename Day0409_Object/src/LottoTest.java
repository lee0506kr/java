
public class LottoTest {
	public static void main(String[] args) {
		/*
		 * 1. 1~45 사이의 중복되지 않는 6개의 수를 생성하는 Lotto 클래스 생성 2. 상태값은 생성된 로또 번호를 저장할 수 있는
		 * 크기6인정수형 배열 lotto 3. 기능은 3-1 랜덤한 숫자를 만들어 내고 lotto에 저장하는 makeNumber()void 3-2
		 * 만들어진배열을 정렬하는 sort() void 3-3 만들어진 배열을 출력하는 printLotto()void 4.생성자는 배열을 받아서
		 * lotto에넣어줄수 있는 생성자 1 기본 생성자1 5. LottoTest main에서 Lotto 객체 만들어서 매서드 하나씩 실행
		 */

		Lotto maker = new Lotto(); // 객체 생성

		maker.makeNumber();
		maker.printLotto();
		maker.sort();
		maker.printLotto();

		int[] arr = { 2, 4, 7, 44, 13, 3 };
		Lotto lotto2 = new Lotto(arr);
		lotto2.printLotto();
		lotto2.sort();
		lotto2.printLotto();
		// arr내용 직접출력:참조에 의한 호출이기 때문에 정렬된다.
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
