import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		//문자열 비교는 ==을 사용하지 않고 String  클래스가 제공하는
		//equals 메서드를 활용한다.
		
		/*Scanner scan = new Scanner(System.in);
		
		String str =scan.nextLine();
		
		if(str.equals("M")) {
			
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}*/
		
		String s = "Hello";
		String s1 = new String ("Hello");
		
		if(s == s1) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		
		
		//[H][e][l][l][o] :a[0]
		String a ="      He llo      ";		
		a.charAt(0); //문자열에서 0번 인덱스에 있는 char를 가져와서 char c에 대입
		char c =a.charAt(0);
		
		System.out.println(c);
		System.out.println(a.length()); //문자열의 길이 가져오기
		
		String b= a.trim(); //앞쪽,뒤쪽 공백제거
		System.out.println(b.length());
		
		System.out.println(a.contains("He")); //문자열이 포함되어있는지 아닌지 검사
		
		
		
		
		
		
		
		
				
				
				
		
		
	}

}
