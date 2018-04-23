package thread3;

public class ThreadTest {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		Runnable person1 = new User(myAccount);

		Thread t1 = new Thread(person1);
		t1.start();
		

		Runnable person2 = new User(myAccount);
		
		Thread t2 = new Thread(person2);
		t2.start();
		
		
	}
}
