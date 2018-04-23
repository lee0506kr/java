
public class MultiplierTest {
	public static void main(String[] args) {
		
		//void 리턴값
		// Multiplier
		// 상태값 : 결과를 저장하는 변수 : result(정수)
		// 동작(메서드) : 출력 x , 매개변수로 전달받은
		// 두 정수를 곱해서 결과를 resylt에 저장하고,
		// 결과를 반환 (return)하는 메서드 mutiply()작성

		// MultiplierTest main에서 해야할일
		// Multiplier 객체 만들고 mutiply() 실행해보기

		Multiplier m = new Multiplier();

		int multResult = m.multiply(3, 5);
		m.multiply(2.5, 4.5);
		
		//같은 기능을 하는 메서드인데 데이터 타입에 따라서 이름을 다르게 쓰는게 헷갈린다.
		//다른데이터 타입을 동시에 사용할 수 있게 만들기 위해서 오버로딩한다.
		
		 System.out.println(multResult);
	     System.out.println(m.result);
	}

}
