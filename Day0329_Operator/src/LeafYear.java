import java.util.Scanner;

public class LeafYear {
	public static void main(String[] args) {
		// 사용자에게 연도를 입력받아서 해당 년도가 윤년인지 아닌지 검사하는 프로그램 작성
		Scanner in = new Scanner(System.in);
		// 윤년의 조건
		/*
		 * 1. 4로 나누어 떨어지면서 100으로 나누어 떨어지지 않음 year %4 ==0 year % 100 != 0; 2. 400으로 나누어
		 * 떨어짐 year %400 ==0 3. 1,2 중 하나라도 만족하면 윤년
		 */
		int year;
		String a;
		boolean result, result2;

		System.out.println("연도를 입력하세요");
		year = in.nextInt();

		result = year % 4 == 0 && year % 100 != 0;
		result2 = year % 400 == 0;

		a = result || result2 ? "윤년" : "평년"; // 압축

		System.out.println(a);
	}

}
