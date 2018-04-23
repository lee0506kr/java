package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		// 데이터 전달 할 때 많이 사용
		// 데이터의 종류가 매우 다양하기 때문에 모든 데이터를 한꺼번에 담아서 처리할
		// 자료구조가 필요>>>Map
		Map<String, Object> map = new HashMap<String, Object>();

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());

		map.put("student", new Student());
		map.put("phone", "010-4166-4559");
		map.put("member_number", 5);
		map.put("studentList", studentList);
		/****************** 보냄 ***************/
		// map에서 데이터를 꺼내서 사용함
		// 이미 어떤 key값이 어떤 종류의 데이터를 사용하는지 약속이 되어 있는 상태로
		// 데이터를 주고 받기 때문에 해당하는 key가 가지는 데이터를 약속된 데이터로 형변환해서
		// 사용한다.
		Student s = (Student) map.get("student");
		String phone = (String) map.get("phone");
		int num = (int) map.get("member_number");
		List<Student> sList = (List<Student>) map.get("studentList");

		for (Student s1 : sList) {
			System.out.println(s1);
		}

		List<List<String>> strList = new ArrayList<List<String>>();

		List<String> list1 = new ArrayList<String>();

		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("F");
		

		strList.add(list1);

	}
}
