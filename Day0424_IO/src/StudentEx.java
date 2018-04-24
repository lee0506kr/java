import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class StudentEx {

	public static void main(String[] args) {

		FileOutputStream out = null;
		FileInputStream in = null;

		StringBuilder sb = new StringBuilder();

		try {
			in = new FileInputStream("src/data.txt");
			int data;
			while ((data = in.read()) != -1) {
				// 읽어온 문자를 문자열로 만들어 내야함
				sb.append((char) data);
			}
			// while문이 끝나면 파일에 있는 문자열이 그대로 sb에 저장
			String str = sb.toString();
			// 제대로 읽어왓는지 확인
			/* System.out.println(str); */

			// 읽어온 문자열을 '/'기준으로 잘라내기
			StringTokenizer st = new StringTokenizer(str, "/");

			// 첫번째 토큰이름, 두번 째는 학년, 세번째는 점수

			Student student = new Student();

			student.setName(st.nextToken());
			// 문자열 >>숫자
			int grade = Integer.parseInt(st.nextToken());
			student.setGrade(grade);
			int score = Integer.parseInt(st.nextToken());
			student.setScore(score);
			// 파일로 부터 읽어온 정보를 넣은 학생 객체 정보 출력
			System.out.println(student);

			// 학생정보 변경
			student.setName("lee");
			student.setGrade(2);
			student.setScore(100);

			// 학생정보를 가져와서 문자열로 만들기
			String outstr = student.getName() + "/" + student.getGrade() + "/" + student.getScore();

			System.out.println(outstr);
			// 학생정보를 file에 쓰기

			out = new FileOutputStream("src/studentOut.txt");
			out.write(outstr.getBytes());

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
