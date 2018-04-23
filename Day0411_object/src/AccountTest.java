
public class AccountTest {
	public static void main(String[] args) {
		Account myAccount = new Account();
		try {
			myAccount.deposit(10000000);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myAccount.showBalance();
	}

}
