
public class Horse2 extends Animal implements Runnable {
	

	//Animal을 상속 받았기 때문에, name 이 이미 존재한다

	public Horse2(String name) {
		this.name = name;
	}
	//Runnable run() 메서드 재정의(오버라이딩)
	public void run() {
		int sum = 0;
		while (sum < 50) {
			int tmp = (int) (Math.random() * 5) + 1;

			sum += tmp;
			// 스레드의 진행을 잠시 멈춤 sleep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "달린거리: " + sum);
		}
		System.out.println("레이스 종료");

	}

}
