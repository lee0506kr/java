
public class BreakEx {
	public static void main(String[] args) {
		//break - continue;
		//break : 반복문을 반복문의 조건문과 상관없이 빠져 나올때 사용
		//continue : 해당 반복 순서의 문장을 더이상 실행하지 않고, 다음 반복으로 넘어감
		//특정조건일때 반복문을 실행하지 않고, 다음 반복으로 진행하고 싶을 때 사용
		for(int i=1; i<10;i++) {
			
			//만약 i가 5의 배수이면 반복문을 종료
			if(i%5 == 0) {
//				//i는 5의 배수
				//만약 i가 5의 배수이면 반복문을 종료
//				break;
				//만약 i가 5의 배수이면 출력하지마라
				continue;
				
			}
			System.out.print(i+" ");
		}
		
	}

}
