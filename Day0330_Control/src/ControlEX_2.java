import java.util.Scanner;

public class ControlEX_2 {
	public static void main(String[] args) {
		
		
		
		int year;
		boolean result, result2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		
		year= input.nextInt();
		
		result = year % 4 == 0 && year % 100 != 0;
		result2 = year % 400 == 0;
		
		if( result|| result2) {
			System.out.println("윤년");
		}
		else {
			System.out.println("풍년");
		}
		
	
	}

}
