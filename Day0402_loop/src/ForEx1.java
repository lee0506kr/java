import java.util.Scanner;

public class ForEx1 {
	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		int a, rs;

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요");
		a = input.nextInt();

		
		for (i = a; j < 10; j++) {

			rs = i * j;
			System.out.println(i + "x" + j + "=" + rs);

		}

	}
}
