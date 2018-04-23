import java.util.Scanner;

public class AdderTest {
	public static void main(String[] args) {
		// 정수 더하기 기능을 하는 클래스(Adder) 작성해서,
		// 더하기 기능 실행해보기
		// 상태값: 결과를 저장하는 result(정수)
		// 기능add(): 숫자 2개를 전달 받아서 더한다음 결과를 상태값 result에 저장하는 기능
		//더하기 기능을 사용하기 위해서 객체 생성후, 참조변수 a에 참조시킴
		Adder a = new Adder();
		//a가 가지고 있는 add() 메서드 호출
		//add()메서드는 매개변수로 2개의 정수를 가짐
		//호출시 정수 2개를 인자로 주여야한다.

		a.add(3, 5);
		System.out.println(a.result);
		

	}
}

class Adder {
	
	int result;
	
	public void add(int x, int y) {
	
		
		result = x + y;
		
		System.out.println(x+"+"+y+"="+result);
	}
}