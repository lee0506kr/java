package thread3;

public class User implements Runnable {

	BankAccount account;

	public User(BankAccount account) {
		this.account = account;
	}

	// 통장에 돈을 10000원 입금, 좀있다가 10000원 출금 : 사람1,사람2 동시에 실행

	public void run() {
		for (int i = 0; i < 50; i++) {
			account.deposit(10000);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdraw(10000);

			System.out.println(account.getBalance());
		}
	}

}
