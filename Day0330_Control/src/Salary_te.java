import java.util.Scanner;

public class Salary_te {
	public static void main(String[] args) {
		
		int hours;
		double salary;
		
		final int REG_HOURS =8;
		final int TIME_PAY=7530;
		final double OVER_PAT_RATE=1.5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("근무시간을 입력하세요");
		hours = input.nextInt();
		
		if(hours<= REG_HOURS) {
			salary = hours*TIME_PAY;
		}else{
			salary = REG_HOURS*TIME_PAY+(hours-REG_HOURS)*TIME_PAY*OVER_PAT_RATE;
		}
		System.out.printf("급여는 %.2f 원입니다.", salary);
	
	}

}
