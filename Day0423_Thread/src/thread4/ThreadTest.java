package thread4;

public class ThreadTest {
	//생산자 - 소비자문제
	public static void main(String[] args) {
		//wait(), notify()
		//공급과잉과 공급부족을 어떻게 처리할 수 있을까???
		
		Buffer buffer = new Buffer();
		Runnable producer = new Producer(buffer);
		Runnable customer = new Customer(buffer);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(customer);
		
		t1.start();
		t2.start();
		

	}

}
