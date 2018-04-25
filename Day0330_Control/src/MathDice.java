
public class MathDice {
	public static void main(String[] args) {
		//Math 이용하기: 수학과 관련된 기능들과, 값들을 저장하고 있는 클래스
		//random(): 0~0.9999999999999999(15자리수)....의사이의 숫자를 생성
		//생성된 숫자*6 : 0~5.999999
		//생성된 실수를 정수로 형변환 (소숫자리가 다 사라짐)
		
		int ranNum = (int)(Math.random()*6)+1;
		
		
		//System.out.println(ranNum);
switch(ranNum) {
		
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
			System.out.println("dice의 숫자는6");
			break;
		default:
			break;
		}
	}

}
