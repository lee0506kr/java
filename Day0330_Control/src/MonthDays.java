import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		// 달을 입력받아서 달의 일수를 구하는 프로그램을 작성하자
		// 예) 월을 입력하세요.
		// 3
		// 3월은 31일 입니다.
		// 1,3,5,7,8,10,12:31일
		// 4,6,9,11 :30일
		// 2: 28/29일
		Scanner scan = new Scanner(System.in);

		int month;
		int days;
		
		System.out.println("월을 입력하세요");
		month = scan.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
			System.out.println("잘못입력함");
			days = 0; //최소한 0의값이들어간다.
			System.exit(0);
			break;
		}
		//switch문을 통해서 선택한 일 수 출력
		System.out.println(month+"월은"+ days +"일 입니다.");
		
		/*int number;
		 *int a=50;
		 *int b;
		 * if(a>100)
		 * 
		 */
	}

}
