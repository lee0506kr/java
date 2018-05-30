package studentDao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	//속성값:연결해야 되니까..url,user,password
		private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		private static final String USER= "zkfkzktm";
		private static final String PASSWORD = "1q2w3e4r";
		
		private Connection conn;
		
		//생성자에서 드라이버 로딩하고 연결까지하기, 연결객체는 멤버변수로 유지 
		
		public StudentDao() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void insertStudent(Student student) {
			String sql = "insert into student_ex"
					+ " values (?,?,?)";
			PreparedStatement pstmt = null;
			
			try {
				//preparedStatement 객체 만들 때 템플릿을 넘겨준다.
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, student.getSnum());
				pstmt.setString(2, student.getSname());
				pstmt.setInt(3,student.getSgrade());
				
				pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
