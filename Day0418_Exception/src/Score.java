
public class Score {
	// 총점(total)을 저장하고,
	// 설정하고,(setTotal(int):void)
	// 출력 (showTotal():void)
	// 할 수 있는 클래스
	// setTotal() 할때 홀수가 입력되면 OddNumberException 발생시키기

	private int total;

	public void setTotal(int x) throws OddNumberException {

		if (x % 2 != 0) {

			throw new OddNumberException();
		}
		total = x;

	}

	public void showTotal() {
		System.out.println("총점: " + total);
	}

}
