
public class Student {
	public static void main(String[] args) {
		// Student 클래스를 작성
		// 객체를 만들어서 객체의 멤버변수에 값을 넣고, 조회하고
		// 메서드를 만들어서 객체 상태를 출력하는 기능 실행해보기
		// Student 가 가져야할 상태값
		// 이름(문자열), 학년(정수), 번호(정수)
		// Student 객체가 할 수 있는 동작
		// 상태값 출력: printStudent
		// 객체 2개 s1,s2 만들어서 각각 이름, 학년, 번호 값 넣어주고
		// printStudent 활용해서 상태값 출력해보기
		/*
		 * 출력 예)이름: 홍길동 학년: 3 번호: 12 이름: 이순신 학년: 2 번호: 10
		 */

		Student1 s1 = new Student1();
		Student1 s2 = new Student1();

		s1.name = "홍길동";
		s1.harnan = 3;
		s1.number = 12;

		s2.name = "이순신";
		s2.harnan = 2;
		s2.number = 10;

		s1.Studnet();
		s2.Studnet();
	}

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

class Student1 {
	String name;
	int harnan;
	int number;

	public void Studnet() {
		System.out.println("이름은 :" + name);
		System.out.println("학년은 :" + harnan);
		System.out.println("번호는 :" + number);

	}

}