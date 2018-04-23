package report;

import java.util.Scanner;

public class SportsAgency {
	// 프로그램

	private SportsPlayer[] playerArr;
	private boolean isRun;
	private Scanner scan;
	private int number;
	private SportsPlayer sportplayer;

	public SportsAgency() {
		playerArr = new SportsPlayer[50];
		isRun = true;
		scan = new Scanner(System.in);
		setDefaultData();
	}

	public SportsAgency(SportsPlayer sportplayer) {

		this.sportplayer = sportplayer;

	}

	// 이름 나이 직업 몸무게 키

	public SportsAgency(String name, int age, String job, int weight, int tall) {

	}

	public void start() {
		setDefaultData();
		while (isRun) {
			showMenu();
			inputMenu();
		}
	}

	public void showMenu() {
		System.out.println("***********************************");
		System.out.println("******** 메뉴를 선택 하세요. ***********");
		System.out.println("*                                 *");
		System.out.println("* 1.모든 선수 보기      2.선수정보입력            *");
		System.out.println("* 3. 이름검색      4. 종료                           *");
		System.out.println("***********************************");
		System.out.println("***********************************");
	}

	public void inputMenu() {

		int menu = scan.nextInt();

		switch (menu) {

		case 1:
			showPlayer();
			break;
		case 2:
			inputPlayer();
			break;
		case 3:
			searchPlayer();
			break;
		case 4:
			System.out.println("종료할까요?");
			endplayer();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

	public void showPlayer() {
		System.out.println("선수 목록 보기");
		for (int i = 0; i < number; i++) {
			if (playerArr[i] == null) {

				break;
			}

			printPlayer(i);
		}
	}

	// 이름 나이 직업 몸무게 키
	public void inputPlayer() {

		System.out.println("선수 정보 입력하기");

		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		System.out.println("직업을 입력하세요");
		String job = scan.next();
		System.out.println("키를 입력하세요");
		int tall = scan.nextInt();
		System.out.println("몸무게를 입력하세요");
		int weight = scan.nextInt();

		switch (job) {

		case "야구선수":
			System.out.println("오른손잡이냐?왼손잡이냐?");
			String hand = scan.next();

			System.out.println("몇루수 지킴이냐?");
			int sack = scan.nextInt();

			System.out.println("나무 쓰냐 알루미늄 쓰냐");
			String bat = scan.next();

			playerArr[number] = new BaseballPlayer(name, age, job, tall, weight, hand, sack, bat);
			break;
		case "축구선수":
			System.out.println("왼발잡이냐?오른발잡이냐?양발이냐?");
			String foot = scan.next();
			System.out.println("순간 속력");
			int speed = scan.nextInt();
			System.out.println("헤딩을 잘한다.");
			String heading = scan.next();
			playerArr[number] = new FootballPlayer(foot, speed, heading);
			break;
		case "농구선수":
			System.out.println("덩치가 크냐? 덩치가 작냐?");
			String size = scan.next();
			System.out.println("헤어밴드를 착용 중인가?");
			String band = scan.next();
			System.out.println("2점 선수냐? 3점 선수냐?");
			int score = scan.nextInt();
			playerArr[number] = new BasketballPlayer(size, band, score);
			break;

		}

		number++;

		System.out.println("추가되었습니다.");
	}

	/*
	 * public void showbaseplayer(int index) { System.out.println("야구 선수 정보 보기");
	 * 
	 * System.out.println("이름: " + playerArr[index].getName());
	 * System.out.println("나이: " + playerArr[index].getAge());
	 * System.out.println("직업: " + playerArr[index].getJob());
	 * System.out.println("키: " + playerArr[index].getTall());
	 * System.out.println("몸무게: " + playerArr[index].getWeight());
	 * 
	 * playerArr[index].showPlayerInfo();
	 * //((BaseballPlayer)playerArr[index]).getHand();
	 * 
	 * //System.out.println("손잡이:"+hand); } public void inputbaseplayer(int index) {
	 * //야구 String hand; int sack; // 몇루 String bat;
	 * System.out.println("야구 선수 추가하기");
	 * 
	 * System.out.println("이름: " + playerArr[index].getName());
	 * System.out.println("나이: " + playerArr[index].getAge());
	 * System.out.println("직업: " + playerArr[index].getJob());
	 * System.out.println("키: " + playerArr[index].getTall());
	 * System.out.println("몸무게: " + playerArr[index].getWeight());
	 * playerArr[index].showPlayerInfo();
	 * 
	 * 
	 * playerArr[number] = new SportsPlayer();
	 * 
	 * number++; System.out.println("추가되었습니다."); }
	 */

	public void endplayer() {

		int x;

		System.out.println("1.종료 2.돌아가기");
		x = scan.nextInt();
		if (x == 1) {
			System.out.println("종료한다");
			isRun = false;
		} else if (x == 2) {
			System.out.println("돌아간다");
			showMenu();
		}
	}

	public void deletePlayer() {
		for (int i = 0; i < number; i++) {
			System.out.println(i + 1 + "번째 학생:");

		}
	}

	public void searchPlayer() {
		System.out.println("이름을 입력하세요");

		String keyword = scan.next();

		for (int i = 0; i < number; i++) {

			String name = playerArr[i].getName();

			name.contains(keyword);

			if (name.contains(keyword)) {
				printPlayer(i);
			}
		}
	}

	public void setSportplayer(SportsPlayer sportplayer) {
		this.sportplayer = sportplayer;
	}

	public void printPlayer(int index) {
		// 이름,나이,직업,포지션,몸무게
		System.out.println("이름: " + playerArr[index].getName());
		System.out.println("나이: " + playerArr[index].getAge());
		System.out.println("직업: " + playerArr[index].getJob());
		System.out.println("키: " + playerArr[index].getTall());
		System.out.println("몸무게: " + playerArr[index].getWeight());
		playerArr[index].showPlayerInfo();

	}

	public void setDefaultData() {
		// 이름,나이,직업,키,몸무게

		playerArr[0] = new SportsPlayer("홍길동", 45, "농구", 175, 86);
		playerArr[1] = new SportsPlayer("이순신", 45, "야구", 175, 86);

		number = 2;

	}

	public void play() {
		System.out.println("시작합니다.");
	}

}
