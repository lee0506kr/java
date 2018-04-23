package collection;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		//List : interface
		//ArrayList, LinkedList
		//둘 다 List 인터페이스를 구현한 List 구현 클래스
		
		//리스트가 어떤 메서드를  구현해야 하는지 확인: 엄청 많음
		//너무 많으니까 간단하게 몇가지 메서드만 구현 : Generic을 이용
		//StudentList의 업그레이드 버전이라고 보시면 됩니다.
		//MyList는 임의의 데이터 타입을 넣을 수 있도록 작성: Generic으로...................!
		
		ArrayList<String> myList = new ArrayList();
		//기본생성자 호출하면 크기 0인 리스트를 생성 : 우리가 만들것도 마찬가지
		System.out.println(myList.size());
		
	}
}
