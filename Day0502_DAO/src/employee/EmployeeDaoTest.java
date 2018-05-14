package employee;

import java.util.List;

import studentdao.Student;

public class EmployeeDaoTest {
	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDao();

		Employee e = new Employee();

		// e.setNumber(1);
		// e.setDepartment(2);
		// e.setName("이순신");
		// e.setSalary(100);
		//
		// dao.insertEmployee(e);

		dao.deleteEmployee(8);
		dao.deleteEmployee(1);

		// Employee e1 = dao.selectOne(8);

		List<Employee> sList = dao.selectAll();
		for (Employee ss : sList) {
			System.out.println(ss);
		}
		System.out.println("완료");

	}
}
