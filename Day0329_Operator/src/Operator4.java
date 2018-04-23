
public class Operator4 {
	public static void main(String[] args) {
		//비트 연산자(사용빈도 낮음)
		//&(AND),|(OR),^(XOR),~(NOT)
		// 비트단위 연산을 할 수 있게 만들어 주는 연산자
		//&(AND):둘다 1일때 1
		//|(OR):둘 중 하나라도 1일떄 1
		//^(XOR):둘 중 하나만 1일떄 1
		//~(NOT):비트전환
		// 0010
		
		int x =2;
		int y =6;
		int result;
		
		result = x&y;
		System.out.println("x&y:"+result);
		
		x=3;
		y=6;
		result = x|y;
		System.out.println("x|y:"+result);
		
		x=3;
		y=6;
		result = x^y;
		System.out.println("x^y:"+result);
		
		x=3;
		y=6;
		result = ~x;
		System.out.println("~x:"+result);
		
		//정수를 2진 표기법으로 출력하기 Integer 클래스 이용
		System.out.println(Integer.toBinaryString(result ));
		System.out.println(Integer.toBinaryString(-1));
		
		//Shift : 비트를 옮기는 연산자 <<,>>,>>>,
		
		//<<: 좌측으로 비트를 옮김, 빈자리는 0으로 채움
		//>>: 우측으로 비트를 옮김, 부호비트를 그대로 유지(앞자리를 남기고 이동)
		//>>>: 우측으로 비트를 옮김, 빈자리는 0으로 채움
		
		x= 7; //x<<1; //1110 (14)
		result = x<<1;
		//*tip. 좌측으로 1bit 쉬프트 되면 곱하기 2가 된다.
		System.out.println("7<<1:"+result);
		System.out.println("7<<1:"+(result<<1));
		
		result = x>>1;
		System.out.println("7>>1:"+result);
	
	
	}
}
