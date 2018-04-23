import java.util.Scanner;

public class Operator_te {
	public static void main(String[] args) {
		
		int number1, number2, nember3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요");
		number1 = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요");
		number2 = input.nextInt();
		
		 nember3 = number1>number2? number1 :number2;
		 System.out.println(nember3);
	}

}
