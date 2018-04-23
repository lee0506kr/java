
public class ThreadTest {
	public static void main(String[] args) {
		//반복문 2개 실행할거에요, 단일스레드(메인스레드)
		for (int i = 0; i < 100; i++) {
			System.out.println("반복분1 : " + i);
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("반복분2 : " + i);
		}
		System.out.println("메인 스레드 종료");
	}

}
