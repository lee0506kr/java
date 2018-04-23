
public class Operator1 {
	public static void main(String[] args) {
		//연산자에 대해서 공부합니다.
		//증감연산자 ++,-- 에 대해서 실습합니다.
		
		int x = 5;  //A=65, B=66 아스키코드
		int y,z;
		
		char a = 'A';
		char b = 'B';
		System.out.println(a+b);
		
		//x++; //다른 연산을 모두 끝낸후 x의 값을 1증가 시킨다.
		//++x; //다른 연산 하기 전x의 값을 1증가 시킨다.
		//System.out.println(x);
		//System.out.println(x++);
		//System.out.println(x);
		
		y = x++;
		z = ++x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		y = x--;
		z = --x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
}
