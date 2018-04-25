import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		// 숫자를 키보드로 입력받아서 더하기
		// 입력 받을 준비 : Scanner 를 사용해야 한다.
		/*
		1.Scanner를 사용하기 위해서 import -> ctrl +shift +o
		2.Scanner 사용방법
		*/
		//scan input 이름 입니다.
		//키보드로 부터 입력받을 준비
		Scanner scan = new Scanner(System.in);
		
		int a,b,sum; //정수를 저장할 변수 a,b,sum 선언
		
		System.out.println("첫 번째 a을 입력해주세요:");
		a = scan.nextInt(); //키보드로 부터 숫자를 읽어와서 a에 대입
		System.out.println("두 번째 b을 입력해주세요:");
		b = scan.nextInt();
		sum = a+b;
		
		System.out.println("a+b의 결과는:"+ sum +"입니다.");
	}
}
