package collection;


import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {

		// List를 구현해 놓은 구현 클래스는 ArrayList, LinkedList
		// 둘다 같은 메소드를 가지고 있다.
		// 문자열을 여러개 저장하는 list
		// String[] list = new String[숫자];
		List<String> list = new ArrayList<String>();
		
		// [Hello][World][!!]
		// 0 1 2

		list.add("Hello");
		list.add("world");
		list.add("!!");
		
		// List의 경우에는 size() 메서드를 이용해서 크기를 가져온다.
		for (int i = 0; i < list.size(); i++) {
			// 배열은 list[i] 형태로 각각 요소에 접근
			// List는 list.get(i)
			String str = list.get(i);
			System.out.print(str + " ");
		}
		System.out.print("\n");
		
		for(String s:list) {
			System.out.print(s + " ");
		}
		//ArrayList 와 LinkedList 를 구분없이 사용가능한 것은
		//둘다 List interface를 상속 받았기 때문이다. >>> 같은 메서드를 가지고 있다.
		
	}
}