import java.util.Scanner;

public class ControlEX_3 {
	public static void main(String[] args) {
		// if-else 를 이용한 학점 계산하기
		// 점수를 입력받아서
		// 점수가 90이상일경우'A' grade >=90
		// 점수가 80이상일경우'B' grade >=80
		// 점수가 70이상일경우'C' grade >=70
		// 점수가 60이상일경우'A' grade >=60
		// 점수가 60미만일경우'A' grade <60

		Scanner input = new Scanner(System.in);

		int score;
		char grade;

		System.out.println("성적을 입력해주세요");
		score = input.nextInt();

	
		if(score >= 90) {
			grade='A';   //1
		}else if(score >= 80) {
		grade='B';//2
		}else if(score>=70) {
		grade='C';
		}else if(score>=60) {
		grade='D';
		}else {
		grade='E';
		}
		
		// 만약에 1에서 참이면 2에서는 검사를 하지 않는다.
		System.out.println(grade);
		
		
	}
}
		
	
		
		/*if (score >= 60) {
			// abcd
			if (score >= 70) {
				// abc
				if (score >= 80) {
					// ab
					if (score >= 90) {
						// a
						grade = 'A';
					} else {
						// b
						grade = 'B';
					}
				} else {
					// c
					grade = 'C';
				}
			} else {
				grade = 'D';
				// d
			}
		} else {
			grade='E';
		}
		System.out.println("당신의 점수는"+score+",등급은"+grade+"입니다.");
	}
	*/


