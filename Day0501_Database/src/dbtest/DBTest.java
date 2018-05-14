package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) {
		// 데이터베이스 프로그래밍 순서
		// 1. 사용하고자 하는 DBMS에 맞는 드라이버 로딩
		// 2. 연결생성(url, user,password 가 필요)
		// url:
		// jdbc:oracle:thin:@localhost:1521:XE
		// 3. 구문객체를 생성(Statement)
		// 자바에서 작성한 sql을 DBMS로 전달하는 역할
		// 4. SQL 작성 및 구문객체를 통한 실행
		// 5. 결과 처리(데이터가 있으면 결과를 처리, 결과가 없는 질의의 경우 작업x)
		// 조회(select)의 경우 데이터가 있음..

		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "lee5656kr";
		String password = "qwer4512";

		// DBMS에 연결을 하게되면 생성되는데 Connection객체로 생성이된다.

		Connection connection = null;

		// SQL을 작성해서 실행시키기 위해 구문객체(Statement)를 활용 >> 연결을 통해서
		Statement stmt = null;

		try {
			// 드라이버 로딩 forName(드라이버이름)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!!");

			// Connection 객체는 DriverManager를 통해서 얻어올 수 있음
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");

			// SQL 전송은 연결을 통해서 전송할거고.. 구문객체는 연결을 ㅌ통해서 가져옴
			stmt = connection.createStatement();

			String sql = "insert into student_ex " + " values (6,'홍길동',3)";
			// 구문객체를 통해서 sql을 실행하는 메서드
			// executeUpate, executeQuery,execute
			// executeUpate: insert, update , delete
			// executeQuery: select
			// execute: Database Definition

			String sql1 = "delete from student_ex where sname = '홍길동'";

			int rowCount = stmt.executeUpdate(sql);
			int rowCount1 = stmt.executeUpdate(sql1);

			System.out.println(rowCount + "개의 행이 영향 받았습니다.");
			System.out.println(rowCount1 + "개의 행이 지워짐");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();

			System.out.println("드라이버 연결 실패!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL 예외 발생!!");
			e.printStackTrace();
		}

	}

}
