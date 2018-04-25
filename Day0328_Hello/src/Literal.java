
public class Literal {
	public static void main(String[] args) {
		//이번 예제 에서는 Literal(값,상수)에 대해서 공부합니다.
		//각 상수 표현법에 따른 값을 저장할 변수 선언
		
		int decimal; //10진수를 저장할 변수
		int octal; //8진수를 저장할 변수
		int hexaDecimal;//16진수를 저장할 변수
		int binary; //2진수를 저장할 변수
		
		decimal = 14; //10진수 상수를 변수에 저장
		octal = 016; //16진수 상수를 변수에 저장그냥 16이라고 쓰면 2진수로 나온다.
		hexaDecimal = 0xe; //16진수 상수를 변수에 저장 
		binary = 0b1110; //2진수 상수를 변수에 저장
		
		System.out.printf("decimal: %d %n",decimal);
		System.out.printf("octal: %d %n",octal);
		System.out.printf("hexaDecimal: %d %n",hexaDecimal);
		System.out.printf("binary: %d %n",binary);
		//문자열을 저장할 수 있는 자료형
		String octaStr;
		String hexaStr;
		String binaryStr;
		
		//Integer 정수와 관련된 기능을 만들어 놓은 클래스
		//정수를 각각 16진수, 8진수, 2진수 문자열 형태로 바꾸기
		hexaStr= Integer.toHexString(14);
		octaStr= Integer.toOctalString(14);
		binaryStr= Integer.toBinaryString(14);
		
		System.out.println(hexaStr);
		System.out.println(octaStr);
		System.out.println(binaryStr);
		
			
	}

}
