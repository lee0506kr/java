import java.util.Scanner;

public class Operator_ex {
	public static void main(String[] args) {
		
		//사용자에게 숫자 2개를 입력받아서 어떤 숫자가 더 큰지 알려주는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		int c;
		System.out.println("숫자를 입력해주세요");
		x = sc.nextInt();
		
		System.out.println("숫자를 입력해주세요");
		y = sc.nextInt();
		
		
		c = x <= y? y: x; //true 자리에 y 큰값은 입력
		
		System.out.println("더 큰숫자는"+c+"입니다.");
		
	}

}

