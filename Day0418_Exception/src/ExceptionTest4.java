
public class ExceptionTest4 {
	public static void main(String[] args) {
		//예외 처리 책임 전가 시키기
		
		Student s = new Student(300,0);
		//예외발생함
		try {
		s.showAverage();
		}catch(Exception e) {
			System.out.println("예외 처리 완료");
		}
		System.out.println("프로그램 종료");
	}
}
