import java.util.Scanner;

public class Rhkwp {
	public static void main(String[] args) {

		int number1, number2;

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력해주세요");
			number1 = input.nextInt();

			System.out.println("숫자를 입력해주세요");
			number2 = input.nextInt();

			if ((number1 >= 2 && number1 <= 9) && (number2 >= 2 && number2 <= 9)) {

				break;

			} else {
				System.out.println("INPUT ERROR");
			}

		}
		if (number1 <= number2) {

			for (int j = 1; j <= 9; j++) { //

				for (int i = number1; i <= number2; i++) {

					System.out.print(i + "x" + j + "=" + i * j + "	");

				}

			}
		} else {
			for (int j = 1; j <= 9; j++) {
				for (int i = number1; i >= number2; i--) {
					System.out.print(i + "x" + j + "=" + i * j + "	");
				}

				System.out.print("\n");
			}

		}

	}
}

/*
 * for(int i=2;i<=number1;i++) { for(int k=i; k<i;k++) {
 * System.out.println(" "); } for(int j=1;j<=9;j++) {
 * System.out.println(i+"x"+j+"="+(i*j)); } System.out.println(" "); }
 * 
 * 
 * for(int i=2;i<=number2;i++) { for(int k=i; k<i;k++) {
 * System.out.println(" "); } for(int j=2;j<=9;j++) {
 * System.out.println(i+"x"+j+"="+(i*j)); } System.out.println(" "); }
 * 
 * 
 */
