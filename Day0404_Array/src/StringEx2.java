
public class StringEx2 {
	public static void main(String[] args) {
		// "no news is good news"
		// 에서 반복문을 사용하여 문자 'n'의 개수를 출력하는 프로그램을 작성하시오.

		// 출력 예)
		// 'n'의 개수는 3개 입니다.
		// 문자열에서 'n'의 개수를 찾는일
		// >>>>> 숫자배열에서 특정 숫자의 개수를 세는 것과 동일하다
		// 뱅열이 문자여로 바뀐것 뿐이다.

		String str = "no news is good news";
		char str1 = 'n';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			// i=0부터 str.length()-1 까지 1씩증가하며 반복
			// String 문자열에서 특정 인덱그의 문자가져오기
			// 만약 배열이였다면 str[i]의 형태였을 것이지만...

			if (str1 == str.charAt(i)) {
				count++;
			}
		}
		// 반복문이 종료하면 'n'의 개수를 출력하면 된다.
		System.out.println(count);

	}

}