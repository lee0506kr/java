import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentList {

	private Student[] students;
	private Scanner scan;

	public StudentList() {
		students = new Student[0];
		setDefaultData();
	}
	//add(): 학생정보 하나를 전달받아서 배열에 추가
	//현재 배열보다 크기 1큰 배열 만들어서 기존 배열 복사하고 학생추가하기

	public void add(Student student) {

		Student[] tmpArr = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			tmpArr[i] = students[i];
		}
		tmpArr[students.length] = student;
		this.students = tmpArr;
		System.out.println("추가되었습니다.");
	}
	//delete() : 삭제할 학생의 이름을 전달 받아서 목록에서 삭제
	//			: 학생 배열에서 입력받은 학생을 삭제하기 위해서, 크기 1작은 배열을 생성해서
	//			: 해당하는 이름의 학생 첫번째 객체만 제외하고 기존배열에서 복사하기
	
	public void delete(String name) {

		boolean isDeleted = false;
		// 삭제할 학생을 찾아서, 복사를 하지 않았으면 true, 못찾았으면 false
		Student[] tmpArr = new Student[students.length - 1];
		int j = 0;
		for (int i = 0; i < students.length; i++) {

			if (students[i].getName().equals(name) && !isDeleted) {
				
				isDeleted = true;
			} else {
				
				tmpArr[j] = students[i];
				j++;
			}
		}
		students = tmpArr;
	}
	public int size() {
		return students.length;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	public void setDefaultData() {
		// 학생배열에 3~4명정도 학생정보 넣기
		Student[] students = new Student[4];

		students[0] = new Student("홍길동", 3, 100, 0, 50);
		students[1] = new Student("이순신", 2, 50, 100, 50);
		students[2] = new Student("신사임당", 1, 80, 100, 100);
		students[3] = new Student("김장금", 2, 70, 80, 100);

	}

	

}
