import java.util.Scanner;

public class ControlEX_1t {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("숫자를 입력해주세요");
		number = input.nextInt();
		
		boolean result = number%2 ==0;
		
		if(!result) {
			System.out.println(number+"홀수입니다.");
		}else {
			System.out.println(number+"짝수입니다.");
		}
	}

}
