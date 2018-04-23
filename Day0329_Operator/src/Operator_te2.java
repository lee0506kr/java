import java.util.Scanner;

public class Operator_te2 {
	public static void main(String[] args) {
		//1.2개씩 비교해서 각각 큰수를 저장. 가장 작은 수 탈락
		//2.2개씩 비교해서 뽑아내면 가장 큰 수 2개 중간 수 하나 가 저장됨
		//3.셋 중에서 작은 것 찾으면 중간수
		
		int x,y,z; //처음 숫자를 입력받을 변수
		int a,b,c; //2개씩 비교후 큰 수를 저장할 변수
		int result; //최종 중간 숫자를 저장할 변수
		
        Scanner input = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요");
		x = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요");
		y = input.nextInt();
		
		System.out.println("세 번째 숫자를 입력하세요");
		z = input.nextInt();
		
		//x,y 비교 후 큰 수 저장
		//큰 수만 저장하면 제일 작은 수는 탈락하고
		//제일 큰 수 두개, 중간 수 하나가 저장된다.
		//이 중에 작은 수를 선택하면 됨
		a = x>y? x:y;
		b = y>z? y:z;
		c = x>z? x:z;
		
		
		//a<b가 참이면 a가 작은 것이다.
		//거짓이라면 a와b가 같거나, b가 작은것 이다. b와 c를 비교해서 작은 것을 찾으면 된다.
		result = a<b? a:(b<c?b:c);
		
		System.out.println("중간값은"+result+"입니다.");
		
		
	}

}
