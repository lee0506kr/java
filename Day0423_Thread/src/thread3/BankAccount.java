package thread3;

public class BankAccount {

	private int balance;

	public int getBalance() {
		return balance;
	}

	// balence에 값을 더함  synchronized(임계구역)
	public synchronized void deposit(int amount) {
		balance = balance + amount;
	}

	// balence에 값을 뻄
	public synchronized void withdraw(int amount) {
		balance = balance - amount;
	}

}
