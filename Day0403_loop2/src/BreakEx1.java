
public class BreakEx1 {
	public static void main(String[] args) {
		// 중첩반복문에서의 break
		/*
		 * 중첩반복문에서 내가 원하는 반복문을 종료하고 싶을 때 반복문에 태그를 달아주면된다.
		 * 태그1:
		 * 반복문1
		 *   태그2:
		 *   반복문2: 
		 * break 태그 1; <<종료하고자 하는 반복문을 선택할 수 있다.
		 *   
		 * 
		 * 반복문의 이름을 설정하지 않고, 안쪽 반복문에서 바깥쪽 반복문을 종료하기 위해서는
		 * 바깥쪽 반복문의 상태를 결정할 수 있는 변수의 값을 바꿔주면 된다. >>isEnd=true;
		 *   
		 */
		int count = 0;
		boolean isEnd =false;
		outFor: //바깥 반복문 태그 작성
		for (int i = 1; i <= 7; i++) {
			inFor: //안쪽 반복문 태그 작성
			for (int j = 1; j <= 5; j++) {
				 //여기는 몇번 들어오나요??? 35 5번하는것을 7번 돌린다.
				 if(i==3 && j==3) {
					 System.out.println(count);
					 //isEnd=true;
					 break outFor;
				 }
				 count++;
			}
			if(isEnd)
			{
				break;
			}
		}
		System.out.println(count);	
	}

}
