package Java_lang;

import java.util.StringTokenizer;

public class JavaUtilTest2 {
	public static void main(String[] args) {
		// StringTokenizer 스트링을 잘라준다.
		// 문자열을 특정한 문자 기준으로 잘라주는 역할을 하는 클래스

		String member = "홍길동/hong123/123@/hong123@email.com";

		StringTokenizer st = new StringTokenizer(member, "/");

		String name = st.nextToken();
		String password = st.nextToken();
		String userID = st.nextToken();
		String email = st.nextToken();

		System.out.println("이름: " + name);
		System.out.println("비밀번호: " + password);
		System.out.println("아이디: " + userID);
		System.out.println("이메일: " + email);

		String date = "date1/date2/date3/date4/date5";

		StringTokenizer st1 = new StringTokenizer(date, "/");
		while (st1.hasMoreTokens()) {
			String str = st1.nextToken();
			System.out.println(str);
		}

	}

}
