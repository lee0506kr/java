
public class ThteadTest4 {
	public static void main(String[] args) {
		// Runnable 구현 해서 구현해서 스레드 실행 시키키
//		Runnable r1 = new Runnable() {
//		public void run() {
//			for(int i=10;i>0;i--) {
//				System.out.println(i);
//			}
//		}
//	};
		// 인터페이스나, 추상클랟
		Runnable r1 = () -> {
			for (int i = 10; i > 0; i--) {
				System.out.println(i);
			}

		};

		Thread t1 = new Thread(r1);
		t1.start(); //스레드 실행

	}
}
