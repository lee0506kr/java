import java.util.Scanner;

public class MyMangement {

	// 메뉴를 보여주고
	// 사용자에게 번호를 입력받고
	// 해당하는 번호의 기능을 실행 하는 클래스
	private boolean isRun;

	public MyMangement() {
		isRun = true;
	}

	public void start() {
		while (isRun) {
			showMenu();
			inputMenu();

		}
	}

	public void showMenu() {
		System.out.println("번호를 선택하세요");
		System.out.println("1.정보보기 2.정보수정 3.정보삭제 4.종료");
	}

	// 사용자에게 메뉴를 입력받는 메서드
	public void inputMenu() {
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			System.out.println("정보보기를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("정보수정을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("정보삭제를 선택하셨습니다.");
			break;
		case 4:
			System.out.println("종료합니다.");
			isRun = false;
			break;
		default:
			System.out.println("잘못입력 하셨습니다.");
			break;

		}

	}

}
