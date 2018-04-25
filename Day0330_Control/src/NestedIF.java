import java.net.StandardSocketOptions;

public class NestedIF {
	public static void main(String[] args) {
		// 중첩 if문에 대해서 공부합니다.
		// if-else 쌍 에 대해서 집중하면서 실습하시면 됩니다.
		// 짝수이면서 5이하인 수를 중첩if를 이용해서 찾아봅시다.

		int x = 6;
		if (x <= 5) {
			if (x % 2 == 0)
				System.out.println("5이하 이면서 짝수");
			else // 괄호가 없으면 가장 가까운 if와 연결
				System.out.println("5이하 이면서 홀수");
		} else {
			if (x % 2 == 0)
				System.out.println("5이상 이면서 짝수");
			else // 괄호가 없으면 가장 가까운 if와 연결
				System.out.println("5이상 이면서 홀수");
		}
	}
}
