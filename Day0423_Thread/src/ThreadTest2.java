
public class ThreadTest2 {
	public static void main(String[] args) {
		// 멀티스레드 만들기 1.
		// 스레드 실행 방법 Thread 클래스 객체 만들어서 start()메서드 호출

		Thread thread1 = new MyThread();
		thread1.start(); //파생스레드
		// start를 실행하면 thread가 가지고 있는 run()메서드 실행
		// 우리가 실행할 코드를 run()에 구현하기 >>> 상속,오버라이딩
		// 개발자가 만들어서 실행한 스레드 : 파생스레드
		for (int i = 0; i < 100; i++)

		{
			System.out.println("메인스레드 : " + i);
		}

	}
}
