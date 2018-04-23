
public class WhileEx {
	public static void main(String[] args) {
		// 1~10까지의 합을 출력하는 프로그램
		// while문장 이용

		/*
		 * 2까지의 합 1+2 2까지의 합 = 1+2 1+2+3 3까지의 합 = 2까지합 +3 1+2+3+4 4까지의합 = 3까지 합 +4 .
		 * 1+2+3+4+5+6+7+8+9+10
		 * 
		 * 특정한 수n 까지의 합은.. n-1까지의 합 +n
		 * 
		 */
		int sum = 0; // 합을 저장할 변수
		int n = 1;
		// sum =n-1까지의 합 +n;
		/*
		 * sum = sum+1; sum = sum+2; sum = sum+3; sum = sum+4; sum = sum+5; sum = sum+6;
		 * sum = sum+7; sum = sum+8; sum = sum+9; sum = sum+10;
		 */
		while (n <= 10) {
		    
		    sum=sum+n;
		    n++;  //n=n+1;
		    
		    System.out.println(sum);
		}

	}

}
