import java.util.Scanner;

public class WhileEx1 {
	public static void main(String[] args) {
		// 사용자에게 입력받은 수 만큼 반복해서 더하기

		int number; // 내가 입력한값
		int n = 1;
		int sum = 0; //합을 저장할 변수, 0으로초기화 (합의 초기값은 0이다. 아무숫자도 더하지 않으면0)

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력 해주세요");
		number = input.nextInt();

		while (n <= number) {

			sum = sum + n;
			n++; // n=n+1;
		}
		System.out.println("1부터"+number+"까지의 합은"+sum+"입니다.");
	}

}
