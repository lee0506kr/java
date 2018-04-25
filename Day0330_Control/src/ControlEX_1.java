import java.util.Scanner;

public class ControlEX_1 {
	public static void main(String[] args) {
		// 사용자에게 숫자(정수)를 하나 입력받아서 (스캐너 사용)
		// 짝수인지 홀 수 인지 출력하는 프로그램작성(정수형 변수선언)
		// 변수의 값이 짝수 인지 확인,
		//( %를 사용해서 2로 나눈 나머지가 0인지 아닌지 확인)
		//(if-else 문장을 이용해서 선택적으로 출력)
		
		Scanner input = new Scanner(System.in);

		int x;
		
		
		System.out.println("숫자를 입력해주세요");
		x = input.nextInt();

		
		
		if (x % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {

			System.out.println("홀수 입니다.");
		}
	}

}
