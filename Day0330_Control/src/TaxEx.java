import java.util.Scanner;

public class TaxEx {
	public static void main(String[] args) {
		//사용자로 부터 연봉(정수,만원)을 입력받아 소득세를 구하는 프로그램 작성
		/*
		 * 연봉 세율 기준: 2000만원 이하, 9% a<=2000
		 				2000만원 초과 4000만원 이하, 18% a<2000 && a<=4000
		 				4000만원 초과 8000만원 이하, 27% a<4000 && a<=8000
		 				8000만원 초과 , 36%
		 	if-else if 를 사용하시오.
		 	생각해야 할 것
		 	1. 어떤 순서로 문제를 해결할 것인가?
		 	2. 문제를 해결하기 위한 데이터는 어떤 것이 필요한가?
		 	3. 문제 해결을 위해 어떤 방법을 사용할 것인가?
		 	
		 	예)
		 	연봉을 입력하세요
		 	2000
		 	소득세 180.00(만원)입니다.
		 */
		Scanner input = new Scanner(System.in);
		
		double a;
		
		System.out.println("연봉을 입력하세요");
		a = input.nextInt();
		
		if(a<=2000) {
		 System.out.printf("당신의 소득세는%.2f 만원입니다.",a*0.09);
		}else if(a<=4000) {
			System.out.printf("당신의 소득세는%.2f 만원입니다.",a*0.18);
		}else if(a<=8000) {
			System.out.printf("당신의 소득세는%.2f 만원입니다.",a*0.27);
		}else {
			System.out.printf("당신의 소득세는%.2f 만원입니다.",a*0.36);
		}
		
		
	}

}
