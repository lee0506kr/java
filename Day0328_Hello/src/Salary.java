import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		// 저축액을 계산하는 프로그램 작성

		Scanner str = new Scanner(System.in);

		int deposit;
		int totalBalance;

		System.out.println("저축액을 입력하세요.");
		deposit = str.nextInt();

		totalBalance = deposit * 10 * 12;
		// 저축액은 1년 12개월 곱해야한다.
		System.out.println("10년동안의 저축액:" + totalBalance + "원");

	}

}
