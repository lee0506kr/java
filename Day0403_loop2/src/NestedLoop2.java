
public class NestedLoop2 {
	public static void main(String[] args) {
//		//별을 다섯 줄 출력해야 되니까 다섯번 반복하는 반목문 작성
//		for(int i=0; i<=5; i++) {
//			//별출력: 별하나 출력하는 반복문 작성
			//첫번째 반복에서 별하나 출력>> 한번반복
			//두번째 반복에서 별 둘 출력 >> 두번반복
			//i번째 반복에서 별 n개 출력 >> i번복	
//			for(int j=0; j<=i; j++) {
//				
//			System.out.printf(" "+"*");
//			
//			}
//			System.out.println(" "); //한줄을 다 출력하고 나서 개행문자
//		}


		/*for(int i=1; i<=5; i++) {
			for(int k=i; k<5;k++) {
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.printf("*");
			}
			System.out.println("");
		
		}*/
		
		for(int i=0; i<=5; i++) {
			//빈공간 먼저 출력
			for(int j=1; j<=5-i;j++) {
				System.out.println(" ");
			} //별출력
			for(int j=1; j<=i; j++) {
					
			System.out.printf("*");

		}
			System.out.println(" ");
		}
	}
}
