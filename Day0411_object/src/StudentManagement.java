import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement {

	// 학생 관리: 모든학생정보조회, 학생추가, 검색, 종료
	// 메뉴보여주기, 메뉴입력받기(입력받은 메뉴별로 기능 수행)
	// 필요데이터 : 학생의 배열(Student[])

	private Student[] students; // 학생정보 저장을 위한 배열
	private boolean isRun; // 프로그램을 계속 실핼할것인지 확인하는 변수
	private Scanner scan;
	private int number; // 학생수를 카운트 하기 위한 변수

	public StudentManagement() { // 생성자
		students = new Student[50];
		isRun = true; // isRun의 초기값을 true로 줘서 프로그램이 실행될 수 있다.
		scan = new Scanner(System.in);
		// 임의데이터넣기
		setDefaultData();

	}

	public void start() {
		// 메뉴를 계속해서 출력하기 위해서 while문에서 메뉴를 출력한다.
		while (isRun) {
			showMenu();
			inputMenu();
		}
	}

	// 메뉴 보여주기
	public void showMenu() {
		try {
			System.out.println("***********************************");
			System.out.println("******** 메뉴를 선택 하세요. ***********");
			System.out.println("*                                 *");
			System.out.println("* 1.모든 학생 보기      2.학생정보입력            *");
			System.out.println("* 3. 이름검색      4. 종료                           *");
			System.out.println("***********************************");
			System.out.println("***********************************");
		} catch (Exception e) {
			
			return;
		}

	}

	public void inputMenu() {

		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			// 학생정보보기
			showStudents();
			break;
		case 2:
			// 학생정보입력
			inputStudents();
			break;
		case 3:
			// 검색
			searchStudets();
			break;
		case 4:
			// 종료
			System.out.println("종료할까요?.");
			// isRun=false;//프로그램을 종료하기 위해서 상태값을 false로 변경
			endStudent();

			break;
		default:
			// 메뉴없음
			System.out.println("잘못입력하셨습니다.");
			break;

		}
	}
	// 모든 학생 정보 보기 메서드

	public void showStudents() {
		System.out.println("학생정보보기");
		// 현재 내가 가지고 있는 학생 정보를 모두 출력
		// 배열에 학생정보를 가지고 잇다.
		// 배열의 요소를 하나 씩 출력

		for (int i = 0; i < number; i++) {
			// 배열요소에 접근하기 배열이름[index]
			// students[i]>> Student 객체 하나를 참조할 수 있음
			printStudent(i);
			/*
			 * System.out.println("이름: "+ students[i].getName()); System.out.println("학년: "+
			 * students[i].getGrade()); System.out.println("평균: "+
			 * students[i].getAverage()); System.out.println("점수: "+
			 * students[i].getScore());
			 * System.out.println("-------------------------------");
			 */
		}
	}

	// 학생 정보 입력하기 메서드
	public void inputStudents() {
	
			System.out.println("학생정보 입력하기");
			// 학생의 정보를 사용자(키보드)로부터 입력받고
			// 객체를 만들어서 배열에 저장
			// 숫자를 입력받는 부분에서 예외가 발생하면
			// 1을 강제로 입력해 준다.

			System.out.println("이름을 입력하세요");
			String name = null;
			try {
				name = scan.next();	
			}catch(InputMismatchException e) {
				scan.next();
				System.out.println("잘못입력하였습니다.");
				return;
			}
			
			System.out.println("학년을 입력하세요");
	
			int grade = 0;
			try {
			grade = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.next();
				/* e.printStackTrace(); */
				System.out.println("잘못입력하셨습니다.");
				return;
			}

			System.out.println("국어 점수를 입력하세요");
			
			int kor = 0;
			try {
			kor = scan.nextInt();
			}catch(InputMismatchException e) {
				scan.next();
				System.out.println("잘못입력하셨습니다.");
				return;
			}
			System.out.println("영어 점수를 입력하세요");
			int eng = 0;
			try {
			eng = scan.nextInt();
			}catch(InputMismatchException e){
				scan.next();
				System.out.println("잘못입력하셨습니다.");
				return;
			}
			System.out.println("수학 점수를 입력하세요");
			int math = 0;
			try {
			math = scan.nextInt();
			}catch(InputMismatchException e) {
				scan.next();
				System.out.println("잘못입력하셨습니다.");
				return;
			}
			
			// 객체를 만들어서 배열에다가 넣기
			students[number] = new Student(name, grade, kor, eng, math);
			number++;
			System.out.println("추가되었습니다.");
		
	}

	public void endStudent() {

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

	// 학생정보 이름 검색 메서드
	public void searchStudets() {
		// System.out.println("학생정보 검색하기");
		// 이름검색
		// 사용자에게 문자열을 입력 받아서 해당 문자열을 포함하는 이름을 가진 학생을 모두 출력하자
		// 문자열을 하나 입력받고
		// 내가 가진 학생배열을 하나씩 검색하면서, 입력받은 문자열과 이름을 비교해서 같거나, 문자열을 포함하고있으면 학생정보를 출력

		System.out.println("이름을 입력하세요");

		String keyword = scan.next();

		for (int i = 0; i < number; i++) {
			// students[i].getName() 와 keyword 비교

			String name = students[i].getName();
			// 문자열 비교 : equals(), contains(s)
			// name.equals(keyword); //같은거 찾을때 이용
			// name 문자열이 keyword를 포함하고 있으면 true, 아니면 false;
			name.contains(keyword);
			if (name.contains(keyword)) {
				// 이름이 검색어를 포함하고 있다.
				// 해당학생을 출력
				printStudent(i);
				/*
				 * System.out.println("이름: "+ students[i].getName()); System.out.println("학년: "+
				 * students[i].getGrade()); System.out.println("평균: "+
				 * students[i].getAverage()); System.out.println("점수: "+
				 * students[i].getScore());
				 * System.out.println("-------------------------------");
				 */

			}
		}
	}

	public void printStudent(int index) {

		System.out.println("이름: " + students[index].getName());
		System.out.println("학년: " + students[index].getGrade());
		System.out.println("평균: " + students[index].getAverage());
		System.out.println("점수: " + students[index].getScore());
		System.out.println("-------------------------------");

	}

	// 임의의 학생정보를 배열에 넣어주는 임시메서드
	public void setDefaultData() {
		// 학생배열에 3~4명 정도 학생정보 넣기
		students[0] = new Student("홍길동", 3, 100, 0, 50);
		students[1] = new Student("이순신", 3, 100, 10, 50);
		students[2] = new Student("신사임당", 3, 100, 60, 50);
		students[3] = new Student("이성계", 3, 100, 100, 90);
		number = 4;

	}

}

