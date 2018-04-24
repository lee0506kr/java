package studentmenagement;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentManagement3 {
	// 수정해야 할 부분: 입력받을 배열의 길이를 고정시키면 안됨
	// : 학생의 수만큼만 저장할 수 있는 배열을 관리

	private boolean isRun; // 프로그램을 계속 실행할 것인지 확인하는 변수
	private Scanner scan;
	private StudentList list;

	public StudentManagement3() {
		list = new StudentList();
		isRun = true;
		scan = new Scanner(System.in);

		// list = file
		// 임의의 데이터 넣어주기
		// setDefaultData();
	}

	public void fileInput() {

		// 파일에서 객체를 읽어온다. ObjectInputStream
		// 객체를 읽어와서 list에다가 참조 시킨다.
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("list.txt")));
			list = (StudentList) ois.readObject();

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 우리가 사용한 자원 닫아주기
			try {
				if (ois != null) {
					ois.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileOutput() {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("list.txt")));

			StudentList s = list;

			s.getStudents();

			oos.writeObject(s);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void start() {
		// 메뉴를 계속해서 출력하기 위해서 while문에서 메뉴를 출력한다.
		fileInput();
		while (isRun) {
			showMenu();
			inputMenu();
			fileOutput();
		}
	}

	// 메뉴 보여주기
	public void showMenu() {
		System.out.println("***************************");
		System.out.println("******** 메뉴를 선택 하세요 *******");
		System.out.println("*                         *");
		System.out.println("* 1. 모든학생보기         2.학생정보입력 *");
		System.out.println("* 3. 이름검색              4. 삭제          *");
		System.out.println("* 5. 종료                                          *");
		System.out.println("***************************");
		System.out.println("***************************");

	}

	// 메뉴 입력받기
	public void inputMenu() {
		scan = new Scanner(System.in);
		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			// 학생정보보기
			showStudents();
			break;
		case 2:
			// 학생정보입력
			inputStudent();

			break;
		case 3:
			// 이름검색
			searchStudent();
			break;
		case 4:
			// 이름으로 삭제(처음검색된 학생만 삭제)
			deleteStudent();
			break;
		case 5:
			// 종료
			System.out.println("종료합니다.");
			endStudent(); // 프로그램을 종료하기 위해서 상태값을 false로 변경
			break;
		default:
			// 메뉴 없음
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

	// 모든 학생 정보 보기 메서드
	public void showStudents() {
		System.out.println("학생정보보기");

		for (int i = 0; i < list.size(); i++) {
			printStudent(i);
		}

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

	public void printStudent(int index) {
		Student[] arr = list.getStudents();
		System.out.println("이름 : " + arr[index].getName());
		System.out.println("학년 : " + arr[index].getGrade());
		System.out.println("평균 : " + arr[index].getAverage());
		System.out.println("점수: " + arr[index].getScore());
		System.out.println("--------------------------------");
	}

	// 학생 정보 입력하기 메서드
	public void inputStudent() {

		System.out.println("학생정보 입력하기");
		// 학생의 정보를 사용자(키보드)로부터 입력받고
		// 객체를 만들어서 배열에 저장
		// 숫자를 입력받는 부분에서 예외가 발생하면
		// 1을 강제로 입력해 준다.

		System.out.println("이름을 입력하세요");
		String name = scan.next();

		System.out.println("학년을 입력하세요");
		int grade = 0;
		grade = scan.nextInt();
		int kor = 0;
		System.out.println("국어 점수를 입력하세요");

		kor = scan.nextInt();

		System.out.println("영어 점수를 입력하세요");
		int eng = scan.nextInt();

		System.out.println("수학 점수를 입력하세요");
		int math = scan.nextInt();

		Student student = new Student(name, grade, kor, eng, math);

		list.add(student);

		System.out.println(list.size());

	}

	// 학생 정보 이름검색 메서드
	public void searchStudent() {
		// System.out.println("학생정보 검색하기");
		// 이름검색
		// 사용자에게 문자열을 입력받아서 해당 문자열을 포함하는 이름을 가진
		// 학생을 모두출력
		// 문자열을 하나 입력받고
		// 내가 가진 학생배열을 하나씩 검색하면서,
		// 입력받은 문자열과 이름을 비교해서 같거나, 문자열을 포함하고 있으면
		// 학생정보를 출력
		System.out.println("이름을 입력하세요");
		String keyword = scan.next();
		Student[] students = list.getStudents();
		for (int i = 0; i < list.size(); i++) {
			// students[i].getName()와 keyword 비교

			String name = students[i].getName();
			// 문자열 비교 : equals(), contains(s)
			// name.equals(keyword);
			// name 문자열이 keyword를 포함하고 있으면 true, 아니면 false
			// name.contains(keyword);

			if (name.contains(keyword)) {
				// 이름이 검색어를 포함하고 있다.
				// 해당학생을 출력
				// System.out.println("이름 : " + students[i].getName());
				// System.out.println("학년 : " + students[i].getGrade());
				// System.out.println("평균 : " + students[i].getAverage());
				// System.out.println("점수: " + students[i].getScore());
				// System.out.println("--------------------------------");
				printStudent(i);
			}

		}

	}

	public void deleteStudent() {
		// 이름 입력받고, 해당하는 이름이 있는지 검색하고, 있으면 삭제
		System.out.println("삭제할 학생이름을 적어주세요!");
		String name = scan.next();

		if (list.size() == 0) {
			System.out.println("학생이 없습니다.");
			return;
		}

		list.delete(name);
		System.out.println("삭제 되었습니다.");
	}

	// 임의의 학생정보를 배열에 넣어주는 임시메서드

}
