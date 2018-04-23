import java.util.Scanner;

public class MethodEx2 {
	public static void main(String[] args) {
		// 메서드 만들겁니다.
		// 수식자는 public static
		// 이름은 add
		// 매개변수는 정수2개
		// 반환형은 정수
		// 반환값은 매개 변수 2개를 더한값
		
		//두 정수를 입력받아서 나머지 값을 반환하는 메서드 작성
		//mod
	
		
		
		int num = add(3, 5);
		System.out.println(num);
		
		int num1= mod(num, add(3,5));
		System.out.println(num1);
		

	}

	public static int add(int a, int b) {
		// 매개변수로 입력받은 두수를 더해서 결과를 변환하는 메서드

		int result = a + b;

		return result;

	}
	
	public static int mod(int x, int y) {
		
		
		int result1 = x % y;
		//return x&y; //이거만 사용할 수 있다.
		return result1;
	}

}
