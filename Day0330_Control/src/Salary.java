import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		//사용자에게 일한 시간을 입력받고, 일한 시간의 수당을 계산해서
		//화면에 보여주는 프로그램을 작성하라
		/*
		 * 정규 근무 시간은 8시간, 8시간을 초과하여 근무 하였을 경우 추가 수당을 지급한다.
		 * 시급은 7,530원이다. 8시간을 초과하였을 경우 초과한 시간만큼은 시급의 1.5배를 적용
		 * 예) 10시간 일했다고 가정할 경우
		 * 		8*7530 +2*7530*1.5
		 *     (60240) +(22590) = 82830
		 *     if-els를 사용해서 계산
		 *     단, 급여는 소수점 둘째자리까지 출력
		 */
		
		//입력받을 변수-정수, 결과(일당)를 저장할 변수-실수
		
		Scanner input = new Scanner(System.in);
		
		int time;
		boolean result;
		
		System.out.println("근무 시간을 입력 해주세요");
		time = input.nextInt();
		
			
		if (time >= 8 ) {
			System.out.printf("급여는 %.2f 원입니다.",8*7530 + (time-8)*1.5*7530);
		}else
		{
			System.out.printf("급여는 %.2f 원입니다.",time*7530);
		}
		
	}

}
