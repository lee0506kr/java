import java.util.Scanner;

public class Operator5 {
	public static void main(String[] args) {
		//조건 삼항 연산자
		//조건식? 값1: 값2
		//조건식이 참이면 값1을 선택, 거짓이면 값2를 선택
		
		//grade : 학년, 4학년(4,5,6,) 이면 용돈 500
		//3학년 이하면 100
		Scanner str = new Scanner(System.in);
		
		int grade;
		
		System.out.println("학년을 입력해주세요.");
		grade= str.nextInt();
		
		String level;
		int pocketMoney;
		
		level = grade <= 3? "LOW": (grade>=7? "VERY HIGH": "High");
		pocketMoney = grade <=3? 100 : 500;
		
		System.out.println(level);
		System.out.println(pocketMoney);
	}
}
