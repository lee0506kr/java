import java.util.Scanner;

public class MonthDays_EX {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int month;
		int days=0;
		int year;
		
		System.out.println("년을 입력하세요");
		year = scan.nextInt();
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
			//윤년이면 29일 ,평년이면28일
			if(( year % 4== 0 && year % 100!= 0) || (year % 400 == 0)) {
				days=29;
			}
			else {
				days=28;
			}
			break;
		default:
			System.out.println("잘못입력함");
			days = 0; //최소한 0의값이들어간다.
			System.exit(0);
			break;
		}
		System.out.printf("%d년%d월%d일입니다.",year,month,days);
	}

}
