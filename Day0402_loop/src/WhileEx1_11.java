import java.util.Scanner;

public class WhileEx1_11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number;//사용자에게 입력받은 정수를 저장할 변수
		System.out.println("숫자를 입력하세요");
		number = scan.nextInt();//숫자입력받기
		
		//입력받은 수 만큼 반복하기 위해서, 반복 횟수를 확인할 수 있는 변수(반복계수)가 필요
		//반복계수: 반복문 시작전에 초기화되며, 반복문에서 변하면서, 반복문의 조건문을 변화시키는 변수
		int n=1;
		
		while(n<=number) {
			//출력되는 부분을 n이 짝수 일때만 출력하고 싶다.
			if(n%2==0) {
				//짝수
				System.out.print(n+" ");
			}
			
			n++; //반복문안에서 반복계수는 1씩 증가
			
		}
		
		
	}

}
