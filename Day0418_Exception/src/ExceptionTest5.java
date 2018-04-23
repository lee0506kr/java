import java.io.IOException;

public class ExceptionTest5 {
	public static void main(String[] args) {
		// finally 예외가 발생하든 안하든 마지막에 실행되는 코드

		Student s = new Student(300, 3);

		try {
			s.showAverage();
			System.out.println("Try 정상 종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception");
		} finally {
			System.out.println("애는 항상 실행합니다.");
		}

	}

}
