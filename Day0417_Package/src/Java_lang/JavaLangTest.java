package Java_lang;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Date;

public class JavaLangTest {
	public static void main(String[] args) {
		// String, Math, object 등등 기본적인 것은 import 를 안해도 자바에서 사용하게 해주었다.
		// Wrapper Class : 기초자료형을 담을 수 있도록 만들어 놓은 클래스

		// Math : 수학 연산과 관련한 기능을 가지고 있는 클래스
		System.out.println("큰 값은: " + Math.max(3, 4));
		System.out.println("작은 값은: " + Math.min(3, 5));
		System.out.println("4의 제곱근: " + Math.sqrt(4));
		System.out.println("4의 제곱: " + pow(4, 2));
		System.out.println("PI: " + PI);

		// wrapper 클래스 : 기초 자료형 데이터를 포함하는 클래스
		int x = 5;
		Integer number = new Integer(5);
		number = 5;

		if (number == 5) {
			System.out.println("같습니다.");
		}
		System.out.println(number.compare(7, 5));
		// 문자열에서 숫자를 추출하기 : paseInt(문자열)

		System.out.println(Integer.parseInt("123") + 1);
		// -------------------------------------------------

		// StringBuilder:문자열을 만들어주는 역할
		// :변경 가능한 문자열

		// String : 변경 불가능한 문자열

		// String str = new String("Hello");
		// System.out.println(str);

		StringBuilder sb = new StringBuilder();
		//메서드체이닝 기법 : 메서드의 반환형이 객체 자신이기 때문에 메서드 호출 후 다시 메서드를 호출 할 수 있다
		sb.append("Hello").append("!!").append("@@");
		
		Date date = new Date();
		String str = sb.toString();
		System.out.println(str);

		String str1 ="Hello";
		String str2 ="Hello";
		
		if(str1.equals(str2) ) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	
		
		
		//Object : 모든클래스의 조상 클래스
		//모든 클래스 is a Object
		//모든 객체는 Object 참조 변수에 참조 가능하다.
		
		Object o1 = 1;
		//Object o1 = new Integer(1); 둘이같다.
		Object o2 = "Hello";
		Object o3 = new TaekwonV();
		//toString();
		System.out.println(o3);
		
		
	}
}
