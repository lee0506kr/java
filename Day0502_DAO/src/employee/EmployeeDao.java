package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER = "lee5656kr";
	private static final String RASSWORD = "qwer4512";
	private Connection conn;

	public EmployeeDao() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, RASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public int insertEmployee(Employee emlpoyee) {
		//String sql = "insert into employee " + "values(" + emlpoyee.getNumber()
		//+",'" + emlpoyee.getName() + "'," + emlpoyee.getDepartment()+","+emlpoyee.getSalary()+ ")";
		
		String sql = "insert into emlpoyee" + "values(?,?,?,?)";
		
		//String sql = "insert into student_ex" + "values(?,?,?);
		System.out.println(sql);
		
		PreparedStatement pstmt =null;
		
		//PreparedStatement pstmt = null;
		Statement stmt = null;
		int result = 0;
		try {
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,emlpoyee.getNumber());
			pstmt.setString(2, emlpoyee.getName());
			pstmt.setInt(3, emlpoyee.getDepartment());
			pstmt.setInt(4, emlpoyee.getSalary());
			
			
			//pstmt = conn.createStatement(sql);
			//pstmt.setInt(1,student.getSnum());
			//pstmt.setString(2,student.getSname());
			//pstmt.setInt(3,student.getSgrade());
			
			
			
			//stmt = conn.createStatement();
			//result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	public int updateEmployee(Employee emlpoyee) {
//		String sql = "update emlpoyee" + " set ename = '" + emlpoyee.getName() + "'," + " Department = "
//				+ emlpoyee.getDepartment() + " where Salary = " + emlpoyee.getSalary();
		
		String sql = "update emlpoyee set enumber =? deptno = ? salary = ? where ename = ?";
		System.out.println(sql);
		
		PreparedStatement pstmt =null;
		
		
		Statement stmt = null;
		
		int result =0;
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,emlpoyee.getNumber());
			pstmt.setString(2, emlpoyee.getName());
			pstmt.setInt(3, emlpoyee.getDepartment());
			pstmt.setInt(4, emlpoyee.getSalary());
			
			
			
			
			
			
//			stmt = conn.createStatement();
//			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null)
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public int deleteEmployee(int enumber) {
		//String sql = "delete from emlpoyee where Department = " + Department;
		
		String sql = "delete from employee where enumber = ? ";
		
		PreparedStatement pstmt =null;
		
		
		//Statement stmt = null;
		int result = 0;
		
		try {
			
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setInt(1,enumber);
		
			result = pstmt.executeUpdate();
			
			//stmt = conn.createStatement();
			//result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(pstmt != null)
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public Employee selectOne(int enumber) {
		Employee result = null;
		//String sql = "select * from employee where enumber=" + number;

		String sql = "select * from employee where enumber = ?";
		
		PreparedStatement pstmt =null;
		
		
		//Statement stmt = null;
		ResultSet rs = null; //select 일때 볼수 있게 해준다.
		
		try 
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, enumber);
			rs = pstmt.executeQuery(sql);
			
			
			//stmt = conn.createStatement();
			//rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int num;// 직원번호
				String name;// 이름
				int Department; // 부서번호
				int Salary; // 월급

				num = rs.getInt("enumber");
				name = rs.getString("ename");
				Department = rs.getInt("deptno");
				Salary = rs.getInt("salary");

				result.setNumber(num);
				result.setName(name);
				result.setDepartment(Department);
				result.setSalary(Salary);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

	public List<Employee> selectAll() {

		List<Employee> result = new ArrayList<Employee>();
		String sql = "select * from employee";
		
		
		
		ResultSet rs = null;
		PreparedStatement pstmt =null;
		
		
		//Statement stmt = null;

		try {
			//stmt = conn.createStatement();

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			Employee employ;
			while (rs.next()) {
				
				//rs 테이블명
				employ = new Employee();

				employ.setNumber(rs.getInt("enumber"));
				employ.setName(rs.getString("ename"));
				employ.setDepartment(rs.getInt("deptno"));
				employ.setSalary(rs.getInt("salary"));

				result.add(employ);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;

	}
}
