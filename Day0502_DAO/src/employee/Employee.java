package employee;

public class Employee {

	int number;//지원번호
	String name;//이름
	int Department; // 부서번호
	int Salary; //월급
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartment() {
		return Department;
	}
	public void setDepartment(int department) {
		Department = department;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", Department=" + Department + ", Salary=" + Salary
				+ "]";
	}
	
	
	
	
	
}