// 학생정보보기 학생정보추가 검색

/*
 * private boolean isRun; private Student[] studentArr; private Student student;
 * 
 * public StudentManagement() {
 * 
 * student = new Student(); studentArr = new Student[5]; isRun = true; }
 * 
 * public void viewStudent() {
 * 
 * for (int i = 0; i < studentArr.length; i++) { if (studentArr[i] != null) {
 * 
 * String name = studentArr[i].getName(); int grade = studentArr[i].getGrade();
 * int kor = studentArr[i].getScore().getKor(); int math =
 * studentArr[i].getScore().getMath(); int eng =
 * studentArr[i].getScore().getEng(); double avg = studentArr[i].getAverage();
 * 
 * System.out.println("이름: " + name + " 학년: " + grade + " 국어: " + kor + " 수학: "
 * + math + " 영어: " + eng + " 평균: " + avg); } } }
 * 
 * public void insertStudent() { for(int j=0; j<studentArr.length;j++) {
 * 
 * } for (int i = 0; i < studentArr.length; i++) { //마지막 인덱스 값 찾기
 * 
 * System.out.println();
 * 
 * String name = studentArr[i].getName(); int grade = studentArr[i].getGrade();
 * int kor = studentArr[i].getScore().getKor(); int math =
 * studentArr[i].getScore().getMath(); int eng =
 * studentArr[i].getScore().getEng(); double avg = studentArr[i].getAverage(); }
 * }
 * 
 * public void showMenu() { System.out.println("번호를 선택하세요");
 * System.out.println("1.학생정보보기 2.학생정보추가 3.이름검색 4.종료"); }
 * 
 * public void start() { while (isRun) { showMenu(); inputMenu(); } }
 * 
 * // 사용자에게 메뉴를 입력받는 메서드 public void inputMenu() { Scanner scan = new
 * Scanner(System.in); int menu = scan.nextInt();
 * 
 * switch (menu) { case 1: System.out.println("정보보기를 선택하셨습니다."); viewStudent();
 * break; case 2: System.out.println("정보수정을 선택하셨습니다.");
 * 
 * break; case 3: System.out.println("정보삭제를 선택하셨습니다.");
 * 
 * break; case 4: System.out.println("종료합니다."); isRun = false; break; default:
 * System.out.println("잘못입력 하셨습니다."); break; }
 * 
 * }
 * 
 * public Student[] getStudentArr() { return studentArr; }
 * 
 * public void setStudentArr(Student[] studentArr) { this.studentArr =
 * studentArr; }
 * 
 * public Student getStudent() { return student; }
 * 
 * public void setStudent(Student student) { this.student = student; }
 */
