
public class ScoreTest {
	public static void main(String[] args) {
		Score odd = new Score();

		try {
			odd.setTotal(11);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

		}

		odd.showTotal();
	}

}
