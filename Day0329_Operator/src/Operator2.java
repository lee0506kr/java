
public class Operator2 {
	public static void main(String[] args) {
		// 관계연산자에 대해 실습합니다.
		// ==, !=, >, <, >=, <=

		int x = 3;
		int y = 4;

		// 결과 값을 저장할 변수를 선언
		boolean result;
		// x가y와 긑은 지 비교하고 결과를 result함수에 넣는다.
		result = x == y;
		System.out.println("x==y:" + result);

		result = x != y;// x가 y와 다르면 참
		System.out.println("x!=y:" + result);

		System.out.println("x>y:" + result); // x가 y와 다르면 참
		result = x > y;

		System.out.println("x<y:" + result);
		result = x < y;

		System.out.println("x>=y:" + result);
		result = x >= y;

		System.out.println("x<=y:" + result);
		result = x <= y;

		// *****결과는 boolean 이다.
		// 논리 연산자 &&, ||, !
		// &&(AND):피연산자 두 개가 모두 참일 때만 참인 연산자
		// ||(OR):피연산자 중 하나라도 참이면 참인 연산자
		// !(NOT):단항연산자, 피연산자의 값(true/false)을 반대로 순간, 만들어주는 연산자

		/*
		 * T:true F:false
		 * 
		 * F&&F:f F&&T:f T&&F:f T&&T:t
		 * 
		 * F||F:f F||T:t T||F:t T||T:t
		 * 
		 */

		boolean result1 = x == 3; // true
		boolean result2 = y == 7; // false
		boolean result3;
		boolean result4;

		result3 = result1 && result2;
		result4 = result1 || result2;
		System.out.println("result1 && result2 :" + result3);
		System.out.println("result1 || result2 :" + result4);

		System.out.println("result:" + !result);
		System.out.println("result:" + result);

	}

}
