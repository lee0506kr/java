import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		//주사위 프로그램 만들기(1~6까지 랜덤하게 숫자생성해서 보여주기)
		//랜덤 숫자 생성방법 -math클래스 이용하기, Random클르스 이용
		//1.Random 클래스 이용하기 //임의 숫자를 만들어주는 클래스
		//Scanner scan = new Scanner(System.in);
		
		
		
		Random ran = new Random();
		
		int dice = ran.nextInt(6)+1; 
		
		//ran.nextInt(6); //0~5까지의 정수를 생성
		
		//System.out.println(ran.nextInt(7));
		
		switch(dice) {
		
		case 1: //위에서 +1을 하였으니깐 0은 없는것이다.
			System.out.println("dice의 숫자는1");
			break;
		case 2:
			System.out.println("dice의 숫자는2");
			break;
		case 3:
			System.out.println("dice의 숫자는3");
			break;
		case 4:
			System.out.println("dice의 숫자는4");
			break;
		case 5:
			System.out.println("dice의 숫자는5");
			break;
		case 6:
			System.out.println("6");
			break;
		default:
			break;
		}
		
		
	}

}
