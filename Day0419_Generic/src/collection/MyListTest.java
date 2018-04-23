package collection;

import java.util.ArrayList;

public class MyListTest {
	public static void main(String[] args) {

		MyList<Integer> myList = new MyList<Integer>();

		// System.out.println(myList.size());
		// System.out.println(myList.get(0));

		myList.add(4);
		myList.add(2);
		myList.add(3);
		myList.add(1);
		myList.add(5);
		myList.remove(0);

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		//for - each 구문 데이터가 여러개면 다되는게 아니라. Iterable를 구현한 클래스나, 배열만 사용 가능 
//		for(Str s:strList) {
//			
//		}

	}

}
