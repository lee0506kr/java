import java.util.Scanner;

public class Practic_te {
	public static void main(String[] args) {
		 	
	
		int sum =0; //총합을 저장할 변수
		int number;//사용자에게 수를 입력받을 변수
		int count=0; //입력 받은 수의 개수를 세기 위한 변수
		double avg; //평균을 저장할 변수	
		
		Scanner input =new Scanner(System.in);
		
//		1. 사용자에게 수를 하나 입력받고
//		2. 입력받은 수가 -1인지 아닌지 확인
//		3. 3-1 :-1이라면 반복을 조료하고(총합과 평균을 계산)
//		   3-2 :-1이아니라면 입력받은 수를 총합에 더하고, 개수를 1증가
//		4. 1~3 을반복		
	
	
		while(true) { //whie(조건문 ) 조건문 자리에는 논리값(true/false)이나 논리식이 옴
			System.out.println("숫자를 입력하세요");
			number = input.nextInt();
			
			if( number == -1) {
				//반복 종료
				break;		
			} //break 위치가 중요하다. //if end
			sum= sum+number; //-1이 아니라면 총합에 입력받은 수를 더한다.
			count++; //입력받은수가 -1이아니라면 입력받은 숫자의 개수를 올린다.
		 	
		} //while end
		//반복문이 끝나고 나면, 총합과 평균을 계산
		
		avg= (double)sum/count;
		
		System.out.println("입력하신 수"+count+"개의총합은"+sum+",");
		System.out.printf("평균은 %.1f 입니다.",avg);
	}
	
}
