import java.util.Random;

public class Lotto1_1 {
	public static void main(String[] args) {

		int[] lotto;
		lotto = new int[6];
		int number;

		Random ran = new Random();

		for (int i = 0; i < lotto.length; i++) {

			number = ran.nextInt(6) + 1;
			
			for (int j = 1; j < i; j++) {

				if (lotto[i] == number) {

					i--;
					
					break;
				}

			}
			lotto[i] = number;
		}
		
		
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
