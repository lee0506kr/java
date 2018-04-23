
public class NestedLoop1_1 {
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 6; i++) { System.out.print("******"); }
		 */

		/*
		 * for (int i = 1; i <= 10; i++) {
		 * 
		 * System.out.print("*"); System.out.print("*"); System.out.print("*");
		 * System.out.print("*"); System.out.print("*"); System.out.print("*");
		 * System.out.print("*"); System.out.print("*"); System.out.print("*");
		 * System.out.print("*"); System.out.println("\n"); }
		 */
		/*
		 * for(int i =1; i<=6; i++) { for(int j =1; j<=10; j++) { System.out.print("*");
		 * } System.out.println("\n"); }
		 */
		/*
		 * 2*1=2 2*2=4 2*3=6 2*4=8 2*5=10 2*6=12 2*7=14 2*8=16 2*9=18
		 * 
		 */

		for (int j = 1; j <= 9; j++) {

			
			
			for (int i = 2; i <= 9; i++) {
				
				
				System.out.print(i+ "x" + j + "=" + (i * j) + "	");
			}
			
			System.out.print("\n");

			
		}

	}

}
